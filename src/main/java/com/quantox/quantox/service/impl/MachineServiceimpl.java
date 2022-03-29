package com.quantox.quantox.service.impl;

import com.quantox.quantox.Exception.ResourcenotFoundException;
import com.quantox.quantox.model.Machine;
import com.quantox.quantox.repository.MachineRepository;

import com.quantox.quantox.service.MachineService;

public class MachineServiceimpl implements MachineService {

    private MachineRepository machineRepository;


    public MachineServiceimpl(MachineRepository machineRepository) {
        super();
        this.machineRepository = machineRepository;
    }
    @Override
    public String start(long id) {
          String response = "alrady running";
            Machine machine =  machineRepository.findById(id).orElseThrow(()-> new ResourcenotFoundException("Machine","id",String.valueOf(id)));
           if(!machine.isActive()){
               machine.setActive(true);
               response = "started the machine!";
           }
           return response;


    }
}
