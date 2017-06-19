package phone;

public class Intital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Byte[] ipBytes=new Byte[4];
		String str="202.202.1.41";
		String[] ipStrings=str.split("[.]");
		
		
		
		for(int i=0;i<4;i++){
			
			int m=Integer.parseInt(ipStrings[i]);
			System.out.println(m);
			byte b=(byte)(m&0xff);
		//	System.out.print(b+"\n");
			ipBytes[i]=b;
		//	System.out.print(ipBytes[i]);
		}
		

	
	

		
		 for(String temp:ipStrings){
			 
			 
     //	 System.out.print(temp+"\n");
			 
			 
		 }
	
		
		// System.out.print("ÎÒ°®Äã");
	}
	

}
