package br.com.ado.adopi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.ado.adopi.Repository.Repositorio;
import br.com.ado.adopi.model.Aluno;

@RestController
public class Controller {
    
    @Autowired
    private Repositorio acao;


    @GetMapping("/")
    public String greetings(){
        return "Hello, Word!!";
    }

    @PostMapping("/api")
    public Aluno cadastro(@RequestBody Aluno a){
        return acao.save(a);
    }

    @GetMapping("/api")
    public List<Aluno> listar(){
        return acao.findAll();
    }

    @GetMapping("api/{ra}")
    public Aluno listarRa(@PathVariable long ra){
        return acao.findByRA(ra);
    }

    @PutMapping("/api")
    public Aluno atualizar(@RequestBody Aluno al){
        return acao.save(al);
    }

    @DeleteMapping("api/{ra}")
    public void remover(@PathVariable long ra){
        Aluno aluno = listarRa(ra);
        acao.delete(aluno);
    }
}
