public class matrix {
	public static void main(String args[]){  
    System.out.println("addition of two matrix");
    int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
	int b[][]={{1,1,1},{2,2,2},{3,3,3}};       
    int c[][]=new int[3][3];     
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]+b[i][j];    
		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();//new line    
		} 
		System.out.println("multiplication of two matrix");
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
			c[i][j]=0;      
			for(int k=0;k<3;k++)      
			{      
			c[i][j]+=a[i][k]*b[k][j];      
			}  
			System.out.print(c[i][j]+" ");  
			} 
			System.out.println();   
			}    
		}}  
