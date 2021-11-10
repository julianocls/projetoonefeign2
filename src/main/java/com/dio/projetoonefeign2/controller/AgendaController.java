package com.dio.projetoonefeign2.controller;

import com.dio.projetoonefeign2.domain.Contato;
import com.dio.projetoonefeign2.service.ConsumidorApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("agenda")
public class AgendaController {

    @Autowired
    private ConsumidorApi consumidorApi;

    @GetMapping
    public Contato retornaContato(){
        return consumidorApi.retornaContato();
    }

}