	create table Endereco (
		id integer primary key auto_increment,
		logradouro varchar(255) not null,
		bairro varchar(255) not null,
		cidade varchar(255) not null,
		estado varchar(255) not null,
		numero integer not null,
		complemento varchar(255) not null,
		cliente_id integer not null
	);
    
    alter table Proposta 
          add constraint FKcliente_id 
		  foreign key (cliente_id) 
		  references cliente;