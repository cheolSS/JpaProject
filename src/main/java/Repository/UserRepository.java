package Repository;

import Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//<T, id>
public interface UserRepository extends JpaRepository <User, Long> {


    <S extends User> S save(S entity);

    void deleteAll();
}
