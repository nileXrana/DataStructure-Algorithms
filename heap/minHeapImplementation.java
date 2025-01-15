class MinHeap{
    int[] arr;
    int size;
    MinHeap(int cap){ // constructor
        arr = new int[cap];
        size = 0;
    }
    public void add(int val) throws Exception{
        if(size == arr.length) throw new Exception("Heap is full");
        arr[size++] = val;
        upheapify(size-1);
    }
    public void upheapify(int idx){
        if(idx == 0) return;
        int parent = (idx-1)/2;
        if(arr[idx]<arr[parent]){
            swap(idx,parent);
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
            System.out.print("Error : heap is empty");
            return -1;
        }
        return arr[0];
    }
    public int remove() throws Exception{
        if(size == 0) throw new Exception("heap is empty");
        int peek = arr[0];
        swap(0,size-1);
        size--;
        downHeapify(0);
        return peek;
    }
    public void downHeapify(int idx){
        int lc = 2*idx + 1; int rc = 2*idx + 2;
        int minidx = idx; // sabse kam value kiski hai
        if(lc < size && arr[lc] < arr[minidx]) minidx = lc;
        if(rc < size && arr[rc] < arr[minidx]) minidx = rc;
        if(minidx == idx) return; // base case : 
        swap(idx,minidx);
        downHeapify(minidx);
    }
}
public class minHeapImplementation {
    public static void main(String[] args) throws Exception{
        MinHeap pq = new MinHeap(4);
        pq.add(1);
        pq.add(6);
        pq.add(2);
        pq.add(0);
        System.out.println(pq.size());
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
    }
}
