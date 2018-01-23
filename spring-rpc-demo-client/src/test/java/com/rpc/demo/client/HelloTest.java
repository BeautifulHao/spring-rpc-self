package com.rpc.demo.client;

import com.rpc.api.HelloService;
import com.rpc.api.Person;
import com.rpc.common.server.RpcProxy;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class HelloTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void callHello() {

        RpcProxy rpcProxy = context.getBean(RpcProxy.class);

        HelloService helloService = rpcProxy.create(HelloService.class);
        String result = helloService.hello("World");

        Assert.assertTrue(result.indexOf("World")>0);

    }

    @Test
    public void callHelloForEntity() {

        Person person = new Person("Fu","Hao");

        RpcProxy rpcProxy = context.getBean(RpcProxy.class);

        HelloService helloService = rpcProxy.create(HelloService.class);
        String result = helloService.hello(person);

        System.out.println(result);

        Assert.assertTrue(result.indexOf("Fu")>0);

    }

    @Test
    public void callHelloVer() {

        RpcProxy rpcProxy = context.getBean(RpcProxy.class);

        HelloService helloService = rpcProxy.create(HelloService.class,"v2.0");
        String result = helloService.hello("World");

        Assert.assertTrue(result.indexOf("World")>0);

    }

    @Test
    public void callHelloForEntityVer() {

        Person person = new Person("Fu","Hao");

        RpcProxy rpcProxy = context.getBean(RpcProxy.class);

        HelloService helloService = rpcProxy.create(HelloService.class,"v2.0");
        String result = helloService.hello(person);

        System.out.println(result);

        Assert.assertTrue(result.indexOf("Fu")>0);

    }
}
