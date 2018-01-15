package br.com.dpacanhella.generator.mapper;

import org.springframework.stereotype.Component;

import br.com.dpacanhella.generator.domain.InjectionImport;
import br.com.dpacanhella.generator.dto.InjectionImportDTO;
import br.com.dpacanhella.generator.utils.BaseMapper;

@Component
public class InjectionImportMapper extends BaseMapper<InjectionImport, InjectionImportDTO> {

    @Override
    public InjectionImportDTO toDTO(InjectionImport entity) {
        InjectionImportDTO dto = new InjectionImportDTO();

        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setImportName(entity.getImportName());

        return dto;
    }

    @Override
    public InjectionImport toEntity(InjectionImportDTO dto) {
        InjectionImport entity = new InjectionImport();

        entity.setName(dto.getName());
        entity.setImportName(dto.getImportName());

        return entity;
    }

}
