package ejercicioextra5;

//El Motor puede trabajar con 3 velocidades distintas (ALTA, MEDIA y BAJA)
public class Motor {

    private final TanqueDeAgua tanque;
    private String velocidad;

    public Motor(TanqueDeAgua tanque, String velocidad) {
        this.tanque = tanque;
        this.velocidad = velocidad;
    }

    public TanqueDeAgua getTanque() {
        return tanque;
    }

    public String getVelocidad() {
        return velocidad;
    }

    /* consumirAgua que cada vez que se lo invoca consume 10 litros si trabaja a velocidad ALTA,
    5 litros si trabaja a velocidad MEDIA y 1 litro si trabaja a velocidad BAJA*/
    public void consumirAgua() {
        switch (velocidad.toUpperCase()) {
            case "ALTA":
                if (tanque.getCapacidad() >= 10) {
                    tanque.setCapacidad(tanque.getCapacidad() - 10);
                } else {
                    System.out.println("No hay suficiente agua en el tanque.");
                }
                break;
            case "MEDIA":
                if (tanque.getCapacidad() >= 5) {
                    tanque.setCapacidad(tanque.getCapacidad() - 5);
                } else {
                    System.out.println("No hay suficiente agua en el tanque.");
                }
                break;
            case "BAJA":
                if (tanque.getCapacidad() >= 1) {
                    tanque.setCapacidad(tanque.getCapacidad() - 1);
                } else {
                    System.out.println("No hay suficiente agua en el tanque.");
                }
                break;
            default:
                System.out.println("Velocidad no compatible.");
        }
    }

    /* cambiarVelocidad que cada vez que se lo usa, cambia la velocidad de Alta
    a Media y de Media a Baja y vuelve a empezar.*/
    public String cambiarVelocidad() {

        if (velocidad.equalsIgnoreCase("ALTA")) {
            velocidad = "MEDIA";
        } else if (velocidad.equalsIgnoreCase("MEDIA")) {
            velocidad = "BAJA";
        } else {
            velocidad = "ALTA";
        }
        return velocidad;
    }
}
