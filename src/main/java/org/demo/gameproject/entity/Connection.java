package org.demo.gameproject.entity;

import lombok.Getter;
import lombok.Setter;
import org.demo.gameproject.model.enums.PlayerLevels;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Connection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne()
    @JoinColumn(name ="region_id")
    private Region region;

    @OneToOne()
    @JoinColumn(name = "game_id")
    private Game game;

    @Column (nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private PlayerLevels playerLevel;
}
