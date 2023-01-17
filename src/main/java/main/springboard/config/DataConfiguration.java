package main.springboard.config;


import lombok.RequiredArgsConstructor;
import main.springboard.mapper.BoardMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.BoardService;
 //Mapper가 생길때마다 등록을 해줘야하는거같다..?
@Configuration
@RequiredArgsConstructor
public class DataConfiguration {
    private final BoardMapper boardMapper;

    @Bean
    public BoardService boardService() {
        return new BoardService(boardMapper);
    }
}
