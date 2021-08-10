package Funtion;
public class FuntionFun {
    public static void main(String[] args) {
    /** *Hàm là một quy trình xử lý một vấn đề , công việc nào đó 
     * trong cuộc sống như một máy say sinh tố đầu vào là hoa quả , cho vào 
     * cái máy,  đầu ra là sinh tố
     * có 4 kiểu hàm : 
     * 1.không ra - không vào : cần scanf lấy data và printf để in kết quả đã xử lý 
     * 2.không ra - có vào  : không cần scanf,  cần printf để thông báo
     * 3.có ra - không vào : cần scanf lấy dữ liệu xử lý, bắt buộc return giá trị trả về , không nên printf 
     * 4.có ra - có vào ;
     * là loại phổ biến nhất vì reuse :
     * bắt buộc return .
     *  */  
    //hàm có thể trùng tên nhưng phải khác datatype ;
    //overloading , overload ; 
    //phân biệt overide - kế thừa 
    printIntegerList(10); 
    // viết này hard code , cố định đầu vào , literal quá nhiều chỗ 
    //thực tế cần hỏi muốn in đến bao nhiêu
    //biến khai báo int n ; mà chưa sử dụng thì sẽ bị báo lỗi .
    printIntegerList();       
    }
    public static void printIntegerList(int n) {
        System.out.println("the list of " + n + " integer : ");
        for (int i = 0; i <= n; i++) {
            System.out.println(i + " ");
        }
    }
    public static void printIntegerList() {
        
        int j = 5 ;
        for (int i = 0; i <= j ; i++) {
            System.out.println("i : " + i + " ");
        }
    }
    // hàm return đầu ra :      
}
