package polymorphism_2_3_1;

public class TVUser {

	public static void main(String[] args) {
/*
		SamsungTV tv = new SamsungTV(); 
		//강결합 상태, 수정이나 유지보수가 힘든 상태
		//개발자가 직접 프로그램 코드내에서 객체 생성
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
*/		
		//사용자의  요구로 인해서 SamsungTV에서 LgTV로 변경사항이 생김
			//객체 생성, 메소드이름 모두 변경
		LgTV tv = new LgTV();

		tv.turnOn();
		tv.turnOff();
		tv.soundUp();
		tv.soundDown();
		
		
	}

}
