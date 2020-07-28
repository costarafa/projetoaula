package fabrica;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fabrica {

    private static EntityManagerFactory emf;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("postgrePU");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static EntityManagerFactory get() {
        return emf;
    }
}
