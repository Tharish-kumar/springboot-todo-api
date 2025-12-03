package TodoPro.Todo.Project;


import TodoPro.Todo.Project.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Api/V5/Todo")
public class TodoController {

    @Autowired
    private  TodoService todoService;


    // New Todo List

    @PostMapping("/create")
    ResponseEntity<Todo> createtodo(@RequestBody Todo todo){
        return new ResponseEntity<>(todoService.create(todo), HttpStatus.OK);
    }


// Get Todo Using Paramas Using ID

    @GetMapping("/find")
    ResponseEntity<Todo> Gettodobyid(@RequestParam Long id){
        try {
            Todo createtodo=todoService.Gettodo(id);
            return new ResponseEntity<>(createtodo,HttpStatus.OK);
        }
        catch (RuntimeException e){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    // Get All Todos In The DataBase
    @GetMapping("/all")
    ResponseEntity<List<Todo>> getalltodos(){
        return new ResponseEntity<>(todoService.Getalltodo(),HttpStatus.OK);
    }



    // Update the Todo In the DataBase
    @PutMapping("update/{id}")
    ResponseEntity<Todo> updatetodo(@PathVariable Long id,@RequestBody Todo todo){
        return new ResponseEntity<>(todoService.UpdateTodo(id,todo),HttpStatus.OK);
    }


    // Delete The Todo
    @DeleteMapping("delete/{id}")
    void DeleteTodo(@PathVariable Long id){
         todoService.DeleteTodo(id);
    }



}
