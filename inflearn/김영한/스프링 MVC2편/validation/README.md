<h2> Notion</h2>
https://chivalrous-license-aa4.notion.site/4c15fb3ea51145b2a3833878c8cdf4b2

---
<h2>Setting</h2>
SpringBoot 3.31 <br>
JAVA 17 <br>
thymeleaf <br>

Lombok <br>
Gradle <br>

--- 

<h2>내용</h2>

<h3>요구사항: 검증 로직 추가</h3>

- 타입 검증
    - 가격, 수량에 문자가 들어가면 검증 오류 처리
- 필드 검증
    - 상품명: 필수, 공백X
    - 가격: 1000원 이상, 1백만원 이하
    - 수량: 최대 9999
- 특정 필드의 범위를 넘어서는 검증
    - 가격 * 수량의 합은 10,000원 이상

<h3>요구사항: 검증 로직 구현</h3>

- 검증 기능을 직접 구현
    - BindingResult를 활용
- 스프링 어노테이션 활용
    - Groups : 하나의 객체에서 입력, 수정 역활을 나눔
    - Form 객체 분리 : 입력, 수정의 객체를 분리하여 역활을 구분
