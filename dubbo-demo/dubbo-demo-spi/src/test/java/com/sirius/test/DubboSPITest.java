package com.sirius.test;


import com.sirius.dubbo.spi.AService;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.jupiter.api.Test;

public class DubboSPITest {

    @Test
    public void sayHello(){
        //1、创建ExtensionLoader
        ExtensionLoader<AService> extensionLoader = ExtensionLoader.getExtensionLoader(AService.class);

        //2、根据key获取实现类
        AService a1 = extensionLoader.getExtension("a1");
        a1.sayHello();

        //获取默认实现
//        AService defaultExtension = extensionLoader.getDefaultExtension();
//        defaultExtension.sayHello();
    }
}
