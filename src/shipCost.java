class main {

    public static void main(String[] args) {

        double shipCost = 7;
        double tax = shipCost * .02;
        double totalCost;

        if (shipCost>=100)
        {
            totalCost = shipCost;
        }
        else
        {
            totalCost = shipCost + tax;
        }
        System.out.println("Your total cost for this order is: " + totalCost);
    }
}