package com.example.EventManager.manages.repository;

import com.example.EventManager.manages.entity.Event;
import com.example.EventManager.manages.entity.Participant;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.Optional;
@Data
public interface EventRepository extends JpaRepository<Event, String> {
    Optional<Participant> findByName(String name);

    boolean existsByName(String name);

    @Transactional
    void deleteByName(String name);
}
