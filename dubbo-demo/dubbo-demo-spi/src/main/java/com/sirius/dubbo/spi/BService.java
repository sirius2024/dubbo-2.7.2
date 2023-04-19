package com.sirius.dubbo.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI
public interface BService {

    /**
     * @Adaptive 当前对象创建会根据方法参数，动态判断创建所需要的实现类
     */
    @Adaptive
    void sayHello(URL url);
}
