/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giancarlolevato
 */
public class Game {
    private String hTeam;
    private String aTeam;
    private int hScore;
    private int aScore;
    
    public Game (String h, String a, int hS, int aS) {
        this.hTeam = h;
        this.aTeam = a;
        this.hScore = hS;
        this.aScore = aS;
    }
    
   public String getHTeam() {
       return this.hTeam;
   } 
   public String getATeam() {
       return this.aTeam;
   }
   public int getHScore() {
       return this.hScore;
   }
   public int getAScore() {
       return this.aScore;
   }
}
