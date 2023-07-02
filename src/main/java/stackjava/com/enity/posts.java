package stackjava.com.enity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import javax.persistence.Table;

@Entity
//@Table(name = "posts")
public class posts implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String video;
    private String content;
    private String music;
    private String userLike;
    private String userComment;
    private String userShare;
    @OneToMany(mappedBy = "posts")
    private List<link> links;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private user user;
	
	public user getUser() {
		return user;
	}
	public void setUser(user user) {
		this.user = user;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
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
