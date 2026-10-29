## Book 

-- Biết: isbn, title, author, year, total, remaning
-- Làm: hasAvailableCopy(), takeCopy(), (trừ 1 khi có ng mượn sách), returnCopy(), (cộng 1 khi có ng trả sách), 
-- Quy Tắc: số bản còn lại luôn từ 0 đến tổng số bản 
-- Nhờ ai : No One

## Member (abstract) + StudentMember, VipMember
-- Biết: id, name, SĐT
-- Làm: maxBooks()(Số lượng mỗi lần mượn), lateFeePerDay(), calculateLateFee()(Số ngày trễ)
-- Mỗi loai bạn đọc tự quy định maxBook() và lateFeePerDay()
-- Nhờ ai : No One

-- Quy Tắc : Kiểm tra thông tin đầu vào bắt và ném lỗi Exception
-- Id <Tự tạo quy tắc ID> , name < Không được Null >,

## Loan
-- Biết: idMember, name, ngày mượn
-- Làm: dueDate(ngày mượn + 14 ngày), lateDays(ngày trả)
-- Nhờ ai: No one

## Notifier (interface) + ConsoleNotifer
làm : send(to, message); ConsoleNotifer in ra màn hình

## LibraryService
-- Biết : Danh sách Book, Bạn đọc, phiếu mượn đang còn hiệu lực, một Notifer
-- Nhờ: Book, Member, Loan, Notifer

## Main
-- Làm: Tạo các thành phần, nạp dữ liệu, gọi service, không chứa quy tắc nghiệp vụ