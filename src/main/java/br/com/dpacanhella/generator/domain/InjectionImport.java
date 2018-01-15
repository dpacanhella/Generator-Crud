package br.com.dpacanhella.generator.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "injection_import")
@Data
public class InjectionImport {

    @Id
    @Column(name = "injection_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "injection_name", length = 200, nullable = false)
    private String name;
    
    @Column(name = "injection_import_name", length = 200)
    private String importName;
}
