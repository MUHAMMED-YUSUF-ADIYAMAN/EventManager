package com.example.EventManager.manages.entity;

import com.example.EventManager.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

@Entity
@Getter
@Setter
@SequenceGenerator(name = "idgen", sequenceName = "PARTICIPANT_SEQ")
@AllArgsConstructor
@NoArgsConstructor
public class Participant extends BaseEntity {



        @Column(name = "NAME")
        private String name;

        @Column(name = "SURNAME")
        private String surname;

        @Column(name = "TC_NO",unique = true)
        private Long tcKimlikNo;

        @Column(name = "EMAIL", unique = true)
        private String email;


}
