package com.sahia.authorization.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Slf4j
@NoArgsConstructor
@Getter
@Setter
public class Role {
    @Id
    private Integer id;

    private String name ;

    private String description;

}
