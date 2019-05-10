package com.brooks.model;

public class Favorite {
	private String id;
	private String image_id;
	private String sub_id;
	private String created_at;
	public Favorite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Favorite(String id, String image_id, String sub_id, String created_at) {
		super();
		this.id = id;
		this.image_id = image_id;
		this.sub_id = sub_id;
		this.created_at = created_at;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImage_id() {
		return image_id;
	}
	public void setImage_id(String image_id) {
		this.image_id = image_id;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((created_at == null) ? 0 : created_at.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((image_id == null) ? 0 : image_id.hashCode());
		result = prime * result + ((sub_id == null) ? 0 : sub_id.hashCode());
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
		Favorite other = (Favorite) obj;
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
		if (image_id == null) {
			if (other.image_id != null)
				return false;
		} else if (!image_id.equals(other.image_id))
			return false;
		if (sub_id == null) {
			if (other.sub_id != null)
				return false;
		} else if (!sub_id.equals(other.sub_id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Favorite [id=" + id + ", image_id=" + image_id + ", sub_id=" + sub_id + ", created_at=" + created_at
				+ "]";
	}
	
	
}
