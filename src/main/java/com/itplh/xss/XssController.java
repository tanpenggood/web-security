package com.itplh.xss;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/xss")
public class XssController {

    private static String content = "";

    @PostMapping(value = "/add")
    public Mono<String> add(@RequestBody String c) {
        content = c;
        return Mono.just(content);
    }

    @PostMapping(value = "/add/no")
    public Mono<String> addNo(@RequestBody String c) {
        content = c.replaceAll("<", "&lt")
                .replaceAll(">", "&gt");
        return Mono.just(content);
    }

    @GetMapping(value = "/content")
    public Mono<String> content() {
        return Mono.just(content);
    }
}
