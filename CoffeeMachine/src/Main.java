import java.util.Scanner;

class CoffeeMachine {
    public static void main(String[] args) {
        int water = 400;
        int milk = 540;
        int coffee = 120;
        int cups = 9;
        int money = 550;

        Scanner scanner = new Scanner(System.in);

        //machineStorage(water, milk, coffee, cups, money);

        System.out.println("Write action (buy, fill, take, remaining, exit:");
        String action = "";
        while (action != "exit") {
            System.out.println("Write action (buy, fill, take, remaining, exit:");
            action = scanner.nextLine();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    String optionBuy = scanner.nextLine();
                    switch (optionBuy) {
                        case "1":
                            if (water - 250 >= 0 && coffee - 16 >= 0) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 250;
                                coffee -= 16;
                                money += 4;
                                cups--;
                            } else if (water - 250 < 0) {
                                System.out.println("Sorry, not enough water!");
                            } else if (coffee - 16 < 0) {
                                System.out.println("Sorry, not enough coffee!");
                            }
                            //machineStorage(water, milk, coffee, cups, money);
                            break;
                        case "2":
                            if (water - 350 >= 0 && milk - 75 >= 0 && coffee - 20 >= 0) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 350;
                                milk -= 75;
                                coffee -= 20;
                                money += 7;
                                cups--;
                            } else if (water - 350 < 0) {
                                System.out.println("Sorry, not enough water!");
                            } else if (coffee - 26 < 0) {
                                System.out.println("Sorry, not enough coffee!");
                            } else if (milk - 75 < 0) {
                                System.out.println("Sorry, not enough milk!");
                            }
                            //machineStorage(water, milk, coffee, cups, money);
                            break;
                        case "3":
                            if (water - 200 >= 0 && milk - 100 >= 0 && coffee - 12 >= 0) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 200;
                                milk -= 100;
                                coffee -= 12;
                                money += 6;
                                cups--;
                            } else if (water - 200 < 0) {
                                System.out.println("Sorry, not enough water!");
                            } else if (coffee - 12 < 0) {
                                System.out.println("Sorry, not enough coffee!");
                            } else if (milk - 100 < 0) {
                                System.out.println("Sorry, not enough milk!");
                            }
                            //machineStorage(water, milk, coffee, cups, money);
                            break;
                        case "back":
                            break;
                        default:
                            System.out.println("Wrong option");
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee you want to add:");
                    coffee += scanner.nextInt();
                    System.out.println("Write how many disposable cups you want to add:");
                    cups += scanner.nextInt();
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;
                case "remaining":
                    machineStorage(water, milk, coffee, cups, money);
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("");
            }
        }
    }

    private static void machineStorage(int water, int milk, int coffee, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffee + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }
}