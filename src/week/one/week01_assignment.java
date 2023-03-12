package week.one;

public class week01_assignment {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
 // 1. Create a variable to hold the quantity of
    // available plane seats left on a flight
    int availablePlaneSeats = 349;

    // 2. Create a variable to hold the cost of groceries at checkout
    double costOfGroceries = 45.55;

    // 3. Create a variable to hold a person's middle initial
    char middleName = 'M';

    // 4. Create a variable to hold true if it's hot outside
    // and false if it's cold outside
    boolean itsHotOutside = true;
    boolean itsColdOutside = false;

    // 5. Create a variable to hold a customer's first name
    String firstName = "Sudeep";

    // 6. Create a variable to hold a street address
    String streetAddress = "911 spy boulevard apt 007 Boston, MA. ";

    // 7. Print all variables to the console
    System.out.println(
        "Available plane seats left on a flight: " + availablePlaneSeats);
    System.out.println("Cost of groceries at checkout: " + costOfGroceries);
    System.out.println("person's middle initial: " + middleName);
    System.out.println("if it's hot outside then it is " + itsHotOutside);
    System.out.println("if it's cold outside then it is " + itsColdOutside);
    System.out.println("Customer's first name " + firstName);
    System.out.println(" a street address " + streetAddress);

    // 8. A customer booked 2 plane seats,
    // remove 2 seats from the available seats variable

    int newAvailablePlaneSeats;
    newAvailablePlaneSeats = availablePlaneSeats - 2;
    System.out.println("New Available Plane Seats: " + newAvailablePlaneSeats);

    // 9. Impulse candy bar purchase, add 2.15 to the grocery total
    //
    double newCostOfGroceries;
    newCostOfGroceries = costOfGroceries + 2.15;
    System.out.println("New cost of groceries: " + newCostOfGroceries);

    // 10. The birth certificate was printed incorrectly,
    // change the middle initial to something else

    char newMiddleInitial = 'A';
    System.out.println("New Middle Initial Name: " + newMiddleInitial);


    // 11. The season has changed, update the hot outside
    // variable to be opposite of what it was
    itsHotOutside = !itsHotOutside;
    System.out.println(itsHotOutside);


    // 12. Create a new variable called full name using the customer's first
    // name,
    // the middle initial, and a last name of your choice
    String lastName = "Uprety";

    String customerFullName;
    customerFullName = (firstName + " " + newMiddleInitial + " " + lastName);
    System.out.println("Customer's full name is: " + customerFullName);

    // 13. Print a line to the console that introduces the customer and says
    // they live
    // at the address variable

    System.out.println("The full name of 'The' Customer is: " + customerFullName
        + " " + "and" + " " + "they live at: " + streetAddress);
  }

  }


