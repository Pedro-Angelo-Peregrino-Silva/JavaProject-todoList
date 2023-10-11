package br.com.pedroangelo.todolist.users;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<userModal, UUID> {
    UserModal findByUsername(String username);

}
