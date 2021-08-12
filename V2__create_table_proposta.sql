	create table Proposta (
		id integer primary key auto_increment,
		valor double not null,
		taxaJuros double not null,
		qtdadeParcelas integer not null,		
		dataContratacao date not null,
		cliente_id integer not null
	);
    
    alter table Proposta 
          add constraint FKcliente_id 
		  foreign key (cliente_id) 
		  references cliente;
