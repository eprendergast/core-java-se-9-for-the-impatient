package ch01.q05;

class CastDoubleToInt {

    public static void main(String[] args) {
        System.out.println(CastDoubleToInt.castDoubleToInt(Double.MAX_VALUE));
        System.out.println(Integer.MAX_VALUE);
    }   

    public static int castDoubleToInt(double valueToCast) {
        return (int) valueToCast;
    }

}