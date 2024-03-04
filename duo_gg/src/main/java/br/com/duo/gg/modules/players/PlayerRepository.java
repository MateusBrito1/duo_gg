package br.com.duo.gg.modules.players;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PlayerRepository extends JpaRepository<PlayersEntity, UUID> {

}
