package party;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Uppgift
//Invite all her and his freinds to a party the list shouldnt contain dubletts /
// Zack is not invited remove him /
//Zacks freind is not invited either, remove them /
//if both Doris and Wilhem are invited remove Wilhem /
//if Lotta is invited remove all guests whos name starts with an A /
//create a random placement list
public class Party {

    public static void main(String[] args) {
        String[] his = {"Zack", "Arvid", "Wilhem", "Anna", "Adam", "Albert", "August", "Doris"};
        String[] hers = {"Stefan", "Sara", "Sune", "Hugo", "Lotta", "Anna", "Adam", "Albert", "Annton"};

        String[] Zacks = {"Hugo", "Albert", "Arvid", "Anna"};

        Set<String> GuestList = new HashSet<>();

        List<String> HisFriends = Arrays.asList(his);
        GuestList.addAll(HisFriends);
        //        ArrayList<String> hisFreinds = new ArrayList<>(Arrays.asList(his));

        List<String> HerFriends = Arrays.asList(hers);
        GuestList.addAll(HerFriends);
        //        ArrayList<String> herFreinds = new ArrayList<>(Arrays.asList(hers));

        List<String> ZacksFriends = Arrays.asList(Zacks);
        GuestList.remove("zack");
        GuestList.removeAll(ZacksFriends);
        //        ArrayList<String> zacksFreinds = new ArrayList<>(Arrays.asList(Zacks));

        if (GuestList.contains("Doris") && GuestList.contains("Wilhem")) {
            GuestList.remove("Wilhem");
        }

        if (GuestList.contains("Lotta")) {
            GuestList.removeIf(name -> name.startsWith("A") || name.startsWith("a"));
        }

        ArrayList<String> Guests = new ArrayList<>();
        Guests.addAll(GuestList);
        //ArrayList<String>Guests=new ArrayList(GuestList);
        Collections.shuffle(Guests);

        Guests.forEach((name) -> {
            System.out.println(name);
            
        });
        System.out.println("");
        for (String name : GuestList) {
            System.out.println(name);
            
            GuestList.removeIf(e -> e.toLowerCase().contains("a")&& e.length()>7);
        }
    }
}
