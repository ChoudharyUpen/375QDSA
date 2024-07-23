class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        Arrays.sort(arr);
        long a = arr[0];
        long c = arr[arr.length - 1];
        return new Pair<>(a, c);
    }
}
