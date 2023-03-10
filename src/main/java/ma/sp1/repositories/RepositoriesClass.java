package ma.sp1.repositories;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ma.sp1.entities.EntitiesClass;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class RepositoriesClass implements InterfaceRepositories {
    private static  final Logger  LOGGER= LoggerFactory.getLogger(RepositoriesClass.class);


    @Override
    public EntitiesClass create(EntitiesClass entity) {
        LOGGER.debug("start methode create");
        LOGGER.debug("end methode create");
        return  entity;

    }

    @Override
    public EntitiesClass update(EntitiesClass entity) {
        LOGGER.debug("start methode update");
        LOGGER.debug("end methode update");
        return new EntitiesClass();
    }

    @Override
    public boolean delete(long id) {
        LOGGER.debug("start methode delete");
        LOGGER.debug("end methode delete");
        return true;
    }

    @Override

        public List<EntitiesClass> select() {
            LOGGER.debug("start methode readAll");

            LOGGER.debug("end methode readAll");
            return new ArrayList<EntitiesClass>();

    }
}
