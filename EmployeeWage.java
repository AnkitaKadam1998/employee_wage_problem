import java.util.Random;

class EmployeeWage
{
public static void main(String args[])
{
Random r=new Random();
int empcheck=r.nextInt(2);
int counter;
int Present_full_time=1;
int Present_part_time=2;
int emp_rate_per_hr=20;
int total_working_days=20;
int emphrs=8;
int salary=0;

for(counter=1; counter<=total_working_days; counter++)
{
        salary=(emphrs * emp_rate_per_hr);
}
System.out.println("Salary = "+ salary);
}
}




