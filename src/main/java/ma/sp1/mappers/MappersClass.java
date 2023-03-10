package ma.sp1.mappers;


import ma.sp1.dto.DtoClass;
import ma.sp1.entities.EntitiesClass;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MappersClass {
    public EntitiesClass convertDtoToEntity(DtoClass dto)
    {
         EntitiesClass entity = new EntitiesClass();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
    public DtoClass convertEntityToDto(EntitiesClass entity)
    {
        DtoClass dto = new DtoClass();
        dto.setId(dto.getId());
        dto.setName(dto.getName());
        return dto;
    }
    public List<EntitiesClass> convertDtosToEntitys (List<DtoClass>dtos)
    {
        return  dtos.stream().map(dto ->convertDtoToEntity(dto)).collect(Collectors.toList());
    }
    public  List<DtoClass>  convertEntitysToDtos (List<EntitiesClass> entitys)
    {
        return entitys.stream().map(entity -> convertEntityToDto(entity)).collect(Collectors
                        .toList());
    }
}
