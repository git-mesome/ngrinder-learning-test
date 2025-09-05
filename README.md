## 테스트 개요
- **도구**: nGrinder (Controller + Agent)
- **테스트 대상**: 학습용 Spring Boot 서버 (`/api/v1/health`, `/api/v1/echo`)
- **테스트 환경**
    - **Controller**: Ubuntu-03 (JDK 21, nGrinder Controller)
    - **Agent**: Ubuntu-03 (JDK 11, nGrinder Agent)
    - **Spring API 서버**: Ubuntu-03 (JDK 21, Spring Boot)  

> ⚠️ 주의: nGrinder Agent는 JDK 21 이상에서 `sun.net.spi.nameservice.NameService` 관련 호환성 문제가 발생하여, **Agent는 JDK 11**로 실행하고 Controller와 Spring 서버는 JDK 21을 사용함.
> Controller 권장도 11이지만 21도 호환