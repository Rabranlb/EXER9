public class TestaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setMarca("KIA");
        carro.setAno(2021);
        carro.setPlaca("SBL201 A");

        System.out.println("Cliente: Rafael Leal");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Placa: " + carro.getPlaca());
    }
}