import Animals.Dog;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Java with POO!");


        Dog cachorro1;
        cachorro1 = new Dog();

        cachorro1.nome = "Pug";
        cachorro1.cor = "Caramelo";
        cachorro1.altura = 10;
        cachorro1.peso = 7.7;
        cachorro1.tamanhoDoRabo = 5.2;



        System.out.println(cachorro1);
        }

}