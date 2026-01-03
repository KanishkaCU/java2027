package com.training.day8;

public class arra {

	public static void main(String[] args) {
		int n=6;
		
	//10101	
	//01010
	//10101
	//01010
	//10101	
//	for(int row=1;row<=n;row++,System.out.println()) {
//		
//			{
//				for(int col=1;col<=n;col++)
//				{
//					if((row+col)%2==0)
//			System.out.print(1);
//					else
//						System.out.print(0);
//				}
//			}
//		}	
//	}
//}
//	

		
//00001
//00012
//00123
//01234
//12345
			for(int row=0; row<n; row++) {
				
				System.out.println();
				for (int space=row; space<n-1; space++) {
					System.out.print("0");
					
				}
				for (int col=1;col<=row+1;col++) {
					System.out.print(col);
				}
				
			}

		}  

	}
	

	

