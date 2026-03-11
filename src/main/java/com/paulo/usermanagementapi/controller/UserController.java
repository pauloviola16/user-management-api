package com.paulo.usermanagementapi.controller;
import com.paulo.usermanagementapi.dto.CreateUserDTO;
import com.paulo.usermanagementapi.dto.UserResponseDTO;
import com.paulo.usermanagementapi.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDTO> insert(@Valid @RequestBody CreateUserDTO dto) {

        UserResponseDTO user = userService.insert(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> findAll() {

        List<UserResponseDTO> users = userService.findAll();

        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> findById(@PathVariable Long id) {

        UserResponseDTO user = userService.findById(id);

        return ResponseEntity.ok(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDTO> update (@PathVariable Long id, @RequestBody CreateUserDTO dto){
        UserResponseDTO user = userService.update(id,dto);

        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        userService.delete(id);

        return ResponseEntity.noContent().build();
    }

}
