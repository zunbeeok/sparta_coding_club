package com.sparta.todolist.domain.board.service

import com.sparta.todolist.domain.board.dto.res.BoardResponse

interface boardService {

    fun getBoardById(boardId :Long):BoardResponse;

    fun getAllBoardList():List<BoardResponse>;

    fun createBoard()
}