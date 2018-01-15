package br.com.dpacanhella.generator.mapper;

import org.springframework.stereotype.Component;

import br.com.dpacanhella.generator.domain.TypeVariable;
import br.com.dpacanhella.generator.dto.TypeVariableDTO;
import br.com.dpacanhella.generator.utils.BaseMapper;

@Component
public class TypeVariableMapper extends BaseMapper<TypeVariable, TypeVariableDTO> {

    @Override
    public TypeVariableDTO toDTO(TypeVariable entity) {
        TypeVariableDTO dto = new TypeVariableDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setImportName(entity.getImportName());

        return dto;
    }

    @Override
    public TypeVariable toEntity(TypeVariableDTO dto) {
        TypeVariable entity = new TypeVariable();
        entity.setName(dto.getName());
        entity.setImportName(dto.getImportName());

        return entity;
    }

}
