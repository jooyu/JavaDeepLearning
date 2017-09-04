package com.zy.FactoryMethod;

public class MagicMazeGame extends MazeGame {
    @Override
    protected Room makeRoom() {
        return new MagicRoom(); 
    }
    
    public static void main(String[] args) {
    	MazeGame magicGame = new MagicMazeGame();
    }
}




