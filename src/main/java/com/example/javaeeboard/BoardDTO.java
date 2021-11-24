package com.example.javaeeboard;

public class BoardDTO {
   int    rownum        ;
   String board_no      ;
   String board_title   ;
   String board_content ;
   String board_regdata ;
   String board_author  ;
   String board_del     ;
   int    board_hit     ;

    public int getRownum() {
        return rownum;
    }

    public void setRownum(int rownum) {
        this.rownum = rownum;
    }

    public String getBoard_no() {
        return board_no;
    }

    public void setBoard_no(String board_no) {
        this.board_no = board_no;
    }

    public String getBoard_title() {
        return board_title;
    }

    public void setBoard_title(String board_title) {
        this.board_title = board_title;
    }

    public String getBoard_content() {
        return board_content;
    }

    public void setBoard_content(String board_content) {
        this.board_content = board_content;
    }

    public String getBoard_regdata() {
        return board_regdata;
    }

    public void setBoard_regdata(String board_regdata) {
        this.board_regdata = board_regdata;
    }

    public String getBoard_author() {
        return board_author;
    }

    public void setBoard_author(String board_author) {
        this.board_author = board_author;
    }

    public String getBoard_del() {
        return board_del;
    }

    public void setBoard_del(String board_del) {
        this.board_del = board_del;
    }

    public int getBoard_hit() {
        return board_hit;
    }

    public void setBoard_hit(int board_hit) {
        this.board_hit = board_hit;
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "board_no=" + board_no +
                ", board_title='" + board_title + '\'' +
                ", board_content='" + board_content + '\'' +
                ", board_regdata='" + board_regdata + '\'' +
                ", board_author='" + board_author + '\'' +
                ", board_del='" + board_del + '\'' +
                ", board_hit=" + board_hit +
                '}';
    }
}
