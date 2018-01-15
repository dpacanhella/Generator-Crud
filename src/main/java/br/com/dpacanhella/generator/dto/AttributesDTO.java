package br.com.dpacanhella.generator.dto;

import lombok.Data;

@Data
public class AttributesDTO {

    private String attributeName;
    private String attributeColumnName;
    private InjectionImportDTO injectionDTO;
    private TypeVariableDTO variableDTO;
}
