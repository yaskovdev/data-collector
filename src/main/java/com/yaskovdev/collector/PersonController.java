package com.yaskovdev.collector;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
class PersonController {

    private final PersonService service;

    @PostMapping("/persons")
    void save(@Validated @RequestBody final Person person) {
        service.send(person);
    }
}
