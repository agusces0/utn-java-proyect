/*
 * GRUPO: YOUNGDEVELOPERS

 * INTEGRANTES:
   si
   
 */                                             
package test.java.proyect;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args){

        User usuario = new User("Hola","23334","Sí");
        //Defines
        Burger clasic = new Burger(1, 500, "Clasic", "Queso y carne");
        Burger doble = new Burger(2, 500, "Double", "Doble carne");
        Burger veggie = new Burger(3, 700, "Veggie", "XD");
        Burger prueba = new Burger(4, 600, "Prueba", "Prueba2");

        Drink cola = new Drink(1, 400, "Coca-Cola", 1.5);
        Drink sprite = new Drink(2, 300, "Sprite", 1.5);
        Drink fanta = new Drink(3, 500, "Fanta", 1.5);

        Topic test = new Topic(1,400,"Test","TestDesc");

        Menu hamburger = new Menu("Hamburguesas");
        Menu drink = new Menu("Bebidas");
        Menu carrito = new Menu("Carro de compras");
        Menu topic = new Menu("Topic");

        hamburger.addMenuBurger(clasic);
        hamburger.addMenuBurger(doble);
        hamburger.addMenuBurger(veggie);
        hamburger.addMenuBurger(prueba);
        drink.addMenuDrink(cola);
        drink.addMenuDrink(sprite);
        drink.addMenuDrink(fanta);

        topic.addMenuTopic(test); //acompaniamientos.addMenuAcomp

        //Inicio
        
        int i = 1;
        while (i != 0) {
            String nombre = JOptionPane.showInputDialog(null,"Ingresa tu nombre");
            usuario.setName(nombre);
            String numero = JOptionPane.showInputDialog(null,"Ingresa tu número");
            usuario.setPhone(numero);
            int input = JOptionPane.showConfirmDialog(null, "Confirma si tus datos son correctos:\n " +
                    "Eres: "+
                    nombre+ " " +
                    "\nNúmero: "+
                    numero, "CONFIRMACIÓN", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            i = input;
        }
        
        System.out.println("Te damos la bienvenida a la aplicación, "+usuario.getName()+".");
        Scanner sc = new Scanner(System.in);
        System.out.println("BurgerApp\n");
        System.out.println("SISTEMA DE PEDIDOS:");

        System.out.println("¿DESEA AGREGAR UNA HAMBURGUESA?");
        System.out.println("1 SI | 2 NO");

        int total = 0;

        int selection = sc.nextInt();
        
        if (selection == 1){

            System.out.println("Menú de hamburguesas:");
            hamburger.showMenuBurger();
            System.out.println("SALIR: 5");

                while (selection != 5){
                    
                    selection = sc.nextInt();
                    
                    if(selection == 1){
                        System.out.println("[+] "+clasic.getName());
                        carrito.addMenuBurger(clasic);
                        total += clasic.getPrice();
                    }
                    else if (selection == 2){
                        System.out.println("[+] "+doble.getName());
                        carrito.addMenuBurger(doble);
                        total += doble.getPrice();
                    }
                    else if (selection == 3){
                        System.out.println("[+] "+veggie.getName());
                        carrito.addMenuBurger(veggie);
                        total += veggie.getPrice();
                    } 
                    else if (selection > 5) {
                        System.out.println("¡Comprueba el número! [1-5]");
                    }

                }
                System.out.println("EN EL CARRO:");
                carrito.showMenuBurger();
                System.out.println("SUBTOTAL: "+total+"\n");
        }

        System.out.println("¿DESEA AGREGAR UNA BEBIDA?");
        System.out.println("1 SI | 2 NO");
        
        selection = sc.nextInt();
        
        if (selection == 1){
        
            System.out.println("Menú de bebidas:");
            drink.showMenuDrink();
            System.out.println("SALIR: 5");

                while (selection != 5){
                    
                    selection = sc.nextInt();
                    
                    if(selection == 1){
                        System.out.println("[+] "+cola.getName());
                        carrito.addMenuDrink(cola);
                        total += cola.getPrice();
                    }
                    else if (selection == 2){
                        System.out.println("[+] "+sprite.getName());
                        carrito.addMenuDrink(sprite);
                        total += sprite.getPrice();
                    }
                    else if (selection == 3){
                        System.out.println("[+] "+fanta.getName());
                        carrito.addMenuDrink(fanta);
                        total += fanta.getPrice();
                    } 
                    else if (selection > 5) {
                        System.out.println("¡Comprueba el número! [1-5]");
                    }

                }
                System.out.println("EN EL CARRO:");
                carrito.showMenuDrink();
        }

        System.out.println("\nTICKET:");
        carrito.showMenuBurger();
        carrito.showMenuDrink();
        System.out.println("SUBTOTAL: "+total);
        int totalNeto = (total/21) + total;
        System.out.println("TOTAL: "+totalNeto);
        sc.close();
    }
    
}

