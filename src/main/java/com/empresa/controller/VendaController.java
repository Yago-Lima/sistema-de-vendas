package com.empresa.controller;
import com.empresa.model.ItemVenda;
import com.empresa.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Transactional
@Controller
@RequestMapping("vendas")
public class VendaController {
    @Autowired
    VendaRepository daoVenda;



    @GetMapping("/list")
    public ModelAndView listar(ModelMap model) {
            model.addAttribute("vendas", daoVenda.vendaList());
        return new ModelAndView("venda/list", model);
    }
   
    @GetMapping("/list/{id}")
    public ModelAndView listarItensVenda(@PathVariable("id") Long vendaId, ModelMap model) {
        List<ItemVenda> itensVenda = daoVenda.findByVendaId(vendaId);
        model.addAttribute("itensVenda", itensVenda);
        return new ModelAndView("venda/details", model);
    }
}
