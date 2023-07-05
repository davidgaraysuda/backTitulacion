CREATE TABLE IF NOT EXISTS career(
    id serial,
    name VARCHAR(50),
    coordinator VARCHAR (50),
    PRIMARY KEY (id)
);

CREATE TYPE state AS ENUM ('todo', 'doing', 'done');

CREATE TABLE IF NOT EXISTS  student(
    id serial,
    nui VARCHAR(13) NOT NULL UNIQUE,
    name VARCHAR(45) NOT NULL,
    lastname VARCHAR(45) NOT NULL,
    email VARCHAR(45) NOT NULL UNIQUE,
    phone VARCHAR(12) NOT NULL UNIQUE,
    s_state state,
    career_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (career_id) references career (id)
);

CREATE TABLE IF NOT EXISTS  company(
  id serial,
  name VARCHAR(45) NOT NULL,
  phone VARCHAR(12),
  contact VARCHAR(100),
  coordinates VARCHAR(200),
  co_status BOOLEAN,
  PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS  tutor(
  id serial,
  name VARCHAR(45) NOT NULL,
  phone VARCHAR(12) NOT NULL,
  alternative VARCHAR(50),
  tu_status BOOLEAN,
  is_main BOOLEAN,
  company_id int,
  PRIMARY KEY (id),
  FOREIGN KEY (company_id) references company (id)
);

CREATE TABLE IF NOT EXISTS  teacher(
    id serial,
    name VARCHAR(45) NOT NULL,
    phone VARCHAR(12),
    te_status BOOLEAN,
    career_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (career_id) REFERENCES career (id)
);


CREATE TABLE IF NOT EXISTS activity(
    id serial,
    description varchar(50) not null,
    career_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (career_id) REFERENCES career (id)
);

CREATE TABLE IF NOT EXISTS  practice(
  id serial,
  start_date date NOT NULL,
  end_date date,
  hours int,
  student_id int not null,
  tutor_id int not null,
  teacher_id int not null,
  pra_status BOOLEAN,
  PRIMARY KEY (id),
  FOREIGN KEY (student_id) references student(id),
  FOREIGN KEY (tutor_id) references tutor(id),
  FOREIGN KEY (teacher_id) references teacher(id)
);

CREATE TABLE IF NOT EXISTS practice_detail(
    id serial,
    actual_date date not null,
    start_time time NOT NULL,
    end_time time NOT NULL,
    total_hours time,
    observations varchar (200),
    practice_id int,
    PRIMARY KEY (id),
    FOREIGN KEY (practice_id) REFERENCES practice (id)
);

CREATE TABLE IF NOT EXISTS activity_detail(
    id serial,
    description varchar(200),
    activities_id int,
    detail_id int,
    checking boolean,
    PRIMARY KEY (id),
    FOREIGN KEY (activities_id) REFERENCES activity (id),
    FOREIGN KEY (detail_id) REFERENCES practice_detail (id)
);

create table if not exists agreement(
id serial primary key,
start_date date not null,
end_date date not null,
ag_status boolean not null,
link_doc varchar (200),
company_id int not null,
foreign key (company_id) references company(id)
);

create table if not exists specific_agreement(
id serial primary key,
link_sdoc varchar (200),
sag_status boolean not null,
agreement_id int not null,
career_id int not null,
foreign key (agreement_id) references agreement(id),
foreign key (career_id) references career(id)
);




