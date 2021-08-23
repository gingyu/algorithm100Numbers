package algorithm100No.algorithmNo001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ����1
 * - �л��������� �����ϰ�, �л��̸����� �˻����� �� �й��� ����ϴ� ���α׷� �ۼ�.
 * 
 * - Student class ����
 * - String name, no�� ���� (�̸��� �й�)
 * 
 * - �л����� ArrayList�� ������ ����,
 * - ��� �˻��� �ϰڴ��� y -> �ݺ�
 * - �����ϰ������ n > ���α׷� ����
 * 
 * - �л� �̸��� �ִ� ��� �� �л��� �й��� ���
 * - �л� �̸��� ������, ���� �л��̸��̶�� ���
 */
public class AlgorithmNo1 {
	
	// ���� �ۼ��� ���α׷�
	public static void student_me() {
		// �л����� ������ �����Ƿ� ArrayList ���
		// ���� �л����� �������ִٸ� �迭�� ���
		// �迭�� �ݷ����� ����Ʈ�� ���� �� �ϳ���
		// �Ϲݹ迭�� ��� ����� ���ÿ� ���̰� �������� �ݷ����� ����Ʈ�� ��� ���̸� �������� �����Ҽ��ִ�.
		List<String> sName = new ArrayList<String>();
		List<String> sNo = new ArrayList<String>();
		
		boolean againUseAdd = true;
		Scanner scan = new Scanner(System.in);
		
		// do while���� �ѹ��� �ݵ�� �����ϴ� �ݺ�������
		// while()���ǰ� ������� ù ������ �ݵ�� �����Ѵ�
		// �л������Է��� �ѹ��̻� �Է��ؾ��ϴ� do while���� ����ߴ�
		do {
			System.out.println("�̸��� �Է��ϼ���.");
			sName.add(scan.nextLine());
			System.out.println("�й��� �Է��ϼ���.");
			sNo.add(scan.nextLine());
			
			System.out.println("�� �����Ͻðڽ��ϱ� ? (Y/N)");
			againUseAdd = scan.nextLine().equalsIgnoreCase("Y"); 
		} while(againUseAdd);
		
		
		
		boolean againUseSearch = true;
		
		do {
			System.out.println("�˻��� �л��� �̸��� �Է��ϼ���.");
			String search = scan.nextLine();
			int idx = -1;
			
			for(int i = 0; i < sName.size(); i++) {
				if(search.equals(sName.get(i))) {
					idx = i;
				}
			}
			
			if(idx < 0) {
				System.out.println("�л��� �����ϴ�. ��� �����Ͻðڽ��ϱ�? (Y/N)");
			} else {
				System.out.println(sNo.get(idx) + "��� �����Ͻðڽ��ϱ�? (Y/N)");
			}
			againUseSearch = scan.nextLine().equalsIgnoreCase("Y");
		} while(againUseSearch);
		
	}
	
	// Jins���� �ۼ��� ���α׷�
	public static void student_jins() {
		Student stu1 = new Student("�տ���", "1234");
		Student stu2 = new Student("���Ȱ�", "2345");
		Student stu3 = new Student("�����", "3456");
		
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
			System.out.println("��� �˻��� �ϰ������ y, �����ϰ� ������ n");
			String input = scan.next();
			
			if (input.equals("y")) {
				System.out.println("�˻��� �����մϴ�.");
				String name = scan.next();
				boolean flag = false;
				
				for (Student stu : list) {
					if (stu.getName().equals(name)) {
						System.out.println("�ش��ϴ� �л��� �й��� : " + stu.getNo());
						
						// �ѹ��̶� �˻��� �л��̶�� true
						flag = true;
					}
				}
				
				if(!flag) {
					System.out.println("�ش��ϴ� �л��̸��� �����ϴ�.");
				}
			}
			else if (input.equals("n")) {
				break;
			}
			
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
