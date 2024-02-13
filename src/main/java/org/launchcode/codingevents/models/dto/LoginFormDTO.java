package org.launchcode.codingevents.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LoginFormDTO {

    @NotNull
    @NotBlank
    @Size(min = 3, max = 20, message = "Invalid Username. Must be between 3 and 20 characters")
    private String username;

    @NotNull
    @NotBlank
    @Size(min = 5, max = 30, message = "Invalid Password. Must be between 5 and 30 characters")
    private String password;

    public String getUsername() {return username;}

    public void setUsername(String aUsername) {username=aUsername;}

    public String getPassword() {return password;}

    public void setPassword(String aPassword) {password=aPassword;}
}
