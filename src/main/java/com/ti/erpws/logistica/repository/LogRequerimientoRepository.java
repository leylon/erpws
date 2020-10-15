package com.ti.erpws.logistica.repository;

import com.ti.erpws.logistica.entity.LogCatalogo;
import com.ti.erpws.logistica.entity.LogRequerimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("LogRequerimientoRepository")
public interface LogRequerimientoRepository extends JpaRepository<LogRequerimiento, Serializable> {
}
