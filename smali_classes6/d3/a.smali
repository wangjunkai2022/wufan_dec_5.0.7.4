.class public Ld3/a;
.super Ljava/lang/Object;
.source "DeviceConfigIniSolver.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()V
    .locals 11

    .line 1
    invoke-static {}, Lcom/xinzhu/datatransfer/b;->c()Ljava/io/File;

    move-result-object v0

    .line 2
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    .line 3
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 4
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v3

    long-to-int v0, v3

    new-array v3, v0, [B

    .line 5
    invoke-virtual {v2, v3}, Ljava/io/FileInputStream;->read([B)I

    move-result v4

    .line 6
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    if-ne v4, v0, :cond_2

    const/4 v2, 0x0

    .line 7
    invoke-virtual {v1, v3, v2, v0}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 8
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 9
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 10
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_3

    .line 11
    new-instance v4, Lcom/xinzhu/overmind/server/os/MindDeviceInfo;

    invoke-direct {v4}, Lcom/xinzhu/overmind/server/os/MindDeviceInfo;-><init>()V

    .line 12
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    .line 13
    invoke-virtual {v1}, Landroid/os/Parcel;->readByte()B

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x1

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    iput-boolean v6, v4, Lcom/xinzhu/overmind/server/os/MindDeviceInfo;->b:Z

    .line 14
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Lcom/xinzhu/overmind/server/os/MindDeviceInfo;->d:Ljava/lang/String;

    .line 15
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Lcom/xinzhu/overmind/server/os/MindDeviceInfo;->c:Ljava/lang/String;

    .line 16
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Lcom/xinzhu/overmind/server/os/MindDeviceInfo;->f:Ljava/lang/String;

    .line 17
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Lcom/xinzhu/overmind/server/os/MindDeviceInfo;->g:Ljava/lang/String;

    .line 18
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Lcom/xinzhu/overmind/server/os/MindDeviceInfo;->e:Ljava/lang/String;

    .line 19
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Lcom/xinzhu/overmind/server/os/MindDeviceInfo;->h:Ljava/lang/String;

    .line 20
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Lcom/xinzhu/overmind/server/os/MindDeviceInfo;->i:Ljava/lang/String;

    .line 21
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v6, :cond_1

    .line 22
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    .line 23
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    .line 24
    iget-object v10, v4, Lcom/xinzhu/overmind/server/os/MindDeviceInfo;->j:Ljava/util/Map;

    invoke-interface {v10, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 25
    :cond_1
    invoke-static {}, Lcom/xinzhu/overmind/client/frameworks/c;->a()Lcom/xinzhu/overmind/client/frameworks/c;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lcom/xinzhu/overmind/client/frameworks/c;->e(ILcom/xinzhu/overmind/server/os/MindDeviceInfo;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 26
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Unable to read Persistence file."

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :catch_0
    move-exception v0

    .line 27
    :try_start_1
    instance-of v2, v0, Ljava/io/FileNotFoundException;

    if-nez v2, :cond_3

    .line 28
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    :cond_3
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    return-void

    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 30
    goto :goto_5

    :goto_4
    throw v0

    :goto_5
    goto :goto_4
.end method
