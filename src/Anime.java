public  class  Anime  implements  Video {
       private  String nome;
    private  String idiomaAudio;
    private  String idiomaLegenda;  
    private boolean estaPausado;
    private  int qtdTemporadas;
    private  int episodiosPorTemporada;

    
    public  Anime ( String  nome , int  qtdTemporadas , int  episodiosPorTemporada ) {
        this . nome = nome;
        this . qtdTemporadas = qtdTemporadas;
        this . episodiosPorTemporada = episodiosPorTemporada;
        estaPausado =  false ;
        idiomaAudio =  " Ingles (Original) " ;
        idiomaLegenda =  " Português (Brasil) " ;
    }
    

    public  void  executar () {
        if (estaPausado ==  false ) {
           System.out.println( " Você começou o anime: " + nome);
        } else {
           System.out.println( " O seu anime está Partida " );
        }
    }
    public  void  pausar () {
        estaPausado =  true ;
        System.out.println( " Você pausou o anime. " );
    }

    public  void  mudarAudio () {
        if (idiomaAudio ==  " Ingles (Original) " ) {
            idiomaAudio =  " Português (Brasil) " ;
        } else {
            idiomaAudio =  " Ingles (Original) " ;
        }
        System.out.println( " Idioma alterado para: " + idiomaAudio);
    }

    public  void  mudarLegenda () {
        if (idiomaLegenda ==  " Com legenda " ) {
            idiomaLegenda =  " Português (Brasil) " ;
        } else {
            idiomaLegenda =  " Com legenda " ;
        }
        System.out.println( " Legenda alterada para: " + idiomaLegenda);
    }

    public  String  exibirDetalhes () {
        System.out.println(nome + " ( " + qtdTemporadas + " temporadas). " + episodiosPorTemporada +  " episódios por temporada. " );
        return  null ;
    }

    public  void  fechar () {
       System.out.println( " Você fechou o anime. " );
    }
    
    
    
}