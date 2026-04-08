package com.paulo.usermanagementapi.service;
import com.paulo.usermanagementapi.dto.CreateUserDTO;
import com.paulo.usermanagementapi.dto.UserResponseDTO;
import com.paulo.usermanagementapi.entity.User;
import com.paulo.usermanagementapi.repository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @Test
    @DisplayName("Achar pessoas pelo ID com sucesso")
    void findUserByIdWithSuccess() {

        User user = new User();

        user.setId(1L);
        user.setNomeCompleto("Paulo César Viola Neto");
        user.setEmail("paulo@dev.com");

        when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        UserResponseDTO response = userService.findById(1L);

        assertEquals("Paulo César Viola Neto", response.getNomeCompleto());

        verify(userRepository, times(1)).findById(1L);

    }

    @Test
    @DisplayName("Criar usuário com sucesso")
    void createUserWithSuccess() {

        CreateUserDTO dto = new CreateUserDTO();
        dto.setSenha("123456");
        dto.setEmail("paulo@dev.com");
        dto.setNomeCompleto("Paulo César Viola Neto");

        User usuarioSalvo = new User();
        usuarioSalvo.setNomeCompleto("Paulo César Viola Neto");
        usuarioSalvo.setEmail("paulo@dev.com");
        usuarioSalvo.setId(1L);

        when(userRepository.save(any(User.class))).thenReturn(usuarioSalvo);

       UserResponseDTO response = userService.createUser(dto);

        assertNotNull(response);
        assertEquals(1L, response.getId());
        assertEquals("Paulo César Viola Neto", response.getNomeCompleto());
        assertEquals("paulo@dev.com", response.getEmail());

        verify(userRepository, times(1)).save(any(User.class));

    }

    @Test
    @DisplayName("Lançar exceção ao buscar usuário com ID inexistente")
    void findUserByIdNotFound(){
        when(userRepository.findById(99L)).thenReturn(Optional.empty());

        assertThrows(RuntimeException.class, () -> {
            userService.findById(99L);
        });
    }

    @Test
    @DisplayName("Lançar exceção ao tentar deletar usuário com ID inexistente")
    void deleteUserNotFound(){
        when(userRepository.existsById(99L)).thenReturn(false);

        assertThrows(RuntimeException.class, () -> {
            userService.delete(99L);
        });
    };


    @Test
    @DisplayName("Deletar usuário pelo ID")
    void deleteUserWithSuccess(){
        when(userRepository.existsById(1L)).thenReturn(true);

        userService.delete(1L);

        verify(userRepository,times(1)).deleteById(1L);
    };






}