package com.example.todolist.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.example.todolist.dto.TodoListDto;
import com.example.todolist.mapper.TodoListMapper;

@Service("com.example.todolist.service.TodoListService")
public class TodoListService {
	@Resource(name="com.example.todolist.mapper.TodoListMapper")
	TodoListMapper mapper;

	public List<TodoListDto> selectAll(int month) {
		return mapper.selectAll(month);
	}
	
	public int insertData(TodoListDto dto) {
		return mapper.insertData(dto);
	}
	
	public int deleteData(int num) {
		mapper.deleteData(num);
		return mapper.numUpdate(num);
	}
	
	public int updateDoing(int num) {
		return mapper.updateDoing(num);
	}
	
	public int updateDone(int num) {
		return mapper.updateDone(num);
	}
}
