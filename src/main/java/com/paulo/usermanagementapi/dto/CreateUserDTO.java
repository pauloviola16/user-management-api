package com.paulo.usermanagementapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class CreateUserDTO {

    @NotBlank(message = "Nome completo é obrigatório")
    private String nomeCompleto;

    @Email(message = "Email inválido")
    @NotBlank(message = "Email é obrigatório")
    private String email;

    @NotBlank(message = "Senha é obrigatória")
    private String senha;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
