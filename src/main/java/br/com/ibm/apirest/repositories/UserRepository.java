package br.com.ibm.apirest.repositories;

import br.com.ibm.apirest.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
