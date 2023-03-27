package src.DataStructure.SinglyLinkedList;

public class Main{
    //    Reference type, null, dan lain-lain (konsep dari linked list)
    //    Setiap object akan menempati setiap memori berbeda
    //    "new" keyword untuk tipe data references
    //    Object disimpan di heap (penyimpanan alamat) dan primitif di stack (penyimpanan nilai alamat atau nilai variabel)
    //    Object garbage adalah object yang tidak di reference oleh suatu varibel
    //    LinkedList bersifat noncongiously (terdapat di lokasi berbeda)
    //    LinkedList hanya menggunakan bigO(1)
    //    Singly berarti memiliki 1 pointer
    //    Untuk menyimpanan memori menggunakan ukuran byte
    //    0x0001 + 4 byte = 0x0005
    //    Dalam stack array hanya menyimpanan alamat dari data pertama
    public static void main(String[] args) {
        LinkedList node = new LinkedList();
        node.addFirst(100);
        node.addLast(200);
        node.addLast(300);
        node.addLast(400);

        //Tambahkan node baru dengan data 500 dari belakang.
        node.addLast(500);

        //Tambahkan node baru dengan data 50 dari depan.
        node.addFirst(50);

        //Tambahkan node dengan data 250 setelah node 200.
        node.insertAfter(200, 250);

        //Hapus node depan.
        node.removeFirst();

        //Hapus node belakang.
        node.removeLast();

        //Hapus nata yang bernilai 300
        node.remove(300);

        //Akses semua data dari seluruh node tersebut dari node yg paling depan ke belakang.
        node.printAll();

        //Buatlah method untuk replace data pada singly linked list. Gunakan pengaksesan index pada node.
        node.replace(2, 300);
        node.printAll();
    }
}
