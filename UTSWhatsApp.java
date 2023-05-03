import java.util.ArrayList; //statement untuk mengimpor kelas ArrayList yang digunakan untuk menyimpan objek-objek chats (pesan-pesan) antar pengguna.
import java.util.Scanner; //statement untuk mengimpor kelas Scanner yang digunakan untuk menerima input dari pengguna.

public class UTSWhatsApp<Chats> {

private static final ArrayList<User> Chats = null; /*Mendeklarasikan variabel statis (Chats) yang bertipe ArrayList<User> dengan nilai awal null. 
                                                    *Variabel ini digunakan untuk menyimpan obyek-obyek chat yang dibuat oleh pengguna program.
                                                    *ArrayList sendiri yaitu kelas turunan dari kelas List yang menyimpan objek-objek dalam bentuk list dengan ukuran list yang dapat berubah.
                                                    */
private static final int ArrayList = 0;
private static final int User = 0;
ArrayList<User> users = new ArrayList<User>(); //deklarasi variabel (users) yang menjadi objek dari kelas ArrayList dan (User sebagai parameter) yang berarti objek yang disimpan dalam array ini harus bertipe .
User pengguna; //user sebagai class dan pengguna sebagai instance atau mengenalkan dari user

public static void main(String[] args) { //sebagai methode yang menjalankan dan mengluarkan output
    UTSWhatsApp app = new UTSWhatsApp(); //deklarasi dari app untuk menjalankan program whatsapp
    app.mulai(); //pemanggilan methode (mulai) dengan objek app = app ini adalah objek dari kelas utama
}

public void mulai() {
    Scanner scanner = new Scanner(System.in);
    boolean keluar = false; //variable boolean untuk menandai apakah pengguna sudah keluar atau belum dari aplikasi
    
    while (!keluar) { //merupakan cara looping dari while jika keluar masih false maka tidak akan keluar dari program hingga keluar bersifat true. 
        System.out.println("Selamat datang di WhatsApp");
        System.out.println("1. Daftar");
        System.out.println("2. Masuk");
        System.out.println("3. Keluar");
        System.out.println("4. Pesan baru");
        System.out.println("5. Keluar");
        System.out.print("Pilih opsi: ");
        int Pilihan = scanner.nextInt();
        
        switch(Pilihan) {
            case 1:
                daftar();
                break;
            case 2:
                masuk();
                break;
            case 3:
                keluar();
                break;
            case 4:
                pesanBaru();
                break;
            case 5:
                keluar = true;
                System.out.println("Selamat tinggal!");
                break;
            default:
                System.out.println("Opsi tidak valid");
        }
    }
    
    scanner.close();
}

public void daftar() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Masukkan nama anda: ");
    String nama = scanner.nextLine();
    
    System.out.print("Masukkan nomor telepon anda: ");
    String nomer = scanner.nextLine();
    
    System.out.print("Masukkan kata sandi: ");
    String password = scanner.nextLine();
    
    User newUser = new User(nama, nomer, password);
    users.add(newUser);
    System.out.println("Pendaftaran berhasil!");
    
}

public void masuk() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Masukkan nomor telepon anda: ");
    String nomer = scanner.nextLine();
    
    System.out.print("Masukkan kata sandi anda: ");
    String password = scanner.nextLine();
    
    for (User user : users) { //terdiri dari class utama dengan tambahan variable untuk mengulangi objek user
        if (user.getNomor().equals(nomer) && user.getPassword().equals(password)) { //merupakan statemnt if yang digunakan untuk memeriksa apa pengguna sudah benar memasukan nomer dan password sesuai user atau daftar.
            pengguna = user;
            pengguna.setLoggedIn(true); //perintah untuk mengubah status login pengguna menjadi "loggedIn = true".
            System.out.println("Masuk berhasil!");
            return;
        }
    }
    
    System.out.println("Nomor telepon atau kata sandi tidak valid");
    
    scanner.close();
}
public void keluar() {
    if (pengguna != null && pengguna.isLoggedIn()) { // suatu kondisi untuk mengecek apa pengguna sudah login dengan null nilai
        pengguna.setLoggedIn(false);
        pengguna = null;
        System.out.println("Keluar berhasil!");
    } else {
        System.out.println("Anda belum masuk");
    }
}
/**
 * 
 */
public void pesanBaru() {
    if (pengguna == null || !pengguna.isLoggedIn()) {
        System.out.println("Anda harus masuk terlebih dahulu");
        return;
    }
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan nomor telepon penerima: ");
    String simpanPenerima = scanner.nextLine();
    simpanPenerima(simpanPenerima);
    System.out.println("Nomor telepon penerima berhasil disimpan!");

    final String simpan = scanner.nextLine(); //mengambil input menggunakan objek Scanner dan menyimpannya dalam variabel simpan. final=variable
    if (simpanPenerima == null) { //memeriksa nomer apakah ada atau tidak
        System.out.println("Penerima tidak ditemukan");
        return;
    }
        System.out.print("Masukan Pesan: ");
        String pesan = scanner.nextLine();
        Chat newChat = (Chat) new Chat(pengguna, simpanPenerima, pesan); //ode yang menciptakan objek Chat baru dengan parameter pengguna, simpanPenerima, dan pesan. Objek Chat kemudian digunakan untuk menambahkan pesan baru ke dalam ArrayList Chats.
        Chat.add(newChat);
        System.out.println("Pesan terkirim!");
        
        scanner.close();
    }

private void simpanPenerima(String simpanPenerima) {
}
    private ArrayList <User> extracted(ArrayList<User> Chats) { //method yang mengembalikan sebuah ArrayList dari User yang diambil dari ArrayList chats.
        return Chats;
    }
    final User findUserBynomer(String nomer) {
        for (User user : users) {
            if (user.getNomor().equals(nomer)) {
                return user;
            }
        }
        return null;
        }
}

class User {
    
    private String nama;
    private String nomor;
    private String password;
    private boolean loggedIn;
    
    public User(String nama, String nomor, String password) {
        this.nama = nama;
        this.nomor = nomor;
        this.password = password;
        this.loggedIn = false;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getNomor() {
        return nomor;
    }
    
    public String getPassword() {
        return password;
    }
    
    public boolean isLoggedIn() {
        return loggedIn;
    }
    
    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
    
}