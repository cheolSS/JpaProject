package Service;

import Entity.Board;
import Repository.BoardRepository;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }
    public void createboard(Board board) {
        boardRepository.save(board);
    }

    public void deleteboard(Board board) {
        boardRepository.delete(board);
    }


}
