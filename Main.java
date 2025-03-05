// Main.java
public class Main {
    public static void main(String[] args) {
        // Criando uma pessoa física
        PessoaFisica pf = new PessoaFisica(
                "João da Silva",
                "Rua das Flores, 123",
                "(11) 98765-4321",
                "123.456.789-00",
                "12.345.678-9",
                "01/01/1990"
        );

        // Criando uma pessoa jurídica
        PessoaJuridica pj = new PessoaJuridica(
                "Empresa XYZ",
                "Avenida Central, 456",
                "(11) 4002-8922",
                "12.345.678/0001-99",
                "XYZ Comércio Ltda",
                "Loja XYZ"
        );

        // Exibindo informações
        System.out.println("=== Pessoa Física ===");
        pf.exibirInformacoes();

        System.out.println("\n=== Pessoa Jurídica ===");
        pj.exibirInformacoes();
    }
}
