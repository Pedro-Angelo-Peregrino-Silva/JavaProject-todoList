package br.com.pedroangelo.todolist.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * public
 * private
 * protected
 */

@RestController
@RequestMapping("/users")
public class userController {

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
    public userModal create(@RequestBody userModal userModal) {

        var user = this.userRepository.findByUsername(userModal.getUsername());

        if(user != null) {
            System.out.println("Usuário existente.");
            return null;
        }

        var userCreated = this.userRepository.save(userModal);
        return userCreated;

    }
    
}
