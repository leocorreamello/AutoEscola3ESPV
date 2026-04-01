package br.com.fiap3espv.AutoEscola3ESPV.controller;

import br.com.fiap3espv.AutoEscola3ESPV.instrutor.InstrutorDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/instrutor")
public class InstrutorController {

    @PostMapping
    public void cadastrarInstrutor(@RequestBody InstrutorDTO dados){
        System.out.println(dados);
    }
}