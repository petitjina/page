package com.example.page.manager;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/manager")
@CrossOrigin(origins = "*")
//웹 브라우저 보안 정책인 Same-Origin Policy 때문에, 다른 출처(도메인, 포트, 프로토콜)에서 요청하는 JavaScript의 HTTP 요청은 기본적으로 차단되는 걸 막기 위한 어노테이션
//CORS는 보안과 관련된 설정이므로, 느슨하게 설정하면 보안에 취약해질 수 있다.
//운영 환경에서는 "*"(전체 허용) 대신 정확한 origin만 지정하는 것을 추천.

//@RequestParam은 핸들러 메서드의 파라미터 종류 중 하나입니다.
//주로 클라이언트 쪽에서 전송하는 요청 데이터를 쿼리 파라미터(Query Parmeter 또는 Query String), 폼 데이터(form-data), x-www-form-urlencoded 형식으로 전송하면 이를 서버 쪽에서 전달받을 때 사용하는 애너테이션
public class ManagerController {
    @PostMapping
    public ResponseEntity postMember(@Valid ManagerDTO memberDto) {
        return new ResponseEntity<ManagerDTO>(memberDto, HttpStatus.CREATED);
    }
}
