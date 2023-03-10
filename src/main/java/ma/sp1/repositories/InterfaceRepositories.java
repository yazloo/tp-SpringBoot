package ma.sp1.repositories;

import ma.sp1.entities.EntitiesClass;

import java.util.List;

public interface InterfaceRepositories {

    EntitiesClass create(EntitiesClass entity);
    EntitiesClass update (EntitiesClass entity);
    boolean delete  (long id);
    List<EntitiesClass> select();


}
