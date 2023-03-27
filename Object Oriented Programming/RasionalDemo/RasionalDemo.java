package src.OOP_C.RasionalDemo;

public class RasionalDemo {
    public static void main(String[] args) {
        Rasional R1 = new Rasional(1,2);
        Rasional R2 = new Rasional(1,3);

        System.out.println("R1.isRasional: " + R1.isRasional());
        System.out.println("R2.isRasional: " + R1.isRasional());
        System.out.println();

        System.out.println("R1 > R2 : " + R1.lessThan(R2));
        System.out.println();

        System.out.print("R1 : ");
        R1.cetak();
        System.out.print("R2 : ");
        R2.cetak();
        System.out.println();

        R1.Sederhana();
        R2.Sederhana();

        System.out.print("R1 : ");
        R1.cetak();
        System.out.print("R2 : ");
        R2.cetak();
        System.out.println();

        System.out.println("Setelah dilakukan Cast ke double menjadi : " );
        System.out.println("R1 : " + R1.Cast());

        System.out.println("R2 : " + R2.Cast());
        System.out.println();

        R1.negasi();
        System.out.print("Unary- dari R1 : ");
        R1.cetak();
        System.out.println();

        R1.times(R2);
        System.out.print("Nilai dari 'R1 *= R2' : ");
        R1.cetak();
        System.out.println();

    }
}
