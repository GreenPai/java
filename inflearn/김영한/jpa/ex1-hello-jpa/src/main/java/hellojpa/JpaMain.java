package hellojpa;

import jakarta.persistence.*;

import java.util.List;

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

        /*
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
         */

        // 회원 수정
//        try{
//
//            // Member findMember = em.find(Member.class, 3L);
//            List<Member> result = em.createQuery("select m from Member as m", Member.class)
//                            .setFirstResult(0)
//                                    .setMaxResults(10)
//                                            .getResultList();
//
//            for(Member member : result){
//                System.out.println(member.getName());
//            }
//
//            tx.commit();
//        }catch(Exception e){
//            tx.rollback();
//        }finally {
//            em.close();
//        }
//
//
//

        // =

        /**
         * 캐싱 테스트
         * em.persist를 할 때 1차 캐시에 값이 저장되고 다시 호출할 때 findMember은 1차 캐시의 값을 들고온다.
         * insert하는 쿼리는 과정이 다 끝난 후 트랜잭션되고 들어간다.
         */

//
//        try{
//
//            //비영속
//            Member member = new Member();
//            member.setId(101L);
//            member.setName("HelloJPA");
//
//            //영속
//            System.out.println("=== BEFORE ===");
//            em.persist(member); // 1차 캐시 저장
//            System.out.println("=== AFTER ===");
//
//            Member findMember = em.find(Member.class, 101L); // 1차 캐시에 있는 Member을 가져옴.
//
//            System.out.println("findMember.id = " + findMember.getId());
//            System.out.println("findMember.name = " + findMember.getName());
//
//            tx.commit();
//
//        }catch(Exception e){
//            tx.rollback();
//        }finally {
//            em.close();
//        }

        /**
         * 영속 엔티티의 동일성 보장
         * 조회를 2번 햇을 때 member1이 캐시에 저장되기 때문에
         * findMember2에서는 캐시에 저장된 값을 호출한다.
         *
         * 그렇기 때문에 조회 쿼리는 한번만 나온다.
         * result = " + (findMember1 == findMember2) ----> true
         *
         */

//        try{
//
//            // 영속
//            Member findMember1 = em.find(Member.class, 101L);
//            Member findMember2 = em.find(Member.class, 101L);
//
//            System.out.println("result = " + (findMember1 == findMember2));
//
//            tx.commit();
//
//        }catch(Exception e){
//            tx.rollback();
//        }finally {
//            em.close();
//        }


        /**
         * 수정을 하는 경우에 따로 persist나 update 해주지 않아도
         * 조회한 값을 수정하는 경우에
         * 마지막에 update 쿼리가 실행이 된다.
         */

        try{

            // 영속
            Member member1 = em.find(Member.class, 150L);
            // member1.setName("ZZZZ");

            System.out.println("==================");

            tx.commit();

        }catch(Exception e){
            tx.rollback();
        }finally {
            em.close();
        }

        emf.close();
    }
}
