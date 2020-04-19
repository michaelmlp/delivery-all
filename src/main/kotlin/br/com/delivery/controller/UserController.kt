package br.com.delivery.controller

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/rest/v1/users")
class UserController {

    @GetMapping
    fun user() = "Teste do endpoint de usuário";

    @PostMapping
    fun create(){

    }

    @PutMapping
    fun update(){

    }

    @DeleteMapping
    fun delete(){

    }
}