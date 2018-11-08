package party;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Party {

    public static void main(String[] args) {
        String his[] = {"Zack", "Arvid", "Wilhem", "Adam", "Anna", "Albert", "August", "Doris"};
        String hers[] = {"Stefan", "Sara", "Sune", "Hugo", "Lotta", "Adam", "Anna", "Albert", "Annton"};
        String zacks[] = {"Hugo", "Anna", "Albert", "Arvid"};

        ArrayList<String> hisFriends = new ArrayList<>(Arrays.asList(his));
        ArrayList<String> herFriends = new ArrayList<>(Arrays.asList(hers));
        ArrayList<String> zacksFriends = new ArrayList<>(Arrays.asList(zacks));

        HashSet<String> invitedToParty = new HashSet<>(hisFriends);
        
        invitedToParty.addAll(herFriends);

        if (invitedToParty.contains("Zack")) {
            invitedToParty.remove("Zack");
        }

        if (invitedToParty.containsAll(zacksFriends)) {
            invitedToParty.removeAll(zacksFriends);
        }

        if (invitedToParty.contains("Doris") && invitedToParty.contains("Wilhem")) {
            invitedToParty.remove("Wilhem");
        }

        if (invitedToParty.contains("Lotta")) {
            Iterator<String> iter = invitedToParty.iterator();
            while (iter.hasNext()) {
                String names = iter.next();
                if (names.startsWith("A")) {
                    iter.remove();
                }
           
                    }
            }
        
            System.out.println("List of Guest without shuffling!!!");
            for (String s : invitedToParty) {
                System.out.println(s);

            }

            System.out.println("List of guest after shuffling!!!");
            ArrayList<String> invitedToPartyList = new ArrayList<>(invitedToParty);
            Collections.shuffle(invitedToPartyList);
            for (String s : invitedToPartyList) {
                System.out.println(s);

            }

        }
    }
