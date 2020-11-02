public class StringManipulator {
    public static String trimAndConcat (String string1, String string2) {
        return string1.trim().concat(string2.trim());
    }

    public static Integer getIndexOrNull(String string3, char c){
        int index = string3.indexOf(c);
        if (index == -1){
            return null;
        }else{
            return index;
        }
    }

    public static Integer getIndexOrNull(String string4, String string5){
        int index2 = string4.indexOf(string5);
        if (index2 == -1){
            return null;
        }else{
            return index2;
        }
    }
    public String concatSubstring(String name1, int val1, int val2, String name2){
        String result = name1.substring(val1, val2);
        return result.concat(name2);
    }
}