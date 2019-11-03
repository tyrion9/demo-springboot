# Demo Spring Boot / JPA / H2DB / Rest API
Project demo Spring Boot / JPA / H2DB / Rest API chạy bằng IDE IntelliJ và hướng dẫn chạy từ A-Z

## Setup
- Download & giải nén demo project: https://github.com/tyrion9/demo-springboot/archive/master.zip
- Download và cài đặt Java JDK 11 (JDK 8 cũng được)
- Download IntelliJ Ultimate (30 days dùng thử) https://www.jetbrains.com/idea/download
- Cài đặt Postman để test API của ứng dụng: https://www.getpostman.com/downloads/
- Mở IntelliJ: File / Open, Chọn thư mục project vừa tải về.

Chờ vài phút để IntelliJ tải thư viện.

## Chạy ứng dụng
Project chạy bằng DB trên memory, nên không cần cài đặt và setup database. Tuy nhiên mỗi lần chạy lại sẽ reset toàn bộ dữ liệu.

Để chạy, tìm class `vn.vietants.demo.DemoApplication`, chọn chuột phải, `"Run DemoApplication"`. Thấy dòng log ở console là thành công:

```
Started DemoApplication in 2.562 seconds (JVM running for 3.443)
```

## Test ứng dụng
Mở Postman để test Restful API, add request theo hình dưới.
- Add Customer: tạo request POST đến localhost:8080/api/customer. Thay đổi giá trị để insert vài bản ghi
```
{
	"customerName": "Jack Ma",
	"address": "China",
	"age": 55
}
```
![Add Customer](https://user-images.githubusercontent.com/30858651/68088814-5586f180-fe95-11e9-93f3-4257e9f22ea4.PNG)

- Find All Customer: tạo request GET đến localhost:8080/api/customer, SEND REQUEST để nhận kết quả trả về
![Find All Customer](https://user-images.githubusercontent.com/30858651/68088820-59b30f00-fe95-11e9-86b1-fa71378d5409.PNG)

## Check H2 DB
Để truy cập vào H2DB trên memory:
- Vào đường link: http://localhost:8080/h2-console
- JDBC URL: jdbc:h2:mem:testdb
- Test Connection, như hình, ok thì click Connect

![Check H2DB](https://user-images.githubusercontent.com/30858651/68088909-5d936100-fe96-11e9-9cda-bc3ea941a433.PNG)

- Xem cấu trúc bảng, chạy thử SQL, check data...
![Check SQL](https://user-images.githubusercontent.com/30858651/68088956-bc58da80-fe96-11e9-91b6-52e2020e9519.PNG)
