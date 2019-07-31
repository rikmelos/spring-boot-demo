package com.bancodebogota.demomitocde.service;

public interface ParsingService {
    /*
    Service to parse the json response and convert it to
    the diserede model class
     */
    Object parse(String url);
}
