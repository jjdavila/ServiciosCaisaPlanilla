/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caisa.planilla.entity.services;

import com.caisa.planilla.entity.Cargos;
import com.caisa.planilla.entity.Empleados;
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
@Path("/cargos")
public class CargosFacadeREST extends AbstractFacade<Cargos> {
    @PersistenceContext(unitName = "ServiciosCaisaPlanillaPU")
    private EntityManager em;

    public CargosFacadeREST() {
        super(Cargos.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Cargos entity) {
        super.create(entity);
    }

    @PUT
    @Override
    @Consumes({"application/xml", "application/json"})
    public void edit(Cargos entity) {
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
    public Cargos find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Cargos> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Cargos> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }
    
      //metodo de busqueda por cargo
    
    @GET
    @Path("/nombre/{nombre}")
    @Consumes({"application/json"})
    @Produces({"application/xml", "application/json"})
    public List<Cargos> findCedula(@PathParam("nombre") String nombre)
    {
         
       return super.find1Paramater("Cargos.findByNombre", "nombre", nombre);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
