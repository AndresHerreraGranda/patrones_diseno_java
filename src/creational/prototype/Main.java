package src.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        usuario1.setNombre("Andres");
        usuario1.setApellido("Herrera");
        usuario1.setEdad(26);
        usuario1.setEstadoCivil("Casado");

        // Si yo igualo usuario2 = usuario1 lo que voy hacer es que ambos usuarios apuntan al mismo espacio de memoria
        // si modifico usuario1 también voy a cambiar usuario2 porque estan apuntando al mismo espacio de memoria
        Usuario usuario2 = usuario1;

        //pero si lo clono son dos objetos completamente diferentes con los mismo valores, ya si modifico usuario1 no
        // tiene por que afecta a usuarioClonado

        Usuario usuarioClonado = usuario1.clone();
        usuario2.setEstadoCivil("Soltero");
        // observe como usuario1 y usuario2 cambian pese a que solo modifico usuario 2 pero usuarioClone no cambia

        System.out.println("usuario1: "+usuario1);
        System.out.println("usuario2: "+usuario2);
        System.out.println("usuarioClonado: "+usuarioClonado);
    }
}
