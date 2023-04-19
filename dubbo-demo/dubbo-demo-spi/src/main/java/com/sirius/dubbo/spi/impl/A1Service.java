package com.sirius.dubbo.spi.impl;


import com.sirius.dubbo.spi.AService;
import org.apache.dubbo.rpc.Protocol;

public class A1Service implements AService {

    /**
     * dubbo ioc
     */
    private Protocol protocol;

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    @Override
    public void sayHello() {
        System.out.println(protocol);
        System.out.println("我是a1实现方式");
    }
}
