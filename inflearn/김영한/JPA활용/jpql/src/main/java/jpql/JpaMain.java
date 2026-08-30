package jpql;

import jakarta.persistence.*;

import java.util.List;


public class JpaMain {

    public static void main(String[] args) {

        // persistence.xml의 hello를 들고와서 팩토리 만들기
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try{

            for(int i=0; i<100; i++){
                Member member = new Member();
                member.setUsername("member" + i);
                member.setAge(10 + i);
                em.persist(member);
            }


            List<Member> result = em.createQuery("select m from Member m", Member.class)
                    .setFirstResult(0)
                    .setMaxResults(10)
                    .getResultList();
            System.out.println("memberDTO.getAge() = " + result);


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
