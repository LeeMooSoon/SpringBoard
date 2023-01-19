package main.springboard.Controller;



//@Controller 어노테이션: 컨트롤러 역할을 수행하는 클래스라는 것을 명시한다.
//
//@RequestMapping 어노테이션: "/board/"로 접근하는 url 처리를 이 클래스인 BoardController 에서 맡는다고 알려준다.
//
//@GetMapping 어노테이션: "/hello"로 접근하는 url 처리를 이 클래스인 BoardController 에서 맡는다고 알려준다.

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import main.springboard.domain.Board;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.BoardService;

@Controller

@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService service;

    @GetMapping("/hello")
    public String Hello() {
        return "/boards/hello";
    }

//    @GetMapping("/test")
//    public String test(Model model) {
//        model.addAttribute("cnt", service.boardCount());
//        model.addAttribute("test", service.boardList());
//
//        return "/boards/hello";
//    }

    // 추가
    @GetMapping("/main")
    public String main(Model model) {
        model.addAttribute("list", service.boardList());
        model.addAttribute("cnt", service.boardCount());
//       for( int i=0; i<service.boardList().size(); i++){
//           System.out.println(service.boardList().get(i).getContent());
//       }
        return "/boards/main";
    }
    @GetMapping("/view")
    public String viewBoard(Model model, Long boardId) {
        model.addAttribute("halo", service.getBoard(boardId));
        return "/boards/view";
    }
    @GetMapping("/upload")
    public String uploadBoardForm() {
        return "/boards/upload";
    }
    @PostMapping("/upload")
 //@Valid 를 추가하여 domain의 보드에 validation 어노테이션이 먹힘.
    public  String uploadBoard(@Valid  Board board) {
            service.uploadBoard(board);
        //디렉토리가아니고 경로 주소 입력
        return "redirect:/board/main";
    }
    @GetMapping("/update")
    public String updateBoardForm(Model model, Long boardId) {
        model.addAttribute("update", service.getBoard(boardId));

        return "/boards/update";
    }

    //controller -> service -> mapper -> xml를 거쳐 수정
    @PostMapping("/update")
    public String updateBoard( @Valid Board board) {
        service.updateBoard(board);
        return "redirect:/board/main";
    }

    @GetMapping("/delete")
    public String deleteBoard(Long boardId) {
        service.deleteBoard(boardId);
        return "redirect:/board/main";
    }
}