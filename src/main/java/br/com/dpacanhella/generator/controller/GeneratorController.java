package br.com.dpacanhella.generator.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dpacanhella.generator.dto.GeneratorDTO;

@RestController
@RequestMapping("/generator")
public class GeneratorController {

    @PostMapping
    public void create(@RequestBody GeneratorDTO dto) { 
        System.out.println(dto);
    }
}
