package entidade;

import entidade.Filme;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class itensLocado {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

private int id;
private float valor;
private int qtdeFilmes;
@ManyToOne
private Filme filme;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQtdeFilmes() {
        return qtdeFilmes;
    }

    public void setQtdeFilmes(int qtdeFilmes) {
        this.qtdeFilmes = qtdeFilmes;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }


}
