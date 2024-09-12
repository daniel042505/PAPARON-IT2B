
package paparon.it2b;

 
public class hotels {
    
     String name, rtype, pstats, status;
    int id, cout, cin;
    public void gethotels(String Name, String Rtype, String Pstats, String Status, int Id, int Cout, int Cin){
        this.name = Name;
        this.rtype = Rtype;
        this.pstats = Pstats;
        this.status = Status;
        this.id = Id;
        this.cout = Cout;
        this.cin = Cin;
    }
      public void viewhotels(){
        System.out.printf("|%-10d  |  %-10s  |  %-10s  |  %-10d  |  %-10d  |  %-10s  |  %-10s  |",this.id, this.name, this.rtype, this.cin, this.cout, this.pstats, this.status);
    }
}
