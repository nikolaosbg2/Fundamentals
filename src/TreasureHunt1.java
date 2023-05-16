import java.util.Arrays;
import java.util.Scanner;
public class TreasureHunt1 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String[] treasureChest = scan.nextLine().split("\\|");

            String command = scan.nextLine();
            while (!command.equals("Yohoho!")) {
                String[] commandParts = command.split(" ");
                switch (commandParts[0]) {
                    case "Loot":
                        for (int i = 1; i < commandParts.length; i++) {
                            boolean alreadyContained = false;
                            for (String a : treasureChest
                            ) {
                                if (a.equals(commandParts[i])) {
                                    alreadyContained = true;
                                    break;
                                }
                            }
                            if (!alreadyContained) {
                                String newChest = commandParts[i].concat(" ")
                                        .concat(String.join(" ", treasureChest));
                                treasureChest = newChest.split(" ");
                            }
                        }
                        break;
                    case "Drop":
                        int position = Integer.parseInt(commandParts[1]);
                        String newChest = "";
                        if (position >= 0 && position <= treasureChest.length - 1) {
                            for (int i = 0; i < treasureChest.length; i++) {
                                if (i != position) {
                                    newChest = newChest.concat(treasureChest[i]).concat(" ");
                                }
                            }
                            newChest = newChest.concat(treasureChest[position]);
                            treasureChest = newChest.split(" ");
                        } else {
                            break;
                        }
                        break;
                    case "Steal":
                        int countOfStealingItem = Integer.parseInt(commandParts[1]);

                        if (countOfStealingItem >= 0 && countOfStealingItem <= treasureChest.length - 1) {
                            for (int i = treasureChest.length - countOfStealingItem; i < treasureChest.length; i++) {
                                if (i == treasureChest.length - 1) {
                                    System.out.printf("%s", treasureChest[i]);
                                } else {
                                    System.out.printf("%s, ", treasureChest[i]);
                                }
                            }
                            String[] tempChest = new String[treasureChest.length - countOfStealingItem];
                            for (int i = 0; i < tempChest.length; i++) {
                                tempChest[i] = treasureChest[i];
                            }
                            treasureChest = tempChest;
                        } else if (countOfStealingItem >= 0) {
                            for (int i = 0; i < treasureChest.length; i++) {
                                System.out.print(treasureChest[i]);
                                if (i != treasureChest.length - 1) {
                                    System.out.print(", ");
                                }
                            }
                            treasureChest = new String[0];
                        }
                        System.out.println();
                        break;
                }
                command = scan.nextLine();
            }
            String points = String.join("", treasureChest);
            double averagePoints = 1.00 * points.length() / treasureChest.length;
            if (averagePoints > 0) {
                System.out.printf("Average treasure gain: %.2f pirate credits.", averagePoints);
            } else {
                System.out.println("Failed treasure hunt.");
            }

    }
}
