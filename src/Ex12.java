public class Ex12 {
        public static void main(String[] args) {
        int answer = 10/0;
        System.out.println(answer);
         try{
            Class.forName("java.lang.NotExistClass");
             System.out.println("");
        } catch (ClassNotFoundException e) {
            System.out.println("");
        }
    }
}

