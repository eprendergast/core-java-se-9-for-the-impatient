package ch01.q02;

class AngleNormalizer {
    public static void main (String[] args) {
        System.out.println(AngleNormalizer.normalize(480));
        System.out.println(Math.floorMod(480, 360));
        System.out.println(AngleNormalizer.normalize(-120));
        System.out.println(Math.floorMod(-120, 360));
    }

    public static int normalize(int angle) {
        return angle % 360 < 0 ? (angle % 360 + 360) : (angle % 360);
    }

}