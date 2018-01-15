package br.com.dpacanhella.generator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dpacanhella.generator.domain.TypeVariable;
import br.com.dpacanhella.generator.dto.TypeVariableDTO;
import br.com.dpacanhella.generator.mapper.TypeVariableMapper;
import br.com.dpacanhella.generator.service.TypeVariableService;

@RestController
@RequestMapping("/type_variable")
public class TypeVariableController {

    @Autowired
    private TypeVariableService service;

    @Autowired
    private TypeVariableMapper mapper;

    @PostMapping
    public TypeVariableDTO save(@RequestBody TypeVariableDTO dto) {
        TypeVariable entity = service.save(mapper.toEntity(dto));

        return mapper.toDTO(entity);
    }

    @GetMapping
    public List<TypeVariableDTO> list() {
        List<TypeVariable> list = service.getAll();

        return mapper.toListDTO(list);
    }

    @GetMapping("/{id}")
    public TypeVariableDTO getOne(@PathVariable Long id) {
        TypeVariable entity = service.findOne(id);

        return mapper.toDTO(entity);
    }

    @PutMapping("/{id}")
    public TypeVariableDTO putOne(@PathVariable Long id, @RequestBody TypeVariableDTO dto) {
        TypeVariable entity = service.putOne(id, dto);

        return mapper.toDTO(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
