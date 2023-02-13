/**
 * basics
 */
public class basics {
     public static void main(String[] args) {
          int a = 10;
          String name = "Faizal";
          Boolean state = true;
          float weight = 74.5f;
          double height = 6.534d;
          int[] numbers = {12,23,45,66,21};
          int num[][] = {{100,101},{200,202}};

          System.out.println("a = "+a+"\nname = "+name+"\n state = "+state+"\n weight = "+weight);
          System.out.println("height = "+height+"\nnumbers = "+numbers.length+"\nnum = "+num.length);

          System.out.println("\nsum = "+sum(2,5)+"sum float = "+sum(12.5f,21.45f));

          Innerbasics class2 = new Innerbasics(5, "Faizal", 20);
          class2.printData();
          System.out.println("id = "+class2.id+"\nname = "+class2.name+"\nage = "+class2.age);
     }

     static int sum(int a, int b){
          return a+b;
     }
     static float sum(float a, float b){
          return a+b;
     }
     

}

/**
 * Innerbasics
 */
class Innerbasics {

     int id;
     String name;
     float age;

     Innerbasics(int id, String name, float age){
          this.id=id;
          this.name=name;
          this.age=age;
     }

     public void printData() {
          System.out.println("id : "+id+"name = "+name+"age = "+age);
     }
     
}