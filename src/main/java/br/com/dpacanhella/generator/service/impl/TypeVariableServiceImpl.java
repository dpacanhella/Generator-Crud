package br.com.dpacanhella.generator.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dpacanhella.generator.domain.TypeVariable;
import br.com.dpacanhella.generator.dto.TypeVariableDTO;
import br.com.dpacanhella.generator.repository.TypeVariableRepository;
import br.com.dpacanhella.generator.service.TypeVariableService;

@Service
public class TypeVariableServiceImpl implements TypeVariableService {

    @Autowired
    private TypeVariableRepository repository;

    @Override
    public TypeVariable save(TypeVariable typeVariable) {
        return repository.save(typeVariable);
    }

    @Override
    public List<TypeVariable> getAll() {
        return repository.findAll();
    }

    @Override
    public TypeVariable findOne(Long id) {
        return repository.findOne(id);
    }

    @Override
    public TypeVariable putOne(Long id, TypeVariableDTO dto) {
        TypeVariable entity = repository.findOne(id);

        entity.setName(dto.getName());
        entity.setImportName(dto.getImportName());

        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

}
