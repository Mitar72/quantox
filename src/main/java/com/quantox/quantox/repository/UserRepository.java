
package com.quantox.quantox.repository;

import com.quantox.quantox.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository <User,Long>{

}