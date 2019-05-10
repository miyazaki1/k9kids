package com.brooks.model;

public class Canine {
	
	private String bred_for;
	private String Breed_group;
	private String country_code;
	private Height height;
	private int id;
	private String life_span;
	private String name;
	private String origin;
	private String temperment;
	private Weight weight;

	public Canine() {}

	public Canine(String bred_for, String breed_group, String country_code, Height height, int id, String life_span,
			String name, String origin, String temperment, Weight weight) {
		super();
		this.bred_for = bred_for;
		Breed_group = breed_group;
		this.country_code = country_code;
		this.height = height;
		this.id = id;
		this.life_span = life_span;
		this.name = name;
		this.origin = origin;
		this.temperment = temperment;
		this.weight = weight;
	}

	public String getBred_for() {
		return bred_for;
	}

	public void setBred_for(String bred_for) {
		this.bred_for = bred_for;
	}

	public String getBreed_group() {
		return Breed_group;
	}

	public void setBreed_group(String breed_group) {
		Breed_group = breed_group;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLife_span() {
		return life_span;
	}

	public void setLife_span(String life_span) {
		this.life_span = life_span;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getTemperment() {
		return temperment;
	}

	public void setTemperment(String temperment) {
		this.temperment = temperment;
	}

	public Weight getWeight() {
		return weight;
	}

	public void setWeight(Weight weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Breed_group == null) ? 0 : Breed_group.hashCode());
		result = prime * result + ((bred_for == null) ? 0 : bred_for.hashCode());
		result = prime * result + ((country_code == null) ? 0 : country_code.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + id;
		result = prime * result + ((life_span == null) ? 0 : life_span.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
		result = prime * result + ((temperment == null) ? 0 : temperment.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
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
		Canine other = (Canine) obj;
		if (Breed_group == null) {
			if (other.Breed_group != null)
				return false;
		} else if (!Breed_group.equals(other.Breed_group))
			return false;
		if (bred_for == null) {
			if (other.bred_for != null)
				return false;
		} else if (!bred_for.equals(other.bred_for))
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
		if (id != other.id)
			return false;
		if (life_span == null) {
			if (other.life_span != null)
				return false;
		} else if (!life_span.equals(other.life_span))
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
		if (temperment == null) {
			if (other.temperment != null)
				return false;
		} else if (!temperment.equals(other.temperment))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dog [bred_for=" + bred_for + ", Breed_group=" + Breed_group + ", country_code=" + country_code
				+ ", height=" + height + ", id=" + id + ", life_span=" + life_span + ", name=" + name + ", origin="
				+ origin + ", temperment=" + temperment + ", weight=" + weight + "]";
	}

	
}
