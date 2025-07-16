 class Q21 {
    public static void main(String[] args) {
        int bl = 15;
        int bb = 8;
        int bh = 5;
        int brickVol = bl * bb * bh;

        int wl = 1500;
        int wb = 1000;
        int wh = 800;
        int wallVol = wl * wb * wh;

        int bricks = wallVol / brickVol;

        System.out.println("Bricks needed = " + bricks);
    }
}
