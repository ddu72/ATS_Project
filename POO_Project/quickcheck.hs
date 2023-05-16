-- Fornecedor
-- Casa {Nome, NIF (nº com 9 algarismos), Fornecedor} 
	-- Divisão {Quarto, Sala de Estar, Sala de Jantar, Entrada, Garagem, Escritorio, Casa de Banho, Jardim, Cozinha, Cave, Corredor}
		-- Equipamentos (1/+)
			-- SmartBulb {type { WARM, NEUTRAL, COLD}, tone, tamanho}
			-- SartCamera {(width + x + height), tamanhoficheiro, consumo }
			-- SmartSpeaker {volume, Radio {lista de radios}, marca, consumo}

import Test.QuickCheck



data Casa = Casa Nome NIF Fornecedor [Divisoes]
			deriving Show

data Divisao = Divisao NomeDiv [Equipamentos]
				deriving Show

data Equipamentos = SmartBulb Type  Tamanho Consumo
				    | SmartCamera Resolucao Tamanhoficheiro Consumo
					| SmartSpeaker Volume Radio Marca Consumo
					deriving Show
data Type =  WARM
		    | NEUTRAL 
			| COLD
			deriving Show

type Nome 				= String
type NIF				= Int 
type Fornecedor 		= String
type Radio 				= String
type NomeDiv 			= String
type Tamanho 			= Double
type Consumo 			= Double  
type Resolucao 			= String
type Tamanhoficheiro 	= Double
type Volume				= Int
type Marca 				= String

genFornecedor :: Gen String
genFornecedor = elements [ 
						"EDP","Goldenergy","Iberdrola","Endesa","Aldro","Alfa","Audax","Axpo","Beiragas",
						"Galp","Coopernico","Dianagas","Duriensegas", "Ecochoice","Elec Energy","EDA",
						"Eletricidade da Madeira","Lusa","Elygas","Enat","Energia Simples","HEN Energia",
						"Jafplus","Lisboagas","Logica Energy","Lusitaniagas","Luzboa","Luzigas","Medigas",
						"Naturgy","OZ Energia","Portgas","PT Live","Rolear Viva"
						]
				

genRadio :: Gen String
genRadio = elements [
					"Antena 1 98.3 FM","Antena 2","Antena 3", "Radio Comercial", "RFM", "Radio Renascença", "TSF Radio Noticías",
					"M80 Radio", "Mega Hits", "Cidade FM", "Radio Nova Era"
					]

genMarca :: Gen String
genMarca  = elements[
					 "Bose","JBL","Sony","Harman Kardon","Klipsch","Yamaha","Polk Audio","Sonos","Bang & Olufsen","Marshall"
					]


gerarFornecedor :: IO String
gerarFornecedor = do
				forn <- generate genFornecedor
				return  forn

gerarRadio :: IO String 
gerarRadio = do 
				radio <- generate genRadio
				return radio



fazerDivisao :: String -> [Equipamentos] -> Divisao
fazerDivisao nome equipamentos = Divisao  nome equipamentos

gerarDivisao ::  Divisao
gerarDivisao = do 
				nomediv <- gerarNomeDiv
				equi <- gerarEquipamentos
			   let divisao = fazerDivisao nomediv equi 
			  return divisao