import java.util.Arrays;
import java.util.stream.IntStream;

public class Good_vs_Evil {
    public static String battle(String goodAmounts, String evilAmounts) {
        byte Hobbits = 1;
        byte Men = 2; //Men can be good and evil
        byte Elves = 3;
        byte Dwarves = 3;
        byte Eagles = 4;
        byte Wizards = 10;//Wizards can be good and evil
        byte Orcs = 1;
        byte Wargs = 2;
        byte Goblins = 2;
        byte UrukHai = 3;
        byte Trolls = 5;

        int goodPower = 0;
        int evilPower = 0;
        String[] goodTroops = goodAmounts.split(" ");
        String[] evilTroops = evilAmounts.split(" ");

        goodPower += Integer.parseInt(goodTroops[0]) * Hobbits;
        goodPower += Integer.parseInt(goodTroops[1]) * Men;
        goodPower += Integer.parseInt(goodTroops[2]) * Elves;
        goodPower += Integer.parseInt(goodTroops[3]) * Dwarves;
        goodPower += Integer.parseInt(goodTroops[4]) * Eagles;
        goodPower += Integer.parseInt(goodTroops[5]) * Wizards;

        evilPower += Integer.parseInt(evilTroops[0]) * Orcs;
        evilPower += Integer.parseInt(evilTroops[1]) * Men;
        evilPower += Integer.parseInt(evilTroops[2]) * Wargs;
        evilPower += Integer.parseInt(evilTroops[3]) * Goblins;
        evilPower += Integer.parseInt(evilTroops[4]) * UrukHai;
        evilPower += Integer.parseInt(evilTroops[5]) * Trolls;
        evilPower += Integer.parseInt(evilTroops[6]) * Wizards;

        String goodWins = "Battle Result: Good triumphs over Evil";
        String evilWins = "Battle Result: Evil eradicates all trace of Good";
        String tie = "Battle Result: No victor on this battle field";

        if (goodPower == evilPower)
            return tie;
        if (goodPower > evilPower)
            return goodWins;
        else
            return evilWins;
    }

    public static String battleCodeWars(String goodAmounts, String evilAmounts) {
        int[] goodWorth = new int[]{1, 2, 3, 3, 4, 10};
        int[] evilWorth = new int[]{1, 2, 2, 2, 3, 5, 10};
        int[] good = Arrays.stream(goodAmounts.split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
        int[] evil = Arrays.stream(evilAmounts.split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
        int goodSum = IntStream.rangeClosed(0,good.length-1).map(i->good[i]*goodWorth[i]).sum();
        int evilSum = IntStream.rangeClosed(0,evil.length-1).map(i->evil[i]*evilWorth[i]).sum();
        return goodSum > evilSum ?  "Battle Result: Good triumphs over Evil" :
                evilSum > goodSum ? "Battle Result: Evil eradicates all trace of Good" :
                        "Battle Result: No victor on this battle field";
    }

    public static void main(String[] args) {
        System.out.println(battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"));
    }
}
