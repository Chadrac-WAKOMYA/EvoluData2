import java.util.List;

public class BoatMovements {
    public static boolean canTravelTo(boolean[][] gameMatrix, int fromRow, int fromColumn, int toRow, int toColumn) {
        boolean valid = false;
        if(fromRow>=0 && fromRow<gameMatrix.length && fromColumn>=0 && fromColumn<gameMatrix[0].length
            && toRow>=0 && toRow<gameMatrix.length && toColumn>=0 && toColumn<gameMatrix[0].length
            && gameMatrix[fromRow][fromColumn] && gameMatrix[toRow][toColumn]
            && (fromRow == toRow || fromColumn == toColumn)) {
            
            int rowStep = Integer.compare(toRow, fromRow); // 1, 0 ou -1
            int colStep = Integer.compare(toColumn, fromColumn); // 1, 0 ou -1

            int currentRow = fromRow + rowStep;
            int currentCol = fromColumn + colStep;

            if(rowStep ==0){
                valid = true; 
                while (currentCol != toColumn) {
                    if (!gameMatrix[fromRow][currentCol]) {
                        valid = false;
                        break;
                    }
                    currentCol += colStep;
                }
            }else if(colStep ==0){
                valid = true; 
                while (currentRow != toRow) {
                    if (!gameMatrix[currentRow][fromColumn]) {
                        valid = false;
                        break;
                    }
                    currentRow += rowStep;
                }
            }          

        }
         
        return valid;
    }

    public static void main(String[] args) {
        boolean[][] gameMatrix = {
            {false, true,  true,  false, false, false},
            {true,  true,  true,  false, false, false},
            {true,  true,  true,  true,  true,  true},
            {false, true,  true,  false, true,  true},
            {false, true,  true,  true,  false, true},
            {false, false, false, false, false, false},
        };

        System.out.println(canTravelTo(gameMatrix, 3, 2, 2, 2)); // true, Valid move
        System.out.println(canTravelTo(gameMatrix, 3, 2, 3, 4)); // false, Can't travel through land
        System.out.println(canTravelTo(gameMatrix, 3, 2, 6, 2)); // false, Out of bounds
    }
}