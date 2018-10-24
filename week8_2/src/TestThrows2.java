import java.io.IOException;

class file_open {
    void method() throws IOException {
        throw new IOException("Thiet bi");
    }
}

public class TestThrows2 {
    public static void main(String args[]) throws IOException {
        file_open file_open = new file_open();
        file_open.method();
        System.out.println("Luong binh thuong...");
    }
}