import pytest
from hypothesis.strategies import *
import string

## casa - Proprietario NIF Fornecedor [Divisões]
## Divisões - Nome [Equipamentos]
## Equipamentos
##      SmartBulb       Type  Tamanho Consumo
##      SmartCamera     Resolução TamanhoFicheiro Consumo
##      SmartSpeaker    Volume Radio Marca Consumo
class Casa:
    def __init__ (self,_proprietario,_nif,_fornecedor,_divisoes):
        self.proprietario = _proprietario
        self.nif = _nif
        self.fornecedor = _fornecedor
        self.divisoes = _divisoes

    def __str__ (casa):
        string =  (f'Casa:')
        for i in [0,1]:  
            for j,nomes in enumerate(casa.proprietario[i]):
                if(j == len(casa.proprietario[i]) - 1 and i == 1):
                    string += (nomes) +','
                else:
                    string += (nomes) + ' '
        string += (f'{casa.nif},{casa.fornecedor}\n')
        for i,divisao in enumerate(casa.divisoes):
            if(i != 0):
                string += '\n' + str(divisao)
            else:
                string += str(divisao)
        return string


class Divisao:
    def __init__ (self,_nome,_equipamentos):
        self.nome = _nome
        self.equipamentos = _equipamentos

    def __str__ (divisao):
        string = (f'Divisao:{divisao.nome}\n')
        for i,elem in enumerate(divisao.equipamentos):
            if(i == len(divisao.equipamentos) - 1 ):
                string += elem 
            else:
                string += elem + '\n'
        return string

    

class Equipamentos:
    def __init__ (self,_tipo,_consumo):
        self.tipo= _tipo
        self.consumo = _consumo

    
class SmartBulb(Equipamentos):
    def __init__ (self,_type,_tamanho,_consumo):
        self.type = _type 
        self.tamanho = _tamanho
        super().__init__("SmartBulb",_consumo)

    def __str__ (smartBulb):
        return (f'SmartBulb:{smartBulb.type},{smartBulb.tamanho},{smartBulb.consumo}')

class SmartSpeaker(Equipamentos):
    def __init__ (self,_volume,_radio,_marca,_consumo):
        self.volume = _volume 
        self.radio = _radio
        self.marca = _marca
        super().__init__("SmartSpeaker",_consumo)

    def __str__ (smartSpeaker):
        return (f'SmartSpeaker:{smartSpeaker.volume},{smartSpeaker.radio},{smartSpeaker.marca},{smartSpeaker.consumo}')

class SmartCamera(Equipamentos):
    def __init__ (self,_resol,_tamanhoFicheiro,_consumo):
        self.resolucao = _resol 
        self.tamanhoFicheiro = _tamanhoFicheiro
        super().__init__("SmartCamera",_consumo)

    def __str__ (smartCamera):
        return (f'SmartCamera:{smartCamera.resolucao},{smartCamera.tamanhoFicheiro},{smartCamera.consumo}')

@composite
def gerar_Num(draw):
    x = draw(integers(min_value=10, max_value=100))
    return x

@composite
def gerar_Consumo(draw):
    x = draw(decimals(min_value = 0.1, max_value = 10,places=3))
    return x

@composite
def gerar_Marca(draw):
    x = draw(sampled_from(["Bose","JBL","Sony","Harman Kardon","Klipsch","Yamaha","Polk Audio","Sonos","Bang & Olufsen","Marshall"]))
    return x

@composite
def gerar_Radio(draw):
    x = draw(sampled_from( ["Antena 1 98.3 FM","Antena 2","Antena 3", "Radio Comercial", "RFM", "Radio Renascença", "TSF Radio Noticías",
					        "M80 Radio", "Mega Hits", "Cidade FM", "Radio Nova Era"]))
    return x

@composite
def gerar_Volume(draw):
    x = draw(integers(min_value=0,max_value=100))
    return x

@composite
def gerar_SmartSpeaker(draw):
    volume  = draw(gerar_Volume())
    radio   = draw(gerar_Radio())
    marca   = draw(gerar_Marca())
    consumo = draw(gerar_Consumo())
    return SmartSpeaker(volume,radio,marca,consumo)

 #SmartBulb       Type  Tamanho Consumo
@composite
def gerar_Type(draw):
    x = draw(sampled_from(["Warm","Neutral","Cold"]))
    return x

@composite
def gerar_Tamanho(draw):
    x = draw(integers(min_value=5,max_value=20))
    return x

@composite
def gerar_SmartBulb(draw):
    type    = draw(gerar_Type())
    tamanho = draw(gerar_Tamanho())
    consumo = draw(gerar_Consumo())
    return SmartBulb(type,tamanho,consumo)

@composite
def gerar_TamanhoFicheiro(draw):
    x = draw(integers(min_value=0,max_value=150))
    return x

@composite
def gerar_Reslucao(draw):
    x = draw(sampled_from(["(640x480)","(1280x720)","(1920x1080)","(2560x1440)","(3840x2160)","(7680x4320)","(4000x3000)","(4920x3264)","(5472x3648)","(6000x4000)"]))
    return x

@composite
def gerar_SmartCamera(draw):
    resol   = draw(gerar_Reslucao())
    tamanho = draw(gerar_TamanhoFicheiro())
    consumo = draw(gerar_Consumo())
    return SmartCamera(resol,tamanho,consumo)

@composite
def gerar_nomeDivisao(draw):
    x = draw(sampled_from(["Quarto", "Sala de Estar", "Sala de Jantar", "Entrada", "Garagem", "Escritorio", "Casa de Banho", "Jardim", "Cozinha", "Cave"]))
    return x

   
@composite
def gerar_Equipamentos(draw,):
    x = draw(integers(max_value=10,min_value=2))
    equipamentos = [0] * x
    for i in range(x):
        e = draw(sampled_from(["SmartCamera","SmartSpeaker","SmartBulb"]))
        if(e == "SmartCamera"):
            equipamentos[i] =  str(draw(gerar_SmartCamera()))
        elif (e == "SmartSpeaker"): 
            equipamentos[i] =  str(draw(gerar_SmartSpeaker()))
        elif (e == "SmartBulb"):
            equipamentos[i] =  str(draw(gerar_SmartBulb()))
        i += 1
    return equipamentos
   

@composite
def gerar_Divisao(draw):
    nome                = draw(gerar_nomeDivisao())
    listEquipamentos    = draw(gerar_Equipamentos())
    return Divisao(nome,listEquipamentos)


@composite
def gerar_Fornecedor(draw):
    x = draw(sampled_from(["EDP","Goldenergy","Iberdrola","Endesa","Aldro","Alfa","Audax","Axpo","Beiragas",
                            "Galp","Coopernico","Dianagas","Duriensegas", "Ecochoice","Elec Energy","EDA",
                            "Eletricidade da Madeira","Lusa","Elygas","Enat","Energia Simples","HEN Energia",
                            "Jafplus","Lisboagas","Logica Energy","Lusitaniagas","Luzboa","Luzigas","Medigas",
                            "Naturgy","OZ Energia","Portgas","PT Live","Rolear Viva"]))
    return x

#casa - Proprietario NIF Fornecedor [Divisões]


@composite
def gerar_Proprietario(draw):
    nomes = ['Ricardo', 'Célia', 'Mafalda', 'Sofia', 'Nelson', 'Lúcia', 'Daniel', 'Júlia', 'Tomás', 
             'Susana', 'Laura', 'Madalena', 'Vanessa', 'Filipa', 'Eva', 'Isabel', 'Cláudia', 'Vera', 
             'Marta', 'Gustavo', 'Mariana', 'Alexandre', 'Carolina', 'Xavier', 'Francisca', 'Manuel', 
             'Diana', 'Teresa', 'António', 'Solange', 'Luísa', 'Pedro', 'Sara', 'Bruna', 'Gabriela', 
             'Sérgio', 'Eduardo', 'Catarina', 'Leonor', 'Rui', 'Samuel', 'Helena', 'Rosa', 'Adelino', 
             'Clara', 'Mário', 'Rafael', 'Cristiano', 'Leonor', 'Leonel', 'Miguel', 'Nuno', 'Raquel', 
             'Patrícia', 'Afonso', 'Zé', 'Diogo', 'Marisa', 'Alice', 'Matilde', 'Inês', 'Gonçalo', 'Andreia', 
             'Joaquim', 'Diana', 'Daniela', 'Sílvia', 'Joana', 'Teresa', 'Soraia', 'Carlos', 'Gabriel', 'David', 
             'Francisco', 'Baltazar', 'Artur', 'Filipe', 'Hélio', 'Óscar', 'Cristiano', 'Eduarda', 'Margarida', 'Sérgio', 'Lara', 
             'Cláudia', 'Rita', 'Miguel', 'Bruno', 'Hugo', 'Valter', 'Xavier', 'André', 'Ivo', 'Nuno', 'Marcelo', 'Luisa']

    apelidos = ["Silva", "Santos", "Pereira", "Costa", "Fernandes", "Rodrigues", "Martins",
            "Sousa", "Carvalho", "Oliveira", "Ferreira", "Cardoso", "Gomes", "Ramos",
            "Almeida", "Neves", "Coelho", "Marques", "Nunes", "Mendes", "Castro", "Santos",
            "Barbosa", "Pinto", "Ribeiro", "Teixeira", "Silva", "Vieira", "Duarte", "Rocha",
            "Alves", "Costa", "Freitas", "Baptista", "Moreira", "Andrade", "Pereira",
            "Fonseca", "Matos", "Reis", "Leal", "Pinheiro", "Lopes", "Fernandes", "Pires",
            "Carvalho", "Torres", "Azevedo", "Correia", "Viana", "Cunha", "Martins", "Gomes",
            "Oliveira", "Pacheco", "Ribeiro", "Santos", "Ferreira", "Lima", "Mendonça",
            "Silva", "Costa", "Araújo", "Castro", "Almeida", "Barbosa", "Teixeira", "Amaral",
            "Campos", "Cardoso", "Cunha", "Dias", "Duarte", "Esteves", "Faria", "Guedes",
            "Lopes", "Madeira", "Marques", "Melo", "Monteiro", "Moura", "Nogueira", "Nunes",
            "Paiva", "Pinto", "Rego", "Reis", "Rodrigues", "Sá", "Salgado", "Salgueiro",
            "Simões", "Soares", "Sousa", "Tavares", "Valente", "Vaz", "Veiga", "Xavier"]
    nome    = draw(tuples((lists(sampled_from(nomes),max_size=2,min_size=1)),(lists(sampled_from(apelidos),max_size=5,min_size=2))))
    return nome

@composite
def gerar_NIF(draw):
    x = draw(integers(min_value=100000000, max_value= 999999999))
    return x

@composite
def gerar_Divisoes(draw): 
    x = draw(integers(max_value=10,min_value=2)) #nº divisões
    divisoes = [0]*x
    for i in range(x):
        divisoes[i] = str(draw(gerar_Divisao()))
        i += 1
    return divisoes

@composite
def gerar_Casa(draw):
    proprietario    = draw(gerar_Proprietario())
    nif             = draw(gerar_NIF())
    fornecedor      = draw(gerar_Fornecedor())
    divisoes        = draw(gerar_Divisoes())
    return Casa(proprietario,nif,fornecedor,divisoes)

    
# Escrever 
def logs(n):
    with open("presets_txt/logs.txt","w") as text_file:
        for i in range(n):
            a = gerar_Casa().example()
            text_file.write(str(a))
            text_file.write('\n')

n = gerar_Num().example()
logs(n)
print("Foram geradas " + str(n) + " casas!")