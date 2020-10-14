package com.ti.erpws.logistica.repository;

import com.ti.erpws.logistica.entity.LogTipoCatalogo;
import com.ti.erpws.publica.entity.PubEmpresas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("LogTipoCatalogoRepository")
public interface LogTipoCatalogoRepository extends JpaRepository<LogTipoCatalogo, Serializable> {
}
