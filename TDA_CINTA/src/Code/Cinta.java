/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author Jonathan
 */
public class Cinta {
    char C[];
    int eof;
    boolean repeat;
    boolean pause;
    int head;
    
    public Cinta(int cantidad){
        C=new char[cantidad];
        eof=cantidad;
        head=-1;
        repeat=false;
        pause=false;
    }
    
    public void setPause(){
        //pause=~pause;
    }
    public void grabar(char x){
        if(head<eof-1){
           head++;
           C[head]=x;
        }else{
            head=-1;
        }
    }
}
