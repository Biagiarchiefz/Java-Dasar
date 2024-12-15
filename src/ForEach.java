public class ForEach {
    public static void main(String[] args) {


        String[] names = {
                "Biagi", "Archie", "Fais",
                "Kuliah", "Di", "Unpas"
        };

//        for (var i = 0; i <= names.length; i++){
//            System.out.println(names[i]);
//        }

        System.out.println("ForEach");

        for (var name : names){
            System.out.println(name);
        }





    }
}

