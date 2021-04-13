import java.util.Random;

class EmployeeWage
{
public static void main(String args[])
{
Random r = new Random();
int empCheck = r.nextInt(2);
int emp_rate_per_hr=20;
int emphrs = 8;
int salary = 0;

if(empCheck == emp_rate_per_hr)
{
        System.out.println("emphrs * emp_rate_per_hr");
}
else
{
        System.out.println("salary = 0");
}
}
}


