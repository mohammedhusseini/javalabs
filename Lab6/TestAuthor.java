/**
 * Write a description of class Lab3 here.
 * 
 * @  MOHAMMED HUSSEINI U14/FNS/CSC/064
 */
public class TestAuthor {
   public static void main(String[] args) {
      Author auth = new Author("Ndaliman Abdullahi Muhammed", "Phoenixkheeng@gmail.com", 'm');
      System.out.println(auth); 
      auth.setEmail("7sgeneral@yahoo.com");
      System.out.println(auth);
      System.out.println("name is: " + auth.getName());
      System.out.println("gender is: " + auth.getGender());
      System.out.println("email is: " + auth.getEmail());
   }
}