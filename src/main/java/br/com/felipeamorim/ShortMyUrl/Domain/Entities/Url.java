package br.com.felipeamorim.ShortMyUrl.Domain.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "url")
public class Url {

    @Id
    private UUID id;
    private String urlOriginal;
    private String urlNova;

    public Url() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUrlNova() {
        return urlNova;
    }

    public void setUrlNova(String urlNova) {
        this.urlNova = urlNova;
    }

    public String getUrlOriginal() {
        return urlOriginal;
    }

    public void setUrlOriginal(String urlOriginal) {
        this.urlOriginal = urlOriginal;
    }
}
