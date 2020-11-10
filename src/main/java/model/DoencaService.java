package model;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DoencaService { 
    
	public List<Doenca> list(){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");        
            EntityManager em = emf.createEntityManager();
            List<Doenca> doenca = null;

            Query query = em.createQuery("SELECT u FROM doenca u");
            doenca = query.getResultList();
         
            em.close();
            emf.close();
            return doenca;            
	}
    
    
    public void create(String nome, String sintomas) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");
        EntityManager em = emf.createEntityManager();

        Doenca d = new Doenca();
        d.setNome(nome);
        d.setSintomas(sintomas);

        em.getTransaction().begin();
        em.persist(d);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}