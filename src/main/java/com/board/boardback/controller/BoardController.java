package com.board.boardback.controller;

import com.board.boardback.entity.Board;
import com.board.boardback.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class BoardController {

    @Autowired BoardService boardService;

    @GetMapping("/board")
    public List<Board> getAllBoards(){
        System.out.println("home");
        return boardService.getAllBoard();
    }
}
