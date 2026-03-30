package com.paulo.usermanagementapi.dto;

import com.paulo.usermanagementapi.entity.User;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Dados retornados de um usuário")
public class UserResponseDTO {

        @Schema(description = "ID único do usuário", example = "1")
        private Long id;

        @Schema(description = "Nome completo do usuário", example = "Paulo Silva")
        private String nomeCompleto;

        @Schema(description = "E-mail do usuário", example = "paulo@email.com")
        private String email;

        @Schema(description = "Indica se o usuário está ativo", example = "true")
        private Boolean ativo;

        public UserResponseDTO(User user) {
                this.id = user.getId();
                this.nomeCompleto = user.getNomeCompleto();
                this.email = user.getEmail();
                this.ativo = user.isAtivo();
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

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

        public Boolean getAtivo() {
                return ativo;
        }

        public void setAtivo(Boolean ativo) {
                this.ativo = ativo;
        }
}