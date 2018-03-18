/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import Juego.Jgame;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author Freddy PC
 */
public class Tiempo  {

    private Timer timer = new Timer(); 
    private int segundos=0;

    //Clase interna que funciona como contador
    class Contador extends TimerTask {
        Jgame main_game = new Jgame();
        public void run() {
            segundos++;
        int num,hor,min,seg;
        num=segundos;
        hor=num/3600;
        min=(num-(3600*hor))/60;
        seg=num-((hor*3600)+(min*60));
        System.out.println(min+":"+seg+"s");
        
        main_game.contador.setText("dadsd");
        }
    }
    //Crea un timer, inicia segundos a 0 y comienza a contar
    public void Contar()
    {
        this.segundos=0;
        timer = new Timer();
        timer.schedule(new Contador(), 0, 1000);
    }
    //Detiene el contador
    public void Detener() {
        timer.cancel();
    }
    //Metodo que retorna los segundos transcurridos
    public int getSegundos()
    {
        return this.segundos;
    }
}
