package com.brooks.model;

import java.util.Arrays;

public class Image {

	private String id;
	private String url;
	private String sub_id;
	private String created_at;
	private String original_filename;
	private Category[] categories;
	private Breed[] breeds;
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Image(String id, String url, String sub_id, String created_at, String original_filename,
			Category[] categories, Breed[] breeds) {
		super();
		this.id = id;
		this.url = url;
		this.sub_id = sub_id;
		this.created_at = created_at;
		this.original_filename = original_filename;
		this.categories = categories;
		this.breeds = breeds;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getSub_id() {
		return sub_id;
	}
	public void setSub_id(String sub_id) {
		this.sub_id = sub_id;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getOriginal_filename() {
		return original_filename;
	}
	public void setOriginal_filename(String original_filename) {
		this.original_filename = original_filename;
	}
	public Category[] getCategories() {
		return categories;
	}
	public void setCategories(Category[] categories) {
		this.categories = categories;
	}
	public Breed[] getBreeds() {
		return breeds;
	}
	public void setBreeds(Breed[] breeds) {
		this.breeds = breeds;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(breeds);
		result = prime * result + Arrays.hashCode(categories);
		result = prime * result + ((created_at == null) ? 0 : created_at.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((original_filename == null) ? 0 : original_filename.hashCode());
		result = prime * result + ((sub_id == null) ? 0 : sub_id.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
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
		Image other = (Image) obj;
		if (!Arrays.equals(breeds, other.breeds))
			return false;
		if (!Arrays.equals(categories, other.categories))
			return false;
		if (created_at == null) {
			if (other.created_at != null)
				return false;
		} else if (!created_at.equals(other.created_at))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (original_filename == null) {
			if (other.original_filename != null)
				return false;
		} else if (!original_filename.equals(other.original_filename))
			return false;
		if (sub_id == null) {
			if (other.sub_id != null)
				return false;
		} else if (!sub_id.equals(other.sub_id))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Image [id=" + id + ", url=" + url + ", sub_id=" + sub_id + ", created_at=" + created_at
				+ ", original_filename=" + original_filename + ", categories=" + Arrays.toString(categories)
				+ ", breeds=" + Arrays.toString(breeds) + "]";
	}
	
	
	
}
