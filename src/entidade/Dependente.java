package entidade;

import entidade.Cliente;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class Dependente extends Cliente{
 
    private String nomeDep;
    private String dtaNasciDep;

    public String getNomeDep() {
        return nomeDep;
    }

    public void setNomeDep(String nomeDep) {
        this.nomeDep = nomeDep;
    }

    public String getDtaNasciDep() {
        return dtaNasciDep;
    }

    public void setDtaNasciDep(String dtaNasciDep) {
        this.dtaNasciDep = dtaNasciDep;
    }

  

    
    
}
