package Controller;

import Entity.Board;
import Service.BoardService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/main")
public class BoardController {

    private BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping ("/board/register")
    public void createBoard(@RequestBody Board board){
        boardService.createboard(board);
    }

    @GetMapping("/board")
    public void deleteBoard(@RequestParam Long board_id) {
        Board board = new Board();
            board.setId(board_id);
        boardService.deleteboard(board);
    }
}