package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="doenca")
public class Doenca { 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private  long id;           
    @Column(name="nome")
    private String nome;      
    @Column(name="sintomas") 
    private String sintomas;
    
    public Doenca(){}          
    public String getNome() {   
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }  
    public String getSintomas(){
        return sintomas;
    }
    public void setSintomas(String sintomas){
        this.sintomas = sintomas;
    }
}