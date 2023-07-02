package stackjava.com.model;

import java.util.List;

public class user {
	private int id;
	private String avatar;
	private String name;
	private String nickname;
	private String content;
	private String following;
	private String followers;
	private String likes;
	private List<postUser> posts;
	
	public user(int id, String avatar, String name, String nickname, String content, String following, String followers,
			String likes, List<postUser> posts) {
		this.id = id;
		this.avatar = avatar;
		this.name = name;
		this.nickname = nickname;
		this.content = content;
		this.following = following;
		this.followers = followers;
		this.likes = likes;
		this.posts = posts;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFollowing() {
		return following;
	}

	public void setFollowing(String following) {
		this.following = following;
	}

	public String getFollowers() {
		return followers;
	}

	public void setFollowers(String followers) {
		this.followers = followers;
	}

	public String getLikes() {
		return likes;
	}

	public void setLikes(String likes) {
		this.likes = likes;
	}

	public List<postUser> getPosts() {
		return posts;
	}

	public void setPosts(List<postUser> posts) {
		this.posts = posts;
	}
}
