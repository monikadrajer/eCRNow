package com.drajer.sof.model;

public class SystemLaunch {

	private String fhirServerURL;
	private String patientId;
	private String encounterId;
	
	public String getFhirServerURL() {
		return fhirServerURL;
	}
	public void setFhirServerURL(String fhirServerURL) {
		this.fhirServerURL = fhirServerURL;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getEncounterId() {
		return encounterId;
	}
	public void setEncounterId(String encounterId) {
		this.encounterId = encounterId;
	}
}
