
public class TestMyStack{
	public static void main(String[] args){
		MyStack MyStack1 = new MyStack();
		
		MyStack1.push("0");
		MyStack1.push("00");
		MyStack1.push("000");

		MyStack MyStack2 = (MyStack)MyStack1.clone();

		MyStack2.push("1");
		MyStack2.push("11");
		MyStack2.push("111");

		System.out.println(MyStack1.getSize());
		System.out.println(MyStack2.getSize());
		
	}
}
