/**
 * Class CharMatrix.
 *
 * @Lisa Dai
 * @version 1.0
 * @param m, a 2D Array of chars
 */

public class CharMatrix{
    char[][] m;
    /*
     * Constructor: creates a grid with length/width r,c,
     * and fills it with space.
     */
    public CharMatrix(int r, int c){
        m=new char[r][c];
        fillRect(0,0,r-1,c-1,' ');
    }

    /*
     * Constructor: creates a grid with dilength/width r, c,
     * and fills it with character fill.  
     */
    public CharMatrix(int r,int c,char fill){
        m=new char[r][c];
        fillRect(0,0,r-1,c-1,fill);
    }

    /*
     * Return the number of r in grid
     */
    public int numR(){
        return m.length;
    }

    /*
     * Return the number of columns in grid
     */
    public int numC(){
        return m[0].length;
    }

    /*
     * Return the character at indexes [r,c]
     */
    public char charAt(int r,int c){
        return m[r][c];
    }

    /*
     * Sets the character at index [row, col] to ch
     */
    public void setCharAt(int r,int c,char ch){
        m[r][c]=ch;
    }

    /*
     * Return true if the character at at index [r,c]is a space,
     * return false otherwise
     */
    public boolean isEmpty(int r,int c){
        return m[r][c]==' ';
    }

    /*Fills the given rectangle with the SPACE characters.
     * row0, col0 is the upper left corner and 
     * row1, col1 is the lower right corner of the rectangle.
     */
    public void fillRect(int row0,int col0, int row1,int col1,char fill){
        for(int r=row0; r<=row1;r++){
            for(int c=col0;c<=col1;c++){
                m[r][c]=fill;
            }
        }
    }

    /*
     * Fill the given rectangle with the character space.
     * The top left rectangle's index is [row0, col0].
     * The lower right rectangle's index is [row1, col1].
     */
    public void clearRect(int row0,int col0,int row1,int col1){
        fillRect(row0,col0,row1,col1,' ');
    }

    
    /*
     * Return the number of all non-SPACE characters in row.
     */
    public int countInRow(int row){
        int count=0;
        for(int i=0;i<m[0].length;i++){
            if(m[row][i]!=' '){
                count++;
            }
        }
        return count;
    }

    /*
     * Return the number of all non-SPACE characters in col.
     */
    public int countInCol(int col){
        int count = 0;
        for(int i=0;i<m[0].length;i++) {
            if(m[i][col]!=' '){
                count++;
            }
        }
        return count;
    }

    /* Print out the result.
     */
    public void print(){
        System.out.println("");
        for(int r=0;r<m.length;r++) {
            for(int c=0;c<m[0].length; c++) {
                System.out.print(m[r][c]);  
            }
            System.out.println("");
        }
        System.out.println("");
    }
}