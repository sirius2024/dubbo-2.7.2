package com.sirius.test;


import com.sirius.dubbo.spi.AService;
import com.sirius.dubbo.spi.BService;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class AdaptiveSPITest {

    @Test
    public void sayHello(){
        //1、获取自适应实现类
        /**
         * 创建一个动态代理类
         *      在动态构造的实现中(Javassist技术将字符串，动态转化为Java对象)
         *          根据传入的调用参数
         *              1、加载真正的实现类
         *              2、执行实现类的响应方法
         */
        BService bService  = ExtensionLoader.getExtensionLoader(BService.class).getAdaptiveExtension();

        //3、构造请求参数(URL对象)
        Map<String, String> map = new HashMap<>();
        map.put("b.service", "b1");

        URL url = new URL("dubbo", "localhost", 8081, map); //dubbo://localhost:8081?b.service=b1Service

        bService.sayHello(url);
    }
}
