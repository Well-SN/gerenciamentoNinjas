package com.ninjasNa.gerenciamentoNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boavindas")
    public String boaVindas(){
        return  "Essa é minha primeira mensagem";
    }

}
