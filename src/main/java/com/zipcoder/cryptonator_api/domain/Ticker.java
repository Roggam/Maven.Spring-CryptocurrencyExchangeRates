package com.zipcoder.cryptonator_api.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Ticker {

    private String base;
    private String target;
    private Double price;
    private Double volume;
    private Double change;

    private String markets;

    public Ticker() {
    }

    public Ticker(String base, String target, Double price, Double volume, Double change, String markets) {
        this.base = base;
        this.target = target;
        this.price = price;
        this.volume = volume;
        this.change = change;
        this.markets = markets;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        this.change = change;
    }

    public String getMarkets() {
        return markets;
    }

    public void setMarkets(String markets) {
        this.markets = markets;
    }

        @Override
    public String toString() {
        return "{" + "\n"+
                "base: '" + base + '\'' +",\n"+
                "target: '" + target + '\'' +",\n"+
                "price: " + price +",\n"+
                "volume: " + volume +",\n"+
                "change: " + change +",\n"+
                "markets=" + markets + ",\n"+
                 '}';
    }


}
