package model;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EpidemService { 
    
	public List<Ocorrencia> list(){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");        
            EntityManager em = emf.createEntityManager();
            List<Ocorrencia> ocorrencia = null;

            Query query = em.createQuery("SELECT u FROM ocorrencia u");
            ocorrencia = query.getResultList();
            
            em.close();
            emf.close();
            return ocorrencia;            
	}
	
}