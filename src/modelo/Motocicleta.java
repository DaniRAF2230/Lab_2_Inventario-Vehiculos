package modelo;

public class Motocicleta extends Vehiculo {

        private final int cilindraje;

        public Motocicleta(String modelo, String marca, int año, double precio, int cilindraje) {
            super(modelo, marca, año, precio);
            this.cilindraje = cilindraje;
        }

        @Override
        protected String getCaracteristica() {
            return "Cilindrada: " + this.cilindraje + " cc";
        }
    }


