package org.involvemint.data.model;

import java.sql.Time;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "project")
public class VolunteerProject {
	private Integer projectPk;
	private String projectDesc;
	private Date eventDate;
	private Time startTime;
	private Time endTime;
	private ProjectType projectType;
	private ProjectCause projectCause;
	private Organization org;
	private String where;

	@XmlElement
	public Integer getProjectPk() {
		return projectPk;
	}

	public void setProjectPk(Integer projectPk) {
		this.projectPk = projectPk;
	}

	@XmlElement
	public String getProjectDesc() {
		return projectDesc;
	}

	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}

	@XmlElement
	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	@XmlElement
	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	@XmlElement
	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	@XmlElement(name="ProjectType")
	public ProjectType getProjectType() {
		return projectType;
	}

	public void setProjectType(ProjectType projectType) {
		this.projectType = projectType;
	}

	@XmlElement(name="ProjectCause")
	public ProjectCause getProjectCause() {
		return projectCause;
	}

	public void setProjectCause(ProjectCause projectCause) {
		this.projectCause = projectCause;
	}

	@XmlElement(name="org")
	public Organization getOrg() {
		return org;
	}

	public void setOrg(Organization org) {
		this.org = org;
	}

	@XmlElement
	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}
}
