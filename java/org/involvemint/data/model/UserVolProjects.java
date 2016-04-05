package org.involvemint.data.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "userProject")
public class UserVolProjects {
	private Integer userProjPk;
	private VolunteerProject volProject;
	private UserProfile userProfile;
	private double time;
	private int credits;
	private String status;

	@XmlElement
	public Integer getUserProjPk() {
		return userProjPk;
	}

	public void setUserProjPk(Integer userProjPk) {
		this.userProjPk = userProjPk;
	}

	@XmlElement(name="VolunteerProject")
	public VolunteerProject getVolProject() {
		return volProject;
	}

	public void setVolProject(VolunteerProject volProject) {
		this.volProject = volProject;
	}

	@XmlElement(name="UserProfile")
	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@XmlElement
	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	@XmlElement
	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	@XmlElement
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
