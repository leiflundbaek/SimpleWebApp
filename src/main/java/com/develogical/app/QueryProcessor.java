package com.develogical.app;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("darwin")) {
            return "Charles Robert Darwin, FRS FRGS FLS FZS (12 February 1809 – 19 April 1882)"+
                    " was an English naturalist and geologist, best known for his contributions"+
                    " to the science of evolution.";
        }
        return "";
    }
}
