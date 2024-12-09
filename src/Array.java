public class Array {
    public static void main(String[] args) {
        String[] stringarray = new String[3];
        stringarray[0] = "Biagi";
        stringarray[1] = "Archie";
        stringarray[2] = "Fais";

        System.out.println(stringarray[0]);
        System.out.println(stringarray[1]);
        System.out.println(stringarray[2]);


        /**
         * Array di dalam array
         */
        String[][] members = {
                {"Eko", "Kurniawan3"},
                {"Budi", "Archie19"},
                {"Joko"}
        };
        System.out.println(members[0][1]);
        System.out.println(members[1][1]);




    }
}
