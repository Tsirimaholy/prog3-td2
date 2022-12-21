INSERT INTO team
VALUES (1, 'arg'),
       (2, 'ang'),
       (3, 'br'),
       (4, 'fr');


INSERT INTO player (name, number, team_id)
VALUES ('john', 2, 1),
       ('ben', 1, 1),
       ('bla', 1, 1),
       ('you', 4, 3),
       ('holee', 10, 2),
       ('pony', 5, 3);


INSERT INTO sponsor
VALUES (1, 'star fox'),
       (2, 'cola'),
       (3, 'adidas');

INSERT INTO team_sponsor(team_id, sponsor_id)
VALUES (1, 1),
       (1, 3),
       (2, 2),
       (3, 1),
       (3, 2);

INSERT INTO play_against (team1_id, team2_id, stadium, date_time)
VALUES (1, 2, 'STADIUM1', '2022-02-01'),
       (1, 3, 'STADIUM1', '2022-02-02'),
       (1, 4, 'STADIUM0', '2022-01-05');