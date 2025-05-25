package br.com.felipeamorim.ShortMyUrl.Infrastructure.Repositories;

import br.com.felipeamorim.ShortMyUrl.Domain.Entities.Url;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UrlRepository extends MongoRepository<Url, UUID> {
    Url findByUrlOriginal(String urlOriginal);
}
