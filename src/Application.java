import model.Kotik;

public class Application

{

    public static void main(String[] args)
    {
        Kotik cat1 = new Kotik("Chendler Bing",3000.0, 10.0, "МЯУ");
        Kotik cat2 = new Kotik();
        cat2.setKotik(10, "Sheldon Cooper", 3000.0, "МЯУ");
        cat1.liveAnotherDay();
        System.out.println("Имя кота: " + cat1.getName());
        System.out.println("Вес кота: " + cat1.getWeight());

        System.out.println(cat1.getMeow() == cat2.getMeow());

        System.out.println("Количество созданных котиков: " + Kotik.getCount());
        









    }

}