package edu.kh.jdbc.common;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Scanner;

public class CreateXMLFile {
	public static void main(String[] args) {
		
		// XML(eXtensible Markup Language) : 확장된 마크업 언어
		//											(기술 언어, 기술 형식)
		// -> 단순화된 데이터 기술 형식 
		
		// XML에 저장되는 데이터의 형식은 Map(Key : value) 형식이다.
		// -> Key, Value 모두 문자열(String) 형식
		// -> Map<String, String>
		
		// Properties (컬렉션)
		// - Map의 후손 클레스
		// - Key, Value 모두 문자열인 Map(map<String, String>)
		// -> MXL 파일을 읽고, 쓰는데 특화된 메서드 제공
		
		Scanner sc = new Scanner(System.in);
		
		//Propertise 객체 생성
		Properties prop = new Properties();
		// -> Key, Value가 모두 String 고정이라서 제네릭 선언 x
		
		System.out.print("생성할 파일 이름 : ");
		String fileName = sc.nextLine();
		
		// FileOutputStream 객체 생성
		try {
			FileOutputStream fos = new FileOutputStream( fileName + ".xml");
			
			//Properties 객체를 이용해서 XML 파일 만들기
			// storetoXML(바이트출력 스트림, 설명) : XML 파일 생성
			
			prop.storeToXML(fos, fileName+ ".xml file 입니디");
			System.out.println(fileName +" 파일이 생성되었습니다. ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
