package org.sber.intership;

public class City {

    private String name;
    private String region;
    private String district;
    private int population;
    private String foundation;

    public City(String name, String region, String district, int population, String foundation) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    @Override
    public String toString(){
        return String.format("City{name='%s', region='%s', district='%s', population=%d, foundation='%s'}",
                name, region, district, population, foundation);
    }


}
