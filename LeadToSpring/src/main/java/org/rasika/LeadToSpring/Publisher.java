package org.rasika.LeadToSpring;

import java.util.Map;

public class Publisher {
	Map<Book, Author> detail;
	public Publisher() {
		super();
	}
	public Publisher(Map<Book, Author> detail) {
		super();
		this.detail = detail;
	}
	public Map<Book, Author> getDetail() {
		return detail;
	}
	public void setDetail(Map<Book, Author> detail) {
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "Publisher [detail=" + detail + "]";
	}
}
