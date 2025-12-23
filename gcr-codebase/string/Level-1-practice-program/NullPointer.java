public class NullPointer{
	
	public static void ExceptionHandling(){
		
		try {
			String str =  null;
			str.length();
		} catch (Exception e){
			System.out.print("NullPointerException handled" );
		}
	}
	
	public static void main(String[] args){
	
	  ExceptionHandling();
	  
	}
}