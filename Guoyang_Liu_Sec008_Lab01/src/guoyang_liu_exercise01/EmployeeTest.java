package guoyang_liu_exercise01;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an object of CommissionEmployee class
		CommissionEmployee commissionEmployee1 = new CommissionEmployee (001, "Micheal", "Jordan",
		100000, 0.5);
		
		System.out.println(commissionEmployee1.toString());
		
		//Create an object of BasePlusCommissionEmployee class
		BasePlusCommissionEmployee basePlusCommissionEmployee1 = new BasePlusCommissionEmployee
				(002, "Kobe", "Bryant",400,100000, 0.5);
		
		System.out.println(basePlusCommissionEmployee1.toString());
		
		//Create an object of HourlyEmployee class
		HourlyEmployee hourlyEmployee1 = new HourlyEmployee (003, "Dyane", "Wade",
				50, 15);
		
		System.out.println(hourlyEmployee1.toString());
	}

}
