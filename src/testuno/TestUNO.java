/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testuno;

import Entities.UNOCard;
import Entities.UNODeck;
import Entities.UNOGame;
import Entities.UNOPlayer;
import java.util.ArrayList;
import java.util.List;

public class TestUNO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UNOGame NewGame = new UNOGame();

        UNOPlayer p1 = new UNOPlayer("Melody");
        UNOPlayer p2 = new UNOPlayer("Mitch");
        UNOPlayer p3 = new UNOPlayer("Sweetie");
        UNOPlayer p4 = new UNOPlayer("Leela");

        ArrayList<UNOPlayer> newlist = new ArrayList<UNOPlayer>();
        newlist.add(p1);
        newlist.add(p2);
        newlist.add(p3);
        newlist.add(p4);

        NewGame.CreateNewGame(1, newlist, new UNODeck());
        System.out.println("Game ID: " + NewGame.getId());
        System.out.println("Discard: " + NewGame.getDiscardPile().toString());
        System.out.println("Cards on deck: ");
        for (int i = 0; i < NewGame.getListOfPlayers().size(); i++) {
            System.out.println("        Player: Name = " + NewGame.getListOfPlayers().get(i).getName());
            System.out.println("        Cards in hand: ");
            for (UNOCard c : NewGame.getListOfPlayers().get(i).getPlayersCards()) {
                System.out.println("                 " + c);
            }

        }
    }
    String i = "asd";
}
