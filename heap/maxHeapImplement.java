class MaxHeap{
    int[] arr;
    int size;
    MaxHeap(int cap){ // constructor
        arr = new int[cap];
        this.size = 0;
    }
    public void add(int val) throws Exception{
        if(size == arr.length) throw new Exception("Error : Heap is full");
        arr[size++] = val;
        upheapify(size-1);
    }
    public void upheapify(int child){
        if(child == 0) return; // base case :
        int parent = (child-1)/2;
        if(arr[child] > arr[parent]){
            swap(child,parent);
            upheapify(parent);
        }
    }
    public void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int size(){
        return size;
    }
    public int peek(){
        if(size == 0){
            System.out.print("Error : Heap is empty");
            return -1;
        }
        return arr[0];
    }
    public int remove(){
        if(size == 0){
            System.out.print("Error : Heap is empty");
            return -1;
        }
        int ak = arr[0];
        swap(0,size-1);
        size--;
        arr[size] = 0;
        downHeapify(0);
        return ak;
    }
    public void downHeapify(int parent){
        int lc = 2*parent+1;
        int rc = 2*parent+2;
        int maxIdx = parent;
        if(lc < size && arr[lc] > arr[maxIdx]) maxIdx = lc;
        if(rc < size && arr[rc] > arr[maxIdx]) maxIdx = rc;
        if(maxIdx == parent) return; // base case :
        swap(maxIdx,parent);
        downHeapify(maxIdx);
    }
}
public class maxHeapImplement {
    public static void main(String[] args) throws Exception{
        MaxHeap pq = new MaxHeap(5);
        pq.add(7);
        pq.add(5);
        pq.add(3);
        pq.add(10);
        pq.add(12);
        System.out.println(pq.remove());
        System.out.println(pq.size());
        System.out.println(pq.peek());
    }
}
