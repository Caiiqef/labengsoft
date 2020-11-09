package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="ocorrencia")
public class Ocorrencia { 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private  long id;           
    @Column(name="data")
    private String data;
    @Column(name="associada")
    private String associada;
    
    public Ocorrencia(){}          
    public long getId() {   
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getData() {
        return data;
    }
    public void setData(String data){
        this.data = data;
    }
    public String getAssociada() {
        return associada;
    }
    public void setAssociada(String associada){
        this.associada = associada;
    } 
}