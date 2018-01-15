package br.com.dpacanhella.generator.service;

import java.util.List;

import br.com.dpacanhella.generator.domain.InjectionImport;
import br.com.dpacanhella.generator.dto.InjectionImportDTO;

public interface InjectionImportService {

    InjectionImport save(InjectionImport entity);

    List<InjectionImport> getAll();

    InjectionImport findOne(Long id);

    InjectionImport put(Long id, InjectionImportDTO dto);

    void delete(Long id);

}
