/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caisa.planilla.entity.services;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author NCN00973
 */
public abstract class AbstractFacade<T> {
    private Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    public void edit(T entity) {
        getEntityManager().merge(entity);
    }

    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0]);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
    
    //es para comprobar si existe una cuenta ( puede usarse para comprobar cualquier campo)
    public int count_2(String querys, String parameterName1, String parameter1) {
         Query query = getEntityManager().createNamedQuery(querys);
        query.setParameter(parameterName1, parameter1);
                return ((Long) query.getSingleResult()).intValue();
    }
    
       public List<T> find2Paramater(String querys, String parameterName1,String parameter1,String parameterName2, String parameter2){
//       CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
//        cq.select(cq.from(entityClass));
        Query query = getEntityManager().createNamedQuery(querys);
        query.setParameter(parameterName1, parameter1);
        query.setParameter(parameterName2, parameter2);                
        return query.getResultList();
    }
       
       
       //busqueda por un parametro string
       
           public List<T> find1Paramater(String queries, String parameterName1,String parameter1){
//       CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
//        cq.select(cq.from(entityClass));
        Query query = getEntityManager().createNamedQuery(queries);
        query.setParameter(parameterName1, parameter1);
                 
        return query.getResultList();
    }
           
           
                  //busqueda por un parametro int
       
           public List<T> find1Paramater(String queries, String parameterName1,int parameter1){
//       CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
//        cq.select(cq.from(entityClass));
        Query query = getEntityManager().createNamedQuery(queries);
        query.setParameter(parameterName1, parameter1);
                 
        return query.getResultList();
        
           }


}
