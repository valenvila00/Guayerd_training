public class Auto{
    private EstadoAuto estadoauto;
    private int velocidad;
    private int cantCombustible;

    public Auto(EstadoAuto estadoauto, int velocidad, int cantCombustible) {
        this.estadoauto = estadoauto;
        this.velocidad = velocidad;
        this.cantCombustible = cantCombustible;
    }

    public EstadoAuto getEstadoauto() {
        return estadoauto;
    }

    public void setEstadoauto(EstadoAuto estadoauto) {
        this.estadoauto = estadoauto;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCantCombustible() {
        return cantCombustible;
    }

    public void setCantCombustible(int cantCombustible) {
        this.cantCombustible = cantCombustible;
    }

    public void frenar() {
        if(this.velocidad > 0){
            setVelocidad(0);
            System.out.println("El auto frenó");
            this.estadoauto.frenar();
        }
    }

    public void acelerar() {
        setVelocidad(getVelocidad()+10);
        System.out.println("El auto ahora va a "+getVelocidad()+" km/h");
        this.estadoauto.acelerar();
    }

    public boolean contacto() {
        if(this.contacto) {
            System.out.println("Ya estaba en contacto");
            return true;
        this.estadoauto.contacto();
        }
    }
}

