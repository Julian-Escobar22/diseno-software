package aplicacionFabrica;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Llanta {
    private String tipo;
    private int tamaño;

    public Llanta(String tipo, int tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Llanta - Tipo: " + tipo + ", Tamaño: " + tamaño;
    }
}

class Chasis {
    private int peso;
    private String material;

    public Chasis(int peso, String material) {
        this.peso = peso;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Chasis - Peso: " + peso + " kg, Material: " + material;
    }
}

class Carro {
    private Llanta llantaDelantera;
    private Llanta llantaTrasera;
    private Chasis chasis;
    private String color;
    private int planta; // Nuevo atributo para identificar la planta

    public Carro(Llanta llantaDelantera, Llanta llantaTrasera, Chasis chasis, String color, int planta) {
        this.llantaDelantera = llantaDelantera;
        this.llantaTrasera = llantaTrasera;
        this.chasis = chasis;
        this.color = color;
        this.planta = planta; // Asignar la planta
    }

    @Override
    public String toString() {
        return "Carro - Color: " + color + "\n" + llantaDelantera + "\n" + llantaTrasera + "\n" + chasis + "\nPlanta: " + planta;
    }
}

class PlantaFabricacion {
    private List<Carro> carrosFabricados;

    public PlantaFabricacion() {
        carrosFabricados = new ArrayList<>();
    }

    public void fabricarCarros(int cantidad, int planta) {
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            String color = obtenerColorAleatorio();
            Llanta llantaDelantera = new Llanta(obtenerTipoLlantaAleatorio(), random.nextInt(21) + 15);
            Llanta llantaTrasera = new Llanta(obtenerTipoLlantaAleatorio(), random.nextInt(21) + 15);
            Chasis chasis = new Chasis(random.nextInt(2000) + 1000, obtenerMaterialChasisAleatorio());

            Carro carro = new Carro(llantaDelantera, llantaTrasera, chasis, color, planta);
            carrosFabricados.add(carro);

            System.out.println("\nCarro Fabricado en la planta " + planta + ":\n" + carro);
        }
    }

    
    private String obtenerColorAleatorio() {
        String[] colores = {"Rojo", "Azul", "Verde", "Blanco", "Negro", "Gris"};
        Random random = new Random();
        int indice = random.nextInt(colores.length);
        return colores[indice];
    }

    private String obtenerTipoLlantaAleatorio() {
        String[] tiposLlanta = {"Michelin", "Pirelli", "Todo Terreno"};
        Random random = new Random();
        int indice = random.nextInt(tiposLlanta.length);
        return tiposLlanta[indice];
    }

    private String obtenerMaterialChasisAleatorio() {
        String[] materiales = {"Aluminio", "Acero"};
        Random random = new Random();
        int indice = random.nextInt(materiales.length);
        return materiales[indice];
    }
}
