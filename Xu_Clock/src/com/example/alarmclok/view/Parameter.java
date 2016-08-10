package com.example.alarmclok.view;

public class Parameter {
	/**
	 *定义类型
	 */
	int playmusic;
	String title;
	String time;
	int user;
	String userQuantity;
	int praise;
	String praiseQuantity;
	int comment;
	String commentQuantity;
	int download;
	/**
	 * set,get方法获得对象
	 * @return
	 */
	public int getPlaymusic() {
		return  playmusic;
	}
	public void setPlaymusic(int  playmusic) {
		this. playmusic =  playmusic;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public String getUserQuantity() {
		return userQuantity;
	}
	public void setUserQuantity(String userQuantity) {
		this.userQuantity = userQuantity;
	}
	public int getPraise() {
		return praise;
	}
	public void setPraise(int praise) {
		this.praise = praise;
	}
	public String getPraiseQuantity() {
		return praiseQuantity;
	}
	public void setPraiseQuantity(String praiseQuantity) {
		this.praiseQuantity = praiseQuantity;
	}
	public int getComment() {
		return comment;
	}
	public void setComment(int comment) {
		this.comment = comment;
	}
	public String getCommentQuantity() {
		return commentQuantity;
	}
	public void setCommentQuantity(String commentQuantity) {
		this.commentQuantity = commentQuantity;
	}
	public int getDownload() {
		return download;
	}
	public void setDownload(int download) {
		this.download = download;
	}
}
