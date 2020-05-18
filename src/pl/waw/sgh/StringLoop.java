package pl.waw.sgh;

public class StringLoop {
        public static void main(String[] args) {
        String[] strArr = new String[] {
                "ABC",
                "DEF",
                "EFG"
        };

        for (String s : strArr) {
            System.out.println(s);
        }
        System.out.println(strArr.length);

    }
}
