public class Filme implements Video {
    
    private String nome;
    private String genero;
    private int duracao; 
    private String idiomaAudio;
    private String idiomaLegenda;
    private boolean estaPausado; 
    private int anoLancamento;

        public Filme(String nome, String genero, int duracao, int anoLancamento){
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        estaPausado = false;
        idiomaAudio = "Português (Brasil)";
        idiomaLegenda = "Português (Brasil)";
    }
    
    public void executar() {
        if(estaPausado == false){
            System.out.println("Você começou o filme: "+ nome);
        }else{
            System.out.println("O seu filme está executando");
        }
    }

    public void pausar() {
        estaPausado = true;
        System.out.println("Você pausou o filme.");

    }

    public void mudarAudio() {
        if(idiomaAudio == "Inglês (Original)"){
            idiomaAudio = "Português (Brasil)";
        }else{
            idiomaAudio = "Inglês (Original)";
        }
        System.out.println("Idioma alterado para: "+idiomaAudio);
    }

    public void mudarLegenda() {
        if(idiomaLegenda == "Sem legenda"){
            idiomaLegenda = "Português (Brasil)";
        }else{
            idiomaLegenda = "Sem legenda";
        }
        System.out.println("Legenda alterada para: "+ idiomaLegenda);
    }

    public String exibirDetalhes() {
        System.out.println(nome+"("+anoLancamento+"). "+"Duração: "+duracao+" min. Gênero: "+genero);
        return null;
    }
            
}