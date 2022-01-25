# ProjetXML

Requettes POSTMAN

GET
http://localhost:8080/movies
http://localhost:8080/theatres
http://localhost:8080/sessions


POST avec les json
http://localhost:8080/movies
{
  "title": "Avengers Endgame66",
  "duration": "3h01min",
  "language": "Français",
  "subtitles": "Non",
  "director": "Joe Russo, Anthony Russo",
  "mainActors": "Robert Downey Jr., Chris Evans, Mark Ruffalo",
  "minAge": 8,
  "startingDate": "24 avril 2019",
  "endDate": "24 juin 2019"
}

http://localhost:8080/theatres

{
  "name": "Theatre inséré",
  "address": "adresse du théatre",
  "city": "Cachan"
}

http://localhost:8080/sessions

{"startingTime": "15",
"days": "JEU SAM"}

PUT
http://localhost:8080/movies/6 avec Json pour pour modifier un film

http://localhost:8080/movies/1/theatres/4 //pour affecter un theatre a un film

http://localhost:8080/sessions/3/movies/1/theatres/3 pour affecter un film et un theatre a une session


---Remplir la bdd
INSERT INTO movies(title,duration,language,subtitles,director,main_actors,min_age,starting_date,end_date) VALUES ('Iron Man3' ,'120' ,'VUS' ,'FR', '	Shane Black', 'Carolyn Loucks, Monica Rochlin' ,'15', '25 JAN', '25 MARS');
INSERT INTO movies(title,duration,language,subtitles,director,main_actors,min_age,starting_date,end_date) VALUES ('Thor : Le Monde des ténèbres' ,'120' ,'VFR' ,'NO', 'Alan Taylor' , 'Carolyn Loucks, Monica Rochlin' ,'16', '12DEC', '11 JAN');
INSERT INTO movies(title,duration,language,subtitles,director,main_actors,min_age,starting_date,end_date) VALUES ('Captain America : Le Soldat de l"hiver' ,'120' ,'VUS' , 'FR', 'Anthony et Joe Russo', 'Carolyn Loucks, Monica Rochlin', '3', '11 MARS', '30 MARS');
INSERT INTO movies(title,duration,language,subtitles,director,main_actors,min_age,starting_date,end_date) VALUES ('Les Gardiens de la Galaxie' ,'120' ,'VFR' ,'ss', 'James Gunn' , 'Carolyn Loucks, Monica Rochlin', '18', '12 FEV', '15 MARS');
INSERT INTO movies(title,duration,language,subtitles,director,main_actors,min_age,starting_date,end_date) VALUES ('Avengers : L"Ère d"Ultron' ,'120' ,'VUS' ,'FR' ,'Joss Whedon' , 'Carolyn Loucks, Monica Rochlin', '20', '11 MAI', '12 JUIN');

---Ajout Théatres

INSERT INTO theatres(name, address, city) values ('Centre d"Art et de Culture',  '15bd des Nations-Unies', 'Meudon');
INSERT INTO theatres(name, address, city) values ('Pathé Beaugrenelle',  'Centre Commercial Beaugrenelle', 'Paris');
INSERT INTO theatres(name, address, city) values ('Cinéma d"Art Romain Rolland',  '18 rue Eugene Varlin', 'Villejuif');
INSERT INTO theatres(name, address, city) values ('UGC Ciné Cité',  '25 route du Rhin', 'Strasbourg' );
INSERT INTO theatres(name, address, city) values ('CGR Castille',  '24 place du Maréchal Leclerc', 'Poitiers' );
INSERT INTO theatres(name, address, city) values ('Balzac',  '1 rue Balzac,', 'Paris');
INSERT INTO theatres(name, address, city) values ('Jean Vigo',  '31 rue Louis de Coppet', 'Nice' );


-- TABLE DE JOINTURE
INSERT INTO movies_theatres(movie_id,theatre_id) VALUES (1,1);
INSERT INTO movies_theatres(movie_id,theatre_id) VALUES (1,2);
INSERT INTO movies_theatres(movie_id,theatre_id) VALUES (2,2);
INSERT INTO movies_theatres(movie_id,theatre_id) VALUES (5,1);
INSERT INTO movies_theatres(movie_id,theatre_id) VALUES (3,2);
INSERT INTO movies_theatres(movie_id,theatre_id) VALUES (3,3);
INSERT INTO movies_theatres(movie_id,theatre_id) VALUES (2,4);


