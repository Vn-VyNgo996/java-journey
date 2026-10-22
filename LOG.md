## 2026-10-22 (Tuần 1, ngày 1)

- Hôm nay học: Cài đặt môi trường JDK 21, IntelliJ IDEA, tìm hiểu cơ chế biên dịch javac/JVM, cách quản lý thư viện bằng Maven và viết unit test với JUnit 5.
- Hôm nay làm được: Khởi tạo thành công dự án `library-app`, cấu hình file `pom.xml` chuẩn Java 21 và chạy vượt qua bài test mẫu `SanityTest` (`BUILD SUCCESS`).
- Kẹt ở đâu và cách gỡ: Gặp lỗi `release version 5 not supported` do Maven mặc định dùng bản cũ; đã khắc phục bằng cách bổ sung `maven-compiler-plugin` (phiên bản 3.11.0) với thẻ `<release>21</release>` trong `pom.xml` và chạy lệnh test qua Maven.
- Một điều mới hiểu (giải thích bằng 2 câu, như nói với bạn cùng lớp): JDK giống như nhà xưởng cung cấp đầy đủ công cụ để dịch mã nguồn thành bytecode, còn JVM là máy phát giúp chạy bản nhạc bytecode đó trên bất kỳ hệ điều hành nào mà không cần viết lại code.
- Ngày mai: Bắt đầu tìm hiểu về cú pháp cơ bản của Java, các kiểu dữ liệu và cấu trúc điều khiển đặt trong thư mục `week1-basics/`.