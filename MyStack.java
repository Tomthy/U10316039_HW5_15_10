/*名字:王懷謙
 *學號:U10316039
 *ex:15_10
 */

import java.util.ArrayList;

public class MyStack implements Cloneable{
	private ArrayList<Object> list = new ArrayList<Object>();

	//判斷陣列是否為空
	public boolean isEmpty(){
		return list.isEmpty();
	}
	//判斷陣列是否為空
	public int getSize(){
		return list.size();
	}
	//回磚堆疊最上方的值
	public Object peek(){
		return list.get(getSize()-1);
	}
	//取出並刪除
	public Object pop(){
		Object o = list.get(getSize()-1);
		list.remove(getSize()-1);
		return o;
	}
	
	public void push(Object o){
		list.add(o);
	}
	
	@Override
	public String toString(){
		return "stack: " + list.toString();
	}

	public Object clone(){
		try{
			//perform a ahallow copy
			MyStack MyStack1 = (MyStack)super.clone();
			//Deep copy on list
			MyStack1.list = (ArrayList<Object>)list.clone();
			return MyStack1;
		}
		catch(CloneNotSupportedException ex){
			return null;
		}
	}
}
