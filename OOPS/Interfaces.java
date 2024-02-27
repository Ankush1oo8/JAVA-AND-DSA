package OOPS;

public class Interfaces {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();
    }

    
} 
interface Chessplayer{
    void moves();
    
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up, down, left ,right ,daigonal ,(in all four direction)");
    }
}
class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up, down, left ,right ");
    }
}
class pawn implements Chessplayer{
    public void moves(){
        System.out.println("1- step up");
    }
}
class king implements Chessplayer{
    public void moves(){
        System.out.println("1-step in any direction");
    }
}

//all method are public, abstract & without implementation
//used tp achieve total abstraction
//variable in the interface are final,public and static