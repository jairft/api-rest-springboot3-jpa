package br.com.ibm.apirest.services;

import br.com.ibm.apirest.entities.Product;
import br.com.ibm.apirest.entities.User;
import br.com.ibm.apirest.repositories.ProductRepository;
import br.com.ibm.apirest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return  productRepository.findAll();
    }

    public Product findById(Long id){
       Optional<Product> obj =  productRepository.findById(id);
       return  obj.get();
    }
}
