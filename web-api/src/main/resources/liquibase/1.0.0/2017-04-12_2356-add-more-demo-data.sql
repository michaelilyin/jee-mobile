INSERT INTO time_logs (user_id, action_id, time_begin, time_end)
    (SELECT u.id, a.id, to_date('01 Apr 2016, 10:15', 'DD Mon YYYY HH24:MI'), to_date('01 Apr 2016, 11:30', 'DD Mon YYYY HH24:MI')
     FROM "users" u JOIN actions a ON u.email = 'user2@domain.com' AND a.name = 'Walking'
    );

INSERT INTO time_logs (user_id, action_id, time_begin, time_end)
    (SELECT u.id, a.id, to_date('01 Apr 2016, 11:30', 'DD Mon YYYY HH24:MI'), to_date('01 Apr 2016, 19:45', 'DD Mon YYYY HH24:MI')
     FROM "users" u JOIN actions a ON u.email = 'user2@domain.com' AND a.name = 'Working'
    );

INSERT INTO time_logs (user_id, action_id, time_begin, time_end)
    (SELECT u.id, a.id, to_date('01 Apr 2016, 19:50', 'DD Mon YYYY HH24:MI'), to_date('01 Apr 2016, 20:30', 'DD Mon YYYY HH24:MI')
     FROM "users" u JOIN actions a ON u.email = 'user2@domain.com' AND a.name = 'Walking'
    );

INSERT INTO time_logs (user_id, action_id, time_begin, time_end)
    (SELECT u.id, a.id, to_date('01 Apr 2016, 23:50', 'DD Mon YYYY HH24:MI'), to_date('02 Apr 2016, 07:35', 'DD Mon YYYY HH24:MI')
     FROM "users" u JOIN actions a ON u.email = 'user2@domain.com' AND a.name = 'Sleeping'
    );

INSERT INTO time_logs (user_id, action_id, time_begin, time_end)
    (SELECT u.id, a.id, to_date('02 Apr 2016, 09:00', 'DD Mon YYYY HH24:MI'), to_date('02 Apr 2016, 09:30', 'DD Mon YYYY HH24:MI')
     FROM "users" u JOIN actions a ON u.email = 'user2@domain.com' AND a.name = 'Walking'
    );

INSERT INTO time_logs (user_id, action_id, time_begin, time_end)
    (SELECT u.id, a.id, to_date('02 Apr 2016, 09:35', 'DD Mon YYYY HH24:MI'), to_date('02 Apr 2016, 18:30', 'DD Mon YYYY HH24:MI')
     FROM "users" u JOIN actions a ON u.email = 'user2@domain.com' AND a.name = 'Working'
    );

INSERT INTO time_logs (user_id, action_id, time_begin, time_end)
    (SELECT u.id, a.id, to_date('02 Apr 2016, 18:30', 'DD Mon YYYY HH24:MI'), to_date('02 Apr 2016, 18:40', 'DD Mon YYYY HH24:MI')
     FROM "users" u JOIN actions a ON u.email = 'user2@domain.com' AND a.name = 'Walking'
    );

INSERT INTO time_logs (user_id, action_id, time_begin, time_end)
    (SELECT u.id, a.id, to_date('02 Apr 2016, 18:40', 'DD Mon YYYY HH24:MI'), to_date('02 Apr 2016, 20:30', 'DD Mon YYYY HH24:MI')
     FROM "users" u JOIN actions a ON u.email = 'user2@domain.com' AND a.name = 'University'
    );

INSERT INTO time_logs (user_id, action_id, time_begin, time_end)
    (SELECT u.id, a.id, to_date('02 Apr 2016, 20:30', 'DD Mon YYYY HH24:MI'), to_date('02 Apr 2016, 21:00', 'DD Mon YYYY HH24:MI')
     FROM "users" u JOIN actions a ON u.email = 'user2@domain.com' AND a.name = 'Walking'
    );

INSERT INTO time_logs (user_id, action_id, time_begin, time_end)
    (SELECT u.id, a.id, to_date('03 Apr 2016, 00:05', 'DD Mon YYYY HH24:MI'), to_date('03 Apr 2016, 08:00', 'DD Mon YYYY HH24:MI')
     FROM "users" u JOIN actions a ON u.email = 'user2@domain.com' AND a.name = 'Sleeping'
    );

INSERT INTO time_logs (user_id, action_id, time_begin, time_end)
    (SELECT u.id, a.id, to_date('03 Apr 2016, 09:15', 'DD Mon YYYY HH24:MI'), to_date('03 Apr 2016, 09:40', 'DD Mon YYYY HH24:MI')
     FROM "users" u JOIN actions a ON u.email = 'user2@domain.com' AND a.name = 'Walking'
    );
