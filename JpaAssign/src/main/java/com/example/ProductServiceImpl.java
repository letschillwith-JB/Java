package com.example;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ProductServiceImpl implements ProductService {

    private EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("productPU");

    @Override
    public Product registerProduct(Product p) throws ProductException {
        EntityManager em = emFactory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            return p;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new ProductException("Failed to register product.", e);
        } finally {
            em.close();
        }
    }

    @Override
    public List<Product> getAllProducts() throws ProductException {
        EntityManager em = emFactory.createEntityManager();
        try {
            Query query = em.createQuery("SELECT p FROM Product p");
            return query.getResultList();
        } catch (Exception e) {
            throw new ProductException("Failed to retrieve products.", e);
        } finally {
            em.close();
        }
    }

    @Override
    public Product updateProduct(Product p) throws ProductException {
        EntityManager em = emFactory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
            return p;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new ProductException("Failed to update product.", e);
        } finally {
            em.close();
        }
    }

    @Override
    public Product deleteProductById(Integer pid) throws ProductException {
        EntityManager em = emFactory.createEntityManager();
        try {
            em.getTransaction().begin();
            Product p = em.find(Product.class, pid);
            if (p != null) {
                em.remove(p);
            }
            em.getTransaction().commit();
            return p;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new ProductException("Failed to delete product.", e);
        } finally {
            em.close();
        }
    }

    @Override
    public List<Product> getProductsByCategory(String category) throws ProductException {
        EntityManager em = emFactory.createEntityManager();
        try {
            Query query = em.createQuery("SELECT p FROM Product p WHERE p.category = :category");
            query.setParameter("category", category);
            return query.getResultList();
        } catch (Exception e) {
            throw new ProductException("Failed to retrieve products by category.", e);
        } finally {
            em.close();
        }
    }

    @Override
    public List<ProductDTO> getProductNameQtyPrice() throws ProductException {
        EntityManager em = emFactory.createEntityManager();
        try {
            Query query = em.createQuery("SELECT NEW ProductDTO(p.productName, p.quantity, p.price) FROM Product p");
            return query.getResultList();
        } catch (Exception e) {
            throw new ProductException("Failed to retrieve product name, quantity, and price.", e);
        } finally {
            em.close();
        }
    }

}

