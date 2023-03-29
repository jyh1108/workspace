package edu.kh.jdbc.run;

import java.util.List;
import java.util.Scanner;

import edu.kh.jdbc.dao.SelectJobNameDAO;
import edu.kh.jdbc.dto.Employee2;

public class JDBCExample4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("직급명 입력 :");
		String gjobName = sc.nextLine();

		// DAO 생성 후 메서드 호출
		SelectJobNameDAO std = new SelectJobNameDAO();

		List<Employee2> empList2 = std.select(gjobName);
		if (empList2.isEmpty()) {
			System.out.println("입력된 직급명과 일치하는 사원이 없습니다.");
			return;
		}
		for (Employee2 emp : empList2) {
			System.out.printf("부서 : %s / 직급명: %s / 이름 : %s / 이메일 : %s \n",
					emp.getDept_Title(), emp.getJob_Name(),
					emp.getEmp_Name(), emp.getEmail());
		}
	}

}
