import javax.sound.midi.Soundbank;

public class SwitchStatment {
    public static void main(String[] args) {


        var nilai = "b";

        switch (nilai){
            case "A":
                System.out.println("Selamat Anda Lolos");
                break;

            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;

            case "D":
                System.out.println("Anda Tidak Lulus");
                break;

            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }

        switch (nilai){
            case "A" -> System.out.println("wow,Selamat Anda Lulus");
            case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
            case "D" -> System.out.println("Anda Tidak LUlus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }

        }
    }
}
