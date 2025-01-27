package test6.sub06;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	
	private String name;
	private String id;
	private String special;
	private List<Patient> patients;
	
	public Doctor(String name, String id, String special) {
		this.name = name;
		this.id = id;
		this.special = special;
		patients = new ArrayList<>();
	}
	
	public void addPatient(Patient patient) {
		patients.add(patient);
	}

	@Override
	public String toString() {
		String str = "의사: " + name + "(ID: " + id + "전문분야: " + special + ")"+ "\n"
				+ "담당 환자 목록: \n";
		for(int i=0; i<patients.size(); i++) {
			Patient patient = patients.get(i);
			str += "- " + patient.toString() + "\n";
		}
		return str;
	}
	
}
