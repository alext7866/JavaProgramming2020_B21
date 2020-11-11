package day28_MultiDimensionalArray;

import java.util.Arrays;

public class ArrayPractice {

    /*
    ScrumTeam
    Testers:  {"Dorin", "Adil", "Fatih", "Subhi"}
    Developers: {"Kastrinsi", "Mustafa", "Ruslan"}
    SM: {"Ayse"}
    PO: {"Omid"}
    BA: {"Agalar"}
     */

    public static void main(String[] args) {
        String[][] ScrumTeam = {
                {"Dorin", "Adil", "Fatih", "Subhi"},    //0
                {"Kastrinsi", "Mustafa", "Ruslan"},     // 1
                {"Ayse"},                               // 2
                {"Omid"},                               // 3
                {"Agalar"}                              // 4
        };
        System.out.println(Arrays.deepToString(ScrumTeam));

        for (int i = 0; i <= ScrumTeam.length - 1; i++) {  // i: index of 1D arrays

            System.out.println(Arrays.toString(ScrumTeam[i]));   // prints the each group in the scrum team

            for (int j = 0; j <= ScrumTeam[i].length - 1; j++) { // j: index of elements
                System.out.println(ScrumTeam[i][j]);
            }
        }

        System.out.println("=====================================");

        for (String[] eachgroup : ScrumTeam) {  // eachgroup: represents each 1D array i scrumTeam
            System.out.println(Arrays.toString(eachgroup));

            for( String eachName : eachgroup){
                System.out.println(eachName);
            }

        }
    }
}