package course.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.springbootjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
