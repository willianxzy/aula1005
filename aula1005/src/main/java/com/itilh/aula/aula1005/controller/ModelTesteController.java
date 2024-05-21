package com.itilh.aula.aula1005.controller;

import org.springframework.web.bind.annotation.RestController;

import com.itilh.aula.aula1005.model.ModelTeste;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
public class ModelTesteController {

    private static final List<ModelTeste> itens = new ArrayList<ModelTeste>();


    @GetMapping("/teste/{posicao}")
    public ModelTeste getPosicao(@PathVariable int posicao) {

        return itens.get(posicao);        
    }

    @GetMapping("/testes")
    public List<ModelTeste> itens() {
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
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        
        return entity;
    }
    
    // apagar dados do Modelo no servidor // delete do CRUD
    @DeleteMapping("/teste/{posicao}")
    public String deletMethodName(@PathVariable int posicao) {
        itens.remove(posicao);
        return "Excluído.";
    }
    
 

}
