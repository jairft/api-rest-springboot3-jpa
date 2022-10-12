package br.com.ibm.apirest.services;

import br.com.ibm.apirest.entities.Category;
import br.com.ibm.apirest.entities.User;
import br.com.ibm.apirest.repositories.CategoryRepository;
import br.com.ibm.apirest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return  categoryRepository.findAll();
    }

    public Category findById(Long id){
       Optional<Category> obj =  categoryRepository.findById(id);
       return  obj.get();
    }
}
