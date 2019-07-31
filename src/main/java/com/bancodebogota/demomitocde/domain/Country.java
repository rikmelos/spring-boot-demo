package com.bancodebogota.demomitocde.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties //anotation used to indicate that the properties that do not match the json response
                      // should be ingnored
public class Country {

    //https://restcountries.eu/rest/v2/name/australia
    //https://www.youtube.com/watch?v=nyAoFmj6neY
    private String name;
    private String capital;
    private long population;
    private List<Currency> currencies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }
}
