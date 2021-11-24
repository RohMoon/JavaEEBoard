package com.example.javaeeboard;

import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class BoardController  extends MultiActionController {
    private BoardService boardService = null;
    private Logger logger = Logger.getLogger(BoardController.class);
    public void setBoardService(BoardService boardService) {
    this.boardService = boardService;
    }
/*
    public ModelAndView doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        Logger.getLogger("111");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("board");
        return mav;




    }*/

    public void BoardSelectAllList(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BoardDTO boardDTO) throws ServletException, IOException {
//        logger.info("SelectAll 정상작동11");
        System.out.println("-==========");
        List<BoardDTO> boardSelectAllList = boardService.BoardSelectAll(boardDTO);
//        logger.info("SelectAll 정상작동");
//        logger.info("======>"+boardSelectAllList);
//        httpServletResponse.sendRedirect("../views/board.jsp");
//        RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/WEB-INF/views/board.jsp");
//        requestDispatcher.forward(httpServletRequest, httpServletResponse);
//        return "redirect:../views/board.jsp";
        Gson gson = new Gson();
        String outString = gson.toJson(boardSelectAllList);
        PrintWriter out = httpServletResponse.getWriter();
        out.print(outString);

    }


}
