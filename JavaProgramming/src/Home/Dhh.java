package Home;

class GS{
	/*[설 명]
	 * 1. 초기 전역 변수를 private 형태로 선언해 외부에서 전역변수를 직접 접근 못하게합니다 (정보은닉)
	 * 2. set - 사용자가 메소드를 호출 시 데이터를 삽입해주는 역할을 담당합니다
	 * 3. get - 사용자가 메소드를 호출 시 삽입된 데이터 값을 return 반환해주는 역할을 담당합니다
	 * 4. this.전역변수 = 메소드 매개변수 의미로 전역변수에 메소드 매개변수 데이터를 삽입합니다
	 * 5. 참 고 - 일반적으로 어떤 전역변수를 사용할 지 명시 위해 get, set 뒤에 변수명을 정의해줍니다
	 */
	
	//초기 전역 변수 선언 
	private String name = "";
	
	//set 메소드 생성 (데이터 삽입)
	public void setName(String name) {
		this.name = name;
	}		
	
	//get 메소드 생성 (데이터 반환)
	public String getName() {
		return "이름 : "+name;
	}
}

public class Dhh {

	public static void main(String[] args) {
		//클래스 객체 생성 실시
		GS gs = new GS();
		
		//set 데이터 삽입 실시
		gs.setName("투케이");
		
		//get 데이터 확인 실시
		System.out.println(gs.getName());

	}//메인 종료

}//클래스 종료