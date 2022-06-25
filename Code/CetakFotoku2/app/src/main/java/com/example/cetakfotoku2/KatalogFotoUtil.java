package com.example.cetakfotoku2;

import java.util.ArrayList;
import java.util.List;

public class KatalogFotoUtil {
    private static int[] ridArray = {
            R.drawable.imges_1,
            R.drawable.imges_2,
            R.drawable.imges_3,
            R.drawable.imges_4
    };

    private static  String[] filenameArray = {
            "imges_1",
            "imges_2",
            "imges_3",
            "imges_4"
    };

    private static List<KatalogFoto> katalogFotoList;

    public static void init(){
        katalogFotoList = new ArrayList<>();
        int nArray = ridArray.length;
        for(int i=0;i<nArray;i++){
            katalogFotoList.add(new KatalogFoto(ridArray[i], filenameArray[i]));
        }
    }

    public static List<KatalogFoto> getKatalogFotoList(){
        return katalogFotoList;
    }

    public static KatalogFoto getKatalogFotoAt(int i){
        return katalogFotoList.get(i);
    }

}
