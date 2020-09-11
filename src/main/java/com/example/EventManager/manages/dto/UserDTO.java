package com.example.EventManager.manages.dto;

import com.example.EventManager.manages.Validation.TcKimlikNo;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import javax.validation.constraints.Size;

@Builder
public class UserDTO {
    @JsonProperty("name")
    @Size(min = 2, message = "İsim en az iki harfli olmalıdır.")
    public final String name;

    @JsonProperty("surname")
    @Size(min = 2, message = "Soyisim en az iki harfli olmalıdır.")
    public final String surname;

    @JsonProperty("tcKimlikNo")
    @TcKimlikNo(message = "TC Kimlik geçeli olmalı")
    public final Long tcKimlikNo;

    @JsonProperty("telno")
    public final Long tel_no;

    @JsonProperty("pasword")
    public final String pasword;

    public UserDTO(  @JsonProperty("name") String name,
                     @JsonProperty("surname") String surname,
                     @JsonProperty Long tcKimlikNo,
                     @JsonProperty Long tel_no,
                     @JsonProperty String pasword) {
        this.name = name;
        this.surname = surname;
        this.tcKimlikNo = tcKimlikNo;
        this.tel_no = tel_no;
        this.pasword = pasword;
    }
}
