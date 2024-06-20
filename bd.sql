

-- Criação da TABELA CIDADE
CREATE TABLE Cidade (
    IdCidade INT PRIMARY KEY,
    NomeCidade VARCHAR(100) NOT NULL
);

-- Criação da TABELA MOTORISTA
CREATE TABLE Motorista (
    IdMotorista INT PRIMARY KEY,
    NomeMotorista VARCHAR(100) NOT NULL,
    NumCPF VARCHAR(11) NOT NULL UNIQUE
);

-- Criação da TABELA ONIBUS
CREATE TABLE Onibus (
    IdOnibus INT PRIMARY KEY,
    MarcaOnibus VARCHAR(50) NOT NULL,
    ModeloOnibus VARCHAR(50) NOT NULL,
    PlacaOnibus VARCHAR(7) NOT NULL UNIQUE
);

-- Criação da TABELA VIAGEM
CREATE TABLE Viagem (
    IdViagem INT PRIMARY KEY,
    IdMotorista INT NOT NULL,
    IdOnibus INT NOT NULL,
    IdCidadeOrigem INT NOT NULL,
    IdCidadeDestino INT NOT NULL,
    Hora_de_partida DATETIME NOT NULL,
    Hora_de_chegada DATETIME NOT NULL,
    FOREIGN KEY (IdMotorista) REFERENCES Motorista(IdMotorista),
    FOREIGN KEY (IdOnibus) REFERENCES Onibus(IdOnibus),
    FOREIGN KEY (IdCidadeOrigem) REFERENCES Cidade(IdCidade),
    FOREIGN KEY (IdCidadeDestino) REFERENCES Cidade(IdCidade)
);

Create Table Usuarios (
	IdUsuario INT PRIMARY KEY,
	Email varchar not null,
	Senha varchar not null, 
	)
