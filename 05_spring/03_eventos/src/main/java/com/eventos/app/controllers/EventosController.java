package com.eventos.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @RequestMapping(value="/editarEvento/{idEvento}", method=RequestMethod.GET)
    public ModelAndView editarEvento(@PathVariable("idEvento") long idEvento) {
        Evento evento = csr.findByIdEvento(idEvento);
        ModelAndView mv = new ModelAndView("editar-evento");
        mv.addObject("evento", evento);
        return mv;
    }

    @RequestMapping(value="/editarEvento/{idEvento}", method=RequestMethod.POST)
    public String editarEvento(@Validated Evento evento, BindingResult result, RedirectAttributes attributes) {
        csr.save(evento);
        return "redirect:/alteracaoSucesso";
    }

    @RequestMapping("/alteracaoSucesso")
    public String alteracaoSucesso() {
        return "editar-sucesso";
    }

    @RequestMapping("/confirmarExclusao/{idEvento}")
    public ModelAndView confirmarExclusao(@PathVariable("idEvento") long idEvento) {
        Evento evento = csr.findByIdEvento(idEvento);
        ModelAndView mv = new ModelAndView("excluir-evento");
        mv.addObject("evento", evento);
        return mv;
    }

    @RequestMapping("/excluirEvento")
    public String excluirEvento(long idEvento) {
        Evento evento = csr.findByIdEvento(idEvento);
        csr.delete(evento);
        return "redirect:/";
    }
}
