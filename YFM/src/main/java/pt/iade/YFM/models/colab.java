package pt.iade.YFM.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="colaborador")
public class colab {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)  
    @Column(name="id_colaborador")
    private int id;
    @Column(name="nome_colaborador")
    private String name;
    @Column(name="e_mail")
    private String mail;
    public colab() {}
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getMail() {
        return mail;
    }
}