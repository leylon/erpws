package com.ti.erpws.logistica.repository;

import com.ti.erpws.logistica.entity.LogCatalogo;
import com.ti.erpws.logistica.entity.LogOrden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("LogOrdenRepository")
public interface LogOrdenRepository extends JpaRepository<LogOrden, Serializable> {

    @Query(value = "SELECT * FROM log_aprobar_orden(:empresa, :area, :anio, :tipo, :nro_orden, :usuario, :notas)", nativeQuery = true)
    public List<Object[]> aprobarOrden(@Param("empresa") String empresa,
                                       @Param("area") String area,
                                       @Param("anio") Integer anio,
                                       @Param("tipo") String tipo,
                                       @Param("nro_orden") Integer nro_orden,
                                       @Param("usuario") String usuario,
                                       @Param("notas") String notas);

    @Query(value = "select * FROM log_listar_ordenes_pend_pr(:empresa, :anio, :usuario, :filtro)", nativeQuery = true)
    public List<Object[]> listarOrdenesPendientes(@Param("empresa") String empresa,
                                                  @Param("anio") Integer anio,
                                                  @Param("usuario") String usuario,
                                                  @Param("filtro") String filtro);


}
