public class Empresa {

    private Pessoa pessoa;
    private String endereco;

    public static class Builder {

        private Pessoa pessoa;
        private String endereco;

        public Builder(String o, String i) {
            this.pessoa = new Pessoa.Builder(o, i)
                .build();
        }

        public Builder endereco(String n){
            this.endereco = n;
            return this;
        }


        public Empresa build(){
            Empresa e = new Empresa();
            e.pessoa = this.pessoa;
            e.endereco = this.endereco;

            return e;
        }
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}

