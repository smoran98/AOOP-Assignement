package ie.gmit.sw;

import lombok.Data;


public @Data class Request {
	String query;
	String jobnum;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jobnum == null) ? 0 : jobnum.hashCode());
		result = prime * result + ((query == null) ? 0 : query.hashCode());
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
		Request other = (Request) obj;
		if (jobnum == null) {
			if (other.jobnum != null)
				return false;
		} else if (!jobnum.equals(other.jobnum))
			return false;
		if (query == null) {
			if (other.query != null)
				return false;
		} else if (!query.equals(other.query))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Request [query=" + query + ", jobnum=" + jobnum + "]";
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getJobnum() {
		return jobnum;
	}

	public void setJobnum(String jobnum) {
		this.jobnum = jobnum;
	}

	public Request(String query, String jobnum) {
		super();
		this.query = query;
		this.jobnum = jobnum;
	}

	public void Request(String taskNumber, String taskNumber2) {
		// TODO Auto-generated constructor stub
	}
	
}
