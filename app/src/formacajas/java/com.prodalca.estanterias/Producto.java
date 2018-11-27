package com.prodalca.estanterias;

/**
 * Created by Andres on 21/12/2016.
 */

public class Producto {

    //declaración de atributos
    private String nombre, ref, unidad;
    private Double precio;

    //declaración de constructor
    public Producto(String nombre, Double precio, String ref, String unidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.ref = ref;
        this.unidad = unidad;
    }

    //declaración de métodos
    public String getNombre(){
        return this.nombre;
    }
    public Double getPrecio(){
        return this.precio;
    }
    public String getRef(){
        return this.ref;
    }
    public String getUnidad(){
        return this.unidad;
    }

    public Double precioProd() { return Double.valueOf(precio);}

    public void actPrecio(Double nuevoPrecio) { this.precio = nuevoPrecio;}

    // Estanteria canastillas (convencional)

    public static Producto paral_090 = new Producto("Parales 0,90 m",   12706.0, "TL088", "Unidad");
    public static Producto paral_146 = new Producto("Parales 1,46 m",   18063.0, "TL145", "Unidad");
    public static Producto paral_194 = new Producto("Parales 1,94 m",   21279.0, "TL099", "Unidad");
    public static Producto paral_240 = new Producto("Parales 2,40 m",   32459.0, "TL013", "Unidad");
    public static Producto cuadro_u = new Producto("Cuadro unión",      22580.0, "TL100", "Unidad");
    public static Producto travesano = new Producto("Travesaño",        7501.0, "TL146", "Unidad");

    public static Producto bota_cuadrada = new Producto("Bota cuadrada de 3/4", 126.0, "MP065", "Unidad");
    public static Producto tapon_cuadrado = new Producto("Tapon de 3/4",        126.0, "MP097", "Unidad");

    public static Producto cuadro_u_doble = new Producto("Cuadro union doble",      34551.0, "TL158", "Unidad");
    public static Producto travesano_doble = new Producto("Travesaños dobles",      11266.0, "TL159", "Unidad");
    public static Producto cuadro_u_costado = new Producto("Cuadro unión costado",  26790.0, "TL171", "Unidad");
    public static Producto travesano_costado = new Producto("Travesaño costado",    7195.0, "TL170", "Unidad");

    // TODO: These items are producing different values in the result!! Consider to change the type of the variable
    // Take a look atthe following link
    // https://javarevisited.blogspot.com/2012/02/java-mistake-1-using-float-and-double.html
    public static Producto cuadro_ext_est_m_1 = new Producto("Cuadro ext. est. m. de 1", 56333.0, "TL021", "Unidad");
    public static Producto cuadro_ext_est_m_2 = new Producto("Cuadro ext. est. m. de 2", 81119.0, "TL027", "Unidad");
    public static Producto cuadro_ext_est_m_3 = new Producto("Cuadro ext. est. m. de 3", 104404.0, "TL033", "Unidad");
    public static Producto cuadro_ext_est_m_4 = new Producto("Cuadro ext. est. m. de 4", 118675.0, "TL034", "Unidad");
    public static Producto cuadro_ext_est_m_5 = new Producto("Cuadro ext. est. m. de 5", 144212.0, "TL054", "Unidad");

    public static Producto travesano_extension_modular = new Producto("Travesaño extensión modular", 10715.0, "TL041", "Unidad");

    public static Producto canastilla_13_cm_perforada = new Producto("Canastilla 13 cm perforada",  15100.0, "", "Unidad");
    public static Producto canastilla_13_cm_cerrada = new Producto("Canastilla 13 cm cerrada",      17900.0, "", "Unidad");
    public static Producto canastilla_18_cm_perforada = new Producto("Canastilla 18 cm perforada",  16900.0, "", "Unidad");
    public static Producto canastilla_18_cm_cerrada = new Producto("Canastilla 18 cm cerrada",      19400.0, "", "Unidad");
    public static Producto canastilla_25_cm_perforada = new Producto("Canastilla 25 cm perforada",  18800.0, "", "Unidad");
    public static Producto canastilla_25_cm_cerrada = new Producto("Canastilla 25 cm cerrada",      22800.0, "", "Unidad");
    public static Producto canastilla_33_cm_perforada = new Producto("Canastilla 33 cm perforada",  25100.0, "", "Unidad");
    public static Producto canastilla_33_cm_cerrada = new Producto("Canastilla 33 cm cerrada",      33400.0, "", "Unidad");
    public static Producto canastilla_41_cm_perforada = new Producto("Canastilla 41 cm perforada",  28100.0, "", "Unidad");
    public static Producto canastilla_41_cm_cerrada = new Producto("Canastilla 41 cm cerrada",      34600.0, "", "Unidad");

    public static Producto tapa_normatizada = new Producto("Tapa normatizada", 15850.0, "", "Unidad");

    // Estanteria canastillas (acero inoxidable)

    public static Producto paral_090_inox = new Producto("Parales 0,90 m", 61582.0, "", "Unidad");
    public static Producto paral_146_inox = new Producto("Parales 1,46 m", 61582.0, "", "Unidad");
    public static Producto paral_194_inox = new Producto("Parales 1,94 m", 61582.0, "", "Unidad");
    public static Producto paral_240_inox = new Producto("Parales 2,40 m", 97976.0, "", "Unidad");

    public static Producto cuadro_u_inox = new Producto("Cuadro unión inoxidable",  68598.0, "", "Unidad");
    public static Producto travesano_inox = new Producto("Travesaño inoxidable",    13252.0, "", "Unidad");

    // Estanteria carga

    public static Producto paral_194_carga = new Producto("Paral carga 1,94 m", 27938.0, "TL147", "Unidad");
    public static Producto paral_240_carga = new Producto("Paral carga 2,40 m", 37438.0, "TL111", "Unidad");

    public static Producto cuadro_carga_40_90 = new Producto("Cuadro carga de 40 x 90",     48717.0, "TL108", "Unidad");
    public static Producto cuadro_carga_52_90 = new Producto("Cuadro carga de 52 x 90",     53350.0, "TL151", "Unidad");
    public static Producto cuadro_carga_60_90 = new Producto("Cuadro carga de 60 x 90",     54754.0, "TL140", "Unidad");
    public static Producto cuadro_carga_70_90 = new Producto("Cuadro carga de 70 x 90",     68793.0, "TL107", "Unidad");
    public static Producto cuadro_carga_60_120 = new Producto("Cuadro carga de 60 x 1,20",  78902.0, "TL152", "Unidad");

    public static Producto tapon_rectangular = new Producto("Tapon rectangular de 20 x 40", 199.0, "MP282", "Unidad");

    // Estanteria carga (inoxidable)

    public static Producto paral_194_carga_inox = new Producto("Paral carga 1,94 m inox",      108353.0, "", "Unidad");
    public static Producto paral_240_carga_inox = new Producto("Paral carga 2,40 m inox",      108353.0, "", "Unidad");
    public static Producto cuadro_carga_60_90_I = new Producto("Cuadro carga de 60 x 90 Inox", 230738.0, "", "Unidad");

    // Tonilleria (comun)

    public static Producto tornillos_40 = new Producto("Tornillos Hex de 6 x 40", 265.0, "MP088", "Unidad");
    public static Producto tornillos_60 = new Producto("Tornillos Hex de 6 x 60", 385.0, "MP279", "Unidad");
    public static Producto tornillos_80 = new Producto("Tornillos Hex de 6 x 80", 503.0, "MP293", "Unidad");
    public static Producto tuerca_lujo = new Producto("Tuerca lujo ciega de 6mm", 147.0, "MP294", "Unidad");

    // Tornilleria (inoxidable)

    public static Producto tornillos_40_inox = new Producto("Tornillos 6 x 40 inox", 491.0, "MP277", "Unidad");
    public static Producto tornillos_60_inox = new Producto("Tornillos 6 x 60 inox", 710.0, "MP278", "Unidad");
    public static Producto tornillos_80_inox = new Producto("Tornillos 6 x 80 inox", 908.0, "MP295", "Unidad");
    public static Producto tuerca_inox = new Producto("Tuerca de 6 mm inox",         143.0, "MP275", "Unidad");

}