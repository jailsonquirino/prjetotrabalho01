public  class  Principal {
    public  static  void  main ( String [] args ) {
        
        Filme filme01 =  new  Filme ( " Gerreiro das Sombras " , " Ação " , 143 , 2019 );
        filme01.exibirDetalhes ();
        filme01.executar ();
        filme01.pausar ();
        filme01.executar ();
        filme01.mudarAudio ();
        filme01.mudarAudio ();
        filme01.mudarLegenda ();
        filme01.mudarLegenda ();
        filme01.exibirDetalhes ();
        System.out.println("");

        
        Filme filme02 =  new  Filme ( " O Guardião " , " Ação " , 15 , 2016 );
        filme02.exibirDetalhes ();
        filme02.executar ();
        filme02.pausar ();
        filme02.executar ();
        filme02.mudarAudio ();
        filme02.mudarAudio ();
        filme02.mudarLegenda ();
        filme02.mudarLegenda ();
        filme02.exibirDetalhes ();
        System.out.println("");

       
        Anime anime01 =  new  Anime ( " Dragon Bool Z " , 10 , 35 );
        anime01.exibirDetalhes ();
        anime01.executar ();
        anime01.pausar ();
        anime01.executar ();
        anime01.mudarAudio ();
        anime01.mudarAudio ();
        anime01.mudarLegenda ();
        anime01.mudarLegenda ();
        anime01.exibirDetalhes ();
        System.out.println("");

        
        Anime anime02 =  new  Anime ( "Caverna do Dragão  " , 19 , 20 );
        anime02.exibirDetalhes ();
        anime02.executar ();
        anime02.pausar ();
        anime02.executar ();
        anime02.mudarAudio ();
        anime02.mudarAudio ();
        anime02.mudarLegenda ();
        anime02.mudarLegenda ();
        anime02.exibirDetalhes ();
    }
    
}