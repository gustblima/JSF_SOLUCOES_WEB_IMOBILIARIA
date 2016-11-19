/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import model.Category;
import utils.EntityManagerSingleton;

/**
 *
 * @author Lara
 */
public class CategoryRepository {
    private EntityManager manager;
    
    public CategoryRepository(EntityManager manager){
        this.manager = EntityManagerSingleton.getEntityManager();
    }
    
    public List<Category> getAllCategories(){
        try{
            Query query = manager.createQuery("SELECT c FROM Category c");
            return query.getResultList();
        }catch(NoResultException e) {
            return null;
        }
    }
    
    public boolean addCategory (Category category){
        try{
            this.manager.persist(category);
            return true;
        }catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
        
       
    }
}