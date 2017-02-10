import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * Created by wangshikai on 17/1/9.
 */
public class TestRandom {
    public static void main(String[] args) {
        /*Random random = new Random();
        System.out.println(random.nextInt(2));

        for(int i=0;i<8;i++){
            System.out.println(i);
        }*/

        ConcurrentSkipListSet<String> serverList = new ConcurrentSkipListSet<>();
        serverList.add("123");
        serverList.add("456");
        serverList.add("789");
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        System.out.println(list.retainAll(serverList));
        System.out.println(list);
        System.out.println(serverList);
        System.out.println(serverList.retainAll(list));
        System.out.println(list);
        System.out.println(serverList);


    }
}
