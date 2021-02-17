import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class fibernacci {

    public static void main(String[] args) {

        System.out.println("Hello Intelij");
        int n = 0;
        int n1 = 1;

        //has the previous number print out first then adds the next number which is the sum
        // this makes the sum equal the previous plus what should be the nex number together

        for (int i = 1; i <= 10; ++i){
            System.out.print(n+" ");


            int sumNum = n + n1;
            n = n1;
            n1 = sumNum;
        }

    }
}
