/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caisa.planilla.entity.services;

import com.caisa.planilla.entity.TiposDeCuentaBanco;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author NCN00973
 */
@Stateless
@Path("tiposdecuentabanco/")
public class TiposDeCuentaBancoFacadeREST extends AbstractFacade<TiposDeCuentaBanco> {
    @PersistenceContext(unitName = "ServiciosCaisaPlanillaPU")
    private EntityManager em;

    public TiposDeCuentaBancoFacadeREST() {
        super(TiposDeCuentaBanco.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(TiposDeCuentaBanco entity) {
        super.create(entity);
    }

    @PUT
    @Override
    @Consumes({"application/xml", "application/json"})
    public void edit(TiposDeCuentaBanco entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    
    
    
    
    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public TiposDeCuentaBanco find(@PathParam("id") Integer id) {
        return super.find(id);
    }
    //MAV servicio para optener segun numero de cuenta
    @GET
    @Path("/codCuenta/{codCuenta}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public List<TiposDeCuentaBanco> find_cuenta(@PathParam("codCuenta") String codCuenta) {        
        return super.find1Paramater("TiposDeCuentaBanco.findByCodCuenta", "codCuenta", codCuenta);        
//         return super.find2Paramater("Usuarios.findByUserPass", "login", login, "pass", pass);
    }
    
    //MAV servicio para optener cuentas existentes
     @GET
    @Path("/count2/{codCuenta}")
    @Consumes({"application/json"})
    @Produces("text/plain")
    public String countREST2(@PathParam("codCuenta") String codCuenta) {
        return String.valueOf(super.count_2("TiposDeCuentaBanco.findByCodCuentaCoun", "codCuenta", codCuenta));
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<TiposDeCuentaBanco> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<TiposDeCuentaBanco> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
