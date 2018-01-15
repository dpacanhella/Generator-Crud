package br.com.dpacanhella.generator.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "type_variables")
@Data
public class TypeVariable {
    
    @Id
    @Column(name = "type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "type_name", length = 20, nullable = false)
    private String name;
    
    @Column(name = "type_import_name", length = 200, nullable = false)
    private String importName;

}
