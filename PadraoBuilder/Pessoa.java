public class Pessoa {

    private String nome;
    private String sobrenome;
    private String endereco;
    private String identidade;

    public static class Builder {

        private String nome;
        private String sobrenome;
        private String endereco;
        private String identidade;

        public Builder(String o, String i) {
            this.nome = o;
            this.identidade = i;
        }

        public Builder nome(String n){
            this.nome = n;
            return this;
        }

        public Builder identidade(String identidade){
            this.identidade = identidade;
            return this;
        }

        public Builder sobrenome(String sobrenome){
            this.sobrenome = sobrenome;
            return this;
        }

        public Builder endereco(String endereco){
            this.endereco = endereco;
            return this;
        }


        public Pessoa build(){
            Pessoa p = new Pessoa();
            p.nome = this.nome;
            p.endereco = this.endereco;
            p.sobrenome = this.sobrenome;
            p.identidade = this.identidade;

            return p;
        }
    }

    private Pessoa() {
        //Constructor is now private.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String branch) {
        this.identidade = branch;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

}
