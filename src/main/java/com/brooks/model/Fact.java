package com.brooks.model;

public class Fact {
	private String id;
	private String text;
	private String languageCode;
	private String breed_id;
	public Fact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Fact(String id, String text, String languageCode, String breed_id) {
		super();
		this.id = id;
		this.text = text;
		this.languageCode = languageCode;
		this.breed_id = breed_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getBreed_id() {
		return breed_id;
	}

	public void setBreed_id(String breed_id) {
		this.breed_id = breed_id;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((breed_id == null) ? 0 : breed_id.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((languageCode == null) ? 0 : languageCode.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fact other = (Fact) obj;
		if (breed_id == null) {
			if (other.breed_id != null)
				return false;
		} else if (!breed_id.equals(other.breed_id))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (languageCode == null) {
			if (other.languageCode != null)
				return false;
		} else if (!languageCode.equals(other.languageCode))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fact [id=" + id + ", text=" + text + ", languageCode=" + languageCode + ", breed_id=" + breed_id + "]";
	}
	
	
}
