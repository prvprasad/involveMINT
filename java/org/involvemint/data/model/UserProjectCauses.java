package org.involvemint.data.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "userProjCause")
public class UserProjectCauses {
	private Integer userCausePk;
	private UserProfile userProfile;
	private ProjectCause projectCause;

	@XmlElement
	public Integer getUserCausePk() {
		return userCausePk;
	}

	public void setUserCausePk(Integer userCausePk) {
		this.userCausePk = userCausePk;
	}

	@XmlElement(name = "UserProfile")
	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	@XmlElement(name = "ProjectCause")
	public ProjectCause getProjectCause() {
		return projectCause;
	}

	public void setProjectCause(ProjectCause projectCause) {
		this.projectCause = projectCause;
	}

}
