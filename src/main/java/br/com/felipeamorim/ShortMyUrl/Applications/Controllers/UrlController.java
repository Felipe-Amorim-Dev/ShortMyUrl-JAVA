package br.com.felipeamorim.ShortMyUrl.Applications.Controllers;

import br.com.felipeamorim.ShortMyUrl.Domain.Dtos.UrlPostDto;
import br.com.felipeamorim.ShortMyUrl.Domain.Interfaces.UrlService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/url")
public class UrlController {

    @Autowired
    UrlService urlService;

    @PostMapping
    public String post(@RequestBody @Valid UrlPostDto dto) {
        return urlService.Encurtar(dto);
    }

    @DeleteMapping
    public String delete(@RequestBody @Valid UrlPostDto dto){
        return urlService.Excluir(dto);
    }
}
