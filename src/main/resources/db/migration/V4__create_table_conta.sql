	create table Conta (
		id integer primary key auto_increment,
		saldo double not null,
		agencia integer not null,
		conta integer not null,		
		cliente_id integer not null
	);
    
    alter table Proposta 
          add constraint FKcliente_id 
		  foreign key (cliente_id) 
		  references cliente;