package com.ti.erpws.logistica.repository;

import com.ti.erpws.logistica.entity.LogCatalogo;
import com.ti.erpws.logistica.entity.LogTipoCatalogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("LogCatalogoRepository")
public interface LogCatalogoRepository extends JpaRepository<LogCatalogo, Serializable> {
}
