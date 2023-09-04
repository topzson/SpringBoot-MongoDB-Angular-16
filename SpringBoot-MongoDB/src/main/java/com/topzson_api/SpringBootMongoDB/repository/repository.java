package repository;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import model.model;

public interface repository extends MongoRepository<model, String> {
    List<model> findByTitleContaining(String title);
    List<model> findByPublished(boolean published);
}
