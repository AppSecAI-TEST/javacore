package com.kitcenter.runners.homework.Lesson15;

import com.kitcenter.app.homework.Lesson15.Flowers.Flower;
import com.kitcenter.app.homework.Lesson15.Flowers.Gladiolus;
import com.kitcenter.app.homework.Lesson15.Flowers.Rose;
import com.kitcenter.app.homework.Lesson15.Flowers.Tulip;

public class FlowerRunner {
    public static void main(String[] args) {
        Rose rose = new Rose();
        rose.setPrice(20.00);

        Gladiolus gladiolus = new Gladiolus();
        gladiolus.setPrice(15);

        Tulip tulip = new Tulip();
        tulip.setPrice(10);


        Flower[] bouquet = {rose, rose, rose, gladiolus, gladiolus, gladiolus, tulip, tulip, tulip};
        collectBouquet(bouquet);


    }

    public static double collectBouquet(Flower [] bouquet){
        double bouquetPrice = 0;
        for (Flower item : bouquet){
            bouquetPrice = bouquetPrice + item.getPrice();
        }
        System.out.println(bouquetPrice);
        return bouquetPrice;
    }


}
