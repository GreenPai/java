package hellojpa;

import jakarta.persistence.*;

import java.util.List;


public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try{

            // 저장
            Team team = new Team();
            team.setName("TeamA");
            em.persist(team);

            /**
             * 연관관계 주인: Member
             * FK가 있는 쪽이 주인. 주로 다(N)
             */
            
            Member member = new Member();
            member.setUsername("member1");

            team.addMember(member);

            // 연관관계 편의 메서드
            em.persist(member);


            // team.getMembers().add(member);

            // find를 해도 db 쿼리문이 나오지 않는다. 이것은 캐시 때문.
            // 만약 쿼리를 보고 싶다면 영속성 컨텍스트를 초기화 시켜주면 된다.
            em.flush();
            em.clear();

            Team findTeam = em.find(Team.class, team.getId());
            List<Member> members = findTeam.getMembers();

            for(Member m : members){
                System.out.println("member : " + m.getUsername());
            }


            tx.commit();
        }catch(Exception e){
            tx.rollback();
        }finally {
            em.close();
        }

        emf.close();
    }
}
