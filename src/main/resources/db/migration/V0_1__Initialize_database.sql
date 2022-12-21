CREATE TABLE "team"
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE "player"
(
    id      SERIAL PRIMARY KEY,
    name    VARCHAR(255),
    number  INTEGER,
    team_id INTEGER REFERENCES team (id)
);

CREATE TABLE "sponsor"
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE "team_sponsor"
(
    id         SERIAL PRIMARY KEY,
    team_id    INTEGER REFERENCES team (id),
    sponsor_id INTEGER REFERENCES sponsor (id),
    CONSTRAINT unique__team_sponsor UNIQUE (sponsor_id, team_id)
);


CREATE TABLE "play_against"
(
    id SERIAL PRIMARY KEY,
    team1_id INTEGER REFERENCES team (id),
    team2_id INTEGER REFERENCES team (id),
    stadium VARCHAR(100),
    date_time timestamp,
    CONSTRAINT team_are_different CHECK ( team2_id != team1_id ),
    UNIQUE (team1_id, team2_id)
);