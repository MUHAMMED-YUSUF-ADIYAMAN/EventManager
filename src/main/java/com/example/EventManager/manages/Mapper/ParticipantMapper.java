package com.example.EventManager.manages.Mapper;

import com.example.EventManager.manages.dto.ParticipantDTO;
import com.example.EventManager.manages.entity.Participant;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface ParticipantMapper {

    ParticipantDTO mapToDto(Participant participant);

    Participant mapToEntity(ParticipantDTO participantDTO);

    List<ParticipantDTO> mapToDto(List<Participant> participantList);

    List<Participant> mapToEntity(List<ParticipantDTO> participantDTOList);
}