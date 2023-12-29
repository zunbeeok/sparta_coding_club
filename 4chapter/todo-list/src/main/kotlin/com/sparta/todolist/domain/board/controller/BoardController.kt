package com.sparta.todolist.domain.board.controller

import com.sparta.todolist.domain.board.dto.req.CreateBoardRequest
import com.sparta.todolist.domain.board.dto.req.UpdateBoardRequest
import com.sparta.todolist.domain.board.dto.res.BoardResponse
import com.sparta.todolist.domain.board.service.boardService
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/board")
class boardController (
    private val boardService: boardService
){


    @GetMapping("/{boardId}")
    fun getBoard(@PathVariable boardId: Long):ResponseEntity<BoardResponse>{
        TODO("boardId의 row만 가져오는 service 메소드를 호출.");
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(boardService.getBoardById(boardId))
    }

    @GetMapping()
    fun getBoardList():ResponseEntity<List<BoardResponse>>{
        TODO("board 테이블의 모든 자료를 조회하는 service 메소드를 호출")
        return  ResponseEntity
            .status(HttpStatus.OK)
            .body(boardService.getAllBoardList())
    }

    @PostMapping()
    fun createBoard(@RequestBody createBoardRequest: CreateBoardRequest ):ResponseEntity<BoardResponse>{
        TODO("create해주는 service 메소드를 호출.")
        return  ResponseEntity
            .status(HttpStatus.OK)
            .body(boardService.createBoard(createBoardRequest))
    }

    @PutMapping("/{boardId}")
    fun updateBoard(
            @PathVariable boardId: Long,
            @RequestBody updateBoardRequest: UpdateBoardRequest,
    ):ResponseEntity<BoardResponse>{
        TODO("update해주는 service메소드를 호출한다.")
        return  ResponseEntity
            .status(HttpStatus.OK)
            .body(boardService.updateBoard(boardId,updateBoardRequest));
    }

    @DeleteMapping("/{boardId}")
    fun deleteBoard(
            @PathVariable boardId: Long
    ):ResponseEntity<Unit>{
        TODO("del해주는 service메소드를 호출")
        boardService.deleteBoard(boardId);
        return  ResponseEntity
            .status(HttpStatus.NO_CONTENT)
            .build();
    }
}