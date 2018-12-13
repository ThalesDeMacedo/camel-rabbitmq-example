package com.example.demo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TesteRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("rabbitmq://localhost/tes?connectionFactory=#customConnectionFactory")
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        System.out.println("AAAAA");
                    }
                });
    }
}
