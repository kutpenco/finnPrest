	create table Parcela(
		id integer primary key auto_increment,
		valor double not null,
		numero integer not null,
		dataParcela date not null,
		status varchar(25) not null,
		proposta_id integer not null
	);
    
    alter table Parcela 
          add constraint FKproposta_id 
		  foreign key (proposta_id) 
		  references Proposta;