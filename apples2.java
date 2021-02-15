public class Main {
    public static void main(String[] args) {
     int[] apples = { 29, 70, 85, 77, 55, 44, 33, 98, 90, 47, 22, 44, 55, 37, 65};
  
  String small = apples.map(apple, index) => ({jrk: index, size: apple}));
  .filter(a => a.size <= 50);
  
  String medium = apples.map((apple, index) => ({jrk: index, size: apple}));
  .filter((a) => a.size > 50 && a.size < 71);
  
  String big = apples.map((apple, index) => ({jrk: index, size: apple}));
  .filter((a) => a.size > 70);
   
  System.out.println({small, medium, big});
  
    }
  }