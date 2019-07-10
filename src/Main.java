import java.awt.*;

public class Main {

    public static void main(String[] args)
    {
        int[] xujeta = {1,2,3,4,5};
        for (int i = 0; i< xujeta.length; i++)
        { System.out.println(xujeta[i]);}
        String[] xujeta2 = {"jobana","w rot"};
        for (int i = 0; i < xujeta2.length; i++)
        {
            System.out.print(xujeta2[i]);
            System.out.println();
        }

        String[] slowa = new String[8];
        slowa [0] = "tak";
        slowa [1] = "nie";
        slowa [2] = "proszę";
        slowa [3] = "dziękuje";
        slowa [4] = "przepraszam";
        slowa [5] = "nie rozumiem";
        slowa [6] = "nie wiem";
        slowa [7] = "proszę powtórzyć";
        for (int i = 0; i < slowa.length; i++)
        {
            System.out.println (slowa[i]);
        }

    }
}
