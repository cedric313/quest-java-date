import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Scanner; 

class TestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt();
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
        sc.close();
        
        // TODO : your code after this line
        Calendar c = Calendar.getInstance();
        
        

        SimpleDateFormat sdf = new SimpleDateFormat();
        c = new GregorianCalendar(year,month -1,day);
        Date d = c.getTime();
        System.out.println(sdf.format(d));
        


        
    }
}