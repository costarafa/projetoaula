
import dao.GenericoDAO;
import entidade.Estado;
import fabrica.Fabrica;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joao
 */
public class TestePersistencia {
    
    public static void main(String[] args){
        Fabrica.get();
        Estado e1 = new Estado();
        e1.setNome("PARANÁ");
        e1.setSigla("PR");
        
        Estado e2 = new Estado();
        e2.setNome("SÃO PAULO");
        e2.setSigla("SP");
        
        GenericoDAO<Estado> dao = new GenericoDAO<Estado>();
        System.out.println("teste 1 - salvado duas cidades");
        dao.salvar(e1);
        dao.salvar(e2);
        System.out.println("teste 1 deu certo!!");
        
        System.out.println("\n\nteste 2 - consultar um");
        Estado e = dao.consultar(1, Estado.class);
        System.out.println("teste 2 deu certo - "+e.getNome());
        
        System.out.println("\n\nteste 3 - consultar todos");
        List<Estado> listaEstados = dao.consultar(Estado.class);
        for(Estado i : listaEstados)
            System.out.println(i.getNome());
    }
}
