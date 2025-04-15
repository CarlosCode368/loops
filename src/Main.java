import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int sum = 0;
for (int i= 1; i<=10; i++){
    if (i%3==0){
            continue;
        }
        System.out.printf("adding %d to %d to get to %d.\n", i, sum, sum+1);
        sum +=i;

    }
        System.out.println("Sum* "+sum);

        int []prices= {11,33,22,66,333,44};
        int limit =50;
        for (int p :prices){
            if(p>=limit){
                break;

            }
            System.out.println(p);
        }
        Scanner in =new Scanner (System.in);
        System.out.println("Enter Full Name as either First Last, or First Middle last:");
        String fullName= in.nextLine();
        fullName=fullName.trim();
        String[]parts=fullName.split(" ");
        String first = "";
        String middle="";
        String last="";

        if (parts.length>0){
            first=parts[0];
        }
        if (parts.length==3){
            middle=parts[1];
        }
        if (parts.length>1) {
            last = parts[parts.length - 1]; //use last index whether there are two or three parts
        }
        System.out.println(first);

        if(!middle.isEmpty()){
            System.out.println(" "+middle);
        }
        if(!last.isEmpty()){
            System.out.println(" "+last);
        }
        System.out.println('\n');
    }

}