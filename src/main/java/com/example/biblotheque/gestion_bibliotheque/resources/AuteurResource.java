import com.example.entities.Auteur;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class AuteurResource {
    private MongoCollection<Document> collection;

    public AuteurService() {
        MongoDatabase database = MongoDBUtil.getDatabase();
        this.collection = database.getCollection("auteurs");
    }

    public void createAuteur(Auteur auteur) {
        Document doc = new Document("nomauteur", auteur.getNomauteur())
                        .append("email", auteur.getEmail())
                        .append("numtel", auteur.getNumtel());
        collection.insertOne(doc);
    }

    // Ajouter les méthodes pour récupérer, mettre à jour et supprimer
}