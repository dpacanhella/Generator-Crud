package br.com.dpacanhella.generator.dto;

import java.util.List;

import lombok.Data;

@Data
public class AttributesDTO {

    private String attributeName;
    private String attributeColumnName;
    private List<InjectionImportDTO> injectionDTO;
    private TypeVariableDTO variableDTO;
}
