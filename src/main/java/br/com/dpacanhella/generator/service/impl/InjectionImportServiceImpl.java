package br.com.dpacanhella.generator.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dpacanhella.generator.domain.InjectionImport;
import br.com.dpacanhella.generator.dto.InjectionImportDTO;
import br.com.dpacanhella.generator.repository.InjectionImportRepository;
import br.com.dpacanhella.generator.service.InjectionImportService;

@Service
public class InjectionImportServiceImpl implements InjectionImportService {

    @Autowired
    private InjectionImportRepository repository;

    @Override
    public InjectionImport save(InjectionImport entity) {
        return repository.save(entity);
    }

    @Override
    public List<InjectionImport> getAll() {
        return repository.findAll();
    }

    @Override
    public InjectionImport findOne(Long id) {
        return repository.findOne(id);
    }

    @Override
    public InjectionImport put(Long id, InjectionImportDTO dto) {
        InjectionImport entity = repository.findOne(id);

        entity.setName(dto.getName());
        entity.setImportName(dto.getImportName());

        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

}
