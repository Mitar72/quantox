package com.quantox.quantox.repository;

import com.quantox.quantox.model.Machine;
import com.quantox.quantox.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MachineRepository  extends JpaRepository<Machine,Long> {

}
