# magic
Endereço na nuvem :
  https://magic-zappts.herokuapp.com/

Path para testes :
  Inserir cartas /api/carta
    Ex : {
      "nome" : "Uro, Titã da Ira da Natureza",
      "edicao" : "Normal",
      "laminada" : true,
      "preco" : 20.00,
      "idIdioma" : 2
	
    }
  
  Buscar todas cartas /api/carta
  Buscar uma carta /api/carta/id
  Deletar carta /api/carta/id
  Alterar carta /api/carta/id

  Inserir jogador /api/jogador
    Ex : {
          "nome" : "Jogador 1"
        }
  
  Buscar todas jogadores /api/jogador
  Buscar uma jogador /api/jogador/id
  Deletar jogador /api/jogador/id
  Alterar jogador /api/jogador/id
  
  Inserir carta em um deck /api/deck
    Ex : {
            "idCarta" : 1,
            "idJogador" : 1,
            "nomeDeck" : "Deck 1",
          }
  
  
  Buscar todos decks de um jogador /api/deck/jogador/idJogador
  Buscar um deck do jogador /api/deck/jogador-cartas/idJogador/nomeDeck
  Deletar carta do deck /api/deck/nomeDeck/idCarta/idJogador
