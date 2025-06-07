package Java_Programs._20_Strings;

public class P092_String_Functions {
    public static void main(String[] args) {
        String name = "Anuj";
        System.out.println(name.length());
        System.out.println(name.charAt(3));//you can check its description by ctrl+method
        //System.out.println(name.charAt(10)); //StringIndexOutOfBoundsException

        //2. concat()
        System.out.println(name.concat("Rajput"));

        //3. contains()
        System.out.println(name.contains("om"));

        //4. equals()
        System.out.println(name.equals("Anuj"));

        //5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("anuj"));

        //6. indexOf()
        //Returns the index within this string of the
        //first occurrence of the specified substring
        //it returns -1 if nothing is returned
        String n = "anujrajputisgoodboy";
        System.out.println(n.indexOf('a'));
        System.out.println(n.lastIndexOf("a"));

        //7. replace( , )
        System.out.println(name.replace('n','N'));

        //8. split()
        String gmail = "anujrajput8959@gmail.com";
        String[] split = gmail.split("@");
        for (int i=0;i<split.length;i++){
            System.out.print(split[i]+" ");
        }
        System.out.println();
        //9. substring( , )
        //returns value from StartIndex and to the EndIndex-1
        System.out.println(name.substring(1, 3));

        //10. startsWith()
        System.out.println(name.startsWith("A"));

        //11. trim()
        String name2 = "   Anuj Rajput   ";
        System.out.println(name2.trim());

        //12. compareTo() - can also be done by +operator
        //returns 0 if they are same else returns different
        System.out.println(name.compareTo("Anuj"));
    }
}
