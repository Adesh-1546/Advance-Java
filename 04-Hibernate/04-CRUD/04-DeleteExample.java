package Hibernate;

import jakarta.persistence.*;

public class DeleteExample {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Student s = em.find(Student.class, 1);

        if (s != null) {
            em.remove(s);
            System.out.println("Deleted Successfully!");
        }

        tx.commit();

        em.close();
        emf.close();
    }
}
