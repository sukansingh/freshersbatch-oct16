package com.spring.rest;

public class PostAdd 
{
	private int postId;
	private String status;
	private String title;
	private String name;
	private String category;
	private String decription;
	private int photoCount;
	private String photo1;
	private String photo2;
	
	public PostAdd(){}

	public PostAdd(int postId, String status, String title, String name, String category, String decription,
			int photoCount, String photo1, String photo2) {
		super();
		this.postId = postId;
		this.status = status;
		this.title = title;
		this.name = name;
		this.category = category;
		this.decription = decription;
		this.photoCount = photoCount;
		this.photo1 = photo1;
		this.photo2 = photo2;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public int getPhotoCount() {
		return photoCount;
	}

	public void setPhotoCount(int photoCount) {
		this.photoCount = photoCount;
	}

	public String getPhoto1() {
		return photo1;
	}

	public void setPhoto1(String photo1) {
		this.photo1 = photo1;
	}

	public String getPhoto2() {
		return photo2;
	}

	public void setPhoto2(String photo2) {
		this.photo2 = photo2;
	}

	@Override
	public String toString() {
		return "PostAdd [postId=" + postId + ", status=" + status + ", title=" + title + ", name=" + name
				+ ", category=" + category + ", decription=" + decription + ", photoCount=" + photoCount + ", photo1="
				+ photo1 + ", photo2=" + photo2 + "]";
	}
	
	
	
	
	
}
