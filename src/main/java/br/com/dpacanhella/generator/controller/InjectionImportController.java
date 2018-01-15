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

import br.com.dpacanhella.generator.domain.InjectionImport;
import br.com.dpacanhella.generator.dto.InjectionImportDTO;
import br.com.dpacanhella.generator.mapper.InjectionImportMapper;
import br.com.dpacanhella.generator.service.InjectionImportService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/injection_import")
public class InjectionImportController {

    @Autowired
    private InjectionImportService service;

    @Autowired
    private InjectionImportMapper mapper;

    @PostMapping
    public InjectionImportDTO save(@RequestBody InjectionImportDTO dto) {
        InjectionImport entity = service.save(mapper.toEntity(dto));

        return mapper.toDTO(entity);
    }

    @GetMapping
    public List<InjectionImportDTO> list() {
        List<InjectionImport> list = service.getAll();
        
        return mapper.toListDTO(list);
    }
    
    @GetMapping("/{id}")
    public InjectionImportDTO getOne(@PathVariable Long id) {
        InjectionImport entity = service.findOne(id);
        
        return mapper.toDTO(entity);
    }
    
    @PutMapping("/{id}")
    public InjectionImportDTO putOne(@PathVariable Long id, @RequestBody InjectionImportDTO dto) {
        InjectionImport entity = service.put(id, dto);
        
        return mapper.toDTO(entity);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
