package com.accp.springMVC_t2.pojo;

public class flightInfo {
	private Integer id;
	private String flightId;
	private String company;
	private String leaveAirport;
	private String arriveAirport;
	private String leaveTime;
	private String arriveTime;
	private String airplane;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getLeaveAirport() {
		return leaveAirport;
	}

	public void setLeaveAirport(String leaveAirport) {
		this.leaveAirport = leaveAirport;
	}

	public String getArriveAirport() {
		return arriveAirport;
	}

	public void setArriveAirport(String arriveAirport) {
		this.arriveAirport = arriveAirport;
	}

	public String getLeaveTime() {
		return leaveTime;
	}

	public void setLeaveTime(String leaveTime) {
		this.leaveTime = leaveTime;
	}

	public String getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}

	public String getAirplane() {
		return airplane;
	}

	public void setAirplane(String airplane) {
		this.airplane = airplane;
	}

	@Override
	public String toString() {
		return "flightInfo [id=" + id + ", flightId=" + flightId + ", company=" + company + ", leaveAirport="
				+ leaveAirport + ", arriveAirport=" + arriveAirport + ", leaveTime=" + leaveTime + ", arriveTime="
				+ arriveTime + ", airplane=" + airplane + "]";
	}

	public flightInfo(Integer id, String flightId, String company, String leaveAirport, String arriveAirport,
			String leaveTime, String arriveTime, String airplane) {
		super();
		this.id = id;
		this.flightId = flightId;
		this.company = company;
		this.leaveAirport = leaveAirport;
		this.arriveAirport = arriveAirport;
		this.leaveTime = leaveTime;
		this.arriveTime = arriveTime;
		this.airplane = airplane;
	}

	public flightInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
}
