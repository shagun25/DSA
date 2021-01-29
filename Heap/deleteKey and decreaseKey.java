/*package whatever //do not write package name here */

import java.io.*;
class MinHeap{
    int capacity,size,arr[];
    MinHeap(int c){
        size=0;
        capacity = c;
        arr = new int[c];
    }
    int left(int i) { return (2*i + 1); } 
    int right(int i) { return (2*i + 2); } 
    int parent(int i) { return (i-1)/2; } 
    
    void insert(int x){
        if(size==capacity) return;
        size++;
        arr[size-1]=x;
        for(int i=size-1;i!=0 && arr[parent(i)]>arr[i];){
            swap(arr,parent(i),i);
            i=parent(i);
        }
    }
    void deleteKey(int i){
        decreaseKey(i,Integer.MIN_VALUE);
        extractMin();
    }
    void decreaseKey(int i,int x){
      arr[i]=x;
        while(i!=0 && arr[parent(i)]>arr[i]){
            swap(arr,parent(i),i);
            i=parent(i);
        }  
    }
    int extractMin(){
        if(size==0) return Integer.MAX_VALUE;
        if(size==1) {
            size--;
            return arr[0];
        } 
        swap(arr,0,size-1);
        size--;
        MinHeapify(0);
        return arr[size];
    }
    void MinHeapify(int i){
        int lt = left(i),rt = right(i),smallest =i;
        if(lt<size && arr[lt]<arr[i])
        smallest =i;
        if(rt<size && arr[rt]<arr[i])
        smallest =i;
        if(smallest!=i){
            swap(arr,i,smallest);
            MinHeapify(smallest);
        }
    }
    void swap(int arr[],int a,int b){
        int k = arr[a];
        arr[a] = arr[b];
        arr[b] = k;
    }
}
class GFG {
	public static void main (String[] args) {
        MinHeap h=new MinHeap(11);
        h.insert(3); 
        h.insert(2);
        h.deleteKey(0);
        h.insert(15);
        h.insert(20);
        System.out.println(h.extractMin());
        h.decreaseKey(2, 1);
        System.out.println(h.extractMin());
	}
}