package board;

import Service.BoardService;
import controller.BoardController;
import entitiy.Board;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(MockitoJUnitRunner.class)
public class BoardControllerTest {
    @Autowired
    @Mock
    private final BoardService boardService;

    @InjectMocks
    private BoardController boardController;

    private MockMvc mockMvc;



    public BoardControllerTest(BoardService boardService) {
        this.boardService = boardService;
    }

    @Before("")
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(boardController).build();
    }

    @org.junit.jupiter.api.Test
    public void testCreateBoard() throws Exception {
        // Given
        Board board = new Board();
        board.setId(1L);
        board.setTitle("Test Board");

        doNothing().when(boardService).createboard(board);

        // When
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/main/board/register")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"id\":1,\"title\":\"Test Board\"}")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn();

        // Then
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
    }

    @Test
    public void testDeleteBoard() throws Exception {
        // Given
        Board board = new Board();
        board.setId(1L);

        doNothing().when(boardService).deleteboard(board);

        // When
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/main/board")
                        .param("board_id", "1")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn();

        // Then
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
    }
}

