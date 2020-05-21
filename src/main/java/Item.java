import java.time.LocalDate;

public class Item {
    private String name;
    private String content;
    private LocalDate creationDate;

    public Item(String name, String content) {
        this.name = name;
        this.content = content;
        this.creationDate = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isValid(){
        return this.content.length() < 1000
                && this.creationDate != null; //Techniquement impossible mais ne sait-on jamais
    }
}
