import java.util.*;

public class SecondTask{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        User[] u= new User[3];

        for(int i=0;i<3;i++){
            u[i] = new User();
        }

        Set<String> uid = new LinkedHashSet<>();  // set used in manner of no same user id occur

        uid.add("alvish_vekariya");
        uid.add("sagar_v");
        uid.add("shrey");

        String[] uids = uid.toArray(new String[uid.size()]);

        ArrayList<String> pwd = new ArrayList<>();
        pwd.add("1234");
        pwd.add("4567");
        pwd.add("6789");

    //    System.out.println(uids[1]);

        boolean b1=true;

        while(b1){
            boolean b2 = true;
            System.out.println("\n**** LOG IN ****");
            System.out.println("    --------    ");
            System.out.println("enter your user id = ");
            String usid = sc.next();
            System.out.println("enter your password = ");
            String pas = sc.next();

            int k = -1;
            int l = 0;

            while(l<3){
                if(usid.equals(uids[l]) && pas.equals(pwd.get(l))){
                    k=l;
                    break;
                }
                l++;
            }
            // System.out.println(k);

            if( k == -1) System.out.println("User_id and password doesn't match.");

            if(k > -1){

                while(b2){
                    System.out.println("\n-----------------------\nchoose operation ");
                    System.out.println("\n1.credit\n2.debit\n3.check balance\n4.transaction history\n5.transfer money\n6.login with other account\n7.Log out\n==");
                    int n = sc.nextInt();

                    switch(n){
                        case 1 :
                                System.out.println("enter the amount to credit = ");
                                int c = sc.nextInt();
                                u[k].credit(c);
                                break;
                        case 2 : 
                                System.out.println("enter the amount to debit =");
                                int d= sc.nextInt();
                                u[k].debit(d);
                            break;
                        case 3 :
                                System.out.println("you have " + u[k].balance() + " rs. in your account.");
                                break;
                        case 4 :
                                System.out.println("transaction history=");
                                u[k].trans();
                                break;
                        case 5:
                                boolean b3 = true;
                                int o = -1;
                                while(b3){
                                    System.out.println("enter the user_id in which you want to transfer money=");
                                    String str = sc.next();
                                        
                                    for(int i=0;i<3;i++){
                                        if(str.equals(uids[i])){
                                            o = i;
                                        }
                                    }
                                    if(o == -1) {
                                        System.out.println("enter valid user_id....");
                                    }else{
                                        break;
                                    }
                                }
        
                                System.out.println("enter the amount to transfer = ");
                                int amo = sc.nextInt();
                                if(u[k].balance() > amo){
                                    u[k].send(amo,uids[o]);
                                    u[o].receive(amo,uids[k]);
                                }else{
                                    System.out.println("Enefficient balance.");
                                }
                                
                                break;
                        case 6:
                                b2=false;
                                break;
                        case 7:
                                b2=b1=false;

                    }
                }
            }
        }
    }
}