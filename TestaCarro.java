public class TestaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setMarca("KIA");
        carro.setAno(2021);
        carro.setPlaca("SBL201 A");

        System.out.println("CLIENTE -> Rafael Leal");
        System.out.println("MARCA -> " + carro.getMarca());
        System.out.println("MODELO -> " + carro.getModelo());
        System.out.println("PLACA -> " + carro.getPlaca());
        System.out.println("ANO -> " + carro.getAno());
    }
}