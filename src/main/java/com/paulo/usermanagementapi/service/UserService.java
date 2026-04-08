package com.paulo.usermanagementapi.service;

import com.paulo.usermanagementapi.dto.CreateUserDTO;
import com.paulo.usermanagementapi.entity.User;
import com.paulo.usermanagementapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.paulo.usermanagementapi.dto.UserResponseDTO;


import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserResponseDTO> findAll() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(UserResponseDTO::new)
                .toList();
    }

    public UserResponseDTO findById(Long id){
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
           return new UserResponseDTO(user);
    }

    public UserResponseDTO createUser(CreateUserDTO dto){
        if (userRepository.findByEmail(dto.getEmail()).isPresent()){
            throw new RuntimeException("Email já cadastrado");
        }
        User user = new User();

        user.setNomeCompleto(dto.getNomeCompleto());
        user.setEmail(dto.getEmail());
        user.setSenhaHash(dto.getSenha());
        user.setAtivo(true);
        user.setDataCriacao(LocalDateTime.now());

        user = userRepository.save(user);
        return new UserResponseDTO(user);
    }

    public UserResponseDTO update(Long id, CreateUserDTO dto){
        User user = userRepository.getReferenceById(id);

        user.setNomeCompleto(dto.getNomeCompleto());
        user.setEmail(dto.getEmail());
        user.setSenhaHash(dto.getSenha());

        user = userRepository.save(user);
        return new UserResponseDTO(user);
    }

    public void delete(Long id){
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("Usuario não encontrado");
        }
        userRepository.deleteById(id);
    }


}
