public class Runner {
    public static void main(String[] args) {
        int[][] arr = {
                {15, 5, 9, 10},
                {12, 16, 11, 6},
                {14, 8, 13, 7}
        };

        System.out.println(Main.findPosition(8, arr)); // → (2, 1)
        System.out.println(Main.findPosition(17, arr)); // → null

        Position[][] pArr2D = Main.getSuccessorArray(arr);
        StringBuilder sb = new StringBuilder();
        for (Position[] pArr : pArr2D) {
            for (Position p : pArr)
                sb.append(p);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
