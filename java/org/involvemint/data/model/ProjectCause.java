package org.involvemint.data.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "projectCause")
public class ProjectCause {
	private Integer projCausePk;
	private String projCauseName;
	private String activeInd;
	private double weightage;

	@XmlElement
	public Integer getProjCausePk() {
		return projCausePk;
	}

	public void setProjCausePk(Integer projCausePk) {
		this.projCausePk = projCausePk;
	}

	@XmlElement
	public String getProjCauseName() {
		return projCauseName;
	}

	public void setProjCauseName(String projCauseName) {
		this.projCauseName = projCauseName;
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
