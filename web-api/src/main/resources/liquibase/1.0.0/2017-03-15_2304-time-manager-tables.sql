CREATE TABLE "users" (
    id BIGSERIAL,
    email VARCHAR(64) NOT NULL,
    name VARCHAR(64) NOT NULL,

    PRIMARY KEY (id)
);

CREATE TABLE actions (
    id   BIGSERIAL,
    name VARCHAR(64) NOT NULL,
    description VARCHAR(256),

    PRIMARY KEY (id)
);

CREATE TABLE time_logs (
    id BIGSERIAL,
    user_id BIGINT NOT NULL,
    action_id BIGINT NOT NULL,
    time_begin TIMESTAMP WITH TIME ZONE NOT NULL,
    time_end TIMESTAMP WITH TIME ZONE,
    comment VARCHAR(512),

    PRIMARY KEY (id),
    CONSTRAINT user_fkey FOREIGN KEY (user_id) REFERENCES "users",
    CONSTRAINT action_fkey FOREIGN KEY (action_id) REFERENCES actions
);

CREATE INDEX time_logs_user_id ON time_logs (user_id);
CREATE UNIQUE INDEX time_logs_user_action_uniq ON time_logs (user_id, action_id);
