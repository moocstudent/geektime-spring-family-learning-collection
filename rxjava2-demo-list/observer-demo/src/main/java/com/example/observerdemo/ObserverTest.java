package com.example.observerdemo;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * @Author: zhangQi
 * @Date: 2020-08-28 16:46
 */
@Deprecated
public class ObserverTest {
    Observer<String> observer = new Observer<String>() {
        @Override
        public void onSubscribe(Disposable disposable) {

        }

        @Override
        public void onNext(String s) {
            //Observable调用这个方法发射数据
        }

        @Override
        public void onError(Throwable throwable) {
            //当Observable遇到错误或者无法返回期望的数据时会调用这个方法,后续不会再调用onNext和onCompleted
        }

        @Override
        public void onComplete() {
            //正常终止时调用,onError和onComplete只会通知一个
        }
    };
}
