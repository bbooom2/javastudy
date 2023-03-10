package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
	
	private List<Book> books;
	private Scanner sc;
	
	
	//생성자 
	public Library() {
		books = new ArrayList<Book>();
		sc = new Scanner(System.in);
	}
	
	private void addBook() {
	
		System.out.println("=== 책 추가하기 ===");
		
		System.out.print("isbn >>> ");
		String isbn = sc.next();
		System.out.print("title >>> ");
		String title = sc.next();
		System.out.print("author >>> ");
		String author = sc.next();
		
		Book book = new Book(isbn, title, author);
		books.add(book);
		
		System.out.println(title + "책이 추가 되었습니다.");
		
	}
	
	public void deleteBook() { //RuntimeException은 UnChecked - Exception이므로 throws RuntiomeException을 생략할 수 있다. 
		
		System.out.println("=== 책 삭제하기 ===");
		
			if(books.isEmpty()) { //books.size() == 0 사용해도 되긴 함 
				throw new RuntimeException("등록된 책이 없습니다.");
			}
			
			System.out.println("삭제할 isbn >>> ");
			String isbn = sc.next();
		

			if(isbn.isEmpty() == false) { //비어있지 않을 때 
				/* 1. 객체 기반 삭제(Book 객체 간 동등비교가 필요하기 때문에 equals 메소드를 오버라이드 해야 한다. 	*/
	
				for (Book book : books) {
					if(isbn.equals(book.getIsbn())) {
						books.remove(book);	 //equals 메소드가 내부에서 사용된다. 	
						System.out.println(book + " 책이 삭제되었습니다.");
						return;
						}
				}
				 
				 	/* 2. 인덱스 기반 삭제 
					for(int i = 0; i <books.size(); i++) {
				
					Book book = books.get(i); //저장된 책 한권 한권을 의미 
				
					if(isbn.equals(book.getIsbn())) { // String의 비교는 " = " 으로 할 수 없음. equals로 진행 
						Book deletedBook = books.remove(i); 
						// remove(i)는 삭제된 요소(Book)를 반환한다.
						// Book deletedBook = <- 이 부분 생략해도 무방. 
							System.out.println(deletedBook + "책이 삭제되었습니다."); // 생략해도 무방한 부분 지울 시 book으로만 기재 
							return;
					}
				} */
			}
			//비어 있을 때 : isbn을 입력하지 않았을 때 (빈 문자열일 때) 
			throw new RuntimeException(isbn + "isbn을 가진 책이 없습니다." );
			}
	
	private void findBook() { 
		
			System.out.println(" === 책 조회하기 === ");
		
			if(books.isEmpty()) {
				throw new RuntimeException("등록된 책이 없습니다.");
			}
			System.out.print("조회할 isbn >>> ");
			String isbn = sc.next();
			if(!isbn.isEmpty()) { //==false 대신할 수 있는 것은 !isbn.isEnmpty
				for( Book book : books ) {
					if(isbn.equals(book.getIsbn())) {
						System.out.println("조회 결과 : "  + book);
						return;
					}
				}
			}
			throw new RuntimeException(isbn + "isbn을 가진 책이 없습니다.");
		}
	
	
	private void printAllBooks()  { // throws RuntimeException는 생략 가능. 언체크드 
		
		System.out.println("=== 전체 조회하기 ===");
		
			if(books.isEmpty()) {
				throw new RuntimeException("등록된 책이 없습니다.");
			}
			for(Book book : books) { // 향상 for문은 인덱스 없이 사용 
				System.out.println(book);
			}
		}
	
	
	public void manage() {
		
		while(true) {
			
			try {
				
				System.out.print("1.추가 2.삭제 3.조회 4.전체 0.종료 >>> ");
				String choice = sc.next();
				
				switch(choice) {
				case "1":
					addBook();
					break;
				case "2":
					deleteBook();
					break;
				case "3":
					findBook();
					break;
				case "4":
					printAllBooks();
					break;
				case "0":
					System.out.println("도서관리 프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못된 입력입니다. 다시 시도하세요.");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				
				}
			}
		}		
	}
	
	

