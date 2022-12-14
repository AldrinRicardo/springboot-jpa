package course.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.springbootjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
