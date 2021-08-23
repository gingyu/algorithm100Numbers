package algorithm100No.algorithmNo001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 문제1
 * - 학생정보들을 저장하고, 학생이름으로 검색했을 때 학번을 출력하는 프로그램 작성.
 * 
 * - Student class 생성
 * - String name, no를 가짐 (이름과 학번)
 * 
 * - 학생들을 ArrayList에 저장한 이후,
 * - 계속 검색을 하겠느냐 y -> 반복
 * - 종료하고싶으면 n > 프로그램 종료
 * 
 * - 학생 이름이 있는 경우 그 학생의 학번을 출력
 * - 학생 이름이 없으면, 없는 학생이름이라고 출력
 */
public class AlgorithmNo1 {
	
	// 내가 작성한 프로그램
	public static void student_me() {
		// 학생수의 제약이 없으므로 ArrayList 사용
		// 만약 학생수가 정해져있다면 배열을 사용
		// 배열과 콜렉션의 리스트의 차이 중 하나는
		// 일반배열의 경우 선언과 동시에 길이가 정해져고 콜렉션의 리스트의 경우 길이를 동적으로 제어할수있다.
		List<String> sName = new ArrayList<String>();
		List<String> sNo = new ArrayList<String>();
		
		boolean againUseAdd = true;
		Scanner scan = new Scanner(System.in);
		
		// do while문은 한번은 반드시 실행하는 반복문으로
		// while()조건과 관계없이 첫 실행은 반드시 실행한다
		// 학생정보입력을 한번이상 입력해야하니 do while문을 사용했다
		do {
			System.out.println("이름을 입력하세요.");
			sName.add(scan.nextLine());
			System.out.println("학번을 입력하세요.");
			sNo.add(scan.nextLine());
			
			System.out.println("더 진행하시겠습니까 ? (Y/N)");
			againUseAdd = scan.nextLine().equalsIgnoreCase("Y"); 
		} while(againUseAdd);
		
		
		
		boolean againUseSearch = true;
		
		do {
			System.out.println("검색할 학생의 이름을 입력하세요.");
			String search = scan.nextLine();
			int idx = -1;
			
			for(int i = 0; i < sName.size(); i++) {
				if(search.equals(sName.get(i))) {
					idx = i;
				}
			}
			
			if(idx < 0) {
				System.out.println("학생이 없습니다. 계속 진행하시겠습니까? (Y/N)");
			} else {
				System.out.println(sNo.get(idx) + "계속 진행하시겠습니까? (Y/N)");
			}
			againUseSearch = scan.nextLine().equalsIgnoreCase("Y");
		} while(againUseSearch);
		
	}
	
	// Jins님이 작성한 프로그램
	public static void student_jins() {
		Student stu1 = new Student("손오공", "1234");
		Student stu2 = new Student("저팔계", "2345");
		Student stu3 = new Student("사오정", "3456");
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		
		for(Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("계속 검색을 하고싶으면 y, 종료하고 싶으면 n");
			String input = scan.next();
			
			if (input.equals("y")) {
				System.out.println("검색을 시작합니다.");
				String name = scan.next();
				boolean flag = false;
				
				for (Student stu : list) {
					if (stu.getName().equals(name)) {
						System.out.println("해당하는 학생의 학번은 : " + stu.getNo());
						
						// 한번이라도 검색된 학생이라면 true
						flag = true;
					}
				}
				
				if(!flag) {
					System.out.println("해당하는 학생이름이 없습니다.");
				}
			}
			else if (input.equals("n")) {
				break;
			}
			
		}
		
		System.out.println("프로그램이 종료되었습니다.");
	}
}
