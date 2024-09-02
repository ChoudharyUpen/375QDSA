//Tiling Problem for 2*1 tile
//but this question can also come for 4*1
class Q1 {
    public static int tilingProblem(int n) { // 2* n(floor size)
        // Base Case
        if (n == 0 || n == 1) {
            return 1;
        }
        // kaam
        // vertical choice
        int fnm1 = tilingProblem(n - 1);

        // horizontal choice
        int fnm2 = tilingProblem(n - 2);

        // returning total ways

        int totalways = fnm1 + fnm2;
        return totalways;

    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(4));

    }
}