package com.dynamicproxy.mian;


import com.dynamicproxy.MetricsCollector;
import com.dynamicproxy.RequestInfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: 动态代理
 * @Author: yanzhihao
 * @Date: 2022/1/25 1:47 下午
 */
public class MetricsCollectorProxy {
    private MetricsCollector metricsCollector;

    public MetricsCollectorProxy() {
        this.metricsCollector = new MetricsCollector();
    }

    public Object createProxy(Object proxyObject) {
        // 需要代理的类实现的所有接口
        Class<?> [] interfaces = proxyObject.getClass().getInterfaces();
        // 代理执行方法
        DynamicProxyHandler handler = new DynamicProxyHandler(proxyObject);
        // 将类加载器、需要代理的类实现的所有接口、代理执行方法handler 作为参数传入，创建代理对象
        return Proxy.newProxyInstance(proxyObject.getClass().getClassLoader(), interfaces, handler);
    }

    private class DynamicProxyHandler implements InvocationHandler {
        private Object proxyObject;

        public DynamicProxyHandler(Object proxyObject) {
            this.proxyObject = proxyObject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            long startTimestamp = System.currentTimeMillis();

            // 执行需要代理的方法
            Object result = method.invoke(proxyObject, args);

            // 以上执行完成后，开始执行下面通过动态代理后附加的操作
            long endTimestamp = System.currentTimeMillis();
            long responseTime = endTimestamp - startTimestamp;
            String apiName = proxyObject.getClass().getName() + ":" + method.getName();
            RequestInfo requestInfo = new RequestInfo(apiName, responseTime, startTimestamp, endTimestamp);
            metricsCollector.recordRequest(requestInfo);
            return result;
        }
    }
}
