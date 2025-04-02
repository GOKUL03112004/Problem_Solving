package CompanyAttendanceTracking;

import java.util.Arrays;

public class Attendance {
    int[] in = new int[31];
    int[] out = new int[31];
    String[] hourInDay=new String[31];
    int temp=0;
    int temp1=0;
    void attendanceIn(int hour){
        in[temp]=hour;
        temp++;
    }
    void attendanceOut(int hour){
        out[temp1]=hour;
        temp1++;
    }
    static int toMinutes(int n){
        return n*60;
    }
    static int toHours(int n){
        return n/60;
    }
    void workPerDay(){
        for (int i=0;i<in.length;i++){
            int total=0;
            if(in[i]==0){
                hourInDay[i]="null";
            }
            else {
                total = toMinutes((out[i] + 12)) - toMinutes(in[i]);
                if (toHours(total) == 8) {
                    hourInDay[i] = "complete";
                } else if (toHours(total) != 8 && toHours(total) > 0) {
                    hourInDay[i] = "incomplete";
                }
            }
        }
    }

    int setSalary() {
        int salary=0;
        for (String i : hourInDay) {
            switch (i.toLowerCase()) {
                case "complete":
                    salary += 2500;
                    break;
                case "incomplete":
                    salary += 1000;
                    break;
                default:
                    // Optional: handle unexpected status
                    break;
            }
        }
        return salary;
    }

    void displaySalary(){
        int days=0;
        int full=0;
        int half=0;
        for(int i=0;i<in.length;i++){
            if(in[i]!=0){
                days+=1;
            }
        }
        for(int i=0;i<hourInDay.length;i++){
            if(hourInDay[i]!=null) {
                if (hourInDay[i].equalsIgnoreCase("complete")) {
                    full += 1;
                } else if (hourInDay[i].equalsIgnoreCase("incomplete")) {
                    half += 1;
                }
            }
        }

        System.out.println("You have worked "+days+" days");
        System.out.println("Full: "+full);
        System.out.println("Half: "+half);
        System.out.println("Your salary: "+setSalary());
        System.out.println("Salary for Full: 2500");
        System.out.println("Salary for Half: 1000");

    }

}
