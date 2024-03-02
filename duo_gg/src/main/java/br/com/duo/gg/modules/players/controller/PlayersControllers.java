package br.com.duo.gg.modules.players.controller;

import br.com.duo.gg.modules.players.PlayersEntity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class PlayersControllers {
    @PostMapping("/")
    public void registerPlayer(@Valid @RequestBody PlayersEntity playersEntity) {
        System.out.println("Player");
    }
}
