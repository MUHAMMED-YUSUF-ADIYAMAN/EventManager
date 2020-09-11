package com.example.EventManager.manages.repository;

import com.example.EventManager.manages.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByTcKimlikNo(Long tcKimlikNo);

    boolean existsByTcKimlikNo(Long tcKimlikNo);

    @Transactional
    void deleteByTcKimlikNo(Long tcKimlikNo);
}