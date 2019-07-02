package practice;

public class String_practice {
	
	public void countcharsNumothers(String str) {
		int alpha=0,num=0,other=0; 
		///A to z (65 to 90) 
		//a to z (97 to 122)
		// 0 to 9 (48 to 57 )
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=48 && str.charAt(i)<=57) {
				num++; 
			}
			else if((str.charAt(i)>=65 && str.charAt(i)<=90) ||(str.charAt(i)>=97 && str.charAt(i)<=122) ) {
				alpha++;
			}
			else {
				other++;
			}
			
		}
		System.out.println("The Number of alphabets::"+alpha+"  the number of numbers:::"+num+" The number of special chracters:::"+other);
		
	}
	
	public void countVowelConsonant(String str) {
		int vowel =0,consonant=0 ; 
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
				vowel++;
			}
			else 
			{
				consonant++;
			}
		}
		System.out.println("The number of vowels is :::"+vowel+"   the number of consonants is :::"+consonant);
		
	}
	public boolean isStringAngrams(String str1,String str2) {
		int count =0 ;
		if(str1.length()!=str2.length()) {
			return false;
		}
		else {
			for(int i=0;i<str1.length();i++) {
				if(str2.indexOf(str1.charAt(i))==-1) {
					count=1 ;
					break;
				}
			}
		}
		if(count==1) {
			return false ;
		}
		else 
			return true ;
	}
	public String removingWhiteSpacesofString(String str) {
		return str.replace(" ", "");
	}
	public String convertUpperchartoLowerCharViseversa(String str) {
		StringBuffer sb= new StringBuffer(str);
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>=65&&ch<=90) {
			sb.setCharAt(i, Character.toLowerCase(ch));
			}
			else 
			{
				sb.setCharAt(i, Character.toUpperCase(ch));
			}
		}
		return sb.toString();
	}
public boolean stringpalidram(String str) {
	StringBuffer sb = new StringBuffer(str.length());
	for(int i =str.length()-1;i>=0;i--) {
		sb.append(str.charAt(i));
	}
	if(str.equals(sb.toString())) {
		return true ;
	}
	else 
		return false ;
}

public void swipetwoStringsWithoutUsingThirdvar(String str1,String str2) {
	str1 = str1+str2; 
	str2 = str1.substring(0,str1.length()-str2.length());
	str1=str1.substring(str2.length()); 
	System.out.println("The swape strings are ::::"+str1 +"   "+str2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_practice obj = new String_practice(); 
		obj.countcharsNumothers("Sriram%%%123%$");
		obj.countVowelConsonant("Abcdioua");
		System.out.println("The given strings are angrams :::"+obj.isStringAngrams("sriram","ramsri"));
		System.out.println("Removing white spaces between two strings :::"+obj.removingWhiteSpacesofString("Sriram  srihari  govindha  "));
		System.out.println("convertUpperchartoLowerCharViseversa :::"+obj.convertUpperchartoLowerCharViseversa("SriRam"));
	    System.out.println("The given string is palaidram :::"+obj.stringpalidram("ABCD"));
	    obj.swipetwoStringsWithoutUsingThirdvar("Sriram","Srihari");
	}

}
