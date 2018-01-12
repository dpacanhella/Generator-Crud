package br.com.dpacanhella.generator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/design-patterns")
public class GeneratorController {

    @GetMapping
    public String calculador() {
       return "testes";
    }
}
