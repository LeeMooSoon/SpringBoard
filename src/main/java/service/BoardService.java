package service;

import lombok.RequiredArgsConstructor;
import main.springboard.domain.Board;
import main.springboard.mapper.BoardMapper;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.PrintWriter;
import java.util.List;

@Service //서비스 명시
@RequiredArgsConstructor // Mapper 생성자를 사용할수 있게함.
@Transactional(readOnly = true)
public class BoardService{
    private final BoardMapper boardMapper;

    public int boardCount() {
        return boardMapper.boardCount(); // 게시글 수 반환
    }
    public List<Board> boardList() {
        return boardMapper.getList(); // 게시글 리스트 반환
    }
    public Board getBoard(Long boardId) {
        return boardMapper.getBoard(boardId);
    }
    public void uploadBoard(Board board) {
        boardMapper.uploadBoard(board);
    }@Transactional
    public void updateBoard(Board board ){
        System.out.println(board.getContent());
        System.out.println(board.getTitle());
         boardMapper.updateBoard(board);
    }
    @Transactional
    public void deleteBoard(Long boardId) {
        boardMapper.deleteBoard((boardId));
    }

//    public void viewCount(Long boardId) {
//        boardMapper.viewCount(boardId);
//    }
}
