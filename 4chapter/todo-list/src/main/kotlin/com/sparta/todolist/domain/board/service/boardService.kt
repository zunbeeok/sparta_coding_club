package com.sparta.todolist.domain.board.service

import com.sparta.todolist.domain.board.dto.req.CreateBoardRequest
import com.sparta.todolist.domain.board.dto.req.UpdateBoardRequest
import com.sparta.todolist.domain.board.dto.res.BoardResponse

interface boardService {

    fun getBoardById(boardId :Long):BoardResponse;

    fun getAllBoardList():List<BoardResponse>;

    fun createBoard(createBoardRequest: CreateBoardRequest):BoardResponse;

    fun updateBoard(boardId: Long, updateBoardResponse: UpdateBoardRequest):BoardResponse;

    fun deleteBoard(boardId: Long):Unit;
}