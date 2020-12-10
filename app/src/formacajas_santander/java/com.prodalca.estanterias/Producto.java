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

    public static Producto paral_090 = new Producto("Parales 0,90 m",   14675.0, "TL088", "Unidad");
    public static Producto paral_146 = new Producto("Parales 1,46 m",   20863.0, "TL145", "Unidad");
    public static Producto paral_194 = new Producto("Parales 1,94 m",   24577.0, "TL099", "Unidad");
    public static Producto paral_240 = new Producto("Parales 2,40 m",   37490.0, "TL013", "Unidad");
    public static Producto cuadro_u = new Producto("Cuadro unión",      26079.0, "TL100", "Unidad");
    public static Producto travesano = new Producto("Travesaño",        8664.0, "TL146", "Unidad");

    public static Producto bota_cuadrada = new Producto("Bota cuadrada de 3/4", 145.0, "MP065", "Unidad");
    public static Producto tapon_cuadrado = new Producto("Tapon de 3/4",        145.0, "MP097", "Unidad");

    public static Producto cuadro_u_doble = new Producto("Cuadro union doble",      39907.0, "TL158", "Unidad");
    public static Producto travesano_doble = new Producto("Travesaños dobles",      13013.0, "TL159", "Unidad");
    public static Producto cuadro_u_costado = new Producto("Cuadro unión costado",  30942.0, "TL171", "Unidad");
    public static Producto travesano_costado = new Producto("Travesaño costado",    8309.0, "TL170", "Unidad");

    // TODO: These items are producing different values in the result!! Consider to change the type of the variable
    // Take a look atthe following link
    // https://javarevisited.blogspot.com/2012/02/java-mistake-1-using-float-and-double.html
    public static Producto cuadro_ext_est_m_1 = new Producto("Cuadro ext. est. m. de 1",  65065.0, "TL021", "Unidad");
    public static Producto cuadro_ext_est_m_2 = new Producto("Cuadro ext. est. m. de 2",  93693.0, "TL027", "Unidad");
    public static Producto cuadro_ext_est_m_3 = new Producto("Cuadro ext. est. m. de 3", 120586.0, "TL033", "Unidad");
    public static Producto cuadro_ext_est_m_4 = new Producto("Cuadro ext. est. m. de 4", 137070.0, "TL034", "Unidad");
    public static Producto cuadro_ext_est_m_5 = new Producto("Cuadro ext. est. m. de 5", 166565.0, "TL054", "Unidad");

    public static Producto travesano_extension_modular = new Producto("Travesaño extensión modular", 12377.0, "TL041", "Unidad");

    public static Producto canastilla_13_cm_perforada = new Producto("Canastilla 13 cm perforada",  16610.0, "", "Unidad");
    public static Producto canastilla_13_cm_cerrada = new Producto("Canastilla 13 cm cerrada",      19690.0, "", "Unidad");
    public static Producto canastilla_18_cm_perforada = new Producto("Canastilla 18 cm perforada",  18590.0, "", "Unidad");
    public static Producto canastilla_18_cm_cerrada = new Producto("Canastilla 18 cm cerrada",      21340.0, "", "Unidad");
    public static Producto canastilla_25_cm_perforada = new Producto("Canastilla 25 cm perforada",  20680.0, "", "Unidad");
    public static Producto canastilla_25_cm_cerrada = new Producto("Canastilla 25 cm cerrada",      25080.0, "", "Unidad");
    public static Producto canastilla_33_cm_perforada = new Producto("Canastilla 33 cm perforada",  27610.0, "", "Unidad");
    public static Producto canastilla_33_cm_cerrada = new Producto("Canastilla 33 cm cerrada",      36740.0, "", "Unidad");
    public static Producto canastilla_41_cm_perforada = new Producto("Canastilla 41 cm perforada",  30910.0, "", "Unidad");
    public static Producto canastilla_41_cm_cerrada = new Producto("Canastilla 41 cm cerrada",      38060.0, "", "Unidad");

    public static Producto tapa_normatizada = new Producto("Tapa normatizada", 17435.0, "", "Unidad");

    // Estanteria canastillas (acero inoxidable)

    public static Producto paral_090_inox = new Producto("Parales 0,90 m",  71127.0, "", "Unidad");
    public static Producto paral_146_inox = new Producto("Parales 1,46 m",  71127.0, "", "Unidad");
    public static Producto paral_194_inox = new Producto("Parales 1,94 m",  71127.0, "", "Unidad");
    public static Producto paral_240_inox = new Producto("Parales 2,40 m", 113163.0, "", "Unidad");

    public static Producto cuadro_u_inox = new Producto("Cuadro unión inoxidable",  79230.0, "", "Unidad");
    public static Producto travesano_inox = new Producto("Travesaño inoxidable",    15307.0, "", "Unidad");

    // Estanteria carga

    public static Producto paral_194_carga = new Producto("Paral carga 1,94 m", 32269.0, "TL147", "Unidad");
    public static Producto paral_240_carga = new Producto("Paral carga 2,40 m", 43241.0, "TL111", "Unidad");

    public static Producto cuadro_carga_40_90 = new Producto("Cuadro carga de 40 x 90",     56268.0, "TL108", "Unidad");
    public static Producto cuadro_carga_52_90 = new Producto("Cuadro carga de 52 x 90",     61619.0, "TL151", "Unidad");
    public static Producto cuadro_carga_60_90 = new Producto("Cuadro carga de 60 x 90",     63240.0, "TL140", "Unidad");
    public static Producto cuadro_carga_70_90 = new Producto("Cuadro carga de 70 x 90",     79456.0, "TL107", "Unidad");
    public static Producto cuadro_carga_60_120 = new Producto("Cuadro carga de 60 x 1,20",  91132.0, "TL152", "Unidad");

    public static Producto tapon_rectangular = new Producto("Tapon rectangular de 20 x 40", 230.0, "MP282", "Unidad");

    // Estanteria carga (inoxidable)

    public static Producto paral_194_carga_inox = new Producto("Paral carga 1,94 m inox",      125148.0, "", "Unidad");
    public static Producto paral_240_carga_inox = new Producto("Paral carga 2,40 m inox",      125148.0, "", "Unidad");
    public static Producto cuadro_carga_60_90_I = new Producto("Cuadro carga de 60 x 90 Inox", 266503.0, "", "Unidad");

    // Tonilleria (comun)

    public static Producto tornillos_40 = new Producto("Tornillos Hex de 6 x 40", 307.0, "MP088", "Unidad");
    public static Producto tornillos_60 = new Producto("Tornillos Hex de 6 x 60", 444.0, "MP279", "Unidad");
    public static Producto tornillos_80 = new Producto("Tornillos Hex de 6 x 80", 582.0, "MP293", "Unidad");
    public static Producto tuerca_lujo = new Producto("Tuerca lujo ciega de 6mm", 169.0, "MP294", "Unidad");

    // Tornilleria (inoxidable)

    public static Producto tornillos_40_inox = new Producto("Tornillos 6 x 40 inox", 567.0, "MP277", "Unidad");
    public static Producto tornillos_60_inox = new Producto("Tornillos 6 x 60 inox", 821.0, "MP278", "Unidad");
    public static Producto tornillos_80_inox = new Producto("Tornillos 6 x 80 inox",1049.0, "MP295", "Unidad");
    public static Producto tuerca_inox = new Producto("Tuerca de 6 mm inox",         165.0, "MP275", "Unidad");

}