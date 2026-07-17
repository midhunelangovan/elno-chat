CREATE TABLE `chat`(
    `id` VARCHAR(50) PRIMARY KEY,
    `type` VARCHAR(10) NOT NULL,
    `name` VARCHAR(100) NOT NULL,
    `description`  TEXT
);

CREATE TABLE `chat_message`(
    `id` VARCHAR(50) PRIMARY KEY,
    `chat_id` VARCHAR(50) NOT NULL,
    `user_id` BIGINT NOT NULL,
    `user_role` VARCHAR(100) NOT NULL,
    `joined_at` TIMESTAMP NOT NULL,
    `left_at` TIMESTAMP,
    `is_active` BIT NOT NULL DEFAULT 0,
    CONSTRAINT `chat_fk_avnairuebibiebv` FOREIGN KEY (`chat_id`) REFERENCES `chat`(`id`)
);

CREATE TABLE `message`(
    `id` VARCHAR(50) PRIMARY KEY,
    `chat_id` VARCHAR(50) NOT NULL,
    `sender_id` VARCHAR(50) NOT NULL,
    `content` TEXT NOT NULL,
    `type` VARCHAR(20) NOT NULL,
    `status` VARCHAR(20) NOT NULL,
    `reply_to_message_id` VARCHAR(100),
    `edited` BIT NOT NULL DEFAULT 0,
    `deleted` BIT NOT NULL DEFAULT 0,
    CONSTRAINT `fk_chatangubivbnv` FOREIGN KEY (`chat_id`) REFERENCES `chat`(`id`),
    CONSTRAINT `fk_vbni4ubgnwfekafj` FOREIGN KEY (sender_id) REFERENCES `chat_message`(`id`)
);