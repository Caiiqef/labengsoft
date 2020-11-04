package model;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UsuarioService { 
    
	public List<Usuario> list(){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");        
            EntityManager em = emf.createEntityManager();
            List<Usuario> users = null;

            Query query = em.createQuery("SELECT u FROM usuario u ");
            users = query.getResultList();
            
            em.close();
            emf.close();
            return users;            
	}
	
}