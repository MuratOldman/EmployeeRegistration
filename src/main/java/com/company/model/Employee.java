package com.company.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Employee {
    //    @NotNull            // Except null, anything can be accepted
//    @NotEmpty           // Except null and empty String anything can be accepted
//    @NotBlank           // Except null, empty String and only space anything can be accepted.

    @NotBlank
    @Size(max = 12,min = 2,message = "size must be in 2-12 char")
    private String firstName;
    @NotBlank
    private String lastName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;
}
