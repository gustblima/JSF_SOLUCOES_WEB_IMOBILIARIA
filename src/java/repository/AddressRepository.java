/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import model.Address;
import utils.EntityManagerSingleton;

/**
 *
 * @author Lara
 */
public class AddressRepository implements Serializable{
    private EntityManager manager;
    
    public AddressRepository(){
        this.manager = EntityManagerSingleton.getEntityManager();
    }
    
    public void AddAddress(Address address){
        this.manager.persist(address);
    }
    
    public List<String> findAllPropertyStates()
    {
        try{
            Query query = manager.createQuery("Select distinct a.state from Address a join Property p" );
           
            return query.getResultList();
        }catch(NoResultException e) {
            return null;
        }
    }
    
    
}
