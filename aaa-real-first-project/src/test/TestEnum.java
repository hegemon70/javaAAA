package test;

public class TestEnum {
enum Animals{
	
	DOG("woof"),CAT("meow"),FISH("burble");
	String sound;
	Animals(String s){sound=s;}
}
	static Animals a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a.DOG.sound+" "+a.FISH.sound);
		
		if(4<1){
			System.out.println();
			
		}
		
		while(true){
			System.out.println("mierda");
			
		}
	}

}
