package Repository;

import Entity.User;
import org.springframework.data.repository.CrudRepository;

//<T, id>
public interface UserRepository extends CrudRepository<User, Long> {
}
