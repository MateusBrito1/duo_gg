package br.com.duo.gg.modules.players.controller;

import br.com.duo.gg.modules.players.PlayerRepository;
import br.com.duo.gg.modules.players.PlayersEntity;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class PlayersControllers {

    @Autowired
    private PlayerRepository playerRepository;
    @PostMapping("/")
    public PlayersEntity registerPlayer(@Valid @RequestBody PlayersEntity playersEntity) {
        return this.playerRepository.save(playersEntity);
    }
}
