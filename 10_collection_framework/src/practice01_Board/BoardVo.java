package practice01_Board;

public class BoardVo {
  
  private int boardNo;
  private String title;
  private String writer;
  private String createdAt;
  
  public BoardVo() {
  
  }
  public BoardVo(int boardNo, String title, String writer, String createdAt) {
    super();
    this.boardNo = boardNo;
    this.title = title;
    this.writer = writer;
    this.createdAt = createdAt;
  }
  
  public int getBoardNo() {
    return boardNo;
  }
  public void setBoardNo(int boardNo) {
    this.boardNo = boardNo;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getWriter() {
    return writer;
  }
  public void setWriter(String writer) {
    this.writer = writer;
  }
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }
  @Override
  public String toString() {
    return "BoardVo [boardNo=" + boardNo + ", title=" + title + ", writer=" + writer + ", createdAt=" + createdAt + "]";
  }
  
}
