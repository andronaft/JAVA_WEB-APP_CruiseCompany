package org.galun;


import org.galun.model.*;
import org.galun.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final CruiseServiceImpl cruiseService;
    private final CruiseStopsServiceImpl cruiseStopsService;
    private final ExcursionServiceImpl excursionService;
    private final PortServiceImpl portService;
    private final ShipServiceImpl shipService;
    private final UserServiceImpl userService;

    @Autowired
    public Controller(@Qualifier("CruiseServiceImpl") CruiseServiceImpl cruiseService, @Qualifier("CruiseStopsServiceImpl") CruiseStopsServiceImpl cruiseStopsService,@Qualifier("ExcursionServiceImpl") ExcursionServiceImpl excursionService,@Qualifier("PortServiceImpl") PortServiceImpl portService,@Qualifier("ShipServiceImpl") ShipServiceImpl shipService, @Qualifier("UserServiceImpl") UserServiceImpl userService) {
        this.cruiseService = cruiseService;
        this.cruiseStopsService = cruiseStopsService;
        this.excursionService = excursionService;
        this.portService = portService;
        this.shipService = shipService;
        this.userService = userService;
    }


    @PostMapping("/login")
    String login(@RequestBody UserEntity userEntity) {
        return userService.login(userEntity).toString();
    }

    @PostMapping("/registration")
    void registration(@RequestBody UserEntity userEntity) {
        userService.registration(userEntity);
    }

    @PostMapping("/getUserById")
    String getUserById(@RequestBody UserEntity userEntity){

        return userService.getById(userEntity).toString();
    }

    @PostMapping("/getExcursion")
    String getUserById(@RequestBody UserEntity userEntity, @RequestBody ExcursionEntity excursionEntity){

        userEntity.setExcursionId(excursionEntity.getId());
        return userService.update(userEntity).toString();
    }

    @PostMapping("/addStop")
    void addStop(@RequestBody PortsEntity portsEntity, @RequestBody CruiseEntity cruiseEntity){

        CruisestopsEntity cruisestopsEntity = new CruisestopsEntity();
        cruisestopsEntity.setIdCruise(cruiseEntity.getId());
        cruisestopsEntity.setIdPort(portsEntity.getId());
        cruiseStopsService.add(cruisestopsEntity);
    }

    @PostMapping("/addShip")
    void addShip(@RequestBody ShipEntity shipEntity){
        shipService.add(shipEntity);
    }

    @PostMapping("/updateShip")
    void updateShip(@RequestBody ShipEntity shipEntity){
        shipService.update(shipEntity);
    }

    @PostMapping("/addPort")
    void addPort(@RequestBody PortsEntity portEntity){
        portService.add(portEntity);
    }

    @PostMapping("/updatePort")
    void updatePort(@RequestBody PortsEntity portsEntity){
        portService.update(portsEntity);
    }



}
