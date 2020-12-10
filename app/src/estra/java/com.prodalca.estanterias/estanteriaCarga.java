package com.prodalca.estanterias;

/**
 * Created by Andres on 29/12/2016.
 */

public class estanteriaCarga {

    //declaración de atributos
    private String altura, cuerpos, niveles, cuadro, modulos, fondo;
    private Boolean aceroInoxidable, instalacion;
    private int numNivelesMin, numNivelesMax;

    private int cant_parales, cant_tornillos_60,
            cant_tornillos_80, cant_tuerca_lujo, cant_tapon_rectangular;
    private float cant_cuadro;

    private Double precio_total_parales, precio_total_cuadro, precio_total_travesanos,
            precio_total_tornillos_60, precio_total_tornillos_80, precio_total_tuerca_lujo,
            precio_total_tapon_rectangular, precio_total_estanteria;

    //declaración de constructor
    public estanteriaCarga(String altura, String cuerpos, String niveles, String cuadro,
                                 String modulos, String fondo, Boolean aceroInoxidable, Boolean instalacion) {
        this.altura = altura;
        this.cuerpos = cuerpos;
        this.niveles = niveles;
        this.cuadro = cuadro;
        this.modulos = modulos;
        this.fondo = fondo;
        this.aceroInoxidable = aceroInoxidable;
        this.instalacion = instalacion;
        this.numNivelesMin = 2;
        this.numNivelesMax = 13;

        this.cant_parales = 0;
        this.cant_cuadro = 0;
        this.cant_tornillos_60 = 0;
        this.cant_tornillos_80 = 0;
        this.cant_tuerca_lujo = 0;
        this.cant_tapon_rectangular = 0;

        this.precio_total_parales = 0.0;
        this.precio_total_cuadro = 0.0;
        this.precio_total_travesanos = 0.0;
        this.precio_total_tornillos_60 = 0.0;
        this.precio_total_tornillos_80 = 0.0;
        this.precio_total_tuerca_lujo = 0.0;
        this.precio_total_tapon_rectangular = 0.0;

        this.precio_total_estanteria = 0.0;
    }

    //declaración de métodos

    public String getAltura(){
        return this.altura;
    }
    public String getCuerpos(){
        return this.cuerpos;
    }
    public String getNiveles(){
        return this.niveles;
    }
    public String getCuadro(){ return this.cuadro; }
    public String getModulos() { return this.modulos; }
    public String getFondo() { return this.fondo; }
    public Boolean getAceroInoxidable() { return this.aceroInoxidable; }
    public int getNumNivelesMin() { return this.numNivelesMin; }
    public int getNumNivelesMax() { return this.numNivelesMax; }

    public int getCantParales(){
        return this.cant_parales;
    }
    public float getCantCuadro(){
        return this.cant_cuadro;
    }
    public int getCantTornillos60(){
        return this.cant_tornillos_60;
    }
    public int getCantTornillos80(){
        return this.cant_tornillos_80;
    }
    public int getCantTuercaLujo(){
        return this.cant_tuerca_lujo;
    }
    public int getCantTaponRectangular(){
        return this.cant_tapon_rectangular;
    }

    public Double getPrecioTotalParales(){
        return this.precio_total_parales;
    }
    public Double getPrecioTotalCuadro(){
        return this.precio_total_cuadro;
    }
    public Double getPrecioTotalTravesanos(){ return this.precio_total_travesanos; }
    public Double getPrecioTotalTornillos60(){
        return this.precio_total_tornillos_60;
    }
    public Double getPrecioTotalTornillos80(){
        return this.precio_total_tornillos_80;
    }
    public Double getPrecioTotalTuercaLujo(){
        return this.precio_total_tuerca_lujo;
    }
    public Double getPrecioTotalTaponRectangular(){ return this.precio_total_tapon_rectangular; }
    public Double getPrecioTotalEstanteria(){
        return this.precio_total_estanteria;
    }

    public void actAltura(String nuevoAltura){ this.altura = nuevoAltura; }
    public void actCuerpos(String nuevoCuerpos){ this.cuerpos = nuevoCuerpos; }
    public void actNiveles(String nuevoNiveles){ this.niveles = nuevoNiveles; }

    public void actCuadro(int estado_caudro){
        if(estado_caudro == 0){
            this.cuadro = "40x90";
        }
        else if(estado_caudro == 1){
            this.cuadro = "52x90";
        }
        else if(estado_caudro == 2){
            this.cuadro = "60x90";
        }
        else if(estado_caudro == 3){
            this.cuadro = "70x90";
        }
        else if(estado_caudro == 4){
            this.cuadro = "60x120";
        }
        else if(estado_caudro == 5){ // Este estado solo se alcanza con el checkbox inoxidable
            this.cuadro = "60x90I";
        }
    }

    public void actModulos(String nuevoModulos) { this.modulos = nuevoModulos; }
    public void actFondo(String nuevoFondo) { this.fondo = nuevoFondo; }
    public void actAceroInoxidable(Boolean nuevoAceroInoxidable) { this.aceroInoxidable = nuevoAceroInoxidable; }

    public void actEstanteriaCanastillas(int estado) {
        if(estado == 0){
            this.altura = "1.94";
            this.numNivelesMin = 2;
            this.numNivelesMax = 13;
            this.niveles = "2";;
        }
        else if(estado == 1){
            this.altura = "2.40";
            this.numNivelesMin = 3;
            this.numNivelesMax = 16;
            this.niveles = "3";
        }
    }

    /* Todos los calculos estan hechos en unidades */

    public void calcularCantidades(Boolean acero_inoxidable){
        this.cant_parales =
                (Integer.valueOf(this.cuerpos) + 1) * Integer.valueOf(this.modulos) * 2 +
                (Integer.valueOf(this.cuerpos) + 1) * Integer.valueOf(this.modulos) * (Integer.valueOf(this.fondo) - 1);
        this.cant_cuadro =
                Integer.valueOf(this.niveles) *  Integer.valueOf(this.cuerpos) *
                Integer.valueOf(this.modulos) * Integer.valueOf(this.fondo);
        this.cant_tornillos_60 =
                8 * Integer.valueOf(this.niveles) * Integer.valueOf(this.modulos) *  Integer.valueOf(this.fondo) ;
        this.cant_tornillos_80 =
                4 * Integer.valueOf(this.niveles) * (Integer.valueOf(this.cuerpos) - 1) *
                Integer.valueOf(this.modulos) *  Integer.valueOf(this.fondo);
        this.cant_tuerca_lujo =
                Integer.valueOf(this.cant_tornillos_60) + Integer.valueOf(this.cant_tornillos_80);
        this. cant_tapon_rectangular =
                4 * (Integer.valueOf(this.cuerpos) + 1) * Integer.valueOf(this.modulos) +
                2 * (Integer.valueOf(this.cuerpos) + 1) * Integer.valueOf(this.modulos) * (Integer.valueOf(this.fondo) - 1);

        /* No es necesario calcular las cantidades de algunos elementos pues ya estas son dadas
         * directamente. Por lo tanto se calcula directo el precio total
         */

    }

    public void calcularPrecio(Boolean acero_inoxidable) {

        if (acero_inoxidable == false) {
            if (this.altura == "1.94") {
                this.precio_total_parales = this.cant_parales * Producto.paral_194_carga.getPrecio();
            } else if (this.altura == "2.40") {
                this.precio_total_parales = this.cant_parales * Producto.paral_240_carga.getPrecio();
            }
        } else { // acero_inoxidable == true
            if (this.altura == "1.94") {
                this.precio_total_parales = this.cant_parales * Producto.paral_194_carga_inox.getPrecio();
            } else if (this.altura == "2.40") {
                this.precio_total_parales = this.cant_parales * Producto.paral_240_carga_inox.getPrecio();
            }
        }

        if (acero_inoxidable == false) {
            if (this.cuadro == "40x90") {
                this.precio_total_cuadro = this.cant_cuadro * Producto.cuadro_carga_40_90.getPrecio();
            }
            if (this.cuadro == "52x90") {
                this.precio_total_cuadro = this.cant_cuadro * Producto.cuadro_carga_52_90.getPrecio();
            }
            if (this.cuadro == "60x90") {
                this.precio_total_cuadro = this.cant_cuadro * Producto.cuadro_carga_60_90.getPrecio();
            }
            if (this.cuadro == "70x90") {
                this.precio_total_cuadro = this.cant_cuadro * Producto.cuadro_carga_70_90.getPrecio();
            }
            if (this.cuadro == "60x120") {
                this.precio_total_cuadro = this.cant_cuadro * Producto.cuadro_carga_60_120.getPrecio();
            }

        } else { // acero_inoxidable == true
            if (this.cuadro == "60x90I") {
                this.precio_total_cuadro = this.cant_cuadro * Producto.cuadro_carga_60_90_I.getPrecio();
            }
        }


        if (acero_inoxidable == false) {
            this.precio_total_tornillos_60 = this.cant_tornillos_60 * Producto.tornillos_60.getPrecio();
        } else { // acero_inoxidable == true
            this.precio_total_tornillos_60 = this.cant_tornillos_60 * Producto.tornillos_60_inox.getPrecio();
        }

        if (acero_inoxidable == false) {
            this.precio_total_tornillos_80 = this.cant_tornillos_80 * Producto.tornillos_80.getPrecio();
        } else { // acero_inoxidable == true
            this.precio_total_tornillos_80 = this.cant_tornillos_80 * Producto.tornillos_80_inox.getPrecio();
        }

        if (acero_inoxidable == false) {
            this.precio_total_tuerca_lujo = this.cant_tuerca_lujo * Producto.tuerca_lujo.getPrecio();
        } else { // acero_inoxidable == true
            this.precio_total_tuerca_lujo = this.cant_tuerca_lujo * Producto.tuerca_inox.getPrecio();
        }

        this.precio_total_tapon_rectangular = this.cant_tapon_rectangular * Producto.tapon_rectangular.getPrecio();

        this.precio_total_estanteria = this.precio_total_parales + this.precio_total_cuadro +
                        this.precio_total_tornillos_60 + this.precio_total_tornillos_80 +
                        this.precio_total_tuerca_lujo + this.precio_total_tapon_rectangular;
    }

    public void adicionInstalacion(Boolean instalacion){

        // Si se selecciona el campo instalacion entonces se adiciona el 5.0% al precio de la estanteria
        if(instalacion == true){
            this.precio_total_estanteria = this.precio_total_estanteria * 1.05;
        }

    }

    // It gives format to the price to be displayed
    public String formatoPrecio(Double precio_num){
        // The "part of interest" of the number is stored (with two decimal positions)
        String precio_string_complete = String.format("%.2f", precio_num);
        String decimal_part = "";
        if (precio_string_complete != null && precio_string_complete.length() >= 2) {
            decimal_part = precio_string_complete.substring(precio_string_complete.length() - 2);
        }

        // Only the integer part is stored
        String precio_string_int = String.format("%.0f", precio_num);

        // Initially, temp_precio is empty
        String temp_precio = "";
        for(int i = 1; i < precio_string_int.length() + 1; i++) {
            // It goes through the whole input string and adds a point every third number
            temp_precio = temp_precio.concat(String.valueOf(precio_string_int.charAt((precio_string_int.length() - i))));
            if(i % 3 == 0 && i != precio_string_int.length()){
                temp_precio = temp_precio.concat(".");
            }
        }
        // The result string is inverted and must be reversed to be displayed
        return reverse(temp_precio) + "," + decimal_part;
    }

    // This function reverses the elements of the string
    public static String reverse(String input){
        char[] in = input.toCharArray();
        int begin = 0;
        int end= in.length - 1;
        char temp;
        while(end > begin){
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

}
