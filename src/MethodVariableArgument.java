public class MethodVariableArgument {
    public static void main(String[] args) {

        sayHai("Biagi", 80, 80, 80, 50, 60);


    }
     static void sayHai(String name, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name +", Anda Lulus");
        }else {
            System.out.println("Maaf " + name +", Tidak Anda Lulus");
        }


    }
}
