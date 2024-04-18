package com.empresa.controller;

import com.empresa.model.PessoaJuridica;
import com.empresa.repository.PessoaRepository;
import com.empresa.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("pessoajuridica")
public class PessoaJuridicaController {
    @Autowired
    PessoaRepository dao;
    @GetMapping("/form")
    public ModelAndView form(PessoaJuridica pessoaJuridica, ModelMap model){
        model.addAttribute("pessoa", pessoaJuridica);
        return new ModelAndView("pessoa/form");
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("pessoa") PessoaJuridica pessoaJuridica){
        //save pessoaFisica
        return new ModelAndView("redirect:/pessoa/list");
    }

    @GetMapping("/list")
    public ModelAndView listar(ModelMap model) {
        model.addAttribute("pessoas", dao.pessoaList());
        return new ModelAndView("pessoa/list", model);
    }



}
