import java.util.LinkedList;

public class LL 
{
    public static void main(String[] args) throws Exception 
    {
        
        LinkedList<String> nama = new LinkedList<String>();
        
        //IsEmpty
        System.out.println("Apakah List Kosong??\n ->" +nama.isEmpty());

        //add
        nama.add("a");
        nama.add("i");
        nama.add("n");
        nama.add("i");
        nama.add(" ");
        nama.add("i");
        nama.add("z");
        nama.add("z");
        nama.add("a");
        nama.add("t");
        nama.add("h");
        nama.add("y");
        nama.add(" ");
        nama.add("i");
        nama.add("s");
        nama.add("p");
        nama.add("e");
        nama.add("n");
        nama.add("d");
        nama.add("i");

        System.out.println("\n\nDATA AWAL");
        System.out.println("\nNama\t\t: "+nama);
        System.out.println("Jumlah Huruf\t-> "+nama.size());
        

        nama.addFirst("r");   
        nama.addLast("z");
        System.out.println("\n\nDATA TERBARU (Add)");
        System.out.println("Nama\t\t: "+nama);
        System.out.println("Jumlah Huruf\t-> "+nama.size());


        
        //Sisip
        nama.set(8, "g");
        nama.set(18, "h");
        System.out.println("\n\nDATA TERBARU (Sisip)");
        System.out.println("Nama\t\t: "+nama);
        System.out.println("Jumlah Huruf\t-> "+nama.size());

        

        //Delete
        nama.removeFirst();
        nama.removeLast();
        nama.remove(3);
        System.out.println("\n\nDATA TERBARU (Delete)");
        System.out.println("Nama\t\t: "+nama);
        System.out.println("Jumlah Huruf\t-> "+nama.size());


        //is Empty
        System.out.println("\n\nApakah List Kosong??\n ->" +nama.isEmpty());

        


        //PUSH
        nama.push("e");
        nama.push("l");
        nama.push("f");
        nama.push("r");
        nama.push("g");
        System.out.println("\n\nDATA TERBARU (PUSH)");
        System.out.println("Nama\t\t: "+nama);
        System.out.println("Jumlah Huruf\t-> "+nama.size());

        //POP
        nama.pop();
        System.out.println("\n\nDATA TERBARU (POP)");
        System.out.println("Nama\t\t: "+nama);
        System.out.println("Jumlah Huruf\t-> "+nama.size());

        
    }
}
