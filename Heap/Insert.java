/*package whatever //do not write package name here */

import java.io.*;
MinHeap{
    int size,capacity,arr[];
    MinHeap(int c){
        capacity = c;
        size=0;
        arr = new int[c];
    }
    int left(int i){
        return (2*i+1);
    }
    int right(int i){
        return (2*i+2);
    }
    int parent(int i){
        return (i-1)/2;
    }
    void insert(int x){
        if(size==capacity) return;
        size++;
        arr[size-1]=x;
        for(int i=size-1;i!=0 && arr[parent]>arr[i]){
            swap(arr,i,parent);
            i=parent(i);
        }
    }
    void swap(int arr[],int i,int parent){
        int k = arr[i];
        arr[i] = arr[parent];
        arr[parent] = k;
    }
}
class GFG {
	public static void main (String[] args) {
	MinHeap h = new MinHeap(11);
	insert(2);
	insert(10);
        insert(5);
	insert(7);
	}
}