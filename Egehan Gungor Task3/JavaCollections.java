import java.util.*;
class TestJavaCollection{

    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Gungor");
        list.add("Ege");
        list.add("Oguz");
        list.add("Jakop");
        Iterator itr=list.iterator();
        System.out.println("Example 1");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Example 2 ");
        LinkedList<String> al=new LinkedList<String>();
        al.add("Gungor");
        al.add("Ege");
        al.add("Oguz");
        al.add("Jakop");
        Iterator<String> itr1=al.iterator();
        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        System.out.println("Example 3");

        Vector<String> v=new Vector<String>();
        v.add("Aksen");
        v.add("Mert");
        v.add("Unlu");
        v.add("Jakop");
        Iterator<String> itr2=v.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println("Example4");

        Stack<String> stack = new Stack<String>();
        stack.push("Aksen");
        stack.push("Mert");
        stack.push("Unlu");
        stack.push("Jakop");
        stack.push("Damla");
        stack.pop();
        Iterator<String> itr3=stack.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }
        System.out.println("Example 5");

        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gungor");
        deque.add("Ege");
        deque.add("Olya");
        for (String str : deque) {
            System.out.println(str);
        }

    }
}
