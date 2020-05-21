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
    public Item canAddItem(Item item){
        if (item.isValid() && !nameAlreadyExist(item) )
            return  item;
        return null;
    }

}
