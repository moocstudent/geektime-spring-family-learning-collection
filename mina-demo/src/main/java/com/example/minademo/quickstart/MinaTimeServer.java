package com.example.minademo.quickstart;

import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * 开启后在黑窗口使用
 * telnet 127.0.0.1 9123 回车
 * 开始通讯 不支持telnet先要开启telnet
 */
public class MinaTimeServer {

    private static final int PORT = 9123;

    public static void main(String[] args) throws IOException {
        //Since this program will be TCP/IP based,we will add a SocketAcceptor to our program
        IoAcceptor acceptor = new NioSocketAcceptor();
        //With the NioSocketAcceptor class in place, we can go ahead and define the handler class and bind the NioSocketAcceptor to a port
        /*/****
        Next we add a filter to the configuration. This filter will log all information such as newly created sessions,
        messages received , messages sent, session closed . The next filter is a ProtocolCodecFilter.
        This filter will translate binary or protocol specific data into message object and vice versa.
        We use an existing TextLine factory because it will handle text base message for you(you don't have to write the codec part)
         */
        acceptor.getFilterChain().addLast("logger",new LoggingFilter());
        acceptor.getFilterChain().addLast("codec",new ProtocolCodecFilter(new TextLineCodecFactory(StandardCharsets.UTF_8)));

        acceptor.setHandler(new TimeServerHandler());

        /*//
        There are 2 new lines in the MinaTimeServer class.These methods set the set the IoHandler,input buffer size and
        the idle property for the sessions. The buffer size will be specified in order to tell the underlying operating
        system how much room to allocate(分配) for incoming data.The second line will specify when to check for idle sessions.
        In the call to setIdleTime, the first parameter defines what actions to check for when determining if a sessoin is idle,
        the second parameter defines the length of time in seconds that must occur before a session is deemed to be idle.
         */
        acceptor.getSessionConfig().setReadBufferSize(2048);
        acceptor.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE,10);
        /*
        * All that is left to do is define the socket address that the server will listen on,
        * and actually make the call that will start the server.
        * */
        acceptor.bind(new InetSocketAddress(PORT));
        /*
        * Try out the Time server
        * At this point,we can go ahead and compile the program.
        * Once you have compiled the program you can run the
        * program in order to test out what happens.
        * The easiest way to test the program is to
        * start the program , and then telnet in to the program
        * */
    }
}
