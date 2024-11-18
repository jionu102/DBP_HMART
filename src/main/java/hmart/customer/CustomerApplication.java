package hmart.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

}

//git remote -v : 연결된 깃허브 리포지토리 확인
//git remote remove origin : 현재 연결된 깃허브 리포지토리 삭제
//git init : 깃 설정
//git remote add origin <깃허브 리포지토리 주소.git>
//git add . : 현재 모든 파일을 origin리포지토리에 추가
//git commit -m "커밋 메시지" : 변경된 리포지토리를 확정
//git push -u origin master : 깃 리포지토리에 푸쉬