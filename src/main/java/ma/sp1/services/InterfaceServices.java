package ma.sp1.services;

import ma.sp1.dto.DtoClass;

import java.util.List;

public interface InterfaceServices {

    DtoClass create (DtoClass dto);
    DtoClass update  (DtoClass dto);
    boolean delete (long id);
    List<DtoClass> select();

}
