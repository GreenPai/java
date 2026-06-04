package hellojpa;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;


public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try{

            Team team = new Team();
            team.setName("teamA");
            em.persist(team);

            System.out.println("team : " + team);

            Member member1 = new Member();
            member1.setUsername("member1");
            member1.setTeam(team);

            System.out.println("team : " + member1);
            em.persist(member1);

            em.flush();
            em.clear();

            // Member m = em.find(Member.class, member1.getId());
            
            // N+1 문제 -> EAGER을 했을때 나오는 문제
            List<Member> members = em.createQuery("select m from Member m", Member.class)
                            .getResultList();

            tx.commit();
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }

        emf.close();
    }

    private static void printMember(Member member) {
        System.out.println("member = "  + member.getUsername());
    }

    private static void printMemberAndTeam(Member member) {
        String username = member.getUsername();
        System.out.println("username = " + username );

        Team team = member.getTeam();
        System.out.println("team = " + team.getName());
    }
}
