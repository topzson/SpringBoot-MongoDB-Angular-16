package model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "tutorials")
public class model {
    @Id
    private String id;

    private String title;
    private String description;
    private boolean published;

    public model(){

    }

    public model(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    public String getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public boolean isPublished(){
        return published;
    }

    public void setPublished(boolean isPublished){
        this.published = isPublished;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return "model [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }
}
