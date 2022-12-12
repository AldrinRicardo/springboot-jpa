package course.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.springbootjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
