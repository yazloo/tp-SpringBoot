package ma.sp1.services;

import ma.sp1.dto.DtoClass;
import ma.sp1.mappers.MappersClass;
import ma.sp1.repositories.InterfaceRepositories;
import ma.sp1.repositories.RepositoriesClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicesClass implements InterfaceServices {
    private static  final Logger LOGGER= LoggerFactory.getLogger(ServicesClass.class);
    public InterfaceRepositories repos= new RepositoriesClass();
    public MappersClass mappers;

    public ServicesClass(InterfaceRepositories repos,MappersClass mappers)
    {
        this.repos=repos;
        this.mappers=mappers;
    }


    @Override
    public DtoClass create(DtoClass dto) {
        LOGGER.debug("start method create");
        return mappers.convertEntityToDto(repos.create(mappers.convertDtoToEntity(dto)));
    }

    @Override
    public DtoClass update(DtoClass dto) {
        LOGGER.debug("start method update");
        return mappers
                .convertEntityToDto(repos
                        .update(mappers
                                .convertDtoToEntity(dto)));
    }

    @Override
    public boolean delete(long id)
    {
        LOGGER.debug("start method update");

        return  repos.delete(id);

    }

    @Override
    public List<DtoClass> select(){
        LOGGER.debug("start method select");

        return mappers.convertEntitysToDtos(repos.select());
    }
}
