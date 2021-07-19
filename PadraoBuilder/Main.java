public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa.Builder("Marge", "1222333444555")
            .sobrenome("Silva")
            .endereco("Avenida 45, 0844 - Barretos SP")
            .build();
        System.out.println("PESSOA: " + p.getIdentidade()+ " " + p.getEndereco() + "\n");


        Empresa e = new Empresa.Builder("Daniel", "000.999.888.777-x")
            .endereco("Paraibuna, 811 - São José dos Campos")
            .build();
        System.out.println("EMPRESA: "+e.getEndereco() + ' ' + e.getPessoa().getNome());
    }
}
