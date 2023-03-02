package kh.service;
import kh.info.*;
import java.util.LinkedList;
import java.util.List;

public class KhService {

	private List<KhInfo>KhInfoList = new LinkedList<>();
	
	public KhService() {
		KhInfoList.add(new KhInfo("홍길동",5,3));
		KhInfoList.add(new KhInfo("평범한 좀비",1,0));
		KhInfoList.add(new KhInfo("조금 쌘 좀비",1,0));
		KhInfoList.add(new KhInfo("경비원 좀비",1,0));
	}
}
