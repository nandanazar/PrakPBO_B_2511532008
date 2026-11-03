package shop.model;

public final class Address {
    private final String street;
    private final String city;
    private final String postalCode;

    public Address(String street, String city, String postalCode) {
        this.street = requireText(street, "Street");
        this.city = requireText(city, "City");
        this.postalCode = requireText(postalCode, "Postal code");
    }

    private static String requireText(String value, String label) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(label + " must not be blank");
        }
        return value;
    }

    public String getStreet() { 
        return street; 
    }
    public String getCity() { 
        return city; 

    }
    public String getPostalCode() { 
        return postalCode; 
    }
    public String toString() {
        return street + ", " + city + " " + postalCode;
    }
}