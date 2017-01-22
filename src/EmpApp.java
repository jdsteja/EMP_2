import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EmpApp {
	
	public static void main(String args[]) throws NumberFormatException, IOException
	{
	int choice=0;
	List<Employee> e=new ArrayList<Employee>();
	do{
		System.out.println("1.List of Employees\n2.Add Employees\n3.Update Employee\n4.Delete Employee\n5.Quit from Menu\n");
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  choice=Integer.parseInt(br.readLine());
	
		  if(choice==1)
			  listEmp(e);
		  else if(choice==2)
			  e=addEmp(e);
		  else if(choice==3)
			  e=UpdateEmp(e);
		  else if(choice==4)
			  e=delEmp(e);
		  else if(choice!=5)
			  System.out.println("Invalid input\n");
	}while (choice!=5);
		System.out.println("Thanks.");
		  System.out.println("mental");

	}
	

	private static List<Employee> delEmp(List<Employee> e) throws NumberFormatException, IOException {
		listEmp(e);
		System.out.println("\nPlease enter the name of the Employee you would like to delete\n");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		
		for(Employee ee:e)
		{
			if(name.equals(ee.getEMPName()))
			{
				e.remove(ee);
				break;
			}
		}
		return e;
	}

	private static List<Employee> UpdateEmp(List<Employee> e) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		listEmp(e);
		System.out.println("Please Enter the name of the Employee you would like to edit\n");
		String name=br.readLine();
		Employee user=new Employee();
		int j=0;
		for(Employee ee:e)
		{
			if(name.equals(ee.getEMPName()))
			{
				j=1;
				user=ee;
				e.remove(ee);
				break;
			}
		}
		if(j==0)
		{
			System.out.println("Usesr not found");
			UpdateEmp(e);
		}
		System.out.println("1.EmpID\n2.Emp Name\n3.Emp Dept\n4.Emp Sal\nEmpWhat would you like to update?\nPlease enter the Corresponding number that you want to edit\n");
		int choice=Integer.parseInt(br.readLine());
		if(choice==1)
		{
			System.out.println("Enter the new EmpID\n");
			user.setEMPID(Integer.parseInt(br.readLine()));
		}
		else if(choice==2)
		{
			System.out.println("Enter the new Emp Name\n");
			user.setEMPName(br.readLine());
		}
		else if(choice==3)
		{
			System.out.println("Enter the new Emp Dept\n");
			user.setEMPDept(br.readLine());
		}
		else if(choice==4)
		{
			System.out.println("Enter the new Emp Sal\n");
			user.setEMPSalary((Double.parseDouble(br.readLine())));
		}
		
		e.add(user);
		return e;
	}

	private static List<Employee> addEmp(List<Employee> e) throws NumberFormatException, IOException {
		Employee em=new Employee();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter EmpID");
		em.setEMPID(Integer.parseInt(br.readLine()));
		System.out.println("Enter Emp Name");
		em.setEMPName(br.readLine());
		System.out.println("Enter Emp Dept");
		em.setEMPDept(br.readLine());
		System.out.println("Enter Emp Salary");
		em.setEMPSalary(Double.parseDouble(br.readLine()));
		e.add(em); 
		System.out.println("Employee added\n");
		return e;
	}

	private static void listEmp(List<Employee> e) {
		for(Employee ee:e)
		{
			System.out.println(ee.getEMPID()+"."+ee.getEMPName()+"\n");
		}
		
	}

	
}
