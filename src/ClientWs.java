import proxy.BankService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWs {
    public static void main(String[] args) {
        BankService stubWs=new BanqueWS().getBankServicePort();
        System.out.println(stubWs.conversionEuroToDH(800));
        Compte cp=stubWs.getCompte(1L);
        System.out.println(cp.getCode());
        System.out.println( cp.getSolde());


        List<Compte> list = stubWs.listComptes();
        list.forEach(p->{
            System.out.println("********************************");
            System.out.println(p.getSolde());
            System.out.println(p.getCode());
            System.out.println("********************************");


            });




    }
}
