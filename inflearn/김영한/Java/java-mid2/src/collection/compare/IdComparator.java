package collection.compare;

import java.util.Comparator;

/**
 * 정렬 2 : Comparable, Comparator
 * MyUser에서의 compare 대신 커스텀 compare
 */
public class IdComparator implements Comparator<MyUser> {

    @Override
    public int compare(MyUser o1, MyUser o2) {
        return o1.getId().compareTo(o2.getId());
    }
}