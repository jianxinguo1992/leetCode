package Stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JIANXIN.GUO
 * @date 2019-05-17 14:53
 **/
public class XStack<E> {

    private List<E> list ;

    private int count;

    public XStack() {
        this.list = new ArrayList();
        count = -1;
    }


    public E push(E obj){
        list.add(obj);
        count ++;
        return obj;
    }


    public E pop(){
        if (count == -1){
            return null;
        }

        E e = list.get(count);
        count --;
        return e;
    }
}
