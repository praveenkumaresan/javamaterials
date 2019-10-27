package com.kpk.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class JavaDemoCaseStudyOneApplication {

    public JavaDemoCaseStudyOneApplication() {
    }

    /*public static void main(String[] args) {
        SpringApplication.run(JavaDemoCaseStudyOneApplication.class, args);
        System.out.println("Demo for simple Java App");

        englishPremierClub();

        ArrayList<String> clublist = new ArrayList<String>();

        clublist.add(0, "Chelsea");
        clublist.add(1, "Aresnal");
        clublist.add(2, "Liverpool");
        clublist.add(3, "Manchester City");
        clublist.add(4, "Tottenham Hotspurs");
        clublist.add(5, "Manchester United");
        clublist.add(6, "Watford");
        clublist.add(7, "West Brom");
        clublist.add(8, "Southampton");
        clublist.add(9, "Stoke City");

        System.out.println("size of club list" + clublist.size());

        String input = null;
        String valuePlayer = getPlayerOfClubs(clublist, input);


        System.out.println("value player across club" + valuePlayer);

    }*/

    // display of english soccer
    static void englishPremierClub() {
        System.out.println("English Premier Soccer Clubs");
    }

    // display list of clubs
    static String getPlayerOfClubs(ArrayList clublist, String input) {

        System.out.println("English premier club starts...");

        for (int i = 0; i < clublist.size(); i++) {
            System.out.printf("Club by standing positions#%s ClubName-%s \n", i,
                    clublist.get(i).toString());
        }

        System.out.println("user inputs" + input);

//		     return (clublist.get(Integer.valueOf(input).toString()));
        return "Bruyne";
    }
}
