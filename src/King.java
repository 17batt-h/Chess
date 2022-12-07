public class King extends Piece {
    private boolean inCheck;

    public King(String position, boolean isBlack){
        super(position, isBlack);
        symbol = 'K';
        inCheck = false;
    }

    //K can move one square in any direction
    public boolean isValidMove(String targetPosition){
        //convert position to row and column
        int startRow = ChessUtils.getRowFromPosition(getPosition());
        int startColumn = ChessUtils.getColumnFromPosition(getPosition());
        int targetRow = ChessUtils.getRowFromPosition(targetPosition);
        int targetColumn = ChessUtils.getColumnFromPosition(targetPosition);
        // can't stand still
        if (targetRow == startRow && targetColumn == startColumn){
            return false;
        }
        //can't move more than one square
        if (Math.abs(startRow - targetRow )>1){
            return false;
        }
        if (Math.abs(startColumn - targetColumn )>1){
            return false;
        }
        return true;

    }

}
