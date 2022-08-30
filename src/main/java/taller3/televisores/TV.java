package taller3.televisores;

public class TV {
    static int numTV = 0;
    Marca marca;
    int canal = 1;
    int precio= 500;
    boolean estado;
    int volumen =1;
    Control control;
    
    public TV(Marca marca, boolean estado){
        this.marca=marca;
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
    
    public int getVolumen(){
        return volumen;
    }
    
    public void setVolumen(Integer volumen) {
	if (1 <= volumen && canal <= 7 && estado == true) {
		this.volumen = volumen;			
	}
}
    public int getCanal(){
        return canal;
    }
    public void setCanal(Integer canal) {
		if (estado == true  && canal >= 1 && canal <= 120) {
			this.canal = canal;			
		}
	
    }
    
    public static void setNumTV(int num) {
		numTV = num;
	}
        
    
    
    public static Integer getNumTV(){
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
    
    public void canalUp() {
		if (canal >= 1 && canal < 120 && estado == true) {
			canal = canal + 1;
		}
	}

	public void canalDown() {
		if (1 < canal && canal <= 120 && estado == true) {
			canal = canal - 1;
		}
	}

	public void volumenUp() {
		if (1 <= volumen && volumen < 7 && estado == true) {
			volumen = volumen + 1;
		}
	}

	public void volumenDown() {
		if (1 < volumen && volumen <= 7 && estado == true) {
			volumen = volumen - 1;
		}
}
}