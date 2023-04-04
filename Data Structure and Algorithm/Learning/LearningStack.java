package src.DataStructure;

public class LearningStack {
    public static void main(String[] args) {
        //Konsep stack sama dengan balok yang ditumpuk dari bawah.
        // C .. (3)
        // B .. (2)
        // A .. (1) --> dimasukkan pertama

        //Untuk mengakses data yang dimasukkan pertama maka harus menghilangkan data di atasnya terlebih dahulu
        java.util.Stack <String> stack = new java.util.Stack<>();

        //Untuk menentukan stack kosong atau tidak
        System.out.println(stack.empty());

        //Untuk menambah data stack menggunakan push
        stack.push("Atomic Habit");
        stack.push("The Art of War");
        stack.push("Rich Dad, Poor Dad");
        stack.push("How to Win Friend");
        System.out.println(stack.empty());
        System.out.println(stack);

        //Cara untuk menghilangkan objek paling atas dengan menggunakan pop
        String disappear1 = stack.pop();
        String disappear2 = stack.pop();
        System.out.println(disappear1);
        System.out.println(disappear2);
        System.out.println(stack);

        //Untuk melihat objek paling atas menggunakan keyword peek
        System.out.println(stack.peek());

        //Untuk melihat posisi objek menggunakan keyword search
        System.out.println(stack.search("Atomic Habit"));

        //Fungsi Stack
        //1. Fitur undo dan redo
        //2. Moving forward or back di browser history
        //3. Backtracking Algorithms
        //4. Calling out functions


    }


}
