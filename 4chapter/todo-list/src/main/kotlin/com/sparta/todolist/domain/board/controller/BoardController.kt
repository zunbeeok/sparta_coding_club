package com.sparta.todolist.domain.board.controller

import com.sparta.todolist.domain.board.dto.req.CreateBoardRequest
import com.sparta.todolist.domain.board.dto.req.UpdateBoardRequest
import com.sparta.todolist.domain.board.dto.res.BoardResponse
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
class boardController {


    @GetMapping("/{boardId}")
    fun getBoard(@PathVariable boardId: Long):ResponseEntity<BoardResponse>{
        TODO("boardId의 row만 가져오는 service 메소드를 호출.");
    }

    @GetMapping()
    fun getBoardList():ResponseEntity<List<BoardResponse>>{
        TODO("board 테이블의 모든 자료를 조회하는 service 메소드를 호출")
    }

    @PostMapping()
    fun createBoard(@RequestBody createBoardRequest: CreateBoardRequest ):ResponseEntity<BoardResponse>{
        TODO("create해주는 service 메소드를 호출.")
    }

    @PutMapping("/{boardId}")
    fun updateBoard(
            @PathVariable boardId: Long,
            @RequestBody updateBoardRequest: UpdateBoardRequest,
    ):ResponseEntity<BoardResponse>{
        TODO("update해주는 service메소드를 호출한다.")
    }

    @DeleteMapping("/{boardId}")
    fun deleteBoard(
            @PathVariable boardId: Long
    ){
        TODO("del해주는 service메소드를 호출")
    }
}