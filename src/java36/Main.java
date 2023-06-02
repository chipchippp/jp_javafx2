package java36;

import java35.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(15, 5, 2021);
        Date date2 = new Date(15, 9, 2030);
        Date date3 = new Date(15, 10, 2025);

        Produce produce = new Produce("Hãng A", "Việt Nam");
        Produce produce2 = new Produce("Hãng B", "Mỹ");
        Produce produce3 = new Produce("Hãng C", "Ba Lan");

    Movie movie = new Movie("Bố già", 2020, produce, 65000, date);
    Movie movie2 = new Movie("Running Man", 2021, produce2, 100000, date2);
    Movie movie3 = new Movie("Khám phá Ba Lan", 2025, produce3, 115000, date3);

        System.out.println("comparison price 1 cheap 2: "+ movie.checkCheaperFares(movie2));
        System.out.println("comparison price 3 cheap 2: "+ movie3.checkCheaperFares(movie2));


        System.out.println("Produce movie3: " +movie3.getTheProducesName());

        System.out.println("Movie discount 10%: "+movie.priceAfterLowering(10));
        System.out.println("Movie 2 discount 20%: "+movie2.priceAfterLowering(20));
        System.out.println("Movie 3 discount 50%: "+movie3.priceAfterLowering(50));

    }
}
