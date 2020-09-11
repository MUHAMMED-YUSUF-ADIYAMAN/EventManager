package com.example.EventManager.manages.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@SequenceGenerator(name = "idgen", sequenceName = "EVENT_SEQ")
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    @Column(name = "NAME",unique = true)
    private String name;

    @Column(name = "STARTING_DATE")
    private LocalDate startingDate;

    @Column(name = "END_DATE")
    private LocalDate endDate;

    @Column(name = "COORDINATE_X")
    private String coordinateX;

    @Column(name = "COORDINATE_Y")
    private String coordinateY;

    @Column(name = "QUOTA")
    private Long quota;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "PARTICIPANT_ID")
    private Set<Participant> participants;





}
