public class King extends Piece {
    private boolean inCheck;

    public King(String position, boolean isBlack){
        super(position, isBlack);
        symbol = 'K';
        inCheck = false;
    }

    //K can move one square in any direction
    public boolean isValidMove(String targetPosition){

    }

}
