package br.com.pedroangelo.todolist.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.favre.lib.crypto.bcrypt.BCrypt;

/**
 * Modificador
 * public
 * private
 * protected
 */

@RestController
@RequestMapping("/users")
public class UserController {

    /**
     * String (texto)
     * Intenger
     * Double
     * Float
     * Char
     * Date
     * Void (Apenas lógica - sem retorno)
     */

    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModal userModal) {

        var user = this.userRepository.findByUsername(userModal.getUsername());

        if(user != null) {
            //Mensagem de erro
            //Status code
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já existe");
        }

       var passwordHashred = BCrypt.withDefaults()
       .hashToString(12, userModal.getPassword().toCharArray());

       userModal.setPassword(passwordHashred);

        var userCreated = this.userRepository.save(userModal);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);

    }
    
}
