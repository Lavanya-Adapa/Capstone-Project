package com.mytodoapp.RestController;
import com.mytodoapp.Entity.ToDo;
import com.mytodoapp.Service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class ToDoRestController {
    private ToDoService toDoService;
    @Autowired
    public ToDoRestController(ToDoService theToDoService){
        toDoService=theToDoService;
    }
    @GetMapping("/todos")
    public List<ToDo>findAll(){
        return toDoService.findAll();
    }
}

