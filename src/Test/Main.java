package Test;

import fd.jc.ip.IPv4Fragmentation;

/**
 * Created by jackiechen on 16/10/9.
 */
public class Main {
    public static void main(String [] args){
        IPv4Fragmentation.Fragmentation fragmentations[]=IPv4Fragmentation.IPv4Fragmentation(4000,1500,777);
        for(int i=0;i<fragmentations.length;i++){
            System.out.print(fragmentations[i].ID+"  ");
            System.out.print(fragmentations[i].offset+"  ");
            System.out.println(fragmentations[i].flag);
        }
    }
}
