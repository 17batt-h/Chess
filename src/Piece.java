public class Piece {
    private int row;
    private int column;
    private boolean isBlack;
    protected char symbol;

    public Piece(int row, int column, boolean isBlack) {
        this.row = row;
        this.column = column;
        this.isBlack = isBlack;
        symbol = 'x';
    }
    public Piece (String position, boolean isBlack){
        this.isBlack = isBlack;
        symbol = 'x';
        row = ChessUtils.getRowFromPosition(position);
        column = ChessUtils.getColumnFromPosition(position);
    }

    public String getPosition(){
        return ChessUtils.columnToLetter(column) + ChessUtils.rowToNumber(row);
    }

    public char getSymbol(){
        if(isBlack){
            return Character.toUpperCase(symbol);
        }
        return Character.toLowerCase(symbol);
    }

    public boolean isValidMove(String targetPosition){
        return true;
    }

}
