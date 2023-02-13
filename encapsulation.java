/**
 * encapsulation
 */

import java.util.Scanner;
import demopackage.*;

public class encapsulation {

     public static void main(String[] args) {
          Person obj = new Person();
          Scanner sc = new Scanner(System.in);

          // obj.name = "faizal"; Error
          obj.setName(sc.nextLine());
          System.out.println("Person Name is : " + obj.getName());

          demopackage.newfile nf = new newfile();
          demopackage.packagedemo pd = new packagedemo();
          nf.meth1();
          pd.meth1();
     }
}

class Person {

     private String name; // must decalre with private to achive encapsulation

     public String getName() {
          return name;
     }

     public void setName(String newName) {
          this.name = newName;
     }

}