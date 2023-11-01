package org.demo.gameproject.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PlayerLevels {

    NOOB(0),
    PRO(1),
    INVINCIBLE(2);

    private Integer type;

}
