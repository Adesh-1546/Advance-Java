package Hibernate;

import jakarta.persistence.*;

public class ReadExample {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        EntityManager em = emf.createEntityManager();

        Student s = em.find(Student.class, 1);

        if (s != null) {
            System.out.println(s);
        } else {
            System.out.println("Not Found");
        }

        em.close();
        emf.close();
    }
}
