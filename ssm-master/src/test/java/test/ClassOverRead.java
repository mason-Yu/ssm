package test;

public class ClassOverRead{

	public void override(String name, String sex){
		System.out.println(name +":-"+ sex);
		
	}
	
	public int override(String name, int sex){
		System.out.println(name +":"+ sex);
		return 5;
	}
	
	public void override(String name){
		System.out.println(name);
		
	}

	public void getName() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		
		ClassOverRead cor = new ClassOverRead();
		cor.override("123");
		cor.override("吴莹莹","13");
		cor.override("吴莹莹",13);
	}
		
}
