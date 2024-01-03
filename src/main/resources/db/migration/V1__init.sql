create table animal
(
    id            varchar(255) not null,
    created_at    datetime(6)  not null,
    updated_at    datetime(6)  not null,
    breed         varchar(255) not null,
    color         varchar(255) not null,
    date_of_birth date         not null,
    gender        varchar(255) not null,
    name          varchar(255) not null,
    species       varchar(255) not null,
    customer_id   varchar(255),
    primary key (id)
) engine = InnoDB;

create table appointment
(
    id               varchar(255) not null,
    created_at       datetime(6)  not null,
    updated_at       datetime(6)  not null,
    appointment_date datetime(6)  not null,
    animal_id        varchar(255),
    doctor_id        varchar(255),
    primary key (id)
) engine = InnoDB;

create table available_date
(
    id         varchar(255) not null,
    created_at datetime(6)  not null,
    updated_at datetime(6)  not null,
    date       date         not null,
    doctor_id  varchar(255) not null,
    primary key (id)
) engine = InnoDB;

create table customer
(
    id         varchar(255)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      not null,
    created_at datetime(6)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       not null,
    updated_at datetime(6)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       not null,
    address    varchar(255)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      not null,
    city       enum ('ADANA','ADIYAMAN','AFYONKARAHISAR','AGRI','AMASYA','ANKARA','ANTALYA','ARTVIN','AYDIN','BALIKESIR','BILECIK','BINGOL','BITLIS','BOLU','BURDUR','BURSA','CANAKKALE','CANKIRI','CORUM','DENIZLI','DIYARBAKIR','EDIRNE','ELAZIG','ERZINCAN','ERZURUM','ESKISEHIR','GAZIANTEP','GIRESUN','GUMUSHANE','HAKKARI','HATAY','ISPARTA','MERSIN','ISTANBUL','IZMIR','KARS','KASTAMONU','KAYSERI','KIRKLARELI','KIRSEHIR','KOCAELI','KONYA','KUTAHYA','MALATYA','MANISA','KAHRAMANMARAS','MARDIN','MUGLA','MUS','NEVSEHIR','NIGDE','ORDU','RIZE','SAKARYA','SAMSUN','SIIRT','SINOP','SIVAS','TEKIRDAG','TOKAT','TRABZON','TUNCELI','SANLIURFA','USAK','VAN','YOZGAT','ZONGULDAK','AKSARAY','BAYBURT','KARAMAN','KIRIKKALE','BATMAN','SIRNAK','BARTIN','ARDAHAN','IGDIR','YALOVA','KARABUK','KILIS','OSMANIYE','DUZCE') not null,
    mail       varchar(255)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      not null,
    name       varchar(255)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      not null,
    phone      varchar(255)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      not null,
    primary key (id)
) engine = InnoDB;

create table doctor
(
    id         varchar(255)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      not null,
    created_at datetime(6)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       not null,
    updated_at datetime(6)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       not null,
    address    varchar(255)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      not null,
    city       enum ('ADANA','ADIYAMAN','AFYONKARAHISAR','AGRI','AMASYA','ANKARA','ANTALYA','ARTVIN','AYDIN','BALIKESIR','BILECIK','BINGOL','BITLIS','BOLU','BURDUR','BURSA','CANAKKALE','CANKIRI','CORUM','DENIZLI','DIYARBAKIR','EDIRNE','ELAZIG','ERZINCAN','ERZURUM','ESKISEHIR','GAZIANTEP','GIRESUN','GUMUSHANE','HAKKARI','HATAY','ISPARTA','MERSIN','ISTANBUL','IZMIR','KARS','KASTAMONU','KAYSERI','KIRKLARELI','KIRSEHIR','KOCAELI','KONYA','KUTAHYA','MALATYA','MANISA','KAHRAMANMARAS','MARDIN','MUGLA','MUS','NEVSEHIR','NIGDE','ORDU','RIZE','SAKARYA','SAMSUN','SIIRT','SINOP','SIVAS','TEKIRDAG','TOKAT','TRABZON','TUNCELI','SANLIURFA','USAK','VAN','YOZGAT','ZONGULDAK','AKSARAY','BAYBURT','KARAMAN','KIRIKKALE','BATMAN','SIRNAK','BARTIN','ARDAHAN','IGDIR','YALOVA','KARABUK','KILIS','OSMANIYE','DUZCE') not null,
    mail       varchar(255)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      not null,
    name       varchar(255)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      not null,
    phone      varchar(255)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      not null,
    primary key (id)
) engine = InnoDB;

create table vaccine
(
    id                    varchar(255) not null,
    created_at            datetime(6)  not null,
    updated_at            datetime(6)  not null,
    code                  varchar(255) not null,
    name                  varchar(255) not null,
    protection_end_date   date         not null,
    protection_start_date date         not null,
    animal_id             varchar(255),
    primary key (id)
) engine = InnoDB;

alter table customer
    add constraint UK_9bs0cm53439brbopbpxhg68e unique (mail);

alter table customer
    add constraint UK_o3uty20c6csmx5y4uk2tc5r4m unique (phone);


alter table doctor
    add constraint UK_n301mmkjvy2j0d4fk4q1xexc3 unique (mail);

alter table doctor
    add constraint UK_2ow2k8dbvtnp7wfc8ywo8fg2e unique (phone);

alter table animal
    add constraint FK6pvxm5gfjqxclb651be9unswe
        foreign key (customer_id)
            references customer (id);

alter table appointment
    add constraint FK2kkeptdxfuextg5ch7xp3ytie
        foreign key (animal_id)
            references animal (id);

alter table appointment
    add constraint FKoeb98n82eph1dx43v3y2bcmsl
        foreign key (doctor_id)
            references doctor (id);

alter table available_date
    add constraint FKk0d6pu1wxarsoou0x2e1cc2on
        foreign key (doctor_id)
            references doctor (id);

alter table vaccine
    add constraint FKne3kmh8y5pcyxwl4u2w9prw6j
        foreign key (animal_id)
            references animal (id);