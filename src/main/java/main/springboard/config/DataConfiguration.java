package main.springboard.config;


import lombok.RequiredArgsConstructor;
import main.springboard.mapper.BoardMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.BoardService;

@Configuration
@RequiredArgsConstructor
public class DataConfiguration {
    private final BoardMapper boardMapper;

    @Bean
    public BoardService boardService() {
        return new BoardService(boardMapper);
    }
}
// //Mapper가 생길때마다 등록을 해줘야하는거같다..?
//Description:
//
// 등록하지 않을시 나오는 오류
//Parameter 0 of constructor in main.springboard.Controller.BoardController required a bean of type 'service.BoardService' that could not be found.