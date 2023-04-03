package com.string;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
	
		  
		        String str = "India     Is My    Country";  
		        
		        //1st way  
		        String noSpaceStr = str.replaceAll(" ", ""); // using built in method  
		        System.out.println(noSpaceStr); 
		        
		        //2nd way  
//		        char[] strArray = str.toCharArray();  
//		        StringBuffer stringBuffer = new StringBuffer();  
//		        for (int i = 0; i < strArray.length; i++) {  
//		            if (strArray[i] != ' ')  {  
//		                stringBuffer.append(strArray[i]);  
//		            }  
//		        }  
//		        String noSpaceStr2 = stringBuffer.toString();  
//		        System.out.println(noSpaceStr2);  
//		        
		        
		        String str5="Sudhir";
		        String Str6="Satwekar";
		        StringBuilder str7=new StringBuilder(str5);
		       System.out.println(str7.append(Str6));
		       
		       
		       String str1 = "5"; 
		       System.out.println(str1);
		        System.out.println(Integer.parseInt(str1)); // Using Integer.parsrInt()  
		        
		        
		    }  
		}  