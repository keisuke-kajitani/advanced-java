public class Ex14 {
        public static void method1() {
        try {
            Class.forName("java.lang.NonExistClass");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try{Class.forName("java.lang. java.lang.NotFoundClass");
           } catch (ClassNotFoundException e) {
             System.out.println("クラスが見つかりません: " + e.getMessage());
           }
        Exception args;
                try {
                    throw(args);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        method1();
        }
        }
    
