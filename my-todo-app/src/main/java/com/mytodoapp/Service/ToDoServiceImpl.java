package com.mytodoapp.Service;
import com.mytodoapp.DAO.ToDoDAO;
import com.mytodoapp.Entity.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class ToDoServiceImpl implements ToDoService {
    private ToDoDAO toDoDAO;
    @Autowired
    public ToDoServiceImpl(ToDoDAO theToDoDAO){
        toDoDAO=theToDoDAO;
    }
    @Transactional
    public List<ToDo>findAll(){
        return toDoDAO.findAll();
    }
}


