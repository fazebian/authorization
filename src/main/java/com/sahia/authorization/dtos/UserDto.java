package com.sahia.authorization.dtos;

import com.sahia.authorization.contraints.FieldMatch;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
    @FieldMatch.List({
            @FieldMatch(first = "password", second = "confirmPassword", message = "The password fields must match")
    })
    public class UserDto {
        @NotBlank(message = "The first name is required")
        private String firstName;

        @NotBlank(message = "The last name is required")
        private String lastName;

        @Email(message = "Email address is not valid")
        @NotBlank(message = "The email address is required")
        private String email;

        @Size(min = 6, message = "Must be at least 6 characters")
        private String password;

        @NotBlank(message = "The timezone is required")
        private String timezone;

        @NotBlank(message = "This field is required")
        private String confirmPassword;

        private String gender;

        private String avatar;

        private boolean enabled;

        private boolean confirmed;
}
