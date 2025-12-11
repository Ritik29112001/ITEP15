 class Q24 {
    public static void main(String[] args) {
        float brick = 25 * 10 * 7.5f;
        float wall = 2000 * 200 * 75;

        float total = wall / brick;
        float cost = (total / 1000) * 900;

        System.out.println("Bricks needed = " + (int)total);
        System.out.println("Total cost = ₹" + (int)cost);
    }
}
