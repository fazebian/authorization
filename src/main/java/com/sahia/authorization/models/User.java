package com.sahia.authorization.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.ZonedDateTime;
import java.util.Set;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    private Integer id;

    private String firsName;

    private String lastName;

    @NotBlank
    @Column(unique = true)
    private String email;
    @JsonIgnore
    private String password;

    private Boolean enabled;

    private Boolean confirmed;;

    private String avatar;

    private ZonedDateTime createdAt;

    private ZonedDateTime updatedAt;
    @ManyToMany
    private Set<Role> roles;

}
