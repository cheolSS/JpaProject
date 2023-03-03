package repository;

import entitiy.Board;
import org.springframework.data.repository.CrudRepository;

public interface boardRepository extends CrudRepository<Board, Long> {
}
