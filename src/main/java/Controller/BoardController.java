package Controller;

import Entity.Board;
import Service.BoardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class BoardController {

    private BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping ("/board/register")
    public String CreateBoard(Board board){

        boardService.createboard(board);
        return null;
    }

    @GetMapping("/board")
    public void DeleteBoard(Board board) {
        boardService.deleteboard(board);
    }
}
