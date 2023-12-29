package com.sparta.todolist.domain.board.dto.res

import java.time.LocalDateTime

class BoardResponse (
        val id : Long,
        val title : String,
        val mainText : String,
        val writer : String,
        val createdAt : LocalDateTime


){

}