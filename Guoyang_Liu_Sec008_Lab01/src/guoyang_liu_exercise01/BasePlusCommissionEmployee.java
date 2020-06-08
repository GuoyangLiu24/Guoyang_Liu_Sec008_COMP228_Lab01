package guoyang_liu_exercise01;

public class BasePlusCommissionEmployee {
	//Define all variables
	int EmployeeID;
	String FirstName;
	String LastName;
	double BaseSalary = 200.00;
	double GrossSales;
	double CommissionRate = 0.1 / 100;
	
	//Set get for employee ID, first name, last name, base salary.
			public int getEmployeeID() {
				return this.EmployeeID;
			}
			
			public String getFirstName() {
				return this.FirstName;
			}
			
			public String getLastName() {
				return this.LastName;
			}
			
			public double getBaseSalary() {
				return this.BaseSalary;
			}
			
			//Define get and set for gross sales and commission rate.
			public double getGrossSales() {
				return this.GrossSales;
			}
			
			public void setGrossSales(double GrossSales) {
				if (GrossSales > 0)
				this.GrossSales = GrossSales;
				else
					System.out.println("GrossSales can not be equal or less than 0.");
			}
			
			public double getCommissionRate() {
				return this.CommissionRate;
			}
			
			public void setCommissionRate(double CommissionRate) {
				if (CommissionRate >= 0.001 && CommissionRate <= 0.01)
				this.CommissionRate = CommissionRate;
				else
					System.out.println("Commission rate should be between 0.1 and 1.0%.");
			}

			//Defined two overloaded constructors
			
			public BasePlusCommissionEmployee(int EmployeeID, String FirstName, 
					String LastName, double BaseSalary, double GrossSales,
					double CommissionRate) 
			{
				this.EmployeeID = EmployeeID;
				this.FirstName = FirstName;
				this.LastName = LastName;
				this.BaseSalary = BaseSalary;
				this.CommissionRate = CommissionRate;
				
			}
			//End constructor.
			public BasePlusCommissionEmployee(int EmployeeID, String FirstName, 
					String LastName, double BaseSalary) 
			{
				this.EmployeeID = EmployeeID;
				this.FirstName = FirstName;
				this.LastName = LastName;	
				this.BaseSalary = BaseSalary;
			}
			//End constructor.
			
			//Method which calculates employee’s commission.
			public double earnings(double TotalNumberOfHoursWorkedPerWeek, double HourlyRate)
			{
				double earnings = CommissionRate * GrossSales/100 + BaseSalary;
				return earnings;
			}
			//End method
			
			//Method which display the object’s data
			@Override
			public String toString()
			{
				return String.format("Employee ID: %d%n First Name: %s%n Last Name: %s%n "
						+ "Gross Sale: %.2f%n Commission Rate: %.2f%n",this.getEmployeeID(), 
						this.getFirstName(), this.getLastName(), this.getBaseSalary(), 
						this.getCommissionRate());
			}
			//End method

}
