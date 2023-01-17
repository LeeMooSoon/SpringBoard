package main.springboard.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller 어노테이션: 컨트롤러 역할을 수행하는 클래스라는 것을 명시한다.
//
//@RequestMapping 어노테이션: "/board/"로 접근하는 url 처리를 이 클래스인 BoardController 에서 맡는다고 알려준다.
//
//@GetMapping 어노테이션: "/hello"로 접근하는 url 처리를 이 클래스인 BoardController 에서 맡는다고 알려준다.
@Controller // 어노테이션을 입력하면 알아서 상단에 import 가 된다!

@RequestMapping("/board/")
public class BoardController {

    @GetMapping("/hello")
    public String Hello() {
        return "/boards/hello";
    }
}