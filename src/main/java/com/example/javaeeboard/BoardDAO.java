package com.example.javaeeboard;

import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class BoardDAO {
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
    public String BoardInsert(BoardDTO boardDTO){
        String insert = null;
        try {
        sqlSessionTemplate.insert("boardInsert",boardDTO);
        }catch (Exception e){
        }
        return insert;
    }
    public List<BoardDTO> BoardSelectAll(BoardDTO boardDTO) throws Throwable{
        List<BoardDTO> boardSelectAllList = sqlSessionTemplate.selectList("boardSelectAll",boardDTO);
        return boardSelectAllList;
    }

}
