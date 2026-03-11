package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message = "name cannot be empty or null")
    @Size(min = 5,max = 30,message = "the name length of the customer should be between 5 and 30")
    private String name;

    @NotEmpty(message = "email cannot be empty or null")
    @Email(message = "Email address should be valid once")
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})",message = "mobile number must be of 10 digit")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
