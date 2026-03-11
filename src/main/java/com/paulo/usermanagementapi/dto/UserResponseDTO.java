package com.paulo.usermanagementapi.dto;

import com.paulo.usermanagementapi.entity.User;

public class UserResponseDTO {

        private Long id;
        private String nomeCompleto;
        private String email;
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
