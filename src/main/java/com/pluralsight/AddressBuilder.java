package com.pluralsight;
import java.util.*;
public class AddressBuilder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String output = assembleAddressInfo(s);
        System.out.println(output);
    }

    public static String assembleAddressInfo(Scanner s) {
        System.out.println("Please provide the following information: ");
        StringBuilder addressContainer = new StringBuilder();

        //Get name
        var fullName = getInputFromConsole("Full name: ", s, false);
        addressContainer.append(fullName + "\n" + "\n");

        //Get billing info
        var billingStreet = getInputFromConsole("Billing street: ", s, true);
        var billingCity = getInputFromConsole("Billing city: ", s, true);
        var billingState = getInputFromConsole("Billing state: ", s, true);
        var billingZip = getInputFromConsole("Billing ZIP code: ", s, true);
        addressContainer.append("Billing Address: " + "\n")
                        .append(billingStreet + "\n")
                        .append(billingCity + ", " + billingState + " " + billingZip)
                        .append("\n" + "\n");

        //Get shipping info
        var shippingStreet = getInputFromConsole("Shipping street: ", s, true);
        var shippingCity = getInputFromConsole("Shipping city: ", s, true);
        var shippingState = getInputFromConsole("Shipping state: ", s, true);
        var shippingZip = getInputFromConsole("Shipping ZIP code: ", s, true);
        addressContainer.append("Shipping Address: " + "\n")
                .append(shippingStreet + "\n")
                .append(shippingCity + ", " + shippingState + " " + shippingZip);

        //Return StringBuilder as a string
        return addressContainer.toString();
    }

    public static String getInputFromConsole(String display, Scanner s, boolean clearBuffer) {
        if (clearBuffer) s.skip("\n");
        System.out.println(display);
        return s.nextLine().trim();
    }
}
