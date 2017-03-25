CREATE TABLE demo (
  id   BIGSERIAL,
  name TEXT NOT NULL,

  PRIMARY KEY (id)
);

INSERT INTO demo (name) VALUES
  ('Michael'),
  ('Ann'),
  ('Somewhere');