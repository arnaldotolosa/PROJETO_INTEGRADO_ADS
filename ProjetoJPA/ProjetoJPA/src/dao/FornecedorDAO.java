
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import modelo.Fornecedor;


public class FornecedorDAO {

    public void cadastrar(Fornecedor f) {
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("ProjetoJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(f);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public void alterar(Fornecedor f) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.merge(f);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public void excluir(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            Fornecedor f = em.find(Fornecedor.class, id);
            em.remove(f);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public List<Fornecedor> listar(String query) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("ProjetoJPAPU");
        EntityManager em = emf.createEntityManager();
        List<Fornecedor> f=null;
        em.getTransaction().begin();
        try {
            Query q = em.createQuery(
            "Select fornecedor from Fornecedor fornecedor "+query);
            f = q.getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return f;
    }

    public void limpar(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
