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
}