package com.brooks.model;

public class Breed {

	private String id;
	private String name;
	private String temperament;
	private String life_Span;
	private String alt_names;
	private String wikipedia_url;
	private String origin;
	private Weight weight;
	private String country_code;
	private Height height;
	public Breed() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Breed(String id, String name, String temperament, String life_Span, String alt_names, String wikipedia_url,
			String origin, Weight weight, String country_code, Height height) {
		super();
		this.id = id;
		this.name = name;
		this.temperament = temperament;
		this.life_Span = life_Span;
		this.alt_names = alt_names;
		this.wikipedia_url = wikipedia_url;
		this.origin = origin;
		this.weight = weight;
		this.country_code = country_code;
		this.height = height;
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
	public String getTemperament() {
		return temperament;
	}
	public void setTemperament(String temperament) {
		this.temperament = temperament;
	}
	public String getLife_Span() {
		return life_Span;
	}
	public void setLife_Span(String life_Span) {
		this.life_Span = life_Span;
	}
	public String getAlt_names() {
		return alt_names;
	}
	public void setAlt_names(String alt_names) {
		this.alt_names = alt_names;
	}
	public String getWikipedia_url() {
		return wikipedia_url;
	}
	public void setWikipedia_url(String wikipedia_url) {
		this.wikipedia_url = wikipedia_url;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public Weight getWeight() {
		return weight;
	}
	public void setWeight(Weight weight) {
		this.weight = weight;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public Height getHeight() {
		return height;
	}
	public void setHeight(Height height) {
		this.height = height;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alt_names == null) ? 0 : alt_names.hashCode());
		result = prime * result + ((country_code == null) ? 0 : country_code.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((life_Span == null) ? 0 : life_Span.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
		result = prime * result + ((temperament == null) ? 0 : temperament.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		result = prime * result + ((wikipedia_url == null) ? 0 : wikipedia_url.hashCode());
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
		Breed other = (Breed) obj;
		if (alt_names == null) {
			if (other.alt_names != null)
				return false;
		} else if (!alt_names.equals(other.alt_names))
			return false;
		if (country_code == null) {
			if (other.country_code != null)
				return false;
		} else if (!country_code.equals(other.country_code))
			return false;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (life_Span == null) {
			if (other.life_Span != null)
				return false;
		} else if (!life_Span.equals(other.life_Span))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (temperament == null) {
			if (other.temperament != null)
				return false;
		} else if (!temperament.equals(other.temperament))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		if (wikipedia_url == null) {
			if (other.wikipedia_url != null)
				return false;
		} else if (!wikipedia_url.equals(other.wikipedia_url))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Breed [id=" + id + ", name=" + name + ", temperament=" + temperament + ", life_Span=" + life_Span
				+ ", alt_names=" + alt_names + ", wikipedia_url=" + wikipedia_url + ", origin=" + origin + ", weight="
				+ weight + ", country_code=" + country_code + ", height=" + height + "]";
	}
	
	
}
