package com.example.page.travel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/travel")
@CrossOrigin(origins = "http://localhost:3000")
//웹 브라우저 보안 정책인 Same-Origin Policy 때문에, 다른 출처(도메인, 포트, 프로토콜)에서 요청하는 JavaScript의 HTTP 요청은 기본적으로 차단되는 걸 막기 위한 어노테이션
//CORS는 보안과 관련된 설정이므로, 느슨하게 설정하면 보안에 취약해질 수 있다.
//운영 환경에서는 "*"(전체 허용) 대신 정확한 origin만 지정하는 것을 추천.
public class TravelController {
}
