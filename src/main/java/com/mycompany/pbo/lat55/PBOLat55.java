/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo.lat55;

/**
 *
 * @author lenovo
 */
public class PBOLat55 {

    private final String manufaktur = "Samsung";
    private final String os = "Android";
    private final String model = "Grand";
    private final int harga = 3000000;
    private final String androidKeyStore = "234ibfd3840fo";

    public void displayProduct() {
        System.out.println("Manufaktur: " + manufaktur);
        System.out.println("OS: " + os);
        System.out.println("Model: " + model);
        System.out.println("Harga: " + harga);
        System.out.println("Android Key Store: " + androidKeyStore);
    }

    public static void main(String[] args) {
        PBOLat55 hp = new PBOLat55();
        hp.displayProduct();

    }
}