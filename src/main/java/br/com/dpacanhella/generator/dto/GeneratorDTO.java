package br.com.dpacanhella.generator.dto;

import java.util.List;

import lombok.Data;

@Data
public class GeneratorDTO {

    private String packageName;
    private ClassDTO classDTO;
    private List<AttributesDTO> attributesDTO;
    
}
