CREATE table elev
(
    idnp          varchar(100) primary key,
    nume          varchar(30) not null,
    prenume       varchar(30) not null,
    varsta        int         not null,
    media         float       not null,
    clasa         int         not null,
    elev_liceu_id int,
    FOREIGN KEY (elev_liceu_id) references Liceu (id)
);