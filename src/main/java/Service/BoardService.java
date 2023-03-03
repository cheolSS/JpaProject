package Service;

import entitiy.Board;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    private final repository.boardRepository boardRepository;

    public BoardService(repository.boardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }
    public void createboard(Board board) {
        boardRepository.save(board);
    }

    public void deleteboard(Board board) {
        boardRepository.delete(board);
    }


}
