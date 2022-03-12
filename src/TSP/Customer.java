package TSP;

public class Customer {
    int AccountID;
    int Street;
    int HouseNumber;
    int PostalCode;
    int City;

    public Customer(int accountID, int street, int houseNumber, int postalCode, int city) {
        AccountID = accountID;
        Street = street;
        HouseNumber = houseNumber;
        PostalCode = postalCode;
        City = city;
    }

    private Destination getCoOrdinates(){
        return new Destination(9,10);
    }
}
