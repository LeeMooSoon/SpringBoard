package main.springboard.mapper;

import main.springboard.domain.Board;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
//@Mapper
public interface BoardMapper {
    int boardCount(); // 곧 생성할 BoardMapper.xml 첫번째 sql 문의 id 와 같음.

    List<Board> getList();

    Board getBoard(Long boardId);

    void uploadBoard(Board board); //insert 할때는 반환값이 없기때문에 앞에 void
    Board updateBoard();

    void updateBoard(Board board);
    void deleteBoard(Long boardId);
//    void viewCount(Long boardId);
}