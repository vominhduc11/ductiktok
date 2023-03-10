package stackjava.com.model;

import java.util.List;


public class posts {
	private long id;
    private String avatar;
    private String video;
    private String name;
    private String subname;
    private String content;
    private String music;
    private String followers;
    private String likes;
    private String userLike;
    private String userComment;
    private String userShare;
    private List<link> links;
    

	public posts(long id, String avatar, String video, String name, String subname, String content, String music,
			String followers, String likes, String userLike, String userComment, String userShare, List<link> links) {
		this.id = id;
		this.avatar = avatar;
		this.video = video;
		this.name = name;
		this.subname = subname;
		this.content = content;
		this.music = music;
		this.followers = followers;
		this.likes = likes;
		this.userLike = userLike;
		this.userComment = userComment;
		this.userShare = userShare;
		this.links = links;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getMusic() {
		return music;
	}
	public void setMusic(String music) {
		this.music = music;
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
	public String getUserLike() {
		return userLike;
	}
	public void setUserLike(String userLike) {
		this.userLike = userLike;
	}
	public String getUserComment() {
		return userComment;
	}
	public void setUserComment(String userComment) {
		this.userComment = userComment;
	}
	public String getUserShare() {
		return userShare;
	}
	public void setUserShare(String userShare) {
		this.userShare = userShare;
	}
	public List<link> getLinks() {
		return links;
	}
	public void setLinks(List<link> links) {
		this.links = links;
	}

}
