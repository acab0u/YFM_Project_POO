package pt.iade.YFM.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="entrada_viaturas")
public class R_Entrada {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)  
    @Column(name="id_Entrada_Viatura")
    private int id;
    @Column(name="id_colaborador")
    private String colab_id;
    @Column(name="id_viatura")
    private String viatura_id;
    @Column(name="dia_entrada")
    private String dia_entrada;
    @Column(name="quilometros_entrada")
    private String quilometros_entrada;
    
    public R_Entrada() {}

    public int getId() {
        return id;
    }

    public String getColab_id() {
        return colab_id;
    }

    public String getViatura_id() {
        return viatura_id;
    }

    public String getDia_entrada() {
        return dia_entrada;
    }

    public String getQuilometros_entrada() {
        return quilometros_entrada;
    }

}
