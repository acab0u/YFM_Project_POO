package pt.iade.YFM.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empresa")
public class Empresa {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)  
    @Column(name="id_empresa")
    private int id;
    @Column(name="nome_empresa")
    private String name;
    @Column(name="e_mail")
    private String mail;
    @Column(name="contacto")
    private int contact;
    @Column(name="morada")
    private String address;
    @Column(name="nif")
    private int nif;
    public Empresa() {}
    public int getId() {
        return id;
    }
    public  String getName() {
        return name;
    }
    public String getMail() {
        return mail;
    }
    public int getContact() {
        return contact;
    }
    public String getAddress() {
        return address;
    }
    public int getNif() {
        return nif;
    }
}