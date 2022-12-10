/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.java.proyect;

/**
 *
 * @author agusc
 */
import java.util.ArrayList;
import java.util.List;

public class Menu {
    
    //ATRIBUTOS
    private String nombre;
    private List<Burger> menuBurger;
    private List<Drink> menuDrink;
    private List<Topic> menuTopic;

    //CONSTRUCTORES
    public Menu(){
    }

    public Menu(String nombre){
        this.nombre = nombre;
        menuBurger = new ArrayList<Burger>();
        menuDrink = new ArrayList<Drink>();
        menuTopic = new ArrayList<Topic>();
    }

    //MÉTODOS
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void addMenuDrink(Drink i){
        menuDrink.add(i);
    }

    public void remMenuBurger(Drink i){
        menuDrink.remove(i);
    }

    public void addMenuBurger(Burger j){
        menuBurger.add(j);
    }

    public void remMenuBurger(Burger j){
        menuBurger.remove(j);
    }
    public void addMenuTopic(Topic x){
        menuTopic.add(x);
    }

    public void remMenuTopic(Topic j){
        menuTopic.remove(j);
    }

    public void showMenuBurger(){

        for (Burger i : menuBurger) {
            System.out.print(i.getIndex()+": ");
            System.out.print(i.getName());
            System.out.print("  $ ");
            System.out.println(i.getPrice());
            System.out.print("Contiene: ");
            System.out.println(i.getDesc());
            System.out.println("");
        }
    }

    public void showMenuDrink(){

        for (Drink i : menuDrink) {
            System.out.print(i.getIndex()+": ");
            System.out.print(i.getName());
            System.out.print("  $ ");
            System.out.println(i.getPrice());
            System.out.print("Tamaño: ");
            System.out.println(i.getSize()+" L");
            System.out.println("");
        }
    }

/*   public burger addCart(String name){

        burger encontrado = null;

        for (burger i : menus){
          
            if (i.getName() == name){
                return i;
            }
        }
        return encontrado;
    }*/ 

}

