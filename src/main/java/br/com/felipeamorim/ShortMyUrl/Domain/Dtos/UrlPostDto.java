package br.com.felipeamorim.ShortMyUrl.Domain.Dtos;

import jakarta.validation.constraints.NotBlank;

public class UrlPostDto {

    @NotBlank(message = "Informe a URL para encurtar.")
    private String urlOriginal;

    public String getUrlOriginal() {
        return urlOriginal;
    }

    public void setUrlOriginal(String urlOriginal) {
        this.urlOriginal = urlOriginal;
    }
}
