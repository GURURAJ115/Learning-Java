public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen(); 
        q.moves();
    }
}

interface Herbivore{
    
}
interface Carnivore{

}
class Bear implements Herbivore,Carnivore{
    
}

interface chessPlayer   {
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("Up, Down, Left, Right, Diagonal");
    }
}

class Rook implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}