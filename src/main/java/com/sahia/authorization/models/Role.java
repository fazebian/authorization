package com.sahia.authorization.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "roles")
@Slf4j
@NoArgsConstructor
@Getter
@Setter
public class Role {
    @Id
    private Integer id;
    @NotBlank
    @Column(unique = true)
    private String name;


    private String description;

}
