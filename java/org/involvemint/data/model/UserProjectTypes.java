package org.involvemint.data.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "userProjTypes")
public class UserProjectTypes {
	private Integer userProjTypePk;
	private UserProfile userProfile;
	private ProjectType projectType;

	@XmlElement
	public Integer getUserProjTypePk() {
		return userProjTypePk;
	}

	public void setUserProjTypePk(Integer userProjTypePk) {
		this.userProjTypePk = userProjTypePk;
	}

	@XmlElement(name="UserProfile")
	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@XmlElement(name="ProjectType")
	public ProjectType getProjectType() {
		return projectType;
	}

	public void setProjectType(ProjectType projectType) {
		this.projectType = projectType;
	}
}
