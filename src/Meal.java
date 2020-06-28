public class Meal {

    public static void main(String[] args) {

        Food comida = new Food();
        comida.food_name = "Feijão";
        comida.food_weight = 1.3;

        Food lanche = new Food();
        lanche.food_name = "Sorvete";
        lanche.food_weight = 0.3;

        Person leo = new Person();
        leo.name = "Leonardo Almeida";
        leo.weight = 68.2;

        System.out.println("Nome: "+ leo.name);
        System.out.println("Peso: "+leo.weight);

        leo.eat(lanche);

        System.out.println("Depois de Comer: "+ leo.weight);
    }

}
