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

    THIS IS IMPORTANCE
-code static data constants in static memory
-temporary data in stack memmory
-dynamic data in heap memmory

    Các tham chiếu (references)
lưu địa chỉ đối tượng trong bộ nhớ máy tính 
đối tượng được thao tác qua tham chiếu :
    - con trỏ đến đối tượng
    - điều khiển trực tiếp các thuộc tính và phương thức
    - không có các toán tử con trỏ
    - phép gán = không sao chép nội dung đối tượng mà nó sao chép nội dung tham chiếu
so sánh nội dung đối tượng, phươn thức equals (có thể ghi đè)
Đối với java lập trình viên không cần thu hồi bộ nhớ, JVM cài đặt cơ chế "Gảbage collection" để thu hồi
tự động các đối tượng khi không cần thiết --> tăng tốc độ phát triển và tính ổn định của ứng dụng 

    Tham chiếu "this"
- Tham chiếu this con trỏ đến chính đối tượng đó
- Công dụng của this
    - tham chiếu tường minh đến thuộc tính và phươpng thức của đối tượng    
    - truyền tham số và trả lại giá trị 
    - dùng để gọi phương thức khỏi tạo

    Phương thức và thuộc tính tĩnh - static
- độc lập với đối tượng 
- có thể truy cập không qua đối tượng (sử dụng tên lớp để gọi)
- đối với thuộc tính tĩnh thì thuộc về lớp được chia sẻ giữa các đối tượng của lớp
--> những biến và thuộc tính tĩnh thì không thể gọi trong phương thức non-static và thành phần thông thường

    Gói các lớp đối tượng package
các lớp đối tượng được chia thành các gói default
các lớp trong cùng 1 tệp mã nguồn luôn thuộc cùng 1 gói
mức truy cập package là mặc định (nếu không khai báo tường minh thì chọn public or private)
các đối tượng của các lớp thuộc cùng gói có thể truy cập 
đến thành phần non-private của nhau
chỉ có thể tạo (new) đối tượng của lớp được khai báo là public của gói kháckhác
muốn sử dụng package cần nhớ thứ tự biên dịch

    Hợp thành (composition)
-các đối tượng có thể chứa các đối tượng khác ở dạng thuộc tính 
-các thuộc tính kiểu tham chiếu này phải được 
khởi tạo sử dụng toán tử new hoặc phép gán 

    Luồng dữ liệu chuẩn 
- 3 đối tượng luồng được tạo tự động khi thực thi chương trình 
    - System.out luòng ra 
    - System.err luồng ra nhưng thường sử dụng để xuất lỗi 
    - System.in luồng vào 

    Kế thừa trong java
 quan hệ is a (polymorphism tính đa hình) từ khóa: extends
    - mức truy cập protected 
    => Bảo mật mã nguồn, Nâng cao khả năng sử dụng lại 
    - gọi hàm của lớp cơ sở là super()
    - khi thực hiện phương thức khởi tạo ở lớp dẫn xuất thì constr lớp cơ sở được gọi trước.
    - cơ chế overriding thực hiện theo bottom-up.
        +Phương thức được định nghĩa lại có
         phạm vi truy cập không chặt hơn
         phạm vị truy cập của lớp cơ sở
        +Kiểu giá trị trả lại như nhau trong
         phương thức được định nghĩa lại
 quan hệ has a( composition )
 kiểm soát truy cập, che dấu thông tin 
 Phương thức khởi tạo - constructor
 Phương thức ghi đè – overriding
 Thiết kế quan hệ kế thừa
 Từ khóa final 
    Hắng số, gán giá trị 1 lần ko được thay đổi
    không cho định nghĩa lại ở lớp dẫn xuất
    Tham số truyền vào không gán thay đổi giá trị
    Không có lớp con



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
    Phạm vi truy cập :  Public có thể truy cập bởi bất kì ai và ở đâu
                        Protected chỉ truy cập trong cùng phân lớp và các lớp con hoặc lớp trong cùng gói 
                        Private chỉ có thể truy cập trong lớp đó 
*/