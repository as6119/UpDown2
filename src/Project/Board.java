package Project;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private List<Board2> posts;

	// �Խ����� ��� �����Դϴ�.
	public Board() {
		this.posts = new ArrayList<>();
	}

	// �Խ��ǿ� ���� �߰��ϴ� ����Դϴ�.
	public void addPost(Board2 post) {
		this.posts.add(post);
	}

	// �Խ����� ���� �����ϴ� ����Դϴ�.
	public void deletePost(int id) {
		for (Board2 post : posts) { // Board2�� ��ϵ� �Խñ��� ã�´�.
			if (post.getId() == id) { // ������ id�� ��ȣ�� �ĺ��Ѵ�.
				posts.remove(post); // ����
				break;
			}
		}
	}

	// �Խ��ǿ� �ִ� ���� �����ִ� ����Դϴ�.
	public void showPosts() {
		System.out.println("==== �Խñ� ��� ====");
		for (Board2 post : posts) { // �Խ����� �Խñ��� ã�´�.
			System.out.println(post.toString()); // ã�� �Խñ��� �ҷ��´�.
		}
	}

	// �ۼ�,����,�Խñ� ������ ������ ó������ ���ư���.
	public List<Board2> getPosts() {
		return this.posts;
	}
}