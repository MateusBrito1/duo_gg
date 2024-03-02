package br.com.duo.gg.modules.players;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "player")
public class PlayersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank()
    @NotBlank(message = "The [nickname] field must be filled in!")
    private String nickname;

    @NotBlank(message = "The [elo] field must be filled in!")
    private String elo;

    @NotBlank(message = "The [description] field must be filled in!")
    private String description;

    @NotBlank(message = "The [posicion] field must be filled in!")
    private String posicion;

    @NotBlank(message = "The [searchLane] field must be filled in!")
    private String searchLane;

    @NotBlank(message = "The [password] field must be filled in!")
    @Length(max = 4, message = "The length must be between 0 and 4")
    @Pattern(regexp = "(?!.*(\\d)\\1{3})\\d{4}", message = "The password cannot contain four repeated digits")
    private String password;

    @NotBlank(message = "The [gameMode] field must be filled in!")
    private String gameMode;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
