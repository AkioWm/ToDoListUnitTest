import java.time.Duration;
import java.util.ArrayList;

public class ToDoListService {
    private ArrayList<Item> listItem;

    public ToDoListService(){
        listItem = new ArrayList<>();
    }

    public ArrayList<Item> getListItem() {
        return listItem;
    }

    public void setListItem(ArrayList<Item> listItem) {
        this.listItem = listItem;
    }
    public boolean nameAlreadyExist(Item item){
        for(Item i : listItem){
            if(item.getName().equals(i.getName()))
                return true;
        }
        return false;
    }
//    public boolean thirtyMinutesDelay( Item item){
//        if (listItem.isEmpty()){
//            return true;
//        }
//        Item lastItem = listItem.get(listItem.size()-1);
//
//        return Duration.between(item.getCreationDate(), lastItem.getCreationDate()).toMinutes() > 30;
//    }
    public Item canAddItem(Item item){
        if (item.isValid() && !nameAlreadyExist(item) && listItem.size() < 11)
            return item;
        return null;
    }

}
