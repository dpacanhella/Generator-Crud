package br.com.dpacanhella.generator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dpacanhella.generator.domain.TypeVariable;

@Repository
public interface TypeVariableRepository extends JpaRepository<TypeVariable, Long> {

}
