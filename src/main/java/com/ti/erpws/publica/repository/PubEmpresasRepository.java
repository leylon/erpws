package com.ti.erpws.publica.repository;

import com.ti.erpws.publica.entity.PubEmpresas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("PubEmpresasRepository")
public interface PubEmpresasRepository extends JpaRepository<PubEmpresas, Serializable> {
}
