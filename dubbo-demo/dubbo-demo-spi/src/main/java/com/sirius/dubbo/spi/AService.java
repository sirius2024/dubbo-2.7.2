package com.sirius.dubbo.spi;


import org.apache.dubbo.common.extension.SPI;

@SPI
//@SPI("a1")
public interface AService {

    void sayHello();
}
