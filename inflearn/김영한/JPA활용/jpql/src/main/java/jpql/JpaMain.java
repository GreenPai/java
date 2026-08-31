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

            Team team = new Team();
            team.setUsername("member1");
            em.persist(team);

            Member member = new Member();
            member.setUsername("회원1");
            member.setAge(10);
            member.setType(MemberType.ADMIN);
            member.setTeam(team);


            Member member2 = new Member();
            member2.setUsername("회원1");
            member2.setAge(20);
            member2.setType(MemberType.ADMIN);
            member2.setTeam(team);

            em.persist(member2);
            em.persist(member);

            em.flush();
            em.clear();

            int i = em.createQuery("update Member m set m.age = 20")
                    .executeUpdate();

            System.out.println(i);



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
