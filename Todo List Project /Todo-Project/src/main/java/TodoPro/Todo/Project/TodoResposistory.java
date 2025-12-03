package TodoPro.Todo.Project;

import TodoPro.Todo.Project.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoResposistory extends JpaRepository<Todo,Long> {


}
