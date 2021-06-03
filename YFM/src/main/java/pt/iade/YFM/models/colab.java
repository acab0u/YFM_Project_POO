package pt.iade.YFM.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.JPanel;

@Entity
@Table(name="colaborador")
public class Colab {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)  
    @Column(name="id_colaborador")
    private int id;
    @Column(name="nome_colaborador")
    private String name;
    @Column(name="e_mail")
    private String mail;
    @Column(name="contacto")
    private String contact;
    @Column(name="morada")
    private String address;
    @Column(name="localidade")
    private String local;
    public Colab() {}
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getMail() {
        return mail;
    }
    public String getContact() {
        return contact;
    }
    public String getAddress() {
        return address;
    }
    public String getLocal() {
        return local;
    }
}
