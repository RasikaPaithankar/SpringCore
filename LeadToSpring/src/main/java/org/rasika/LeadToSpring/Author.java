package org.rasika.LeadToSpring;

public class Author {
	int aId;
	String aName;
	public Author() {
		super();
	}
	public Author(int aId, String aName) {
		super();
		this.aId = aId;
		this.aName = aName;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	@Override
	public String toString() {
		return "Author [aId=" + aId + ", aName=" + aName + "]";
	}
}
