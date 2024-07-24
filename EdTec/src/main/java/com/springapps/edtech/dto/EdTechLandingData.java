package com.springapps.edtech.dto;

public class EdTechLandingData {

	int Id;
	String Username;
	String Description;
	String UserImage;
	Double Interested;
	
	public EdTechLandingData() {
	}

	public EdTechLandingData(int id, String username, String description, String userImage, Double interested) {
		Id = id;
		Username = username;
		Description = description;
		UserImage = userImage;
		Interested = interested;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getUserImage() {
		return UserImage;
	}

	public void setUserImage(String userImage) {
		UserImage = userImage;
	}

	public Double getInterested() {
		return Interested;
	}

	public void setInterested(Double interested) {
		Interested = interested;
	}

	@Override
	public String toString() {
		return "EdTechLandingData [Id=" + Id + ", Username=" + Username + ", Description=" + Description
				+ ", UserImage=" + UserImage + ", Interested=" + Interested + "]";
	}
	
}
