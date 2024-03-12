package com.projects;

import java.util.Scanner;

public class BiryaniClient {
    static double totalPriceOfButterscotch;
    static double totalPriceChickenBiryani;
    static double totalPriceVegBiryani;
    static double totalPriceFishBiryani;
    static double totalPriceSprite;
    static double totalPriceThumsUp;
    static double totalPriceCoffee;
    static double totalPriceTea;

    Scanner scanner = new Scanner(System.in);

    void biryaniDetails() {
        while (true) {
            System.out.println("+++++++++++");
            System.out.println("        1)Chicken Biryani");
            System.out.println("        2)Veg Biryani");
            System.out.println("        3)Fish Biryani");
            System.out.println("        4)Back");
            System.out.println("++++++++++++++++++++");

            int choose = scanner.nextInt();
            BiryaniClient biryaniClient = new BiryaniClient();
            switch (choose) {
                case 1:
                    biryaniClient.chickenBiryani();
                    break;
                case 2:
                    biryaniClient.vegBiryani();
                    break;
                case 3:
                    biryaniClient.fishBiryani();
                    break;
                case 4:
                    biryaniClient.biryaniClient();
                    break;
                default:
                    System.out.print("Please choose between 1 to 3!! thanks!!");
            }
            System.out.print("+++++++++++");

        }


    }

    void chickenBiryani() {
        System.out.println("How many chicken biryani you want?");
        int howManyChickenBiryani = scanner.nextInt();
        double chickenBiryaniPrice = 100;
        totalPriceChickenBiryani = howManyChickenBiryani * chickenBiryaniPrice;

    }

    void vegBiryani() {
        System.out.println("How many veg biryani you want");
        int howManyVegBiryani = scanner.nextInt();
        double vegBiryaniPrice = 70;
        totalPriceVegBiryani = howManyVegBiryani * vegBiryaniPrice;
    }

    void fishBiryani() {
        System.out.println("How many fish biryani you want");
        int howManyVegBiryani = scanner.nextInt();
        double chickenBiryaniPrice = 170;
        totalPriceFishBiryani = howManyVegBiryani * chickenBiryaniPrice;

    }

    void drinksDetails() {
        while (true) {
            System.out.println("+++++++++++");
            System.out.println("        1)Soft drinks");
            System.out.println("        2)Hot drinks");
            System.out.println("        3)Back");
            System.out.println("++++++++++++++++++++");
            int choose = scanner.nextInt();
            BiryaniClient biryaniClient = new BiryaniClient();
            switch (choose) {
                case 1:
                    biryaniClient.softDrinks();
                    break;
                case 2:
                    biryaniClient.hotDrinks();
                    break;
                case 3:
                    biryaniClient.biryaniClient();
                    break;
                default:
                    System.out.print("Please choose between 1 to 3!! thanks!!");
            }
            System.out.print("+++++++++++");

        }
    }

    void hotDrinks() {
        while (true) {
            System.out.println("+++++++++++");
            System.out.println("        1)Tea");
            System.out.println("        2)Coffee");
            System.out.println("        3)Back");
            System.out.println("++++++++++++++++++++");
            int choose = scanner.nextInt();
            BiryaniClient biryaniClient = new BiryaniClient();
            switch (choose) {
                case 1:
                    biryaniClient.tea();
                    break;
                case 2:
                    biryaniClient.coffee();
                    break;
                case 3:
                    biryaniClient.drinksDetails();
                    break;
                default:
                    System.out.print("Please choose between 1 to 3!! thanks!!");
            }
            System.out.println("+++++++++++");

        }
    }

    void coffee() {
        System.out.println("How many coffee you want? ");
        int numberOfCoffee = scanner.nextInt();
        double priceOfCoffee = 25;
        totalPriceCoffee = numberOfCoffee * priceOfCoffee;
    }

    void tea() {
        System.out.println("How many tea you want? ");
        int numberOfTea = scanner.nextInt();
        double priceOfTea = 20;
        totalPriceTea = numberOfTea * priceOfTea;

    }

    void softDrinks() {
        while (true) {
            System.out.println("+++++++++++");
            System.out.println("        1)Sprite");
            System.out.println("        2)ThumsUp");
            System.out.println("        3)Back");
            System.out.println("++++++++++++++++++++");
            int choose = scanner.nextInt();
            BiryaniClient biryaniClient = new BiryaniClient();
            switch (choose) {
                case 1:
                    biryaniClient.sprite();
                    break;
                case 2:
                    biryaniClient.thumsUp();
                    break;
                case 3:
                    biryaniClient.drinksDetails();
                    break;
                default:
                    System.out.print("Please choose between 1 to 3!! thanks!!");
            }
            System.out.print("+++++++++++");

        }
    }

    void thumsUp() {
        System.out.println("How many ThumsUp you want?");
        int howManyThumsUp = scanner.nextInt();
        double thumsUpPrice = 100;
        totalPriceThumsUp = howManyThumsUp * thumsUpPrice;
    }

    void sprite() {
        System.out.println("How many chicken biryani you want?");
        int howManysprite = scanner.nextInt();
        double spritePrice = 100;
        totalPriceSprite = howManysprite * spritePrice;
    }

    void icecreamDetails() {
        while (true) {
            System.out.println("+++++++++++");
            System.out.println("        1)ButterScotch");
            System.out.println("        2)Back");
            System.out.println("++++++++++++++++++++");
            int choose = scanner.nextInt();
            BiryaniClient biryaniClient = new BiryaniClient();
            switch (choose) {
                case 1:
                    biryaniClient.butterScotch();
                    break;

                case 2:
                    biryaniClient.biryaniClient();
                    break;
                default:
                    System.out.print("Please choose between 1 to 2!! thanks!!");
            }
            System.out.print("+++++++++++");
        }
    }

    void butterScotch() {
        System.out.println("How many butterscotch you want?");
        int numberOfButterScotch = scanner.nextInt();
        double priceOfButterScotch = 50;
        double totalPriceOfButterscotch = numberOfButterScotch * priceOfButterScotch;

    }

    void bill() {

        double totalBill = totalPriceOfButterscotch + totalPriceChickenBiryani +
                totalPriceCoffee + totalPriceSprite + totalPriceTea + totalPriceThumsUp +
                totalPriceVegBiryani + totalPriceFishBiryani;
        System.out.println("Your total bill is : " + totalBill);
    }

    void exit() {

    }

    void biryaniClient() {
        while (true) {
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("                       1)Biryani");
            System.out.println("                       2)Drinks");
            System.out.println("                       3)IceCream");
            System.out.println("                       4)Bill");
            System.out.println("                       5)Exit");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("choose!! What do you want?");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            BiryaniClient biryaniClient = new BiryaniClient();
            switch (choice) {
                case 1:
                    biryaniClient.biryaniDetails();
                    break;
                case 2:
                    biryaniClient.drinksDetails();
                    break;
                case 3:
                    biryaniClient.icecreamDetails();
                    break;
                case 4:
                    biryaniClient.bill();
                    break;
                case 5:
                    biryaniClient.exit();
                    break;
                default:
                    System.out.println("Choose only 1 to 5 options!!");
            }
        }
    }

    public static void main(String[] args) {
        BiryaniClient biryaniClient = new BiryaniClient();
        biryaniClient.biryaniClient();
    }

}


