package com.exemplo.projetogerenciamento.controller;

import com.exemplo.projetogerenciamento.model.Projeto;
import com.exemplo.projetogerenciamento.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @GetMapping
    public String listarProjetos(Model model) {
        List<Projeto> projetos = projetoService.listarProjetos();
        model.addAttribute("projetos", projetos);
        return "listaProjetos";
    }

    @PostMapping
    public String adicionarProjeto(Projeto projeto) {
        projetoService.salvarProjeto(projeto);
        return "redirect:/projetos";
    }
}
