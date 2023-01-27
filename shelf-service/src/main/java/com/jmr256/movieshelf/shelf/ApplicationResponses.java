package com.jmr256.movieshelf.shelf;

public enum ApplicationResponses {
    STATUS_UP("We're Up!");

    private final String text;
    ApplicationResponses(final String text){
        this.text = text;
    }

    @Override
    public String toString(){
        return text;
    }
}
