public class QueueDisplay {
    public static void main(String[] args) throws Exception {
        CustomQueue queue =new CustomQueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
