package guoyang_liu_exercise01;

public class CommissionEmployee {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Defined 5 variables for class CommissionEmployee
		int EmployeeID ;
		String FirstName;
		String LastName;
		double GrossSales;
		double CommissionRate =0.1/100;
	
	//Set get for employee ID, first name, last name.
		public int getEmployeeID() {
			return this.EmployeeID;
		}
		
		public String getFirstName() {
			return this.FirstName;
		}
		
		public String getLastName() {
			return this.LastName;
		}

	//Define get and set for gross sales and commission rate.
		public double getGrossSales() {
			return this.GrossSales;
		}
		
		public void setGrossSales(double GrossSales) {
			if(GrossSales > 0)
				this.GrossSales = GrossSales;
				else
					System.out.println("Total gross sales can not be equal or less than 0");
		}
		
		public double getCommissionRate() {
			return this.CommissionRate;
		}
		
		public void setCommissionRate(double CommissionRate) {
			if(CommissionRate >= 0.001 && CommissionRate <= 0.01)
				this.CommissionRate = CommissionRate;
				else
					System.out.println("Total commission rate per week can not be equal or less than 0");
		}
		
		//Defined two overloaded constructors
		
		public CommissionEmployee(int EmployeeID, String FirstName, String LastName,
				double GrossSales, double CommissionRate) 
		{
			//if (EmployeeID != null)
			this.EmployeeID = EmployeeID;			
			//else 
				//System.out.println("Employee ID is not provided");
			//if (FirstName != null )
					 this.FirstName = FirstName;
					 //else 
					 //System.out.println("Employee first name is not provided");
					 //if(LastName != null)	
			this.LastName = LastName;
			//else 
			//System.out.println("Employee last name is not provided");
			
			//if(GrossSales > 0)
			this.GrossSales = GrossSales;
			//else
			//System.out.println("Total gross sales can not be equal or less than 0");
			//if(CommissionRate > 0)
			this.CommissionRate = CommissionRate;
			//else
			//System.out.println("Total commission rate per week can not be equal or less than 0");
			
		}
		//End constructor.
		public CommissionEmployee(int EmployeeID, String FirstName, String LastName) 
		{
			this.EmployeeID = EmployeeID;
			 this.FirstName = FirstName;
			 this.LastName = LastName;
			
		}
		//End constructor.
		
		//Method which calculates employee’s commission.
		public double earnings(double CommissionRate, double GrossSales)
		{
			double earnings = CommissionRate*GrossSales/100;
			return earnings;
		}
		//End method
		
		//Method which display the object’s data
		@Override
		public String toString()
		{
			return String.format("Employee ID: %d%n First Name: %s%n Last Name: %s%n "
					+ "Gross Sale: %.2f%n Commission Rate: %.2f%n",this.getEmployeeID(), 
					this.getFirstName(), this.getLastName(), this.getGrossSales(), 
					this.getCommissionRate());
		}
		//End method
	//}

}//End class
