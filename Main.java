package tekrarEdenCiftSayilar;
import java.util.*;




public class Main {

	public static void main(String[] args) {
		int[] array= {1,2,3,2,2,2,4,6,7,8,9,7,8,4};
		int[] arrayCopy=new int[array.length];
		int count=0;
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(i!=j&&array[i]==array[j]) {
					if(!isFound(arrayCopy, array[i])) {
						arrayCopy[count++]=array[i];					
					}
					break;
				}
			}
		}
		for(int index:arrayCopy) {
			if(index!=0) {
				if(isEven(index))
				System.out.print(index+" ");
				
			}
		
		}
		
		
	}
	
	static boolean isEven(int number) {
		if(number%2==0) {
			return true;
		}
		return false;
		
	}
	static boolean isFound(int[] arrayCopy,int index) {
		for(int i:arrayCopy) {
			if(i==index)
				return true;
		}
		return false;
		
	}
	

}
