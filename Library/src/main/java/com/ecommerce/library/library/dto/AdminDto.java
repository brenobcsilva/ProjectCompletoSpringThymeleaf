package com.ecommerce.library.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Lob;
import javax.validation.constraints.Size;

@Data @NoArgsConstructor @AllArgsConstructor
public class AdminDto {

    @Size(min = 3, max=10, message =
            "Invalid first name(3-10 characters)")
    private String firstName;
    @Size(min = 3, max=10, message =
            "Invalid first name(3-10 characters)")
    private String lastName;

    private String username;
    @Size(min = 3, max=10, message =
            "Invalid first name(3-10 characters)")
    private String password;

    private String repeatPassword;

}
