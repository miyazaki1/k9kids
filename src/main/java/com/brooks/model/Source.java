package com.brooks.model;

public class Source {
	private String id;
	private String name;
	private String website_url;
	private String breed_id;
	public Source() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Source(String id, String name, String website_url, String breed_id) {
		super();
		this.id = id;
		this.name = name;
		this.website_url = website_url;
		this.breed_id = breed_id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebsite_url() {
		return website_url;
	}
	public void setWebsite_url(String website_url) {
		this.website_url = website_url;
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
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((website_url == null) ? 0 : website_url.hashCode());
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
		Source other = (Source) obj;
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (website_url == null) {
			if (other.website_url != null)
				return false;
		} else if (!website_url.equals(other.website_url))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Source [id=" + id + ", name=" + name + ", website_url=" + website_url + ", breed_id=" + breed_id + "]";
	}
	
	
}
