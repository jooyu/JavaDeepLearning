package creatation.com.zy.FactoryMethod;

public class OrdinaryMazeGame extends MazeGame {
    @Override
    protected Room makeRoom() {
        return new OrdinaryRoom(); 
    }
    
    public static void main(String[] args) {
    	MazeGame ordinaryGame = new OrdinaryMazeGame();
    }
}


