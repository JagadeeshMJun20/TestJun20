package p1;

public class Test {
	void displayOutput(String str) {
		if(str.contains("itemId")) {
		str = str.substring(str.indexOf("itemId"));
		String temp ="";
		int index=0;
		while(index<str.length()){
			if(!((str.charAt(index))>48 && (str.charAt(index)<58))) 
				index++;
			else	{
				temp = temp+str.charAt(index);
				if((str.charAt(index)+1)>48 && (str.charAt(index)+1<58)) 
					index++;
				else
					break;
				
			}
	}
		System.out.println(temp);
		}
		else
			System.out.println("Item Id is not present");
	}
	public static void main(String[] agrs) {
		String str = "https://www.facebook.com/technocredits/itemId=123&empid=12345";
		new Test().displayOutput(str);
	}
}
