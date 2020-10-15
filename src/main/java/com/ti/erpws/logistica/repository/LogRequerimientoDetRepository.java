package com.ti.erpws.logistica.repository;

import com.ti.erpws.logistica.entity.LogCatalogo;
import com.ti.erpws.logistica.entity.LogRequerimientoDet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("LogRequerimientoDetRepository")
public interface LogRequerimientoDetRepository extends JpaRepository<LogRequerimientoDet, Serializable> {
}
