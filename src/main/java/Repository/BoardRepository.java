package Repository;

import Entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository <Board, Long> {

    void delete(Board entity);

    <S extends Board> S save(S entity);
}
