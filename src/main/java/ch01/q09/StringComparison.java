package ch01.q09;

class StringComparison { 
    
    public static void main(String[] args) {
        String helloWorld = "Hello World";
        String hello = "Hello";
        String world = "World";
        String helloWorldAgain = hello + " " + world;

        System.out.println(helloWorld == helloWorldAgain); // returns false because helloWorldAgain is computed
        System.out.println(helloWorld.equals(helloWorldAgain));
    }

}