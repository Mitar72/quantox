package com.quantox.quantox.controller;

import com.quantox.quantox.model.Machine;
import com.quantox.quantox.model.User;
import com.quantox.quantox.service.MachineService;
import com.quantox.quantox.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Machine")
public class MachineController {
    @Autowired
    private MachineService machineService;

    @Autowired
    public MachineController(MachineService machineService) {
        super();
        this.machineService = machineService;
    }


    @PutMapping("{id}")
    public String saveEmployee(@PathVariable(name ="id") long id){
        return  machineService.start(id);
    }


}
