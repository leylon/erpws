package com.ti.erpws.logistica.repository;

import com.ti.erpws.logistica.entity.LogCatalogo;
import com.ti.erpws.logistica.entity.LogRequerimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("LogRequerimientoRepository")
public interface LogRequerimientoRepository extends JpaRepository<LogRequerimiento, Serializable> {

    @Query(value = "select * from public.log_listar_reque_pendientes(:empresa,:anio,:usuario,:filtro)", nativeQuery = true)
    public List<Object[]> listaRequerimientosPendientes(@Param("empresa") String empresa,
                                                        @Param("anio") Integer anio,
                                                        @Param("usuario") String usuario,
                                                        @Param("filtro") String filtro);

    @Query(value = "SELECT * from PUBLIC.log_aprobar_requerimiento (:empresa,:und_negocio,:area_origen,:anio,:nro_requerimiento,:usuario,:notas,:tipo_ope)", nativeQuery = true)
    public List<Object[]> aprobarRequerimiento(@Param("empresa") String empresa,
                                               @Param("und_negocio") String und_negocio,
                                               @Param("area_origen") String area_origen,
                                               @Param("anio") Integer anio,
                                               @Param("nro_requerimiento") Integer nro_requerimiento,
                                               @Param("usuario") String usuario,
                                               @Param("notas") String notas,
                                               @Param("tipo_ope") String tipo_ope);


    /*@Query(value = Admin_query.WEB_USUARIO_PERFIL ,nativeQuery = true) // @Procedure(procedureName = "WEB_USUARIO_PERFIL")
    public List<String> perfil(@Param("IN_USUARIO") String in_usuario, @Param("IN_SISTEMA") String in_sistema);

    @Query(value = Admin_query.pub_empresa ,nativeQuery = true) // @Procedure(procedureName = "WEB_USUARIO_PERFIL")
    public List<String> empresa(@Param("CODEMP") String in_codemp);5*/

}
