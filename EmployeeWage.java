import java.util.Random;
class EmployeeWage
{
public static void main(String args[])
{
Random r=new Random();
int empCheck=r.nextInt(3);
int present_full_time=1;
int present_part_time=2;
int emp_rate_per_hr=20;
int emphrs=8;

switch(empCheck)
{
        case 1:System.out.println("present_full_time");
        break;
        case 2:System.out.println("present_part_time");
        break;
        default:System.out.println("not prsent");
        break;
}
}
}





