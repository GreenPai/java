package hellojpa;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;


public class JpaMain {

    public static void main(String[] args) {

        // persistence.xml의 hello를 들고와서 팩토리 만들기
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try{
            Member member = new Member();
            member.setUsername("유저1");
            member.setCreateDate(LocalDateTime.now());
            member.setLastModifiedBy("나");
            em.persist(member);

            em.flush();
            em.clear();


            tx.commit();
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }

        emf.close();
    }


}
