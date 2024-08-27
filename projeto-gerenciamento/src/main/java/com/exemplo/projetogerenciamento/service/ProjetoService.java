package com.exemplo.projetogerenciamento.service;

import com.exemplo.projetogerenciamento.model.Projeto;
import com.exemplo.projetogerenciamento.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    @Transactional
    public void salvarProjeto(Projeto projeto) {
        projetoRepository.save(projeto);
    }

    public List<Projeto> listarProjetos() {
        return projetoRepository.findAll();
    }
}
