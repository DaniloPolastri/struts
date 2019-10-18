CREATE table seguros_segurados(
	idsegurado int not null,
    idseguro int not null,
    Key `fk_id_segurado` (idsegurado),
    Key `fk_id_seguro` (idseguro),
	CONSTRAINT `fk_id_segurado` FOREIGN KEY (`idsegurado`) REFERENCES segurado (`id`),
	CONSTRAINT `fk_id_seguro` FOREIGN KEY (`idseguro`) REFERENCES seguros (`id`),
    primary key(idsegurado,idseguro)
);

CREATE table segurado (
	id int(11) primary key auto_increment, 
	nome varchar(15),
	cpf varchar(15),
	rg varchar(15), 
	sexo varchar(15), 
	correntista varchar(15), 
	diaVisita varchar(15), 
	dataDeCadastro date, 
	dataDeAlteracao date, 
	data_nasc varchar(15)
	
);

CREATE table segurado (
	id int primary key auto_increment, 
	nome varchar(15),
	cpf varchar(15),
	rg varchar(15), 
	sexo varchar(15), 
	correntista varchar(15), 
	diaVisita varchar(15), 
	dataDeCadastro timestamp, 
	dataDeAlteracao timestamp, 
	data_nasc varchar(15)
	
);