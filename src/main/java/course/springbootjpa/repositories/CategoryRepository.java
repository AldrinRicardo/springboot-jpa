package course.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.springbootjpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
