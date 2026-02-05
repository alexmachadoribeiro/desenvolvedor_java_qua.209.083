package com.eventos.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eventos.app.models.Evento;
import com.eventos.app.repository.EventosRepository;

@Controller
public class EventosController {
    @Autowired
    private EventosRepository csr;

    @RequestMapping(value="/", method=RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        Iterable<Evento> eventos = csr.findAll();
        mv.addObject("eventos", eventos);
        return mv;
    }

    @RequestMapping(value="/cadastrarEvento", method=RequestMethod.GET)
    public String cadastrarEvento() {
        return "cadastrar-evento";
    }

    @RequestMapping(value="/cadastrarEvento", method=RequestMethod.POST)
    public String cadastrarEvento(Evento evento) {
        csr.save(evento);
        return "redirect:/cadastroSucesso";
    }

    @RequestMapping("/cadastroSucesso")
    public String cadastroSucesso() {
        return "cadastro-sucesso";
    }
}
