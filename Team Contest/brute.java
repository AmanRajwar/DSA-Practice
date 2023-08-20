class brute {
    public static int team(int[] skill, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (skill[i] > 2 * skill[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {727, 349, 916, 7, 595, 873, 516, 960, 976, 170, 662, 317, 529, 702, 789, 256, 75, 575, 330, 339, 584, 239, 31, 173, 929, 967, 20, 654, 780, 478, 337, 67, 343, 14, 415, 842, 908};
System.out.println(team(array,array.length));
    }
}