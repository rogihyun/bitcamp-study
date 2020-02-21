# 37_1 - Application Server 구조로 변경: 규칙1에 따라 통신하는 클라이언트 만들기

## 학습목표

- Application Server 아키텍처의 구성과 특징을 이해한다.
- 통신 프로토콜 규칙에 따라 동작하는 클라이언트를 만들 수 있다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/dao/mariadb/BoardDaoImpl.java 변경
- src/main/java/com/eomcs/lms/dao/mariadb/LessonDaoImpl.java 변경
- src/main/java/com/eomcs/lms/dao/mariadb/MemberDaoImpl.java 변경
- src/main/java/com/eomcs/lms/ClientApp.java 변경

## 실습  

#### 훈련1: 클라이언트와 서버 사이의 기본 통신 규칙을 정한다

- 요청과 응답은 `Stateless` 방식으로 처리한다. 
- 클라이언트가 요청할 때 서버와 연결하고, 서버에서 응답하면 연결을 끊는다.

규칙1) 단순한 명령어 전송과 실행 결과 수신
```
[클라이언트]                                        [서버]
서버에 연결 요청        -------------->           연결 승인
명령(CRLF)              -------------->           명령처리
화면 출력               <--------------           응답(CRLF)
화면 출력               <--------------           응답(CRLF)
명령어 실행 완료        <--------------           !end!(CRLF)
서버와 연결 끊기
```

