public class StringManipulatorController {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str); 

        StringManipulator manipulator2 = new StringManipulator();
        char letter = 'o';
        Integer a = manipulator2.getIndexOrNull("Coding", letter);
        Integer b = manipulator2.getIndexOrNull("Hello World", letter);
        Integer c = manipulator2.getIndexOrNull("Hi", letter);
        System.out.println(a); 
        System.out.println(b); 
        System.out.println(c);

        StringManipulator manipulator3 = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer sub = manipulator3.getIndexOrNull(word, subString);
        Integer not = manipulator3.getIndexOrNull(word, notSubString);
        System.out.println(sub); 
        System.out.println(not); 

        StringManipulator manipulator4 = new StringManipulator();
        String word1 = manipulator4.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word); 

    }
}
