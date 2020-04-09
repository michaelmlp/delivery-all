package br.com.delivery.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/users")
class UserController {

    @GetMapping
    fun user() = "Teste do endpoint de usuário";
}