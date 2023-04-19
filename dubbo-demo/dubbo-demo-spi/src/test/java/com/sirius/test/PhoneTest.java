package com.sirius.test;


import com.sirius.dubbo.spi.AService;
import com.sirius.dubbo.spi.Phone;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.jupiter.api.Test;

/**
 * dubbo装饰者模式
 */
public class PhoneTest {

    @Test
    public void sayHello(){
        //1、创建ExtensionLoader
        ExtensionLoader<Phone> extensionLoader = ExtensionLoader.getExtensionLoader(Phone.class);

        //2、根据key获取实现类
        Phone phone = extensionLoader.getExtension("iphone");
        phone.call();
    }
}
