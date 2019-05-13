package com.brooks.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ImageShort {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private String id;
	@Column(name="url")
	private String url;
	@Column(name="Categories")
	private Category[] categories;
	@Column(name="Breeds")
	private Breed[] breeds;
	public ImageShort() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ImageShort(String id, String url, Category[] categories, Breed[] breeds) {
		super();
		this.id = id;
		this.url = url;
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		ImageShort other = (ImageShort) obj;
		if (!Arrays.equals(breeds, other.breeds))
			return false;
		if (!Arrays.equals(categories, other.categories))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
		return "ImageShort [id=" + id + ", url=" + url + ", categories=" + Arrays.toString(categories) + ", breeds="
				+ Arrays.toString(breeds) + "]";
	}
	
	
}
