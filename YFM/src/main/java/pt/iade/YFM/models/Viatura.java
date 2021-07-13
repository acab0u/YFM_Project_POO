package pt.iade.YFM.models;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="viaturas")
public class Viatura {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)  
    @Column(name="id_viatura")
    private int id;
    @Column(name="id_empresa")
    private String emp_Id;
    @Column(name="matricula")
    private String matricula;
    @Column(name="data_matricula")
    private String data_mat;
    @Column(name="nome_viatura")
    private String nome;
    @Column(name="modelo_viatura")
    private String modelo;
    @Column(name="nr_apolice")
    private String apolice;
    @Column(name="data_apolice")
    private String data_apolice;
    @Column(name="quilometros_viatura")
    private String quilometros;

    public int getId() {
        return id;
    }
    public String getEmp_Id() {
        return emp_Id;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getData_mat() {
        return data_mat;
    }
    public String getNome() {
        return nome;
    }
    public String getModelo() {
        return modelo;
    }
    public String getApolice() {
        return apolice;
    }
    public String getData_apolice() {
        return data_apolice;
    }
    public String getQuilometros() {
        return quilometros;
    }
}
