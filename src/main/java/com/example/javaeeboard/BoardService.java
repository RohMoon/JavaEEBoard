package com.example.javaeeboard;

import java.util.List;

public class BoardService {
    private BoardDAO boardDAO;
    public void setBoardDAO(BoardDAO boardDAO) {
        this.boardDAO = boardDAO;
    }


    public List<BoardDTO> BoardSelectAll(BoardDTO boardDTO){
        List<BoardDTO> boardSelectAllList= null;
            try {
                boardSelectAllList = boardDAO.BoardSelectAll(boardDTO);
            }catch (Throwable e){
                e.printStackTrace();
            }
        return boardSelectAllList;
    }

}
