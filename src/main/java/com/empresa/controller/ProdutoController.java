package com.empresa.controller;

import com.empresa.model.Produto;
import com.empresa.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Transactional
@Controller
@RequestMapping("produtos")
public class ProdutoController {
    @Autowired
    ProdutoRepository dao;

    @GetMapping("/form")
    public String form(Produto produto) {
        return "produto/form";
    }

    @GetMapping("/list")
    public ModelAndView listar(ModelMap model) {
        model.addAttribute("Produtos", dao.produtoList());
        return new ModelAndView("produto/list", model);
    }


    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Integer id, ModelMap model) {
        model.addAttribute("produto", dao.produto(id));
        return new ModelAndView("produto/form", model);
    }

    @PostMapping("/update/{id}")
    public ModelAndView update(@ModelAttribute("produto") Produto produto) {
        dao.update(produto);
        return new ModelAndView("redirect:/produtos/list");
    }


    @PostMapping("/save")
    public ModelAndView save(Produto Produto) {
        dao.save(Produto);
        return new ModelAndView("redirect:/produtos/list");
    }

    @GetMapping("/remove/{id}")
    public ModelAndView remove(@PathVariable("id") Integer id) {
        dao.remove(id);
        return new ModelAndView("redirect:/produtos/list");
    }
}
