package br.com.delivery.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rest/v1/users")
class UserController {

    @GetMapping
    fun user() = "Teste do endpoint de usuário";
}