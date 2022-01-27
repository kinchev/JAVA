package Items;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items=new HashMap<String, Item>();

    public Registry(){
        loadItems();
    }

    public Item createItem(String type){
        Item item=null;
        return item;
    }



    private void loadItems(){
        Movie movie=new Movie();
        movie.setTitle("Shameless");
        movie.setRuntime("1 hour");
        movie.setPrice(0.00);
        items.put("Items.Movie",movie);

        Book book=new Book();
        book.setNumberOfPages(4354);
        book.setPrice(221.22);
        book.setTitle("Crypto");
        items.put("Items.Book",book);
    }
}
