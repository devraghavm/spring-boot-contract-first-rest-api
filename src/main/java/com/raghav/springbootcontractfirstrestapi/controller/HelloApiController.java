package com.raghav.springbootcontractfirstrestapi.controller;

import com.raghav.springbootcontractfirstrestapi.api.HelloApi;
import com.raghav.springbootcontractfirstrestapi.models.Hello;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;


@RestController
public class HelloApiController implements HelloApi {
    @Override
    public Mono<ResponseEntity<Hello>> hello(ServerWebExchange exchange) {
        return Mono.just(new ResponseEntity<>(new Hello().text("Hello World!"), HttpStatus.OK));
    }

}
