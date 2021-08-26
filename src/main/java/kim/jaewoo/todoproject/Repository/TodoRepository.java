package kim.jaewoo.todoproject.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import kim.jaewoo.todoproject.Model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {

}
