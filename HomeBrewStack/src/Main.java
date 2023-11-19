public class Main {

        public static void main(String[] args)
        {
            HomebrewStack s = new HomebrewStack();
            s.push(1);
            s.push(2);
            assert s.pop() == 2;
            s.push(3);
            s.push(4);
            assert s.peek() == 4;
            s.pop();
            assert s.pop() == 3;
            assert s.isEmpty() == false;
            assert s.size() == 1;
            for(int i=0; i < 3; i++)
            {
                s.push(i);
            }
            assert s.size() == 4;
            s.clear();
            assert s.isEmpty();
            System.out.println("Works!");
        }
    }
