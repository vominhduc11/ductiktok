package stackjava.com.model;

public class recAcc {
    private int id;
    private String name;
    private String nickname;
    private String avatar;
    private String like;
	private String follow;

	public recAcc(int id, String name, String nickname, String avatar, String like, String follow) {
		this.id = id;
		this.name = name;
		this.nickname = nickname;
		this.avatar = avatar;
		this.like = like;
		this.follow = follow;
	}

	public String getLike() {
		return like;
	}

	public void setLike(String like) {
		this.like = like;
	}

	public String getFollow() {
		return follow;
	}

	public void setFollow(String follow) {
		this.follow = follow;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
    
}
