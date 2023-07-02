package stackjava.com.model;

public class userSearch {
	private String avatar;
	private String name;
	private String nickname;
	public userSearch(String avatar, String name, String nickname) {
		this.avatar = avatar;
		this.name = name;
		this.nickname = nickname;
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
	
	
}
