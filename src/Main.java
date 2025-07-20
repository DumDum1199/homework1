public class Main {
    public static void main(String[] args) {
        //Задача 1//
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        System.out.println("dog="+dog);
        System.out.println("cat="+cat);
        System.out.println("paper="+paper);

        //Задача 2//
        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println("dog+4="+dog);
        System.out.println("cat+4="+cat);
        System.out.println("paper+4="+paper);

        //Задача 3//
        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println("dog+4-3.5="+dog);
        System.out.println("cat+4-1.6="+cat);
        System.out.println("paper+4-1.6="+paper);

        //Задача 4//
        var friend=19;
        System.out.println("friend="+friend);
        friend=friend+2;
        System.out.println("friend+2="+friend);
        friend=friend/7;
        System.out.println("(friend+2)/7="+friend);

        //Задача 5//
        var frog=3.5;
        System.out.println("frog="+frog);
        frog=frog*10;
        System.out.println("frog*10="+frog);
        frog=frog/3.5;
        System.out.println("frog*10/3.5="+frog);
        frog=frog+4;
        System.out.println("(frog*10/3.5)+4="+frog);

        //Задача 6//
        var boxer1=78.2;
        var boxer2=82.7;
        var sumBoxers=boxer1+boxer2;
        System.out.println("Суммарный вес боксеров="+sumBoxers);
        var diffBoxers=boxer2-boxer1;
        System.out.println("Разница в весе двух боксеров="+diffBoxers);

        //Задача 7//
        var remainBoxers=boxer2%boxer1;
        System.out.println("Остаток от деления="+remainBoxers);

        //Задача 8.1//
        var hoursAll=640;
        var hoursPE=8;
        var employees=hoursAll/hoursPE;
        System.out.println("Всего работников в компании - "+employees+" человек");

        //Задача 8.2//
        employees=employees+94;
        hoursAll=employees*hoursPE;
        System.out.println("Если в компании работает "+employees+" человек, то всего "+hoursAll+" часов работы может быть поделено между сотрудниками");


    }
}