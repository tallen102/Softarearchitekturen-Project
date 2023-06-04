package dropboxclone.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        // Create a Hibernate configuration instance
        Configuration configuration = new Configuration().configure();

        // Build the session factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Creates a new session
        Session session = sessionFactory.openSession();

        try {
           
           // gets users by ID#
            int userId = 1;
            User user = session.get(User.class, userId);
            if (user != null) {
                System.out.println("User: " + user.getUsername());
            } else {
                System.out.println("User not found.");
            }

          // Retrieve all lots(groups)
            List<Lot> lots = session.createQuery("FROM Lot", Lot.class).getResultList();
            System.out.println("Lots: " + lots);


        } finally {
          
            session.close();
            sessionFactory.close();
        }
    }
}

