package com.example.EventManager.manages.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@Builder
public class EventDTO {
    @JsonProperty("name")
    public final String name;

    @JsonProperty("startingDate")
    @PastOrPresent(message = "Gelecek bir tarih seçiniz")
    public final LocalDate startingDate;

    @JsonProperty("endDate")
    @PastOrPresent(message = "Gelecek bir tarih seçiniz")
    public final LocalDate endDate;

    @JsonProperty("coordinateX")
    public final String coordinateX;

    @JsonProperty("coordinateY")
    public final String coordinateY;

    @JsonProperty("quota")
    public final Long quota;

    public EventDTO(@JsonProperty("name")String name,
                    @JsonProperty("startingDate") LocalDate startingDate,
                    @JsonProperty("endDate") LocalDate endDate,
                    @JsonProperty("coordinateX")String coordinateX,
                    @JsonProperty("coordinateY")String coordinateY,
                    @JsonProperty("quota")Long quota) {
        this.name = name;
        this.startingDate = startingDate;
        this.endDate = endDate;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.quota = quota;
    }
}
