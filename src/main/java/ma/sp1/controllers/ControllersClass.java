package ma.sp1.controllers;

import ma.sp1.dto.DtoClass;
import ma.sp1.services.ServicesClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/www")



public class ControllersClass {
    private static  final Logger LOGGER= LoggerFactory.getLogger(ControllersClass.class);

     private ServicesClass service;

      public ControllersClass(ServicesClass service)
     {
         this.service=service;
     }

        @PostMapping("/save")
        public DtoClass save(@RequestBody DtoClass dto){
            LOGGER.debug("start save dto : {}",dto);
            DtoClass result = service.create(dto);
            LOGGER.debug("end save");
            return  result;

    }

    @PutMapping("/update")
    public DtoClass update(@RequestBody DtoClass dto){
        LOGGER.debug("start update dto : {}",dto);
        DtoClass result=service.update(dto);
        LOGGER.debug("end  update");
        return result;



    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") long id){
        LOGGER.debug("start delete id : "+ id);
        boolean result = service.delete(id);
        LOGGER.debug("end  delete");
        return  result;

    }

    @GetMapping("/read")
    public List<DtoClass> selectAll(){
        LOGGER.debug("start  selectAll");
        List<DtoClass> lst=service.select();
        LOGGER.debug("end methode selectAll");
        return lst;
    }





}
