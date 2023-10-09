package br.com.pedroangelo.todolist.users;

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

     @PostMapping("/")
    public void create(@RequestBody userModal userModal) {
        System.out.println(userModal.name);
    }
    
}
