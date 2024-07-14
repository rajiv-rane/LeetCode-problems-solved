class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> tri = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {

                    int left = tri.get(i - 1).get(j - 1);
                    int right = tri.get(i - 1).get(j);
                    row.add(left + right);
                }
            }
            tri.add(row);
        }
        return tri.get(rowIndex);
    }
}