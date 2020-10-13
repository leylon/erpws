package com.ti.erpws.almacen.repository;

import com.ti.erpws.almacen.entity.Planta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("AlmacenesRepository")
public interface AlmacenesRepository extends JpaRepository<Planta, Serializable> {

}
