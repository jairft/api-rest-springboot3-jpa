package br.com.ibm.apirest.repositories;

import br.com.ibm.apirest.entities.Category;
import br.com.ibm.apirest.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
