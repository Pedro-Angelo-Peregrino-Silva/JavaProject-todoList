package br.com.pedroangelo.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")



public class MinhaPrimeiraController {
    /**
     * Métodos de acesso HTTP
     * GET - Buscar uma informação
     * POST - Adicionar um dado / informação
     * PUT - Alterar um dado / Info (Alterar mais de 1 dado)
     * DELETE - Remover um dado
     * PATCH - Alterar somente uma parte da info / dado (Alterar apenas um dado)
     * 
     */

    
    // Método (funcionalidade) de uma classe
    @GetMapping("/")
    public String primeiraMensagem() {
        return "Funcionou";
    }

}
