package me.riley.authlock.shared.storage;

import java.util.UUID;

public abstract class StorageHandler {

    public abstract String getKey(UUID uuid);

    public abstract void setKey(UUID uuid, String key);

    public abstract void removeKey(UUID uuid);

    public abstract String getBackupKey(UUID uuid);

    public abstract void setBackupKey(UUID uuid, String backupKey);

    public abstract void removeBackupKey(UUID uuid);



}
