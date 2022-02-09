//Write a java program to accept details of ‘n’ cricket player (pid, pname, totalRuns, 
// InningsPlayed, NotOuttimes). Calculate the average of all the players. Display the 
// details of player having maximum average. (Use Array of Object)

import java.io.*;

class Player {
    int Id;
    String name;
    int TotalRuns, TimesNotOut, InningsPlayed;
    float avg;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void getData() {
        try {
            System.out.println("Enter Id of player");
            Id = Integer.parseInt(br.readLine());
            System.out.println("Enter player name:");
            name = br.readLine();
            System.out.println("Enter Total Runs:");
            TotalRuns = Integer.parseInt(br.readLine());
            System.out.println("Enter times Not Out:");
            TimesNotOut = Integer.parseInt(br.readLine());
            System.out.println("Enter the Innings Played:");
            InningsPlayed = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void putdata() {
        System.out.println(
                Id + "\t" + name + "\t\t" + TotalRuns + "\t\t" + TimesNotOut + "\t\t" + InningsPlayed + "\t\t" + avg);
    }

    float getAvg() {
        avg = (TotalRuns / (InningsPlayed - TimesNotOut + 1));
        return avg;
    }
}

public class Slip7b {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) {

        try {
            System.out.println("Enter the Number of Players:");
            int n = Integer.parseInt(br.readLine());
            Player p[] = new Player[n];
            for (int i = 0; i < n; i++) {
                p[i] = new Player();
                p[i].getData();
            }
            System.out.println("Id" + "\t" + "Name" + "\t" + "TotalRuns" + "\t" + "TimesNotOut" + "\t" + "InningsPlayed"
                    + "\t" + "Average");
            for (int i = 0; i < n; i++) {
                p[i].getAvg();
                p[i].putdata();
            }
            sortPlayer(p);
            // getting data of maximum player
            System.out.println("Maximum of all is :");
            p[0].putdata();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void sortPlayer(Player p[]) {
        int n = p.length;
        // for comparing array of object
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (p[i].getAvg() < p[j].getAvg()) {
                    Player t = p[i];
                    p[i] = p[j];
                    p[j] = t;
                }
            }

        }
    }
}
