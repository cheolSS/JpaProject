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

    //Entity를 직접 가져오지 않고, Dto로 만들어서 가져와야 하지만 기능상으로는 우선 문제가 없기 때문에 빠르게 작업했습니다.
    public void createboard(Board board) {
        boardRepository.save(board);
    }

    public void deleteboard(Board board) {
        boardRepository.delete(board);
    }


}
