CREATE USER replication_user WITH REPLICATION ENCRYPTED PASSWORD 'replication_password';
SELECT pg_create_physical_replication_slot('replication_slot');
ALTER SYSTEM SET wal_level TO 'hot_standby';
ALTER SYSTEM SET archive_mode TO 'ON';
ALTER SYSTEM SET max_wal_senders TO '5';
ALTER SYSTEM SET wal_keep_segments TO '10';
ALTER SYSTEM SET listen_addresses TO '*';
ALTER SYSTEM SET hot_standby TO 'ON';