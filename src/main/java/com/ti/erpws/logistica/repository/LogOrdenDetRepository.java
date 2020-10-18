package com.ti.erpws.logistica.repository;

import com.ti.erpws.logistica.entity.LogOrden;
import com.ti.erpws.logistica.entity.LogOrdenDet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("LogOrdenDetRepository")
public interface LogOrdenDetRepository extends JpaRepository<LogOrdenDet, Serializable> {
}
