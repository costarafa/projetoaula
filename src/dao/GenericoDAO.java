package dao;

import fabrica.Fabrica;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class GenericoDAO<E> {
    //método para salvar e retornar a Entidade salva
    public E salvar(E entidade){
        EntityManager manager = Fabrica.get().createEntityManager();    //A variável manager pega referência do objeto de Gerenciador de Entidades (EntityManager) através da Fábrica (EntityManagerFactory)
        EntityTransaction t = manager.getTransaction();                 //A variável t pega referência do objeto de Controle de Transações (EntityTransaction) através do Gerenciador de Entidades (EntityManager)
        
        try{                            //tente
            t.begin();                  //inicia transação    
            manager.persist(entidade);    //salva
            t.commit();                 //confirma a transação
        }catch(Exception e){            //captura o erro caso ocorra
            t.rollback();               //descarta transação
            e.printStackTrace();        //imprime o erro
        }finally{                       //no final faça
            manager.close();            //fecha o Gerenciador de Entidades
        }
        return entidade;                  //retorna a Entidade salva
    }
    
    //método para alterar e retornar a Entidade alterada
    public E alterar(E entidade){
        EntityManager manager = Fabrica.get().createEntityManager();    //A variável manager pega referência do objeto de Gerenciador de Entidades (EntityManager) através da Fábrica (EntityManagerFactory)
        EntityTransaction t = manager.getTransaction();                 //A variável t pega referência do objeto de Controle de Transações (EntityTransaction) através do Gerenciador de Entidades (EntityManager)
        try{                                 //tente
            t.begin();                       //inicia transação   
            entidade = manager.merge(entidade);  //altera e pega a referência
            t.commit();                      //confirma a transação
        }catch(Exception e){                 //captura o erro caso ocorra
            t.rollback();                    //descarta transação
            e.printStackTrace();             //imprime o erro
        }finally{                            //no final faça
            manager.close();                 //fecha o Gerenciador de Entidades
        }                                    
        return entidade;                       //retorna a Entidade salva
    }
    
    //método para excluir uma Entidade 
    public boolean excluir(int id, Class c){
        EntityManager manager = Fabrica.get().createEntityManager();    //A variável manager pega referência do objeto de Gerenciador de Entidades (EntityManager) através da Fábrica (EntityManagerFactory)
        EntityTransaction t = manager.getTransaction();                 //A variável t pega referência do objeto de Controle de Transações (EntityTransaction) através do Gerenciador de Entidades (EntityManager)
        try{                                                //tente
            t.begin();                                      //inicia transação    
            manager.remove(manager.find(c,id));             //exclui a entidade a ser salva
            t.commit();                                     //confirma a transação
            return true;                                    //retorna verdadeiro (significa que deu certo!)
        }catch(Exception e){                                //captura o erro caso ocorra
            t.rollback();                                   //descarta transação
            e.printStackTrace();                            //imprime o erro
            return false;                                   //retorna falso (significa que deu errado!)
        }finally{                                           //no final faça
            manager.close();                                //fecha o Gerenciador de Entidades
        }                                                   
    }
    
    //método para buscar uma Entidade que possua o id passado pelo parâmetro (retorna somente uma Entidade)
    public E consultar(int id, Class c){
        EntityManager manager = Fabrica.get().createEntityManager();    //A variável manager pega referência do objeto de Gerenciador de Entidades (EntityManager) através da Fábrica (EntityManagerFactory)
        try{                                                            //tente
            return (E) manager.find(c,id);                       //busca a Entidade com o id passado pelo parâmetro                                           //retorna a Entidade 
        }catch(Exception e){                                            //captura o erro caso ocorra
            e.printStackTrace();                                        //imprime o erro
            return null;                                                //retorna nulo (não deu certo ou não foi encontrada!)
        }finally{                                                       //no final faça
            manager.close();                                            //fecha o Gerenciador de Entidades
        }
    }
    
    //método que busca todas as Entidades 
    public List<E> consultar(Class c){
        EntityManager manager = Fabrica.get().createEntityManager();                    //A variável manager pega referência do objeto de Gerenciador de Entidades (EntityManager) através da Fábrica (EntityManagerFactory)            
        try{                                                                            //tente
            return manager.createQuery("from "+c.getSimpleName()).getResultList();  //busca todas as Entidades e transforma em uma List
        }catch(Exception e){                                                            //captura o erro caso ocorra
            e.printStackTrace();                                                        //imprime o erro
            return null;                                                                //retorna nulo (não deu certo ou não foi encontrada!)
        }finally{                                                                       //no final faça
            manager.close();                                                            //fecha o Gerenciador de Entidades
        }
    }
}
