public class HomebrewStack {

    int pointer;
    int [] data;

    final int STACK_SIZE = 10;


    public HomebrewStack() {
        pointer = -1;
        data = new int[STACK_SIZE];
    }

    public void push(int n) {
        pointer++;
        data[pointer] = n;

    }

    public int pop() {
        pointer--;
        return data[pointer+1];
    }

    public int peek() {
        return data[pointer];
    }

    public int size() {
        return pointer+1;

    }

    public boolean isEmpty() {
        return pointer == -1;

    }

    public void clear() {
        pointer = -1;
    }


}
