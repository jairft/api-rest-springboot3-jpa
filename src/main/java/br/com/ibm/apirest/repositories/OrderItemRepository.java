package br.com.ibm.apirest.repositories;

import br.com.ibm.apirest.entities.OrderItem;
import br.com.ibm.apirest.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
