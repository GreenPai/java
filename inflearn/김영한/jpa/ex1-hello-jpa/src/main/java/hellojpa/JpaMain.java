package hellojpa;

import jakarta.persistence.*;

public class JpaMain {

    public static void main(String[] args) {

        // persistence-unit name="hello"의 hello는 persistence.xml의 유닛 이름이다.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        // 트랜잭션. tx가 없이 persist 하는 순간 오류가 발생한다.
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        /*
        // 회원 등록
        try{
            Member member = new Member();
            member.setId(3L);
            member.setName("HelloC");

            em.persist(member);
            tx.commit();
        }catch(Exception e){
            tx.rollback();
        }finally {
           em.close();
        }
        */

        
        /*
        // 조회
        try{
            Member member = em.find(Member.class, 3L);
            System.out.println("findMember.id = " + member.getId());
            System.out.println("findMember.name = " + member.getName());

            tx.commit();
        }catch(Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
        */

        /*
        // 삭제
        try{
            Member member = em.find(Member.class, 3L);
            em.remove(member);

            tx.commit();
        }catch(Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
         */

        // 회원 수정
        try{
            Member findMember = em.find(Member.class, 3L);
            findMember.setName("HelloJPA");

            tx.commit();
        }catch(Exception e){
            tx.rollback();
        }finally {
            em.close();
        }


        
        emf.close();
    }
}
