CREATE table profesor
(
    idnp          varchar(23) primary key,
    nume          varchar(30) not null,
    prenume       varchar(30) not null,
    varsta        int not null,
    disciplina    varchar(30) not null unique,
    prof_liceu_id int,
    FOREIGN KEY (prof_liceu_id) references Liceu (id)
);