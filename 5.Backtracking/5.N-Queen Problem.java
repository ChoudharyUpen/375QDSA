class Solution {
    static ArrayList<ArrayList<Integer>> res;
    static int[] row = new int[10];
    static int k = 0;

    static boolean place(int r, int c) {
        for (int prev = 0; prev < c; prev++) {
            if (row[prev] == r || Math.abs(row[prev] - r) == Math.abs(prev - c)) {
                return false;
            }
        }
        return true;
    }

    static void bt(int c, int n) {
        if (n == 2 || n == 3) return;

        if (c == n) {
            ArrayList<Integer> v = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                v.add(row[i] + 1);
            }
            res.add(v);
            k++;
        }

        for (int i = 0; i < n; i++) {
            if (place(i, c)) {
                row[c] = i;
                bt(c + 1, n);
            }
        }
    }

    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        res = new ArrayList<ArrayList<Integer>>();
        bt(0, n);
        return res;
    }
}








//gfg solutions
class Solution{
        static ArrayList<ArrayList<Integer>> res; // Ye res list hai jismein saare solutions store honge
        static int[] row=new int[10]; // Ye array hai jo queen ki row position store karega
        static int k=0; // Ye counter hai jo number of solutions count karega
        
        // Ye function check karta hai ki kya hum queen ko row 'r' aur column 'c' par place kar sakte hain
        static boolean place(int r, int c){
            for(int prev=0; prev<c; prev++){
                // Agar koi queen pehle se row 'r' mein hai ya phir diagonally attack kar sakti hai to return false
                if(row[prev] == r || (int)Math.abs(row[prev] - r) == (int)Math.abs(prev - c))
                    return false;
            }
            return true; // Agar place kar sakte hain to return true
        }
        // Ye backtracking function hai jo queen ko place karne ke sab possible ways explore karega
        static void bt(int c, int n)
        {
            if(n == 2 || n == 3) return; // Agar n 2 ya 3 hai to solution possible nahi hai, return kar do
            
            if(c == n)
            {
                // Agar saari queens ko place kar diya hai, to solution list mein add kar do
                ArrayList<Integer> v = new ArrayList<Integer>();
                for(int i=0; i<n; i++)
                    v.add(row[i] + 1); // 1-based index ke liye +1
                res.add(v);
                k++;
            }
            for(int i=0; i<n; i++)
            {
                // Har row mein queen ko place karne ka try karo
                if(place(i, c))
                {
                    row[c] = i; // Agar place kar sakte hain to row array mein set kar do
                    bt(c + 1, n); // Agle column ke liye recursive call
                }
            }
        }
        // Ye function saare solutions return karega
        static ArrayList<ArrayList<Integer>> nQueen(int n)
        {
            res = new ArrayList<ArrayList<Integer>>(); // Result list ko initialize karo
            bt(0, n); // Backtracking start karo first column se
            return res; // Result return karo
        }
}
