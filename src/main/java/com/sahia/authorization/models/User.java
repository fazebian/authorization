package com.sahia.authorization.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.ZonedDateTime;

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

    private String email;

    private String password;

    private Boolean enabled;

    private Boolean confirmed;;

    private String avatar;

    private ZonedDateTime createdAt;

    private ZonedDateTime updatedAt;

}
