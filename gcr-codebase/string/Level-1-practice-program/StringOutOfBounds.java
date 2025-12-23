public class StringOutOfBounds{
	
	public static void StringIndex(){
		try{
			String sc = "Ansh";
			System.out.print(sc.charAt(4));
		} catch (StringIndexOutOfBoundsException e){
			System.out.print("StringIndexOutOfBoundsException" +e.getMessage());
		}
	}
	
	public static void main(String args[]){
		StringIndex();
	}
}