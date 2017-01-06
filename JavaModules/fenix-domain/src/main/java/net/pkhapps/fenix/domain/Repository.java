package net.pkhapps.fenix.domain;

import com.mongodb.MongoClient;
import org.bson.types.ObjectId;

import javax.inject.Inject;
import java.util.Optional;

/**
 * TODO Document me!
 */
public abstract class Repository<T extends AggregateRoot> {

    private final MongoClient mongoClient;

    @Inject
    public Repository(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    public Optional<T> findById(ObjectId id) {
        return Optional.empty();
    }

}
