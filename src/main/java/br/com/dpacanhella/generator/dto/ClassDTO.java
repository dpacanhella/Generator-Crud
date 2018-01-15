package br.com.dpacanhella.generator.dto;

import java.util.List;

import lombok.Data;

@Data
public class ClassDTO {

    private String className;
    private String tableName;
    private List<InjectionImportDTO> classInjectionsDTO;
}
