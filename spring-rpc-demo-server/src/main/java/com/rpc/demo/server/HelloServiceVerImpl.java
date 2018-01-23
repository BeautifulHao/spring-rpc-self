package com.rpc.demo.server;

import com.rpc.api.HelloService;
import com.rpc.api.Person;
import com.rpc.common.server.RpcService;

@RpcService(value = HelloService.class,version = "v2.0")
public class HelloServiceVerImpl implements HelloService {

    public String hello(String name) {
        return "Hello! " + name+" @v2.0";
    }

    public String hello(Person person) {
        return "Hello! " + person.getFirstName() + " " + person.getLastName()+" @v2.0";
    }
}
