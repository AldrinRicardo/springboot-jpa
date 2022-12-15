package course.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.springbootjpa.entities.OrderItem;
import course.springbootjpa.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
