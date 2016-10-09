package fd.jc.ip;

/**
 * Created by jackiechen on 16/10/9.
 */

/**
 * No option -> fragmentation head lenght 20 bytes
 */
public class IPv4Fragmentation {
    public static class Fragmentation{
        public int ID;
        public int offset;
        public int flag;
    }
    public static Fragmentation[] IPv4Fragmentation(int length,int mtu,int id){
        int numOfParts=(length-20)/mtu+1;

        Fragmentation [] fragmentation=new Fragmentation[numOfParts];

        for(int i=0;i<numOfParts-1;i++){
            fragmentation[i]=new Fragmentation();//initialization is important
            fragmentation[i].ID=id;
            fragmentation[i].flag=1;
            fragmentation[i].offset=(mtu-20)/8*i;
        }
        fragmentation[numOfParts-1]=new Fragmentation();
        fragmentation[numOfParts-1].ID=id;
        fragmentation[numOfParts-1].flag=0;
        fragmentation[numOfParts-1].offset=(mtu-20)/8*(numOfParts-1);
        return  fragmentation;



    }
}
