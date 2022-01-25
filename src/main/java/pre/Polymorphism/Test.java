package pre.Polymorphism;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/1/20 11:09 上午
 */
public class Test {
    private static void print(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        Iterator arrayIterator = new Array();
        print(arrayIterator);
        Iterator linkedListIterator = new LinkedList();
        print(linkedListIterator);
    }
}
