package com.paulo.usermanagementapi.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "Dados necessários para criação ou atualização de um usuário")
public class CreateUserDTO {

    @Schema(description = "Nome completo do usuário", example = "Paulo Silva")
    @NotBlank(message = "Nome completo é obrigatório")
    private String nomeCompleto;

    @Schema(description = "E-mail do usuário", example = "paulo@email.com")
    @Email(message = "Email inválido")
    @NotBlank(message = "Email é obrigatório")
    private String email;

    @Schema(description = "Senha do usuário", example = "senha123", minLength = 6)
    @NotBlank(message = "Senha é obrigatória")
    private String senha;

    public CreateUserDTO() {

    }

    public String getNomeCompleto() { return nomeCompleto; }

    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }

    public void setSenha(String senha) { this.senha = senha; }

    public CreateUserDTO(String nomeCompleto, String email, String senha) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
    }
}
