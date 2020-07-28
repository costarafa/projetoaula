package entidade;

import entidade.itensLocado;
import entidade.Funcio;
import entidade.Cliente;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class locacao {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

private int id;
private String hora;
private String dataLoc;
private String dataDev;
private float precoLoc;
@ManyToOne
private Cliente cliente;
@ManyToOne
private Funcio func;
@OneToMany
private List <itensLocado> IL;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDataLoc() {
        return dataLoc;
    }

    public void setDataLoc(String dataLoc) {
        this.dataLoc = dataLoc;
    }

    public String getDataDev() {
        return dataDev;
    }

    public void setDataDev(String dataDev) {
        this.dataDev = dataDev;
    }

    public float getPrecoLoc() {
        return precoLoc;
    }

    public void setPrecoLoc(float precoLoc) {
        this.precoLoc = precoLoc;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcio getFunc() {
        return func;
    }

    public void setFunc(Funcio func) {
        this.func = func;
    }

    public List<itensLocado> getIL() {
        return IL;
    }

    public void setIL(List<itensLocado> IL) {
        this.IL = IL;
    }

    public void setFuncio(Funcio funcio1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    

}
