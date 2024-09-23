package tp3.ejercicio2;

import tp3.GeneralTree;
import java.util.List;

public class MainPruebaE2 {

    public static void main(String[] args) {

        GeneralTree<Integer> gt = new GeneralTree<>(1);

        GeneralTree<Integer> hijo1 = new GeneralTree<>(2);
        GeneralTree<Integer> hijo2 = new GeneralTree<>(3);

        hijo1.addChild(new GeneralTree<>(4));
        hijo1.addChild(new GeneralTree<>(5));
        hijo1.addChild(new GeneralTree<>(6));

        hijo2.addChild(new GeneralTree<>(7));
        hijo2.addChild(new GeneralTree<>(8));
        hijo2.addChild(new GeneralTree<>(9));

        gt.addChild(hijo1);
        gt.addChild(hijo2);

        List<Integer> lista = new RecorridosAG().numerosImparesMayoresQueInOrden(gt, 4);
        for(Integer n : lista) {
            System.out.print(n + " - ");
        }
    }

}
