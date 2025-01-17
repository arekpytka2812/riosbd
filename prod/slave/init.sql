ALTER SYSTEM SET hot_standby TO 'ON';
ALTER SYSTEM SET primary_conninfo to 'host=192.168.0.2 port=5432 user=replication_user password=replication_password';