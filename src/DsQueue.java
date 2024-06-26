public class DsQueue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public DsQueue(int size){
        maxSize=size;
        queueArray=new int[maxSize];
        front=0;
        rear=-1;
        nItems=0;
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full. cannot enqueue" + value);
            return;
        }
        if(rear==maxSize-1){
            rear=-1;
        }
        queueArray[++rear]=value;
        nItems++;
    }

    public int dequeue(int value){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return -1;
        }
        int temp=queueArray[front++];
        if(front==maxSize){
            front=0;
        }
        nItems--;
        return temp;
    }

    public int peek(){
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queueArray[front];
    }

    public boolean isEmpty(){
        return (nItems==0);
    }
    public boolean isFull(){
        return(nItems==maxSize);
    }

    public int size(){
        return nItems;
    }


    public static void main(String[] args) {

    }
}
