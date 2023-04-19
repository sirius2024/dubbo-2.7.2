package com.sirius.dubbo.spi.impl;

import com.sirius.dubbo.spi.Phone;

/**
 * 装饰者(增强类)
 */
public class MusicPhone implements Phone {

    private Phone phone;

    public MusicPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void call() {
        System.out.println("播放音乐");
        this.phone.call();
    }
}
