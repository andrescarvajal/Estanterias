package com.prodalca.estanterias;

/**
 * Created by Andres on 31/10/2018.
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


    public String precioProd() {
        return String.valueOf(precio);
    }

    public void actPrecio(Double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    // Estanteria canastillas (convencional)

    public static Producto paral_090 = new Producto("Parales 0,90 m",   13341.0, "TL088", "Unidad");
    public static Producto paral_146 = new Producto("Parales 1,46 m",   18966.0, "TL145", "Unidad");
    public static Producto paral_194 = new Producto("Parales 1,94 m",   22343.0, "TL099", "Unidad");
    public static Producto paral_240 = new Producto("Parales 2,40 m",   34082.0, "TL013", "Unidad");
    public static Producto cuadro_u = new Producto("Cuadro unión",      23708.0, "TL100", "Unidad");
    public static Producto travesano = new Producto("Travesaño",        7876.0, "TL146", "Unidad");

    public static Producto bota_cuadrada = new Producto("Bota cuadrada de 3/4", 132.0, "MP065", "Unidad");
    public static Producto tapon_cuadrado = new Producto("Tapon de 3/4",        132.0, "MP097", "Unidad");

    public static Producto cuadro_u_doble = new Producto("Cuadro union doble",      36279.0, "TL158", "Unidad");
    public static Producto travesano_doble = new Producto("Travesaños dobles",      11830.0, "TL159", "Unidad");
    public static Producto cuadro_u_costado = new Producto("Cuadro unión costado",  28129.0, "TL171", "Unidad");
    public static Producto travesano_costado = new Producto("Travesaño costado",     7554.0, "TL170", "Unidad");

    // TODO: These items are producing different values in the result!! Consider to change the type of the variable
    // Take a look atthe following link
    // https://javarevisited.blogspot.com/2012/02/java-mistake-1-using-float-and-double.html
    public static Producto cuadro_ext_est_m_1 = new Producto("Cuadro ext. est. m. de 1",  59150.0, "TL021", "Unidad");
    public static Producto cuadro_ext_est_m_2 = new Producto("Cuadro ext. est. m. de 2",  85175.0, "TL027", "Unidad");
    public static Producto cuadro_ext_est_m_3 = new Producto("Cuadro ext. est. m. de 3", 109624.0, "TL033", "Unidad");
    public static Producto cuadro_ext_est_m_4 = new Producto("Cuadro ext. est. m. de 4", 124609.0, "TL034", "Unidad");
    public static Producto cuadro_ext_est_m_5 = new Producto("Cuadro ext. est. m. de 5", 151423.0, "TL054", "Unidad");

    public static Producto travesano_extension_modular = new Producto("Travesaño extensión modular", 11251.0, "TL041", "Unidad");

    public static Producto canastilla_13_cm_perforada = new Producto("Canastilla 13 cm perforada",  12500.0, "", "Unidad");
    public static Producto canastilla_13_cm_cerrada = new Producto("Canastilla 13 cm cerrada",      15000.0, "", "Unidad");
    public static Producto canastilla_18_cm_perforada = new Producto("Canastilla 18 cm perforada",  14500.0, "", "Unidad");
    public static Producto canastilla_18_cm_cerrada = new Producto("Canastilla 18 cm cerrada",      19400.0, "", "Unidad");
    public static Producto canastilla_25_cm_perforada = new Producto("Canastilla 25 cm perforada",  16000.0, "", "Unidad");
    public static Producto canastilla_25_cm_cerrada = new Producto("Canastilla 25 cm cerrada",      19000.0, "", "Unidad");
    public static Producto canastilla_33_cm_perforada = new Producto("Canastilla 33 cm perforada",  25100.0, "", "Unidad");
    public static Producto canastilla_33_cm_cerrada = new Producto("Canastilla 33 cm cerrada",      33400.0, "", "Unidad");
    public static Producto canastilla_41_cm_perforada = new Producto("Canastilla 41 cm perforada",  36379.0, "", "Unidad");
    public static Producto canastilla_41_cm_cerrada = new Producto("Canastilla 41 cm cerrada",      44794.0, "", "Unidad");

    public static Producto tapa_normatizada = new Producto("Tapa normatizada", 13000.0, "", "Unidad");

    // Estanteria canastillas (acero inoxidable)

    public static Producto paral_090_inox = new Producto("Parales 0,90 m",  64661.0, "", "Unidad");
    public static Producto paral_146_inox = new Producto("Parales 1,46 m",  64661.0, "", "Unidad");
    public static Producto paral_194_inox = new Producto("Parales 1,94 m",  64661.0, "", "Unidad");
    public static Producto paral_240_inox = new Producto("Parales 2,40 m", 102875.0, "", "Unidad");

    public static Producto cuadro_u_inox = new Producto("Cuadro unión inoxidable",  72027.0, "", "Unidad");
    public static Producto travesano_inox = new Producto("Travesaño inoxidable",    13915.0, "", "Unidad");

    // Estanteria carga

    public static Producto paral_194_carga = new Producto("Paral carga 1,94 m", 29335.0, "TL147", "Unidad");
    public static Producto paral_240_carga = new Producto("Paral carga 2,40 m", 39310.0, "TL111", "Unidad");

    public static Producto cuadro_carga_40_90 = new Producto("Cuadro carga de 40 x 90",     51153.0, "TL108", "Unidad");
    public static Producto cuadro_carga_52_90 = new Producto("Cuadro carga de 52 x 90",     56017.0, "TL151", "Unidad");
    public static Producto cuadro_carga_60_90 = new Producto("Cuadro carga de 60 x 90",     57491.0, "TL140", "Unidad");
    public static Producto cuadro_carga_70_90 = new Producto("Cuadro carga de 70 x 90",     72233.0, "TL107", "Unidad");
    public static Producto cuadro_carga_60_120 = new Producto("Cuadro carga de 60 x 1,20",  82847.0, "TL152", "Unidad");

    public static Producto tapon_rectangular = new Producto("Tapon rectangular de 20 x 40", 209.0, "MP282", "Unidad");

    // Estanteria carga (inoxidable)

    public static Producto paral_194_carga_inox = new Producto("Paral carga 1,94 m inox",      113771.0, "", "Unidad");
    public static Producto paral_240_carga_inox = new Producto("Paral carga 2,40 m inox",      113771.0, "", "Unidad");
    public static Producto cuadro_carga_60_90_I = new Producto("Cuadro carga de 60 x 90 Inox", 242275.0, "", "Unidad");

    // Tonilleria (comun)

    public static Producto tornillos_40 = new Producto("Tornillos Hex de 6 x 40", 279.0, "MP088", "Unidad");
    public static Producto tornillos_60 = new Producto("Tornillos Hex de 6 x 60", 404.0, "MP279", "Unidad");
    public static Producto tornillos_80 = new Producto("Tornillos Hex de 6 x 80", 529.0, "MP293", "Unidad");
    public static Producto tuerca_lujo = new Producto("Tuerca lujo ciega de 6mm", 154.0, "MP294", "Unidad");

    // Tornilleria (inoxidable)

    public static Producto tornillos_40_inox = new Producto("Tornillos 6 x 40 inox", 515.0, "MP277", "Unidad");
    public static Producto tornillos_60_inox = new Producto("Tornillos 6 x 60 inox", 746.0, "MP278", "Unidad");
    public static Producto tornillos_80_inox = new Producto("Tornillos 6 x 80 inox", 954.0, "MP295", "Unidad");
    public static Producto tuerca_inox = new Producto("Tuerca de 6 mm inox",         150.0, "MP275", "Unidad");
}