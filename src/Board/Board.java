package Board;

import java.time.LocalDateTime;

public class Board { // 파일을 총 3개로 나누었습니다.
	private int id; // 게시글 ID
	private String title; // 제목
	private String content; // 내용

	public Board(int id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	} // ID , 제목 , 내용 을 갖는다.

	// 제목을 설정한다.
	public void setTitle(String title) {
		this.title = title;
	}

	// 내용을 설정한다.
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "ID: " + id + "\n 제목: " + title + "\n 내용:" + content + "\n";
	}
}
