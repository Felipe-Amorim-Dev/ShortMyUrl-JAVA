package br.com.felipeamorim.ShortMyUrl.Domain.Services;

import br.com.felipeamorim.ShortMyUrl.Domain.Dtos.UrlPostDto;
import br.com.felipeamorim.ShortMyUrl.Domain.Entities.Url;
import br.com.felipeamorim.ShortMyUrl.Domain.Interfaces.UrlService;
import br.com.felipeamorim.ShortMyUrl.Infrastructure.Repositories.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;
import java.util.UUID;

@Service
public class UrlServiceImpl implements UrlService {

    @Autowired
    private UrlRepository urlRepository;

    @Override
    public String Encurtar(UrlPostDto dto) {
        String urlOriginal = dto.getUrlOriginal();

        String dominio;
        try {
            URI uri = new URI(urlOriginal);
            dominio = uri.getScheme() + "://" + uri.getHost();
            if (uri.getPort() != -1) {
                dominio += ":" + uri.getPort();
            }
        } catch (URISyntaxException e) {
            throw new RuntimeException("URL inválida: " + urlOriginal);
        }

        String uuid = UUID.randomUUID().toString().substring(0, 8);

        String urlEncurtada = dominio + "/" + uuid;

        Url url = new Url();
        url.setId(UUID.randomUUID());
        url.setUrlOriginal(urlOriginal);
        url.setUrlNova(urlEncurtada);
        urlRepository.save(url);

        return urlEncurtada;
    }

    @Override
    public String Excluir(UrlPostDto dto) {
        String urlOriginal = dto.getUrlOriginal();

        try{
            if(urlOriginal == null){
                throw new RuntimeException("URL não encontrada");
            }

            Url url = urlRepository.findByUrlOriginal(urlOriginal);

            urlRepository.delete(url);
        } catch (Exception e) {
            throw new RuntimeException("Erro" + e.getMessage());
        }

        return "";
    }
}
