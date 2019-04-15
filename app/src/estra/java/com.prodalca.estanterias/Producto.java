package com.prodalca.estanterias;

/**
 * Created by Andres on 21/12/2016.
 */

public class Producto {

    //declaración de atributos
    private String nombre, ref, unidad;

    /* TODO : There is a problem with the exponential representation of double variables. The
    / applicacation of these variables in financial fields can lead to problems in the calculations.
    / Take a look atthe following link:
    / https://javarevisited.blogspot.com/2012/02/java-mistake-1-using-float-and-double.html
    /
    / Note that the prices are limited to some value and after that they lost precision.
    / Something beyond this length in a value 99.999.999.955.566,05
    */
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

    public static Producto paral_090 = new Producto("Parales 0,90 m",   11654.0, "TL088", "Unidad");
    public static Producto paral_146 = new Producto("Parales 1,46 m",   16568.0, "TL145", "Unidad");
    public static Producto paral_194 = new Producto("Parales 1,94 m",   19517.0, "TL099", "Unidad");
    public static Producto paral_240 = new Producto("Parales 2,40 m",   29772.0, "TL013", "Unidad");
    public static Producto cuadro_u = new Producto("Cuadro unión",      20710.0, "TL100", "Unidad");
    public static Producto travesano = new Producto("Travesaño",         6880.0, "TL146", "Unidad");

    public static Producto bota_cuadrada = new Producto("Bota cuadrada de 3/4", 116.0, "MP065", "Unidad");
    public static Producto tapon_cuadrado = new Producto("Tapon de 3/4",        116.0, "MP097", "Unidad");

    public static Producto cuadro_u_doble = new Producto("Cuadro union doble",      31690.0, "TL158", "Unidad");
    public static Producto travesano_doble = new Producto("Travesaños dobles",      10334.0, "TL159", "Unidad");
    public static Producto cuadro_u_costado = new Producto("Cuadro unión costado",  24572.0, "TL171", "Unidad");
    public static Producto travesano_costado = new Producto("Travesaño costado",     6599.0, "TL170", "Unidad");

    public static Producto cuadro_ext_est_m_1 = new Producto("Cuadro ext. est. m. de 1", 51669.0, "TL021", "Unidad");
    public static Producto cuadro_ext_est_m_2 = new Producto("Cuadro ext. est. m. de 2", 74403.0, "TL027", "Unidad");
    public static Producto cuadro_ext_est_m_3 = new Producto("Cuadro ext. est. m. de 3", 95760.0, "TL033", "Unidad");
    public static Producto cuadro_ext_est_m_4 = new Producto("Cuadro ext. est. m. de 4", 108849.0, "TL034", "Unidad");
    public static Producto cuadro_ext_est_m_5 = new Producto("Cuadro ext. est. m. de 5", 132272.0, "TL054", "Unidad");

    public static Producto travesano_extension_modular = new Producto("Travesaño extensión modular", 9828.0, "TL041", "Unidad");

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

    public static Producto paral_090_inox = new Producto("Parales 0,90 m", 56483.0, "", "Unidad");
    public static Producto paral_146_inox = new Producto("Parales 1,46 m", 56483.0, "", "Unidad");
    public static Producto paral_194_inox = new Producto("Parales 1,94 m", 56483.0, "", "Unidad");
    public static Producto paral_240_inox = new Producto("Parales 2,40 m", 89864.0, "", "Unidad");

    public static Producto cuadro_u_inox = new Producto("Cuadro unión inoxidable",  62918.0, "", "Unidad");
    public static Producto travesano_inox = new Producto("Travesaño inoxidable",    12155.0, "", "Unidad");

    // Estanteria carga

    public static Producto paral_194_carga = new Producto("Paral carga 1,94 m", 25625.0, "TL147", "Unidad");
    public static Producto paral_240_carga = new Producto("Paral carga 2,40 m", 34339.0, "TL111", "Unidad");

    public static Producto cuadro_carga_40_90 = new Producto("Cuadro carga de 40 x 90",     44684.0, "TL108", "Unidad");
    public static Producto cuadro_carga_52_90 = new Producto("Cuadro carga de 52 x 90",     48933.0, "TL151", "Unidad");
    public static Producto cuadro_carga_60_90 = new Producto("Cuadro carga de 60 x 90",     50220.0, "TL140", "Unidad");
    public static Producto cuadro_carga_70_90 = new Producto("Cuadro carga de 70 x 90",     63097.0, "TL107", "Unidad");
    public static Producto cuadro_carga_60_120 = new Producto("Cuadro carga de 60 x 1,20",  72369.0, "TL152", "Unidad");

    public static Producto tapon_rectangular = new Producto("Tapon rectangular de 20 x 40", 183.0, "MP282", "Unidad");

    // Estanteria carga (inoxidable)

    public static Producto paral_194_carga_inox = new Producto("Paral carga 1,94 m inox",       99382.0, "", "Unidad");
    public static Producto paral_240_carga_inox = new Producto("Paral carga 2,40 m inox",       99382.0, "", "Unidad");
    public static Producto cuadro_carga_60_90_I = new Producto("Cuadro carga de 60 x 90 Inox", 211634.0, "", "Unidad");

    // Tonilleria (comun)

    public static Producto tornillos_40 = new Producto("Tornillos Hex de 6 x 40", 243.0, "MP088", "Unidad");
    public static Producto tornillos_60 = new Producto("Tornillos Hex de 6 x 60", 353.0, "MP279", "Unidad");
    public static Producto tornillos_80 = new Producto("Tornillos Hex de 6 x 80", 462.0, "MP293", "Unidad");
    public static Producto tuerca_lujo = new Producto("Tuerca lujo ciega de 6mm", 135.0, "MP294", "Unidad");

    // Tornilleria (inoxidable)

    public static Producto tornillos_40_inox = new Producto("Tornillos 6 x 40 inox", 450.0, "MP277", "Unidad");
    public static Producto tornillos_60_inox = new Producto("Tornillos 6 x 60 inox", 651.0, "MP278", "Unidad");
    public static Producto tornillos_80_inox = new Producto("Tornillos 6 x 80 inox", 833.0, "MP295", "Unidad");
    public static Producto tuerca_inox = new Producto("Tuerca de 6 mm inox",         131.0, "MP275", "Unidad");

}