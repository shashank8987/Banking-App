package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message = "AccountNumber shouldn't be empty")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "account number must be of 10 digit")
    private Long accountNumber;

    @NotEmpty(message = "accountType cannot be empty")
    private String accountType;

    @NotEmpty(message = "branchAddress cannot be empty")
    private String branchAddress;
}
