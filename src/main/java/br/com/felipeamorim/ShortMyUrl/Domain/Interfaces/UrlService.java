package br.com.felipeamorim.ShortMyUrl.Domain.Interfaces;

import br.com.felipeamorim.ShortMyUrl.Domain.Dtos.UrlPostDto;

public interface UrlService {

    String Encurtar(UrlPostDto dro);

    String Excluir(UrlPostDto dto);
}
