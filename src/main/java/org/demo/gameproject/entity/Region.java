package org.demo.gameproject.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String regionName;
    private String regionNameAbbreviation;

}
