package Project;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private List<Board2> posts;

	// 게시판의 기능 정렬입니다.
	public Board() {
		this.posts = new ArrayList<>();
	}

	// 게시판에 글을 추가하는 기능입니다.
	public void addPost(Board2 post) {
		this.posts.add(post);
	}

	// 게시판의 글을 제거하는 기능입니다.
	public void deletePost(int id) {
		for (Board2 post : posts) { // Board2의 등록된 게시글을 찾는다.
			if (post.getId() == id) { // 동일한 id의 번호를 식별한다.
				posts.remove(post); // 제거
				break;
			}
		}
	}

	// 게시판에 있는 글을 보여주는 기능입니다.
	public void showPosts() {
		System.out.println("==== 게시글 목록 ====");
		for (Board2 post : posts) { // 게시판의 게시글을 찾는다.
			System.out.println(post.toString()); // 찾은 게시글을 불러온다.
		}
	}

	// 작성,삭제,게시글 관람이 끝나면 처음으로 돌아간다.
	public List<Board2> getPosts() {
		return this.posts;
	}
}