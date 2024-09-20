package tp3.ejercicio2;

import tp3.GeneralTree;
import java.util.List;

public class MainPruebaE2 {

    public static void main(String[] args) {

        GeneralTree<Integer> subHI = new GeneralTree<>(8);
        subHI.addChild(new GeneralTree<>(18));
        subHI.addChild(new GeneralTree<>(14));

        GeneralTree<Integer> subHD = new GeneralTree<>(7);
        subHD.addChild(new GeneralTree<>(9));

        GeneralTree<Integer> HI = new GeneralTree<>(3);
        HI.addChild(subHI);
        HI.addChild(subHD);

        GeneralTree<Integer> HD = new GeneralTree<>(2);
        HD.addChild(new GeneralTree<>(29));
        HD.addChild(new GeneralTree<>(6));

        GeneralTree<Integer> gt = new GeneralTree<>(1);
        gt.addChild(HI);
        gt.addChild(HD);

        List<Integer> lista = new RecorridosAG().numerosImparesMayoresQuePreOrden(gt, 4);
        for(Integer n : lista) {
            System.out.print(n + " - ");
        }
    }

}
