package com.brooks.model;

public class Weight {
	private String imperial;
	private String metric;
	public Weight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Weight(String imperial, String metric) {
		super();
		this.imperial = imperial;
		this.metric = metric;
	}
	public String getImperial() {
		return imperial;
	}
	public void setImperial(String imperial) {
		this.imperial = imperial;
	}
	public String getMetric() {
		return metric;
	}
	public void setMetric(String metric) {
		this.metric = metric;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((imperial == null) ? 0 : imperial.hashCode());
		result = prime * result + ((metric == null) ? 0 : metric.hashCode());
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
		Weight other = (Weight) obj;
		if (imperial == null) {
			if (other.imperial != null)
				return false;
		} else if (!imperial.equals(other.imperial))
			return false;
		if (metric == null) {
			if (other.metric != null)
				return false;
		} else if (!metric.equals(other.metric))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Weight [imperial=" + imperial + ", metric=" + metric + "]";
	}
	
}
