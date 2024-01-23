package com.tns.assign1;

public class Customer {
	private String name;
    private String source;
    private String destination;
 // Constructor
    public Customer(String name, String source, String destination) {
        this.name = name;
        this.source = source;
        this.destination = destination;
    }
 // Getter methods
    public String getName() {
        return name;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }


}
