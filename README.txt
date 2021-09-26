# Java 
 This is every things I learnt about java and oop

 Java là 1 ngôn ngữ liên kết động phù hợp cho thiết kế đối tượng 
 Có tính bao gói và che dấu thông tin:
 - Không lộ các cấu trúc dữ liệu bên trong 
 - Các đối tượng mở ra cung cấp dịch vụ, giao diện
 - Độ phức tạp được ẩn bên trong các đối tượng:
    + tạo thuận tiện cho các "Client"
    + tính mô đun hóa cao
    + ít phát sinh lỗi 
This is for Subject.java
/*
    Cơ chế nạp chồng: 
    có thể định nghĩa các phương thức trùng tên nhưng phải khánh danh sách tham số
*/
/*
    có thể có nhiều phương thức khởi tạo 
    Nếu không định nghiã phương thức khởi tạo thì Java sẽ tự động cho ta 1 hàm khơi tạo rỗng 
*/
/* 
    mySubject là tham chiếu  
    Subject là đối được được tham chiếu được tạo bởi new Subject() được lưu trong bộ nhớ Heap
*/

/*
    Phạm vi truy cập : Public có thể truy cập bởi bất kì ai và ở đâu
                        Protected chỉ truy cập trong cùng phân lớp và các lớp con hoặc lớp trong cùng gói 
                        Private chỉ có thể truy cập trong lớp đó 
*/