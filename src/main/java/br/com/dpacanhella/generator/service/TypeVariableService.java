package br.com.dpacanhella.generator.service;

import java.util.List;

import br.com.dpacanhella.generator.domain.TypeVariable;
import br.com.dpacanhella.generator.dto.TypeVariableDTO;

public interface TypeVariableService {

    TypeVariable save(TypeVariable typeVariable);

    List<TypeVariable> getAll();

    TypeVariable findOne(Long id);

    TypeVariable putOne(Long id, TypeVariableDTO dto);

    void delete(Long id);

}
