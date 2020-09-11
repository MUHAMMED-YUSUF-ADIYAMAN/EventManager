package com.example.EventManager.manages.repository;

import com.example.EventManager.manages.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.Optional;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
    Optional<Participant> findByTcKimlikNo(Long tcKimlikNo);

    boolean existsByTcKimlikNo(Long tcKimlikNo);

    @Transactional
    void deleteByTcKimlikNo(Long tcKimlikNo);
}
