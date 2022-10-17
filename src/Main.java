public class Main {
    public static void main(String[] args) {
        //Задание 1.1, 1.2, 2.1
        Human Max = new Human("Максим","Минск",35,"бренд-менеджер");

        System.out.println("Привет! Меня зовут "+Max.name+". Я из города "+Max.town+". Я родился в "+Max.getYearOfBirth()+" году." +" Я работаю на должности "+Max.post+". Будем знакомы!");

        Human Any = new Human("Аня","Москва",29,"методист образовательных программ" );

        System.out.println("Привет! Меня зовут "+Any.name+". Я из города "+Any.town+". Я родился в "+Any.getYearOfBirth()+" году." +" Я работаю на должности "+Any.post+". Будем знакомы!");

        Human Katya = new Human("Катя","Калининград",28,"продакт-менеджер");

        System.out.println("Привет! Меня зовут "+Katya.name+". Я из города "+Katya.town+". Я родился в "+Katya.getYearOfBirth()+" году." +" Я работаю на должности "+Katya.post+". Будем знакомы!");

        Human Artem = new Human("Артем","Москва",27,"директор по развитию бизнеса");

        System.out.println("Привет! Меня зовут "+Artem.name+". Я из города "+Artem.town+". Я родился в "+Artem.getYearOfBirth()+" году." +" Я работаю на должности "+Artem.post+". Будем знакомы!");

        //Задание 1.3, 2.2
        Car Lada = new Car("Lada","Granta",1.7,"желтый",2015, "Россия");
        System.out.println(Lada);

        Car Audi = new Car("Audi","A8 50 L TDI quattro", 3.0,"черный",2020,"Германия");
        System.out.println(Audi);

        Car BMW = new Car("BMW","Z8,",3.0,"черный",2021, "Германия");
        System.out.println(BMW);

        Car Kia = new Car("Kia","Sportage", 2.4,"красный",2018,"Южная Корея");
        System.out.println(Kia);

        Car Hyundai  = new Car("Hyundai ","Avante", 1.6,"оранжевый",2016,"Южная Корея");
        System.out.println(Hyundai );



    }
}