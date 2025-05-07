package com.prata.agendador_tarefas.business.mapper;

import com.prata.agendador_tarefas.business.dto.TarefasDTO;
import com.prata.agendador_tarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    @Mapping(source = "id", target = "id")
    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
