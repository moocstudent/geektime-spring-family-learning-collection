package com.example.minademo.quickstart;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

import java.util.Date;

public class TimeServerHandler extends IoHandlerAdapter {

    @Override
    public void exceptionCaught(IoSession session, Throwable cause)throws Exception{
        cause.printStackTrace();
    }

    @Override
    public void messageReceived(IoSession session, Object message)throws Exception{
        String str = message.toString();
        if("quit".equalsIgnoreCase(str.trim())){
            session.close();
            return;
        }else{
            Date date = new Date();
            session.write(date.toString());
            System.out.println("Message written...");
        }
    }

    @Override
    public void sessionIdle(IoSession session, IdleStatus status)throws Exception{
        System.out.println("IDLE "+session.getIdleCount(status));
    }
}
