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

            Member member = new Member();
            member.setUsername("회원1");
            member.setAge(10);

            Member member2 = new Member();
            member2.setUsername("회원2");
            member2.setAge(10);


            Member member3 = new Member();
            member3.setUsername("회원3");
            member3.setAge(10);

            em.persist(member);
            em.persist(member2);
            em.persist(member3);

            int i = em.createQuery("update Member m set m.age = 20")
                    .executeUpdate();

            em.clear();

            Member newMember  = em.find(Member.class, member.getId());
            System.out.println(newMember.getAge());




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
