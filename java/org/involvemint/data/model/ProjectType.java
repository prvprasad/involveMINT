package org.involvemint.data.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "projectType")
public class ProjectType {
	private Integer projTypePk;
	private String projTypeName;
	private String activeInd;
	private double weightage;

	public ProjectType() {
		// TODO Auto-generated constructor stub
	}
	
	public ProjectType(Integer pk, String name, String activeInd, double weightage) {
		this.projTypePk = pk;
		this.projTypeName = name;
		this.activeInd = activeInd;
		this.weightage = weightage;
	}

	@XmlElement
	public Integer getProjTypePk() {
		return projTypePk;
	}

	public void setProjTypePk(Integer projTypePk) {
		this.projTypePk = projTypePk;
	}

	@XmlElement
	public String getProjTypeName() {
		return projTypeName;
	}

	public void setProjTypeName(String projTypeName) {
		this.projTypeName = projTypeName;
	}

	@XmlElement
	public String getActiveInd() {
		return activeInd;
	}

	public void setActiveInd(String activeInd) {
		this.activeInd = activeInd;
	}

	@XmlElement
	public double getWeightage() {
		return weightage;
	}

	public void setWeightage(double weightage) {
		this.weightage = weightage;
	}

}
