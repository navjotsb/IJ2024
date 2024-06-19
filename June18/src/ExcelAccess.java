import javax.swing.*;

public class ExcelAccess {

    private boolean read;

    private boolean write;

    public boolean isRead()
    {
        return read;
    }

    public boolean isWrite()
    {
        return write;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public void setWrite(boolean write) {
        this.write = write;
    }

    public void readData(String read) {
        if (read.equals("true")) {
            this.read = true;
            System.out.println(this.read);
        } else {
            System.out.println("can't read");
        }
    }

    public void writeData(String write) {
        if (write.equals("true")) {
            this.write = true;
            System.out.println(this.write);
        } else {
            System.out.println("can't write");
        }
    }

    @Override
    public String toString() {
        return "ExcelAccess{" +
                "read=" + read +
                ", write=" + write +
                '}';
    }

    public static void main(String[] args) {
        ExcelAccess excelAccess = new ExcelAccess();
        excelAccess.readData("false");
        excelAccess.writeData("true");
        excelAccess.setRead(true);
        System.out.println(excelAccess);

    }
}
