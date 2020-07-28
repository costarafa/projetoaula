package entidade;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Midia {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

private int id;
private String formatoMidia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFormatoMidia() {
        return formatoMidia;
    }

    public void setFormatoMidia(String formatoMidia) {
        this.formatoMidia = formatoMidia;
    }


}
