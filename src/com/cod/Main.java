package com.cod;

public class Main {

    public static void main(String[] args) {
/*
	    // utilizamos el builder y en concreto el metodo build
        // para tener nuestra pizza
	    Pizzas creadaConBuilder = new BuilderPizzas().build();
	    Pizzas sintaxisEncadenada = new BuilderPizzas()
                .setCebolla(true)
                .setSize(Pizzas.BIG)
                .build();

	    // aunque el toSpring no está definida, nos valen estas lineas para poner
        // un punto de ruptura y hacer debug
        // asi podemos ver los objetos creados
        System.out.println(creadaConBuilder.toString());
        System.out.println(sintaxisEncadenada.toString());

*/
        System.out.println("-----------------------------------------");


        Pizzas pizzaDefault;
        Pizzas pizzaMedida;

        BuilderPizzas miBuilder = new BuilderPizzas();
       /*
       Pasos a seguir:
       Se instancia Builder ej: BuilderPizzas miBuilder = new BuilderPizzas();
       se configura el objeto ej: miBuilder.setCebolla(false);
       se carga el objeto  ej: pizzaDefault = miBuilder.build();
        */

        //ahora vamos a cambiar los atributos de nuestra pizza por defecto que ya ha sido construida con el build();
        miBuilder.setCebolla(false);
        miBuilder.setSize(Pizzas.BIG);
        //tambien se puede construir así
        miBuilder.setSize(Pizzas.FINA).setCebolla(false).setRecojida(0);


        pizzaDefault = miBuilder.build();
        System.out.println(pizzaDefault);

    }
}
