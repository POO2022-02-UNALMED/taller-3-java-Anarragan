package taller3.televisores

public class TV {
    public static int numTV = 0;
    Marca marca;
    int canal = 1;
    int precio= 500;
    boolean estado;
    int volumen =1;
    Control control;
    
    public TV(Marca marca, boolean estado){
        this.marca=marca;
        this.estado=estado;
    }
    
    public Marca getMarca(){
        return marca;
    }
    
    public void setMarca(Marca marca){
        this.marca=marca;
}
    
    public void setControl(Control control){
        this.control = control;
    }
    
    public Control getControl(){
        return control;
    }
    
    public void setPrecio(int precio){
        this.precio=precio;
    }
    
    public int getPrecio (){
        return precio;
    }
    
    public void setVolumen(int volumen){
        this.volumen=volumen;
    }
    
    public int getVolumen(){
        return volumen;
    }
    
    public void setCanal(int canal){
        this.canal=canal;
    }
    
    public int getCanal(){
        return canal;
    }
    
    public void contadorTV(TV tv){
        if (tv == this){
            numTV += 1;
        }
    }
    
    public int getNumTV(){
        return numTV;
    }
    
    public void turnOn(){
        this.estado=true;
    }
    
    public void turnOff (){
        this.estado=false;
    }
    
    public boolean getEstado(){
        return estado;
    }
    
    public void canalUp(int canal, TV tv){
        boolean asd = tv.getEstado();
        if (this.canal<=120 && this.canal>=1 && asd==true){
            this.canal += 1;
        }    
    }   
    
    public void canalDown(int canal, TV tv){
        boolean asd = tv.getEstado();
        if (this.canal<=120 && this.canal>=1 && asd==true){
            this.canal -= 1;
        }
    }
    
    public void volumenUp(int volumen, TV tv){
        boolean asd = tv.getEstado();
        if(this.volumen>=0 && this.volumen<=0 && asd==true){
            this.volumen+=1;
        }
    }
    
    public void volumenDown(int volumen, TV tv){
        boolean asd = tv.getEstado();
        if(this.volumen>=0 && this.volumen<=0 && asd==true){
            this.volumen-=1;
        }
    }
    
}