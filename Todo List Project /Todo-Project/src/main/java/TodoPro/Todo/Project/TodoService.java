package TodoPro.Todo.Project;


import TodoPro.Todo.Project.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoResposistory todoResposistory;

    // for creating todo List
    public Todo create(Todo todo){
        return todoResposistory.save(todo);
    }


    // Get Data By Id Using Numbers
    public Todo Gettodo(Long id){
        return  todoResposistory.findById(id).orElseThrow(()->new RuntimeException("Todo Not Founded"));
    }


    // Get All Todos
    public List<Todo> Getalltodo(){
        return todoResposistory.findAll();
    }

    //Update The Todo
    public Todo UpdateTodo(Long id,Todo newDetails) {

        Todo existingtodo=todoResposistory.findById(id).orElseThrow(()->new RuntimeException("Todo Not Founded"));
        existingtodo.setDescription(newDetails.getDescription());
        existingtodo.setIscompleted(newDetails.isIscompleted());
        existingtodo.setTitle(newDetails.getTitle());

        return todoResposistory.save(existingtodo);
    }


    //Delete the Todo
    public  void DeleteTodo(Long id){
         todoResposistory.deleteById(id);
    }

}
