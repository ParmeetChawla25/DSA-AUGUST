public class StackMain2 {
    public static void main(String[] args) throws StackException {
        DynamicStack stack2 =new DynamicStack(5);
        stack2.push(34);
        stack2.push(5);
        stack2.push(81);
        stack2.push(23);
        stack2.push(12);
        stack2.push(71);
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        //System.out.println(stack.pop());
    }
}
