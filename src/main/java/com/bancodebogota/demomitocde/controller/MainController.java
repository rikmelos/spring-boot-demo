package com.bancodebogota.demomitocde.controller;

import com.bancodebogota.demomitocde.domain.Country;
import com.bancodebogota.demomitocde.service.ParsingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
public class MainController {

    private static final String MAIN_PAGE = "main";
    private static final String JSON_COUNTRY_URL = "https://restcountries.eu/rest/v2/name/australia";

    @Autowired
    private ParsingService parsingService;

    @GetMapping
    public String main(final Model model){

        List<Country> countries = (List<Country>) parsingService.parse(JSON_COUNTRY_URL);
        model.addAttribute("country", countries.get(0));
        return MAIN_PAGE;
    }

    @GetMapping(value = "/paises")
    public List<Country> getInfoCountries(){
        List<Country> countries = (List<Country>) parsingService.parse(JSON_COUNTRY_URL);
        return countries;
    }
}
