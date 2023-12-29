package com.sparta.todolist.domain.board.dto.req

data class CreateBoardRequest (
        val title:String,
        val mainText:String,
        val writer:String
){
}