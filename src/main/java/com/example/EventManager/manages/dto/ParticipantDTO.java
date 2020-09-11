package com.example.EventManager.manages.dto;

import com.example.EventManager.manages.Validation.TcKimlikNo;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Builder
public class ParticipantDTO {

    @JsonProperty("name")
    @Size(min = 2, message = "İsim en az iki harfli olmalıdır.")
    public final String name;

    @JsonProperty("surname")
    @Size(min = 2, message = "Soyisim en az iki harfli olmalıdır.")
    public final String surname;

    @JsonProperty("tcKimlikNo")
    @TcKimlikNo(message = "TC Kimlik geçeli olmalı")
    public final Long tcKimlikNo;

    @JsonProperty("email")
    @Email(message = "Please enter a valid e-mail address!")
    @Size(max = 255, message = "E-mail can't be longer than 255!")
    public final String email;

    public ParticipantDTO(@JsonProperty("name") String name,
                          @JsonProperty("surname") String surname,
                          @JsonProperty("email") String email,
                          @JsonProperty("tcKimlikNo") Long tcKimlikNo){
        this.name = name;
        this.surname = surname;
        this.tcKimlikNo = tcKimlikNo;
        this.email = email;
    }


}
