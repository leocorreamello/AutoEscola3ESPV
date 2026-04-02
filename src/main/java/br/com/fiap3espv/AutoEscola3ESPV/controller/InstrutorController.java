package br.com.fiap3espv.AutoEscola3ESPV.controller;

import br.com.fiap3espv.AutoEscola3ESPV.instrutor.Instrutor;
import br.com.fiap3espv.AutoEscola3ESPV.instrutor.InstrutorDTO;
import br.com.fiap3espv.AutoEscola3ESPV.instrutor.InstrutorRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/instrutor")
public class InstrutorController {
    @Autowired
    private InstrutorRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarInstrutor(@RequestBody @Valid InstrutorDTO dados){
        Instrutor instrutor = new Instrutor(dados);
        repository.save(instrutor);
    }
}