package MoreOnInterfaces;

enum Status{
    Running,Failed,Pending,Success;
}
// enum extends enum class java.lang.enum;

public class EnumsDemo {
    public static void main(String[] args) {
        // Status[] ss = Status.values();
        // for(Status s:ss){
        //     System.out.println(s+":"+s.ordinal());
        // }
        Status s = Status.Pending;

        switch (s) {
            case Running:
                System.out.println("All Good");
                break;
            
            case Failed:
                System.out.println("Try Again");
                break;
            
            case Pending:
                System.out.println("Please Wait");
                break;
            
            default:
                System.out.println("Done");
                break;
        }
        s=Status.Success;
        if(s==Status.Running)
            System.out.println("All Good");
        else if(s==Status.Failed)
            System.out.println("Try Again");
        else if(s==Status.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Done");
    }
}