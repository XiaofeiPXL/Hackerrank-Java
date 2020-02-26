    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<Integer>();
            Set<Integer> set = new HashSet<Integer>();
            int max = Integer.MIN_VALUE;
            int n = in.nextInt();
            int m = in.nextInt();

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                set.add(num);
                deque.add(num);

                if(deque.size()==m){
                    if(set.size()>max){
                       max = set.size();
                    }

                    int first = deque.remove();
                    if(!deque.contains(first)){
                         set.remove(first);
                    }
                }         
            }
            System.out.println(max);
        }
    }



