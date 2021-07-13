package pt.iade.YFM.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="saida_viaturas")
public class R_Saida {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)  
    @Column(name="id_Saida_Viatura")
    private int id;
    @Column(name="id_colaborador")
    private String colab_id;
    @Column(name="id_viatura")
    private String viatura_id;
    @Column(name="dia_saida")
    private String dia_saida;
    @Column(name="quilometros_saida")
    private String quilometros_saida;
    
    public R_Saida() {}

    public int getId() {
        return id;
    }

    public String getColab_id() {
        return colab_id;
    }

    public String getViatura_id() {
        return viatura_id;
    }

    public String getDia_saida() {
        return dia_saida;
    }

    public String getQuilometros_saida() {
        return quilometros_saida;
    }
}