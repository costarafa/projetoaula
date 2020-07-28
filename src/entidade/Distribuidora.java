package entidade;

import entidade.Pessoa;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Distribuidora extends Pessoa {

@GeneratedValue(strategy=GenerationType.AUTO)

private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    

    


}
