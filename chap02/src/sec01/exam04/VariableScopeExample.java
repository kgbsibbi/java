package sec01.exam04;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 0xF;
		int v2 = 0;
		
		if(v1 > 10) {
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5; //v2를 사용할 수 없기 때문에 에러
	}
}
