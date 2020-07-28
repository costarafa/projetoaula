package entidade;

import entidade.cargoFunc;
import entidade.Pessoa;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Funcio extends Pessoa{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

private String CPF;
private String RG;
private String dataNasci;
private String sexo;
@OneToOne
private cargoFunc cargo;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public cargoFunc getCargo() {
        return cargo;
    }

    public void setCargo(cargoFunc cargo) {
        this.cargo = cargo;
    }

     

    public String getDataNasci() {
        return dataNasci;
    }

    public void setDataNasci(String dataNasci) {
        this.dataNasci = dataNasci;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


}
