// user class for users
import java.util.*;
import java.text.SimpleDateFormat;

class User{
    User(){

    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy  HH:mm:ss aa");
    Date dt = new Date();
    String date = sdf.format(dt);
    int bal = '\0';
    ArrayList<String> a1 = new ArrayList<>();

    public int balance(){
        return bal;
    }

    public void send(int amo,String receiver){
        bal = bal - amo;
        a1.add(amo + " rs. send to " + receiver + " at " + date);
        System.out.println(amo + " rs. send to " + receiver + " successfully.");
    }

    public void receive(int amo, String sender){
        bal = bal + amo;
        a1.add(amo + " rs. received from " + sender + " at "+ date);
    }


    public void debit(int deb){
        if(deb > bal){
            System.out.println("you don't have efficient balance.");
        }
        bal = bal - deb;
        System.out.println(deb + " rs. is successfully debited.");
        a1.add(deb + " rs. is debited. " + date);
    }

    public void credit(int cred){
        bal = bal + cred;
        System.out.println(cred + " rs. is successfully credited.");
        a1.add(cred + " rs. is credited. " + date);
    }

    public void trans(){
        for(int i=0;i<a1.size();i++){
            System.out.println(a1.get(i));
        }
    }

}