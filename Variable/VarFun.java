package Variable;

public class VarFun {
    public static void main(String[] args) {
        // playWithVariable();
        // playWithIntegers();  
        // playWithDoubles();
       //  playWithCharacters();
       //  playWithBooleans();
           printIntegerList();  
    }
    public static void playWithVariable() {
        // biến là một vùng ram được đặt tên chiếm một số byte nhất định tùy data type
        //dữ liệu/ thông tin mà nó sẽ chứa bên trong 
        int age = 30;
        String name = "Trinh Nam Phong";
        int yob = 2000;
        double salary = 1.5;
        boolean marriedStatus = false;
    }
    public static void playWithIntegers(){
        int n = 30;
        System.out.println("n: " + n);
        long m = 3_000_000_000L;
        System.out.println("m :" + m);
        int status = 0xFA;
        System.out.println("status: " + status);
        int phone = 010; // hệ 8 octal
        System.out.println("phone :" + phone);

    }
    public static void playWithDoubles() {
        double pi = 3.14;
        System.out.println("pi : " + pi);
        System.out.printf("pi : %.5f", pi);
        System.out.println(); // cách dòng khi sử dùng printf
        float vat = 0.1f;
        System.out.println("vat: " + vat);
    }
    public static void playWithCharacters() {
        //2 byte trong ram cho kiểu char, lưu bảng mã Unicode
        char c = '$';
        System.out.println("unit :" + c);
        // dùng mảng các ký tự char để lưu 
        //char name [] = "Trinh Nam Phong";
        //trong java String là một Object là một kiểu dữ liệu phức hợp

        String name = "Trinh Nam Phong ";
        System.out.println("my name is : " + name);
        System.out.println("letter of my name : " + name.charAt(4));
        System.out.println("my name in to upper case: " + name.toUpperCase());
    }
    public static void playWithBooleans() {
        //trạng thái đúng sai 
        boolean live = true;
        if (live == true) 
          System.out.println("Life is short");  
        else 
            System.out.println("sorry head to that");
        
    }

    public static void printIntegerList() {
       for (int i = 0; i <= 10; i++) {
           System.out.print("i: "+ i + ", ");
       } 
       System.out.println();
       int j = 0;
       int k = 0;
       while (j <= 8) {
           System.out.print("j: "+j + ", ");
           j++;
        }
        System.out.println();
        do {
            System.out.print("k: "+ k + ", ");
            k++;
       } while (k <= 5);
    }
}
