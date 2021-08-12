    create table cliente (
        id integer primary key auto_increment,
        nome varchar(255) not null,
        cpf varchar(255) not null,
		dataNascimento date not null,
		dataContratacao date not null,       
		salario double not null,
		patrimonio double not null,	 	
        primary key (id)		
    );