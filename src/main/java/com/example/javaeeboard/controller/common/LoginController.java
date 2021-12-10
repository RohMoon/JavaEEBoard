package com.example.javaeeboard.controller.common;

import com.example.javaeeboard.BoardService;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.ServletException;
import java.io.IOException;


public class LoginController extends MultiActionController {
    private BoardService boardService = null;
    private Logger logger = Logger.getLogger(LoginController.class);
    public void setBoardService(BoardService boardService) {
    this.boardService = boardService;
    }

    public String LoginController() throws ServletException, IOException {
        logger.info("Index = > LoginCont");

        return "common/login";
    }


}
