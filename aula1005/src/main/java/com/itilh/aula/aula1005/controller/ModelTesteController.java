package com.itilh.aula.aula1005.controller;

import org.springframework.web.bind.annotation.RestController;

import com.itilh.aula.aula1005.model.ModelTeste;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
public class ModelTesteController {

    private static final HashSet<ModelTeste> itens = new HashSet<ModelTeste>();


    @GetMapping("/teste/{id}")
    public ModelTeste getPosicao(@PathVariable BigInteger id) {
        ModelTeste alvo = new ModelTeste();
        alvo.setId(id);
        for (ModelTeste item : itens) {
            if (item.equals(alvo))
            return item;
        }
        return alvo;
    }

    @GetMapping("/testes")
    public HashSet<ModelTeste> itens() {
        return itens;
    }
    
    
    
    // criar uma nova Instancia do modelo no servidor //create do CRUD
    @PostMapping("/teste")
    public ModelTeste createModelTeste(@RequestBody ModelTeste novo) {
        
        itens.add(novo);
        
        return novo;
    }

    // atualizar dados do Modelo no servidor // update do CRUD
    @PutMapping("/teste/{id}")
    public ModelTeste putMethodName(@PathVariable BigInteger id, @RequestBody ModelTeste novo) {
        ModelTeste alvo = new ModelTeste();
        alvo.setId(id);
        for (ModelTeste item : itens) {
            if (item.equals(alvo)){
            item.setNome(novo.getNome());
            return item;
        }
        }
        return alvo;
    }
    
    // apagar dados do Modelo no servidor // delete do CRUD
    @DeleteMapping("/teste/{id}")
    public String deletMethodName(@PathVariable BigInteger id) {
        ModelTeste alvo = new ModelTeste();
        alvo.setId(id);
        
        itens.remove(alvo);
        return "Excluído.";
    }
}
