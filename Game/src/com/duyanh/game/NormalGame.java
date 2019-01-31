/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duyanh.game;

/**
 *
 * @author Welcome
 */
public class NormalGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game game = new Game(1280, 720, "Communism");
        game.start();
    }
    
}
