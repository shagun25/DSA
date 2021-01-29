/*package whatever //do not write package name here */

import java.io.*;
class HeapSort{
    void sort(int arr[]){
        int n = arr.length; 
        buildHeap(arr);
        for(int i=n-1;i>=1;i--){
            swap(arr,i,0);
            heapify(arr,i,0);
        }
    }
    void buildHeap(int arr[]){
        int n = arr.length;
        for(int i=(n-2)/2;i>=0;i--)
        heapify(arr,n,i);
    }
    void swap(int arr[],int a,int b){
        
			int k = arr[a]; 
			arr[a] = arr[b]; 
			arr[b] = k; 
    }

    void heapify(int arr[],int n,int i){
        int lt=2*i+1,rt = 2*i+2,largest = i;
        if(lt<n && arr[lt]>arr[largest])  largest=lt;
        if(rt<n && arr[rt]>arr[largest])  largest=rt;
        if(largest!=i){
            swap(arr,i,largest);
            heapify(arr,n,largest);
        }
    }
}
class GFG {
    public static void printArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
	public static void main (String[] args) {
	    int arr[] = {12, 11, 13, 5, 6, 7}; 

		HeapSort hp = new HeapSort(); 
		hp.sort(arr); 

		System.out.print("Sorted array is ");
		printArray(arr);
	}
}