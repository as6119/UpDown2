package Board;

import java.time.LocalDateTime;

public class Board { // ������ �� 3���� ���������ϴ�.
	private int id; // �Խñ� ID
	private String title; // ����
	private String content; // ����

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
	} // ID , ���� , ���� �� ���´�.

	// ������ �����Ѵ�.
	public void setTitle(String title) {
		this.title = title;
	}

	// ������ �����Ѵ�.
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "ID: " + id + "\n ����: " + title + "\n ����:" + content + "\n";
	}
}
