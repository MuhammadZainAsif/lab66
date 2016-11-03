/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab66;

/**
 *
 * @author Zain Asif
 */
public class Lab66 {

    /**
     * @param args the command line arguments
     */
    
    char path[];
int i=0;
public static int min(int a, int b,int c) { 
	if(a<b&&a<c){
	return a;
	}
	if(b<a&&b<c){
	return b;
	}
	if(c<a&&c<b){
	return c;
	}
	if(a==b&&a<c){
	return a;
	}
	if(b==c&&b<a){
	return b;
	}
	else
		return a;
	}

public static int carAssembly(int a[][], int t[][], int e[], int x[]){
    int T1[] = new int[100];
    int T2[] = new int[100];
    int T3[] = new int[100];
    int i;
    T1[0] = e[0] + a[0][0]; 
    T2[0] = e[1] + a[1][0]; 
	T3[0] = e[2] + a[2][0];
 
    
    for (i = 1; i < 4; i++)
    {
        T1[i] = min(T1[i-1] + a[0][i], T2[i-1] + t[1][i] + a[0][i],T3[i-1] + t[2][i] + a[0][i]);
        T2[i] = min(T2[i-1] + a[1][i], T1[i-1] + t[0][i] + a[1][i],T3[i-1] + t[2][i] + a[0][i]);
		T3[i] = min(T3[i-1] + a[1][i], T1[i-1] + t[0][i] + a[1][i],T2[i-1] + t[1][i] + a[0][i]);
    }
 
    
    return min(T1[4-1] + x[0], T2[4-1] + x[1],T3[4-1] + x[2]);
}
    
    public static void main(String[] args) {
        // TODO code application logic here
    int a[][] = {{9, 5, 3, 2},{2, 2, 1, 4},{4,7,2,6}};
    int t[][] = {{0, 7, 4, 5},{0, 9, 2, 8},{7,5,0,2}};
    int e[] = {10, 12,9}, x[] = {18, 7,7};
  
    System.out.println(carAssembly(a, t, e, x));
    }
    
}
