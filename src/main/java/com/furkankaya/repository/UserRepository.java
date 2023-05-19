package com.furkankaya.repository;

import com.furkankaya.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select c from User c where c.firstName = ?1")
    User getUserById(String firstName);

}
