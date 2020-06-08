package guoyang_liu_exercise01;

public class HourlyEmployee {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variable
		int EmployeeID;
		String FirstName;
		String LastName;
		double TotalNumberOfHoursWorkedPerWeek;
		double HourlyRate;
		
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
				public double getTotalNumberOfHoursWorkedPerWeek() {
					return this.TotalNumberOfHoursWorkedPerWeek;
				}//End getter.
				
				public void setTotalNumberOfHoursWorkedPerWeek(double TotalNumberOfHoursWorkedPerWeek) {
					if(TotalNumberOfHoursWorkedPerWeek > 0)
					this.TotalNumberOfHoursWorkedPerWeek = TotalNumberOfHoursWorkedPerWeek;
					else
						System.out.println("Total number of hours worked per week can not be equal or less than 0");
				}//End setter.
				
				public double getHourlyRate() {
					return this.HourlyRate;
				}//End getter.
				
				public void setHourlyRate(double HourlyRate) {
					if(HourlyRate >= 14)
					this.HourlyRate = HourlyRate;
					else
						System.out.println("Hourly rate can not beess than 14");
				}//End setter.
				
				//Defined two overloaded constructors
				
				public HourlyEmployee(int EmployeeID, String FirstName, String LastName,
						double TotalNumberOfHoursWorkedPerWeek, double HourlyRate) 
				{
					this.EmployeeID = EmployeeID;
					this.FirstName = FirstName;
					this.LastName = LastName;
					this.TotalNumberOfHoursWorkedPerWeek = TotalNumberOfHoursWorkedPerWeek;
					this.HourlyRate = HourlyRate;
					
				}
				//End constructor.
				public HourlyEmployee(int EmployeeID, String FirstName, String LastName) 
				{
					this.EmployeeID = EmployeeID;
					this.FirstName = FirstName;
					this.LastName = LastName;				
				}
				//End constructor.
				
				//Method which calculates employee’s commission.
				public double earnings(double TotalNumberOfHoursWorkedPerWeek, double HourlyRate)
				{
					double earnings = TotalNumberOfHoursWorkedPerWeek * HourlyRate;
					return earnings;
				}
				//End method
				
				//Method which display the object’s data
				@Override
				public String toString()
				{
					return String.format("Employee ID: %d%n First Name: %s%n Last Name: %s%n "
							+ "Gross Sale: %.2f%n Commission Rate: %.2f%n",this.getEmployeeID(), 
							this.getFirstName(), this.getLastName(), this.getTotalNumberOfHoursWorkedPerWeek(), 
							this.getHourlyRate());
				}
				//End method
	//}

}
