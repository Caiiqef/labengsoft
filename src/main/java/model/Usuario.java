/*
** This file contains the persistence class.
** Each class attribute is known as persistence attribute
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="usuario")
public class Usuario { 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;           
    @Column(name="nome")
    private  String nome;       
    public Usuario(){}          
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
}