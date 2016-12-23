package net.pkhapps.fenix.domain;

import org.bson.BsonDocument;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import java.io.Serializable;

/**
 * TODO Document me!
 */
public abstract class Entity implements Serializable, Bson {

    @Override
    public <TDocument> BsonDocument toBsonDocument(Class<TDocument> tDocumentClass, CodecRegistry codecRegistry) {
        return null;
    }

    /**
     * @return
     */
    public ObjectId getId() {
        return null;
    }
}
