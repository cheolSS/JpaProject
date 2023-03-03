package repository;

import entitiy.User;
import org.springframework.data.repository.CrudRepository;

//<T, id>
public interface userRepository extends CrudRepository<User, Long> {
}
