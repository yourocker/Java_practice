 public class Main {
     public static void main(String[] args) {
        Security security = Security.getInstance();

        security.signUp("zalupa@mail.ru", "12345");
        security.signUp("pupa@mail.ru", "11111");
        security.signUp("lupa@mail.ru", "54321");

         System.out.println(security.checkUser("pupa@mail.ru", "11111"));
         System.out.println(security.checkUser("lupa@mail.ru", "12345"));
     }
 }
