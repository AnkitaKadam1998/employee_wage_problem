import java.util.Random;

class EmployeeWage
{
public static void main(String args [])
{
Random r = new Random();
int empCheck = r.nextInt(2);
int is_full_time=1;
if (empCheck == is_full_time)
{
        System.out.println(" Employee is present");
}
else
{
        System.out.println(" Employee is absent");
}
}
}

