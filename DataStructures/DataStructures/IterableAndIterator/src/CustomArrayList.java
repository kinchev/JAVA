import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CustomArrayList<T> implements Iterable<T> {
    private List<T> myList=new ArrayList<>();


    public void add(T value){
        myList.add(value);
    }
    @Override
    public Iterator<T> iterator() {
        return new CustomIterator<T>(myList);
    }

    public class CustomIterator<E> implements Iterator<E>{

        int indexPosition=0;
        List<E> interList;

        CustomIterator(List<E> interList){
            this.interList=interList;
        }

        @Override
        public boolean hasNext() {
            if(interList.size()>=indexPosition+1){
                return true;

            }
            return  false;

//
    }

        @Override
        public E next() {
            E val=interList.get(indexPosition);
            indexPosition++;
            return val;
    }
}
}
