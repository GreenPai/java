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
            member.setId(1L);
            member.setUsername("한이");

            Member member1 = new Member();
            member1.setId(2L);
            member1.setUsername("한수");

            em.persist(member);
            em.persist(member1);
            
            member1.setUsername("한수변화");

            List<Member> result = em.createQuery("select m from Member m ", Member.class)
                    .setFirstResult(1)
                    .setMaxResults(1)
                    .getResultList();

            for(Member m : result){
                System.out.println("m.getName() = " + m.getUsername());
            }

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
