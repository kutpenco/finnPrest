	create table Telefone (
		id integer primary key auto_increment,
		ddd integer not null,
		numero integer not null,
		cliente_id integer not null
	);
    
    alter table Proposta 
          add constraint FKcliente_id 
		  foreign key (cliente_id) 
		  references cliente;