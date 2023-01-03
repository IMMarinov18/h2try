create table car(
  id int auto_increment,
  brand nvarchar(255) NOT NULL,
  horsePower int NOT NULL,
  driver nvarchar(255) NOT NULL
);

INSERT INTO car(brand, horsePower, driver) VALUES ( 'nz', 350, 'Iliicho' );