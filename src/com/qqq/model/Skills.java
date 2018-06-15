package com.qqq.model;

public class Skills {
	public String name;
	public String skill;
	public int point;
	public int type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Skills [name=" + name + ", skill=" + skill + ", point=" + point
				+ ", type=" + type + "]";
	}

}
