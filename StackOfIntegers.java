public class StackOfIntegers
{
    int elements[] = null;
    int size = 0;

    public StackOfIntegers(){
        this.elements = new int [16];
    }

    public StackOfIntegers(int capacity){
        this.elements = new int [capacity];
    }

    public void push(int i){
        elements[size] = i;
        size++;
    }

    public void show(){
        for (int i: elements){
            System.out.print(i + " ");
        }
    }

    public int pop(){
        int valuePop = this.elements[size-1];
        size --;
        return valuePop;
    }

    public int peek(){
        int valuePeek = this.elements[size-1];
        return valuePeek;
    }

    public boolean empty(){
        if (getSize() == 0){
            return true;
        } else{
            return false;
        }
    }

    public int getSize() {
        return size;
    }
    
}