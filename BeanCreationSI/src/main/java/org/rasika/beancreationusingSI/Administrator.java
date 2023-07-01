package org.rasika.beancreationusingSI;

public class Administrator {
	int aId;
	String aName;
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
		return "Administrator [aId=" + aId + ", aName=" + aName + "]";
	}
}
