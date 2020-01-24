package com.revature.pojo;

public class Superhuman {
	private Integer superid;
	private String superName;
	private String alias;
	private String hometown;
	private String nemesis;
	private String alignment;
	private Integer alignmentid;

	// Reading
	public Superhuman(Integer superid, String superName, String alias, String hometown, String nemesis,
			Integer alignmentid) {
		super();
		this.superid = superid;
		this.superName = superName;
		this.alias = alias;
		this.hometown = hometown;
		this.nemesis = nemesis;
		this.alignmentid = alignmentid;
	}

	// Writing, you don't need to add an ID
	
	public Superhuman(String supernName, String alias, String hometown, String nemesis, Integer alignmentid) {
		super();
		this.superName = supernName;
		this.alias = alias;
		this.hometown = hometown;
		this.nemesis = nemesis;
		this.alignmentid = alignmentid;
	}

	
	//Read via Join
	public Superhuman(Integer superid, String superName, String alias, String hometown, String nemesis, String alignment) {
		super();
		this.superid = superid;
		this.superName = superName;
		this.alias = alias;
		this.hometown = hometown;
		this.nemesis = nemesis;
		this.alignment = alignment;
	}

	public Integer getSuperid() {
		return superid;
	}

	public void setSuperid(Integer shid) {
		this.superid = shid;
	}

	public String getSuperName() {
		return superName;
	}

	public void setSuperName(String supername) {
		this.superName = supername;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getNemesis() {
		return nemesis;
	}

	public void setNemesis(String nemesis) {
		this.nemesis = nemesis;
	}

	public Integer getAlignmentid() {
		return alignmentid;
	}

	public void setAlignmentid(Integer alignmentid) {
		this.alignmentid = alignmentid;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}
}
