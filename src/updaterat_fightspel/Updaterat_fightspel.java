/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package updaterat_fightspel;

import java.util.Random;
import java.util.Scanner;

/**
 * klass: t21E
 * @author carl.hummerhielm
 */
public class Updaterat_fightspel {

    /**
     * @param args the command line arguments
     */
    static int spelare_attack_lätt(int attack_val) {
        
        switch(attack_val) {
        //Svag attack
        case 1:
            System.out.println("\n\nDu träffade din attack!");
            return RandomNummer(1,30);
        //Mellan attack
        case 2:
            if(ProcentChans(20)) {
                System.out.println("\n\nDu träffade din attack!");
                return RandomNummer(30,50);
            }
            break;
        //Hård attack
        case 3:
            if(ProcentChans(50)) {
                System.out.println("\n\nDu träffade din attack!");
                return RandomNummer(50,70);

            }
            break;
        //Knockout
        case 4:
            if(ProcentChans(75)) {
                System.out.println("\n\nDu träffade din attack!");
                return 100;
            }
        }
        if(attack_val>4) {
            System.out.println("\nFel svar!\nDitt svar måste vara mellan 1-4, annars gör du ingen skada.");
        }
        System.out.println("\n\nDu missade din attack!");
        return 0;
    }
   
    static int spelare_attack_medium(int attack_val) {

        switch(attack_val) {
        //Svag attack
        case 1:
            System.out.println("\n\nDu träffade din attack!");
            return RandomNummer(1,30);
        //Mellan attack
        case 2:
            if(ProcentChans(40)) {
                System.out.println("\n\nDu träffade din attack!");
                return RandomNummer(30,50);
            }
            break;
        //Hård attack
        case 3:
            if(ProcentChans(70)) {
                System.out.println("\n\nDu träffade din attack!");
                return RandomNummer(50,70);

            }
            break;
        //Knockout
        case 4:
            if(ProcentChans(85)) {
                System.out.println("\n\nDu träffade din attack!");
                return 100;
            }

        }
        if(attack_val>4) {
            System.out.println("\nFel svar!\nDitt svar måste vara mellan 1-4, annars gör du ingen skada.");
        }
        System.out.println("\n\nDu missade din attack!");
        return 0;
    }
    static int spelare_attack_svår(int attack_val) {

        switch(attack_val) {
        //Svag attack
        case 1:
            if(ProcentChans(20)) {
                System.out.println("\n\nDu träffade din attack!");
                return RandomNummer(1,30);
            }
        //Mellan attack
        case 2:
            if(ProcentChans(60)) {
                System.out.println("\n\nDu träffade din attack!");
                return RandomNummer(30,50);
            }
            break;
        //Hård attack
        case 3:
            if(ProcentChans(80)) {
                System.out.println("\n\nDu träffade din attack!");
                return RandomNummer(50,70);

            }

            break;
        //Knockout
        case 4:
            if(ProcentChans(95)) {
                System.out.println("\n\nDu träffade din attack!");
                return 100;
            }
            break;


        }
        if(attack_val>4) {
            System.out.println("\nFel svar!\nDitt svar måste vara mellan 1-4, annars gör du ingen skada.");
        }
        System.out.println("\n\nDu missade din attack!");
        return 0;
    }
    //slumpar ett nummer mellan en interval min till max. I detta program använder jag det för skada.
    static int RandomNummer(int min, int max) {
        Random r = new Random();
        return (r.nextInt(max-min) + min);
    }
    //metod som ser ifall man missar eller sätter en procentlig chans
    //True = man klarar det
    static boolean ProcentChans(int procent) {
        double b=(Math.random()*100);
        boolean a = true;
        int SlumpNummer=(int)b;
        if(SlumpNummer<=procent) {
            a=false;
        }
        return a;
    }





    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Dev: Carl Hummerhielm \n <FIGHT SPEL>\n");
        System.out.print("Instruktioner:\nDu kommer att spela mot en dator och du kör bäst av 3 rundor. Du kommer att kunna välja mellan 3 svårighetsgrader. Både du och datorn har 100 hälsopoäng\n\nTryck enter för att starta\n");
        scan.nextLine();
        int val;
        System.out.println("Svårighetsgrader:\n");
        System.out.println("Ditt val måste vara 1, 2 eller 3");
        System.out.println("1. Lätt");
        System.out.println("2. Medium");
        System.out.println("3. Svår");
        System.out.print("val: ");
        val = scan.nextInt();
        
        switch (val) {
        case 1:
            System.out.println("""
                               DINA ATTACKER:
                               1. Svag attack(ingen chans att missa, 1-30 skada)
                               2. Mellan attack(40% chans att missa, 30-50 skada)
                               3. Hård attack(70% chans att missa, 50-70 skada)
                               4. Knockout(75% att missa och man, 100 skada""");
            break;
        case 2:
            System.out.println("""
                               DINA ATTACKER:
                               1. Svag attack(ingen chans att missa, 1-30 skada)
                               2. Mellan attack(40% chans att missa, 30-50 skada)
                               3. Hård attack(70% chans att missa, 50-70 skada)
                               4. Knockout(95% att missa och man, 100 skada""");
            break;
        case 3:
            System.out.println("""
                               DINA ATTACKER:
                               1. Svag attack(40% chans att missa, 1-30 skada)
                               2. Mellan attack(70% chans att missa, 30-50 skada)
                               3. Hård attack(90% chans att missa, 50-70 skada)
                               4. Knockout(99% att missa och man, 100 skada""");
            break;
        default:
            System.out.println("Fel val!\nDitt svar måste vara mellan 1-3");
            break;
        }
        int spelare_hp;
        int dator_hp;
        int spelare_vinster=0;
        int dator_vinster=0;
        int attack_val;
        int varv;
        switch(val) {
        case 1:
            for(varv=1; varv<=3; varv++) {
                if(dator_vinster>=2 || spelare_vinster>=2) {
                    break;
                }
                spelare_hp=100;
                dator_hp=100;
                while(dator_hp>=0 | spelare_hp>=0) {
                    System.out.println("\nDator hp: "+ dator_hp);
                    System.out.println("Spelare hp: "+spelare_hp);
                    System.out.print("Attack val: ");
                    attack_val = scan.nextInt();
                    dator_hp-=spelare_attack_lätt(attack_val);
                    //datorns damage
                    spelare_hp-=RandomNummer(1,50);
                    System.out.println("");
                    if(spelare_hp<=0) {
                        dator_vinster++;
                        System.out.println("Datorn vann runda "+varv+"\nScore:\nSpelare: "+spelare_vinster+" Dator: "+dator_vinster+"\n");
                        if(varv==3 || spelare_vinster==2 || dator_vinster==2) {
                            System.out.println("\nDu förlora tjockis!!");
                            break;
                        }
                        System.out.println("Tryck enter för att starta runda "+(varv+1));
                        scan.nextLine();
                        scan.nextLine();
                        break;
                    } else if(dator_hp<=0) {
                        spelare_vinster++;
                        System.out.println("Du vann runda "+varv+"\nScore:\n Spelare: "+spelare_vinster+" Dator: "+dator_vinster+"\n");
                        if(varv==3 || spelare_vinster==2 || dator_vinster==2) {
                            System.out.println("\nBra jobbat, du vann!");
                            break;
                        }
                        System.out.println("Tryck enter för att starta runda "+(varv+1));
                        scan.nextLine();
                        scan.nextLine();
                        break;
                    }
                }
            }

            break;
        case 2:
            for(varv=1; varv<=3; varv++) {
                if(dator_vinster>=2 || spelare_vinster>=2) {
                    break;
                }
                spelare_hp=100;
                dator_hp=100;
                while(dator_hp>=0 | spelare_hp>=0) {
                    System.out.println("\nDator hp: "+ dator_hp);
                    System.out.println("Spelare hp: "+spelare_hp);
                    System.out.print("Attack val: ");
                    attack_val = scan.nextInt();
                    dator_hp-=spelare_attack_medium(attack_val);
                    //datorns damage
                    spelare_hp-=RandomNummer(1,50);
                    System.out.println("");
                    if(spelare_hp<=0) {
                        dator_vinster++;
                        System.out.println("Datorn vann runda "+varv+"\nScore:\nSpelare: "+spelare_vinster+" Dator: "+dator_vinster+"\n");
                        if(varv==3 || spelare_vinster==2 || dator_vinster==2) {
                            System.out.println("\nDu förlora tjockis!!");
                            break;
                        }
                        System.out.println("Tryck enter för att starta runda "+(varv+1));
                        scan.nextLine();
                        scan.nextLine();
                        break;
                    } else if(dator_hp<=0) {
                        spelare_vinster++;
                        System.out.println("Du vann runda "+varv+"\nScore:\n Spelare: "+spelare_vinster+" Dator: "+dator_vinster+"\n");
                        if(varv==3 || spelare_vinster==2 || dator_vinster==2) {
                            System.out.println("\nBra jobbat, du vann!");
                            break;
                        }
                        System.out.println("Tryck enter för att starta runda "+(varv+1));
                        scan.nextLine();
                        scan.nextLine();
                        break;
                    }
                }
            }
            break;
        case 3:
            for(varv=1; varv<=3; varv++) {
                if(dator_vinster>=2 || spelare_vinster>=2) {
                    break;
                }
                spelare_hp=100;
                dator_hp=100;
                while(dator_hp>=0 | spelare_hp>=0) {
                    System.out.println("\nDator hp: "+ dator_hp);
                    System.out.println("Spelare hp: "+spelare_hp);
                    System.out.print("Attack val: ");
                    attack_val = scan.nextInt();
                    dator_hp-=spelare_attack_svår(attack_val);
                    //datorns damage
                    spelare_hp-=RandomNummer(1,50);
                    System.out.println("");
                    if(spelare_hp<=0) {
                        dator_vinster++;
                        System.out.println("Datorn vann runda "+varv+"\nScore:\nSpelare: "+spelare_vinster+" Dator: "+dator_vinster+"\n");
                        if(varv==3 || spelare_vinster==2 || dator_vinster==2) {
                            System.out.println("\nDu förlora tjockis!!");
                            break;
                        }
                        System.out.println("Tryck enter för att starta runda "+(varv+1));
                        scan.nextLine();
                        scan.nextLine();
                        break;
                    } else if(dator_hp<=0) {
                        spelare_vinster++;
                        System.out.println("Du vann runda "+varv+"\nScore:\n Spelare: "+spelare_vinster+" Dator: "+dator_vinster+"\n");
                        if(varv==3 || spelare_vinster==2 || dator_vinster==2) {
                            System.out.println("\nBra jobbat, du vann!");
                            break;
                        }
                        System.out.println("Tryck enter för att starta runda "+(varv+1));
                        scan.nextLine();
                        scan.nextLine();
                        break;
                    }
                }
            }
            break;

        }
    }
}
