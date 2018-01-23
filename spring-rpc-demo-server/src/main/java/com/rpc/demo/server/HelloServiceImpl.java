package com.rpc.demo.server;

import com.rpc.api.HelloService;
import com.rpc.api.Person;
import com.rpc.common.server.RpcService;

@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

    public String hello(String name) {
        return "Hello! " + name;
    }

    public String hello(Person person) {
        return "Hello! " + person.getFirstName() + " " + person.getLastName();
    }
}
