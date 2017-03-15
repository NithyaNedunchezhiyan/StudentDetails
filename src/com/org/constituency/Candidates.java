package com.org.constituency;

public class Candidates {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cand_id;
		result = prime * result + ((cand_name == null) ? 0 : cand_name.hashCode());
		result = prime * result + ((cand_party == null) ? 0 : cand_party.hashCode());
		result = prime * result + constituency_id;
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
		Candidates other = (Candidates) obj;
		if (cand_id != other.cand_id)
			return false;
		if (cand_name == null) {
			if (other.cand_name != null)
				return false;
		} else if (!cand_name.equals(other.cand_name))
			return false;
		if (cand_party == null) {
			if (other.cand_party != null)
				return false;
		} else if (!cand_party.equals(other.cand_party))
			return false;
		if (constituency_id != other.constituency_id)
			return false;
		return true;
	}
	int cand_id;
	String cand_name;
	int constituency_id;
	String cand_party;
	public Candidates(int cand_id, String cand_name, int constituency_id, String cand_party) {
		super();
		this.cand_id = cand_id;
		this.cand_name = cand_name;
		this.constituency_id = constituency_id;
		this.cand_party = cand_party;
	}


	public Candidates(int cand_id, String cand_name, String cand_party) {
		super();
		this.cand_id = cand_id;
		this.cand_name = cand_name;
		this.cand_party = cand_party;
	}


	public int getCand_id() {
		return cand_id;
	}
	public void setCand_id(int cand_id) {
		this.cand_id = cand_id;
	}
	public String getCand_name() {
		return cand_name;
	}
	public void setCand_name(String cand_name) {
		this.cand_name = cand_name;
	}
	public int getConstituency_id() {
		return constituency_id;
	}
	public void setConstituency_id(int constituency_id) {
		this.constituency_id = constituency_id;
	}
	public String getCand_party() {
		return cand_party;
	}
	public void setCand_party(String cand_party) {
		this.cand_party = cand_party;
	}
	@Override
	public String toString() {
		return "Candidates [cand_id=" + cand_id + ", cand_name=" + cand_name + ", constituency_id=" + constituency_id
				+ ", cand_party=" + cand_party + "]";
	}

}
