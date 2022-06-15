--liquibase formatted sql

--changeset henrique.campos:create_table:client
--preconditions onFail:MARK_RAN onError:HALT
--precondition-sql-check expectedResult:0 ${tables_exists} = UPPER('client')
--comment: create table client
create table client (
    id ${uuid} primary key,
    deleted ${boolean} default ${false},
    created_at ${zonedDateTime},
    updated_at ${zonedDateTime},
    created_by ${varchar}(255),
    updated_by ${varchar}(255),
    name ${varchar}(10) NOT NULL,
    cpf ${varchar}(11),
    cnpj ${varchar}(15)
);
COMMENT ON TABLE client IS 'table used to store clients';
COMMENT ON COLUMN client.id IS 'primary key, table identifier';
COMMENT ON COLUMN client.deleted IS 'column used to identify logical exclusion';
COMMENT ON COLUMN client.created_at IS 'column used to store creation date';
COMMENT ON COLUMN client.updated_at IS 'column used to store actualization date';
COMMENT ON COLUMN client.created_by IS 'column used to store creation user';
COMMENT ON COLUMN client.updated_by IS 'column used to store the update user';
COMMENT ON COLUMN client.name IS 'column used to store the client name';
COMMENT ON COLUMN client.cpf IS 'column used to store the customers identification document, when natural';
COMMENT ON COLUMN client.cnpj IS 'column used to store the customers identification document, when legal person';

--changeset henrique.campos:create_table:service_provided
--preconditions onFail:MARK_RAN onError:HALT
--precondition-sql-check expectedResult:0 ${tables_exists} = UPPER('service_provided')
--comment: create table service_provided
create table service_provided (
    id ${uuid} primary key,
    deleted ${boolean} default ${false},
    created_at ${zonedDateTime},
    updated_at ${zonedDateTime},
    created_by ${varchar}(255),
    updated_by ${varchar}(255),
    description ${varchar}(10) NOT NULL,
    value ${currency} NOT NULL,
    client_id ${uuid} NOT NULL,
    FOREIGN KEY (client_id) REFERENCES client(id)
);
COMMENT ON TABLE service_provided IS 'table used to store service_provided';
COMMENT ON COLUMN service_provided.id IS 'primary key, table identifier';
COMMENT ON COLUMN service_provided.deleted IS 'column used to identify logical exclusion';
COMMENT ON COLUMN service_provided.created_at IS 'column used to store creation date';
COMMENT ON COLUMN service_provided.updated_at IS 'column used to store actualization date';
COMMENT ON COLUMN service_provided.created_by IS 'column used to store creation user';
COMMENT ON COLUMN service_provided.updated_by IS 'column used to store the update user';
COMMENT ON COLUMN service_provided.description Is 'column used to store the description of service_provided';
COMMENT ON COLUMN service_provided.value Is 'column used to store the value service_provided';
COMMENT ON COLUMN service_provided.client_id Is 'client table reference';



--changeset henrique.campos:create_table:user_account
--preconditions onFail:MARK_RAN onError:HALT
--precondition-sql-check expectedResult:0 ${tables_exists} = UPPER('user_account')
--comment: create table user_account
create table user_account (
    id ${uuid} primary key,
    deleted ${boolean} default ${false},
    created_at ${zonedDateTime},
    updated_at ${zonedDateTime},
    created_by ${varchar}(255),
    updated_by ${varchar}(255),
    name ${varchar}(255) NOT NULL,
    password ${varchar}(255) NOT NULL
);


