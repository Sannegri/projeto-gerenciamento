package com.exemplo.projetogerenciamento.repository;

import com.exemplo.projetogerenciamento.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}
