package com.sirius.dubbo.spi.impl;

import com.sirius.dubbo.spi.BService;
import org.apache.dubbo.common.URL;

public class B2Service implements BService {

    @Override
    public void sayHello(URL url ) {
        System.out.println("我是b2");
    }
}
