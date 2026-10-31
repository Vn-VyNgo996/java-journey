## 2026-10-22 (Tuần 1, ngày 1)

- Hôm nay học: Cài đặt môi trường JDK 21, IntelliJ IDEA, tìm hiểu cơ chế biên dịch javac/JVM, cách quản lý thư viện bằng Maven và viết unit test với JUnit 5.
- Hôm nay làm được: Khởi tạo thành công dự án `library-app`, cấu hình file `pom.xml` chuẩn Java 21 và chạy vượt qua bài test mẫu `SanityTest` (`BUILD SUCCESS`).
- Kẹt ở đâu và cách gỡ: Gặp lỗi `release version 5 not supported` do Maven mặc định dùng bản cũ; đã khắc phục bằng cách bổ sung `maven-compiler-plugin` (phiên bản 3.11.0) với thẻ `<release>21</release>` trong `pom.xml` và chạy lệnh test qua Maven.
- Một điều mới hiểu : JDK giống như nhà xưởng cung cấp đầy đủ công cụ để dịch mã nguồn thành bytecode, còn JVM là máy phát giúp chạy bản nhạc bytecode đó trên bất kỳ hệ điều hành nào mà không cần viết lại code.
- Ngày mai: Bắt đầu tìm hiểu về cú pháp cơ bản của Java, các kiểu dữ liệu và cấu trúc điều khiển đặt trong thư mục `week1-basics/`.


## 2026-10-23 (Tuần 1, ngày 2)

- Hôm nay học : Kiểu dữ liệu nguyên thiểu, toán tử , phép so sánh, Cấu trúc điều kiện, Mảng 1 chiều và mảng 2 chiều , StringPool - StringBuilder - StringBuffer
- Hôm nay làm : Hiểu và làm được các bài tập nhỏ ở mỗi phân đoạn 
- Kẹt ở đâu và cách gỡ : Kẹt ở các phương thức bổ trợ có trong String và Array; đã khắc phục bằng cách tra cứu học các phương thức mới
- Một điều mới : data-bye giống tem dán cho mỗi hàng phù hợp với nó
- Ngày mai : degbug vd

## 2026-10-23 (Tuần 1, ngày 2)

- Hôm này làm : fix bug code với những bài tập nhỏ
- Kẹt ở đâu và cách gỡ : Kẹt ở chưa hiểu quá trình chạy của code; đã khắc phục bằng cách viết ra giấy input và output để test ví dụ
- Ngày mai : Bắt đầu học OOP

## 2026-10-28 (Tuần 1, ngày 7)

-- Hôm nay làm : Học Được OOP, Thiết ké CRC và viết các class Member, Book , Loan, interface Interfire, serviec
-- Kẹt ở đâu và cách gỡ : Kẹt ở những các class có các nghiệp vụ như vào ; khắc phục bằng cách tự đặt câu hỏi và đưa ví dụ minh họa
-- Ngày mai : Tiếp tục thiết kế library-app

## 2026-10-31 (Tuần 2, Ngày 1)

-- Hôm nay làm : Test lại các nghiệp vụ các case và fix lỗi 
-- Kẹt ở đâu và cách gỡ : Kẹt ở những các case chưa tìm được cách khắc phục : khắc phục học tập nhiều cái mới để tìm ra hướng đi phù hợp nhất 
-- Ngày mai : Luyện tập DSA và Học cái mới
