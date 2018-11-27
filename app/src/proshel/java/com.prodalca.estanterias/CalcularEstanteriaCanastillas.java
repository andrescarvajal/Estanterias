package com.prodalca.estanterias;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

// This class is used to calculate the price of a given shelf
public class CalcularEstanteriaCanastillas extends AppCompatActivity implements OnClickListener, OnFocusChangeListener {

    // In the following, the elements associated to the user interface are declared
    // These are used by the user to introduce the properties of the shelf
    Button menosAltura;
    Button masAltura;
    TextView textoAlturaSelec;

    Button menosCuerpos;
    Button masCuerpos;
    TextView textoCuerposSelec;

    Button menosPosiciones;
    Button masPosiciones;
    TextView textoPosicionesSelec;

    Button menosCuadroU;
    Button masCuadroU;
    TextView textoCuadroUSelec;

    Button menosModulos;
    Button masModulos;
    TextView textoModulosSelec;

    Button calcularEstCanastillas;
    TextView textoResultado;

    // This creates an object of the class estanteriaCanastillas
    // The shelf starts with a configuration of 1,94 m "altura".
    estanteriaCanastillas estanteria = new estanteriaCanastillas("1.94", "1", "4", "3", "1", false, false);

    // This counters allow one to move around the possible values of the shelf characteristics
    int contador_altura = 2;
    int contador_cuerpos = Integer.valueOf(estanteria.getCuerpos());
    int contador_posiciones = Integer.valueOf(estanteria.getPosiciones());
    int contador_cuadro_u = Integer.valueOf(estanteria.getCuadroU());
    int contador_modulos = Integer.valueOf(estanteria.getModulos());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // The layout activity_calcular_estanteria_canastillas is associated here
        setContentView(R.layout.activity_calcular_estanteria_canastillas);

        TextView textView = new TextView(this);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_calcular_estanteria_canastillas);
        layout.addView(textView);

        // find the elements
        menosAltura = (Button) findViewById(R.id.menosAltura);
        masAltura = (Button) findViewById(R.id.masAltura);
        textoAlturaSelec = (TextView) findViewById(R.id.textoAlturaSelec);

        menosCuerpos = (Button) findViewById(R.id.menosCuerpos);
        masCuerpos = (Button) findViewById(R.id.masCuerpos);
        textoCuerposSelec = (TextView) findViewById(R.id.textoCuerposSelec);

        menosPosiciones = (Button) findViewById(R.id.menosPosiciones);
        masPosiciones = (Button) findViewById(R.id.masPosiciones);
        textoPosicionesSelec = (TextView) findViewById(R.id.textoPosicionesSelec);

        menosCuadroU = (Button) findViewById(R.id.menosCuadroU);
        masCuadroU = (Button) findViewById(R.id.masCuadroU);
        textoCuadroUSelec = (TextView) findViewById(R.id.textoCuadroUSelec);

        menosModulos = (Button) findViewById(R.id.menosModulos);
        masModulos = (Button) findViewById(R.id.masModulos);
        textoModulosSelec = (TextView) findViewById(R.id.textoModulosSelec);

        calcularEstCanastillas = (Button) findViewById(R.id.calcularEstCanastillas);
        textoResultado = (TextView) findViewById(R.id.textoResultado);

        // set a listener
        menosAltura.setOnClickListener(this);
        masAltura.setOnClickListener(this);

        menosCuerpos.setOnClickListener(this);
        masCuerpos.setOnClickListener(this);

        menosPosiciones.setOnClickListener(this);
        masPosiciones.setOnClickListener(this);

        menosCuadroU.setOnClickListener(this);
        masCuadroU.setOnClickListener(this);

        menosModulos.setOnClickListener(this);
        masModulos.setOnClickListener(this);

        /* Se hace este "setOnFocusChangeListener" con el fin de que con solo seleccionar una de
         * opciones de los campos de textos, el resultado total de la estanteria se borra.
         * Ver la funcion "onFocusChange". De este modo se obliga al usuario a actualizar el
         * resultado presionando el boton CALCULAR  */

        calcularEstCanastillas.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View v) {

        /* Con cualquier cambio en alguno de las entradas el valor de la estantería se borra
         * con esto se obliga al usuario a recalcular luego de alguna modificacion en la cotizacion
         */
        textoResultado.setText("-");

        // It is detected which button was pressed and according to this, some changes are performed
        switch (v.getId()) {
            case R.id.menosAltura:
                if(contador_altura > 0){
                    contador_altura =  contador_altura - 1;
                    estanteria.actEstanteriaCanastillas(contador_altura);
                }
                break;

            case R.id.masAltura:
                if(contador_altura < 3) {
                    contador_altura = contador_altura + 1;
                    estanteria.actEstanteriaCanastillas(contador_altura);
                }
                break;

            case R.id.menosCuerpos:
                if(contador_cuerpos > 1){
                    contador_cuerpos =  contador_cuerpos - 1;
                    estanteria.actCuerpos(Integer.toString(contador_cuerpos));
                }
                break;

            case R.id.masCuerpos:
                if(contador_cuerpos < 99) {
                    contador_cuerpos = contador_cuerpos + 1;
                    estanteria.actCuerpos(Integer.toString(contador_cuerpos));
                }
                break;

            case R.id.menosPosiciones:
                if(contador_posiciones > estanteria.getNumPosicionesMin()){
                    if(contador_posiciones == contador_cuadro_u){
                        contador_cuadro_u = contador_cuadro_u - 1;
                        estanteria.actCuadroU(Integer.toString(contador_cuadro_u));
                    }
                    contador_posiciones =  contador_posiciones - 1;
                    estanteria.actPosiciones(Integer.toString(contador_posiciones));
                }
                break;

            case R.id.masPosiciones:
                if(contador_posiciones < estanteria.getNumPosicionesMax()) {
                    contador_posiciones = contador_posiciones + 1;
                    estanteria.actPosiciones(Integer.toString(contador_posiciones));
                }
                break;

            case R.id.menosCuadroU:
                if(contador_cuadro_u > 2){
                    contador_cuadro_u =  contador_cuadro_u - 1;
                    estanteria.actCuadroU(Integer.toString(contador_cuadro_u));
                }
                break;

            case R.id.masCuadroU:
                if(contador_cuadro_u < contador_posiciones) {
                    contador_cuadro_u = contador_cuadro_u + 1;
                    estanteria.actCuadroU(Integer.toString(contador_cuadro_u));
                }
                break;

            case R.id.menosModulos:
                if(contador_modulos > 1){
                    contador_modulos =  contador_modulos - 1;
                    estanteria.actModulos(Integer.toString(contador_modulos));
                }
                break;

            case R.id.masModulos:
                if(contador_modulos < 99) {
                    contador_modulos = contador_modulos + 1;
                    estanteria.actModulos(Integer.toString(contador_modulos));
                }
                break;

            // The price of the shelf is calculated here
            case R.id.calcularEstCanastillas:

                //TODO: Hardcoded input for functions. Look for a better solution
                // It calculates the amount of elements that are necessary to build the shelf
                estanteria.calcularCantidades(false,false);
                // It calculates the price of the shelf
                estanteria.calcularPrecio(false,false);

                // It gives format to the price to be displayed and
                // it displays the calculated price of the shelf
                textoResultado.setText(estanteria.formatoPrecio(estanteria.getPrecioTotalEstanteria()));

                break;

            default:
                break;
        }

        // It refreshes the new values of the input parameter (given by the user)
        textoAlturaSelec.setText(estanteria.getAltura());
        textoCuerposSelec.setText(estanteria.getCuerpos());
        textoPosicionesSelec.setText(estanteria.getPosiciones());
        textoCuadroUSelec.setText(estanteria.getCuadroU());
        textoModulosSelec.setText(estanteria.getModulos());

    }

    // If an additional element is selected, the result field is "deleted" with "-".
    // In this way, the user has to press the button "Calcular" again.
    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        textoResultado.setText("-");
    }

}