package com.example.EventManager.manages.entity;

import com.example.EventManager.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@SequenceGenerator(name = "idgen", sequenceName = "User_SEQ")
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity {
    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "TC_NO",unique = true)
    private Long tcKimlikNo;

    @Column(name = "TEL_NO",unique = true)     //https://wa.me/905078983233  tel no ile wp üzerinden direk mesajlaşma için almıştım
    private Long tel_no;         // kullancak kadar ilerlemedim.

    @Column(name = "PASSWORD")
    private String pasword;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "EVENT_ID")
    private Set<Event> events;

}
