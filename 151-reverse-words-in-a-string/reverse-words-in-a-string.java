class Solution {
    public String reverseWords(String s) {
        String str = s.trim();
        String[] arr = str.split(" ");
        // System.out.println(Arrays.toString(arr));
        String add = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != "") {
                add += arr[i];

                add += " ";

            }

            // System.out.print(add);

        }
        return add.trim();

    }
}