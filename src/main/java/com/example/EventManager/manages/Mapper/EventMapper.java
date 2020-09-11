package com.example.EventManager.manages.Mapper;

import com.example.EventManager.manages.dto.EventDTO;
import com.example.EventManager.manages.entity.Event;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EventMapper {

    EventDTO mapToDto(Event event);

    Event mapToEntity(EventDTO eventDTO);

    List<EventDTO> mapToDto(List<Event> eventList);

    List<Event> mapToEntity(List<EventDTO> eventDTOList);
}
