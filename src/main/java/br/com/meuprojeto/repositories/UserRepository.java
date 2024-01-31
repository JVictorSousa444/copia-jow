package br.com.meuprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.meuprojeto.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	@Query("SELECT u FROM User u WHERE u.userName =:userName")
	User findByUserName(@Param("userName") String userName);
}
