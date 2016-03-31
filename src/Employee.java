import java.io.Serializable;

public class Employee implements Serializable{
	String EMPName, EMPDept;
	int EMPID;
	double EMPSalary;
	Employee()
	{
	
	}
	
	public String getEMPName() {
		return EMPName;
	}
	public void setEMPName(String eMPName) {
		EMPName = eMPName;
	}
	public String getEMPDept() {
		return EMPDept;
	}
	public void setEMPDept(String eMPDept) {
		EMPDept = eMPDept;
	}
	public int getEMPID() {
		return EMPID;
	}
	public void setEMPID(int eMPID) {
		EMPID = eMPID;
	}
	public double getEMPSalary() {
		return EMPSalary;
	}
	public void setEMPSalary(double eMPSalary) {
		EMPSalary = eMPSalary;
	}
	
}
