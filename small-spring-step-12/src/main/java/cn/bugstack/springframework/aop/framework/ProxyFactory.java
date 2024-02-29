package cn.bugstack.springframework.aop.framework;

import cn.bugstack.springframework.aop.AdvisedSupport;

/**
 * Factory for AOP proxies for programmatic use, rather than via a bean
 * factory. This class provides a simple way of obtaining and configuring
 * AOP proxies in code.
 * <p>
 *
 *
 *
 *
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public class ProxyFactory {

    private AdvisedSupport advisedSupport;

    public ProxyFactory(AdvisedSupport advisedSupport) {
        this.advisedSupport = advisedSupport;
    }

    public Object getProxy() {
        return createAopProxy().getProxy();
    }

    /**
     * JdkDynamicAopProxy implements AopProxy, InvocationHandler
     * Cglib2AopProxy implements AopProxy
     *
     * @return AopProxy
     */
    private AopProxy createAopProxy() {

        if (advisedSupport.isProxyTargetClass()) {
            return new Cglib2AopProxy(advisedSupport);
        }
        //注意jdk还实现了InvocationHandler
        return new JdkDynamicAopProxy(advisedSupport);
    }

}
