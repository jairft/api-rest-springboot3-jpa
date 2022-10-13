package br.com.ibm.apirest.services;

import br.com.ibm.apirest.entities.User;
import br.com.ibm.apirest.repositories.UserRepository;
import br.com.ibm.apirest.services.exceptions.DatabaseException;
import br.com.ibm.apirest.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return  userRepository.findAll();
    }

    public User findById(Long id){
       Optional<User> obj =  userRepository.findById(id);
       return  obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }
    public User insert(User user) {
       return userRepository.save(user);
    }
    public void delete(Long id) {
        try {
            userRepository.deleteById(id);
        }catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        }catch (DataIntegrityViolationException e){

        }

    }
    public User update(Long id, User user) {
        try {
            User entity = userRepository.getReferenceById(id);
            updateData(entity, user);
            return  userRepository.save(entity);
        }catch (EntityNotFoundException e){
            e.printStackTrace();
            throw new ResourceNotFoundException(id);
        }
    }

    public void updateData(User entity, User user) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());
    }
}
