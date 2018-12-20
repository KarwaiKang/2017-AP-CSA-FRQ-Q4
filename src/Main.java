public class Main {
    /**
     * Precondition: {@code intArr} contains at least one row.
     *
     * @param num    the int to look for in {@code intArr}
     * @param intArr the two-dimensional array to search {@code num} in.
     * @return the position of {@code num} in {@code intArr};
     * returns {@code null} if no such element exists in {@code intArr}.
     */
    public static Position findPosition(int num, int[][] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {
                if (intArr[i][j] == num)
                    return new Position(i, j);
            }
        }
        return null;
    }

    /**
     * Precondition: {@code intArr} contains at least one row and contains consecutive values.
     * Each of these integers may be in any position in the 2D array.
     *
     * @param intArr a 2D integer array.
     * @return a successor array created from a given 2D integer array.
     */
    public static Position[][] getSuccessorArray(int[][] intArr) {
        Position[][] posArr = new Position[intArr.length][intArr[0].length];
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {
                posArr[i][j] = findPosition(intArr[i][j] + 1, intArr);
            }
        }
        return posArr;
    }
}
