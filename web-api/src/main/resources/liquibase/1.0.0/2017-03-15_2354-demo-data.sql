INSERT INTO "users" (email, name) VALUES
    ('user1@domain.com', 'User 1'),
    ('user2@domain.com', 'User 2'),
    ('user3@domain.com', 'User 3')
;

INSERT INTO actions (name) VALUES
    ('Working'),
    ('Walking'),
    ('University'),
    ('Sleeping')
;

INSERT INTO time_logs (user_id, action_id, time_begin)
    (SELECT u.id, a.id, to_date('05 Dec 2016', 'DD Mon YYYY') FROM "users" u JOIN actions a ON u.email = 'user1@domain.com' AND a.name = 'Working');

INSERT INTO time_logs (user_id, action_id, time_begin)
    (SELECT u.id, a.id, to_date('02 Dec 2016', 'DD Mon YYYY') FROM "users" u JOIN actions a ON u.email = 'user2@domain.com' AND a.name = 'Walking');

INSERT INTO time_logs (user_id, action_id, time_begin)
    (SELECT u.id, a.id, to_date('03 Dec 2016', 'DD Mon YYYY') FROM "users" u JOIN actions a ON u.email = 'user2@domain.com' AND a.name = 'University');

INSERT INTO time_logs (user_id, action_id, time_begin)
    (SELECT u.id, a.id, to_date('04 Dec 2016', 'DD Mon YYYY') FROM "users" u JOIN actions a ON u.email = 'user2@domain.com' AND a.name = 'Sleeping');
