.class public Lcom/join/mgps/service/CommonService;
.super Landroid/app/Service;
.source "CommonService.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/service/CommonService$p;,
        Lcom/join/mgps/service/CommonService$t;,
        Lcom/join/mgps/service/CommonService$s;,
        Lcom/join/mgps/service/CommonService$r;,
        Lcom/join/mgps/service/CommonService$q;,
        Lcom/join/mgps/service/CommonService$u;,
        Lcom/join/mgps/service/CommonService$o;,
        Lcom/join/mgps/service/CommonService$n;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EService;
.end annotation


# static fields
.field private static final T:Ljava/lang/String; = "CommonService"

.field public static U:Z = true

.field public static V:Z = true

.field public static W:Z

.field static X:Z

.field static Y:Z


# instance fields
.field A:Lcom/papa/controller/core/d;

.field B:Z

.field private C:I

.field D:Ljava/util/concurrent/ScheduledExecutorService;

.field E:I

.field F:I

.field G:I

.field H:I

.field I:I

.field J:Ljava/lang/String;

.field K:Lcom/join/mgps/service/CommonService$p;

.field private L:Z

.field private M:Ljava/lang/String;

.field N:Z

.field O:Ljava/util/concurrent/atomic/AtomicBoolean;

.field P:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final Q:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/join/mgps/dto/DownloadScanEvent;",
            ">;"
        }
    .end annotation
.end field

.field R:Ljava/util/concurrent/ScheduledExecutorService;

.field private final S:Lapp/mgsim/arena/SocketListener$NotifyObserver;

.field private b:Ljava/util/concurrent/ScheduledExecutorService;

.field c:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field d:Lcom/join/mgps/Util/b;
    .annotation build Lorg/androidannotations/annotations/Bean;
    .end annotation
.end field

.field e:Landroid/content/Intent;

.field private f:Lcom/join/mgps/dto/RecomDatabean;

.field g:Landroid/content/IntentFilter;

.field h:Landroid/content/IntentFilter;

.field i:Landroid/content/IntentFilter;

.field j:Landroid/content/IntentFilter;

.field k:Landroid/content/IntentFilter;

.field l:Lcom/join/mgps/service/CommonService$r;

.field m:Lcom/join/mgps/service/CommonService$s;

.field private n:Landroid/content/Context;

.field o:Ljava/lang/Thread;

.field private p:Ljava/lang/String;

.field private q:Z

.field r:Landroid/os/Handler;

.field s:Lcom/github/snowdream/android/app/downloader/b;

.field t:Lcom/github/snowdream/android/app/downloader/b$b;

.field u:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/github/snowdream/android/app/downloader/c;",
            ">;"
        }
    .end annotation
.end field

.field private v:Lcom/join/mgps/socket/fight/arena/b;

.field private w:Z

.field x:Landroid/os/CountDownTimer;

.field private y:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field z:Lcom/join/mgps/rpc/k;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/service/CommonService;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 3
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.join.mgps.activity.sendUI"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/join/mgps/service/CommonService;->e:Landroid/content/Intent;

    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lcom/join/mgps/service/CommonService;->q:Z

    .line 5
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    iput-object v2, p0, Lcom/join/mgps/service/CommonService;->r:Landroid/os/Handler;

    const/4 v2, 0x0

    .line 6
    iput-object v2, p0, Lcom/join/mgps/service/CommonService;->s:Lcom/github/snowdream/android/app/downloader/b;

    .line 7
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    iput-object v3, p0, Lcom/join/mgps/service/CommonService;->u:Ljava/util/Map;

    .line 8
    iput-boolean v1, p0, Lcom/join/mgps/service/CommonService;->w:Z

    .line 9
    iput-object v2, p0, Lcom/join/mgps/service/CommonService;->y:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 10
    iput-boolean v1, p0, Lcom/join/mgps/service/CommonService;->B:Z

    const/4 v3, 0x5

    .line 11
    iput v3, p0, Lcom/join/mgps/service/CommonService;->C:I

    .line 12
    iput-object v2, p0, Lcom/join/mgps/service/CommonService;->D:Ljava/util/concurrent/ScheduledExecutorService;

    .line 13
    iput v1, p0, Lcom/join/mgps/service/CommonService;->E:I

    .line 14
    iput v1, p0, Lcom/join/mgps/service/CommonService;->F:I

    const/16 v2, 0x14

    .line 15
    iput v2, p0, Lcom/join/mgps/service/CommonService;->G:I

    .line 16
    iput v1, p0, Lcom/join/mgps/service/CommonService;->H:I

    .line 17
    iput v1, p0, Lcom/join/mgps/service/CommonService;->I:I

    const-string v2, "11111"

    .line 18
    iput-object v2, p0, Lcom/join/mgps/service/CommonService;->J:Ljava/lang/String;

    .line 19
    iput-boolean v1, p0, Lcom/join/mgps/service/CommonService;->N:Z

    .line 20
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v2, p0, Lcom/join/mgps/service/CommonService;->O:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/service/CommonService;->P:Ljava/util/HashMap;

    .line 22
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/service/CommonService;->Q:Ljava/util/HashMap;

    .line 23
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/service/CommonService;->R:Ljava/util/concurrent/ScheduledExecutorService;

    .line 24
    new-instance v0, Lcom/join/mgps/service/CommonService$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService$d;-><init>(Lcom/join/mgps/service/CommonService;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService;->S:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    return-void
.end method

.method private A()V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/join/mgps/service/CommonService;->U:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/join/mgps/service/CommonService;->v0()V

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/service/CommonService;->s()V

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/service/CommonService;->w()V

    return-void
.end method

.method private B(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    .line 1
    :try_start_0
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->p:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ".png"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    .line 4
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 5
    :cond_0
    :try_start_1
    new-instance v1, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/join/mgps/Util/v;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "MG"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".nomedia"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_2

    .line 7
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_1

    .line 8
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 9
    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_0

    :catch_0
    move-exception v1

    .line 10
    :try_start_2
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    .line 11
    :cond_2
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/service/CommonService;->p:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 12
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 13
    :try_start_3
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 14
    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    .line 15
    :cond_3
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    .line 16
    new-instance v3, Ljava/net/URL;

    invoke-direct {v3, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 17
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    check-cast p1, Ljava/net/HttpURLConnection;

    const/16 v3, 0x1388

    .line 18
    invoke-virtual {p1, v3}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    const-string v3, "GET"

    .line 19
    invoke-virtual {p1, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/4 v3, 0x1

    .line 20
    invoke-virtual {p1, v3}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 21
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v3

    const/16 v4, 0xc8

    if-ne v3, v4, :cond_5

    .line 22
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    .line 23
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/16 v4, 0x400

    new-array v4, v4, [B

    .line 24
    :goto_1
    invoke-virtual {p1, v4}, Ljava/io/InputStream;->read([B)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_4

    const/4 v6, 0x0

    .line 25
    invoke-virtual {v3, v4, v6, v5}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_1

    .line 26
    :cond_4
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 27
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V

    return-object v1

    .line 28
    :cond_5
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 29
    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_2

    :catch_2
    move-exception p1

    move-object v2, v0

    .line 30
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    if-eqz v2, :cond_6

    .line 31
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 32
    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    :cond_6
    :goto_3
    return-object v0
.end method

.method private C(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    .line 1
    :try_start_0
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->p:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ".mp4"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    .line 4
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 5
    :cond_0
    :try_start_1
    new-instance v1, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/join/mgps/Util/v;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "MG"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".nomedia"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_2

    .line 7
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_1

    .line 8
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 9
    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_0

    :catch_0
    move-exception v1

    .line 10
    :try_start_2
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    .line 11
    :cond_2
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/service/CommonService;->p:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 12
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 13
    :try_start_3
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 14
    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    .line 15
    :cond_3
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    .line 16
    new-instance v3, Ljava/net/URL;

    invoke-direct {v3, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 17
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    check-cast p1, Ljava/net/HttpURLConnection;

    const/16 v3, 0x1388

    .line 18
    invoke-virtual {p1, v3}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    const-string v3, "GET"

    .line 19
    invoke-virtual {p1, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/4 v3, 0x1

    .line 20
    invoke-virtual {p1, v3}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 21
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v3

    const/16 v4, 0xc8

    if-ne v3, v4, :cond_5

    .line 22
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    .line 23
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/16 v4, 0x400

    new-array v4, v4, [B

    .line 24
    :goto_1
    invoke-virtual {p1, v4}, Ljava/io/InputStream;->read([B)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_4

    const/4 v6, 0x0

    .line 25
    invoke-virtual {v3, v4, v6, v5}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_1

    .line 26
    :cond_4
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 27
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V

    return-object v1

    .line 28
    :cond_5
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 29
    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_2

    :catch_2
    move-exception p1

    move-object v2, v0

    .line 30
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    if-eqz v2, :cond_6

    .line 31
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 32
    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    :cond_6
    :goto_3
    return-object v0
.end method

.method public static H(Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 4
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 5
    array-length v1, v0

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    .line 6
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_5

    .line 7
    aget-object v2, v0, v1

    .line 8
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 9
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, ".apk"

    .line 10
    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, ".zip"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 11
    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 12
    :cond_2
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/service/CommonService;->H(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 13
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_3

    goto :goto_1

    .line 14
    :cond_3
    invoke-interface {p0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    :goto_2
    return-object p0
.end method

.method private K1(Lcom/join/mgps/dto/DownloadGameArgsBean;Lcom/join/mgps/dto/CollectionBeanSub;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 9

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getRecPosition()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/join/mgps/dto/DownloadPointBase;->setRecPosition(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getRemarks()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/join/mgps/dto/DownloadPointBase;->setReMarks(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getNodeId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/join/mgps/dto/DownloadPointBase;->setNodeId(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getFrom()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getFromType()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getVolcanoOther()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getVolcanoOther()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    invoke-virtual {v0, v1, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    invoke-virtual {p2, v0}, Lcom/join/mgps/dto/DownloadPointBase;->setPosition_path(Lcom/psk/eventmodule/StatFactory$VolcanoOther;)V

    .line 8
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getFrom()I

    move-result v0

    invoke-virtual {p3, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from(I)V

    .line 9
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getFromType()I

    move-result v0

    invoke-virtual {p3, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    .line 10
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->isFromRecommend()Z

    move-result v0

    invoke-virtual {p3, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setFromRecomDown(Z)V

    .line 11
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getKeyWord()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setKeyword(Ljava/lang/String;)V

    .line 12
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getExt()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setExt(Ljava/lang/String;)V

    .line 13
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getExt1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setExt1(Ljava/lang/String;)V

    .line 14
    :cond_1
    invoke-virtual {p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v2}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 15
    new-instance p1, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {p1}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 v0, 0x4

    .line 16
    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 17
    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionBeanSub;->getDown_url_remote()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 18
    iget-object p2, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {p3, p2}, Lcom/join/mgps/Util/UtilsMy;->T2(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    .line 19
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p2

    invoke-virtual {p2, p3}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object p3, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {p2, p3, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void

    .line 21
    :cond_2
    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_3

    .line 22
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 23
    :cond_3
    invoke-static {p3, p2}, Lcom/join/mgps/Util/UtilsMy;->y1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/CollectionBeanSub;)V

    .line 24
    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionBeanSub;->getDown_status()I

    move-result v0

    const/4 v1, 0x5

    const-string v2, "gameid"

    const-string v3, "com.wufun.down.androidversion"

    if-ne v0, v1, :cond_6

    .line 25
    invoke-virtual {p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMax_an_compatible_ver()I

    move-result p1

    if-lez p1, :cond_5

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMin_an_compatible_ver()I

    move-result p2

    if-lt p1, p2, :cond_4

    invoke-virtual {p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMax_an_compatible_ver()I

    move-result p2

    if-le p1, p2, :cond_5

    :cond_4
    invoke-virtual {p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 26
    iput-object p3, p0, Lcom/join/mgps/service/CommonService;->y:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 27
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 28
    iget-object p2, p0, Lcom/join/mgps/service/CommonService;->y:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 29
    invoke-virtual {p0, p1}, Landroid/app/Service;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0

    .line 30
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {p1, p3}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 31
    :cond_6
    invoke-virtual {p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMax_an_compatible_ver()I

    move-result v0

    if-lez v0, :cond_8

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMin_an_compatible_ver()I

    move-result v1

    if-lt v0, v1, :cond_7

    invoke-virtual {p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMax_an_compatible_ver()I

    move-result v1

    if-le v0, v1, :cond_8

    :cond_7
    invoke-virtual {p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 32
    iput-object p3, p0, Lcom/join/mgps/service/CommonService;->y:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 33
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 34
    iget-object p2, p0, Lcom/join/mgps/service/CommonService;->y:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 35
    invoke-virtual {p0, p1}, Landroid/app/Service;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0

    .line 36
    :cond_8
    iget-object v3, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionBeanSub;->getTp_down_url()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionBeanSub;->getOther_down_switch()I

    move-result v6

    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionBeanSub;->getCdn_down_switch()I

    move-result v7

    move-object v4, p3

    move-object v8, p1

    invoke-static/range {v3 .. v8}, Lcom/join/mgps/Util/UtilsMy;->S0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;IILcom/join/mgps/dto/DownloadGameArgsBean;)V

    :goto_0
    return-void
.end method

.method private S()V
    .locals 16

    move-object/from16 v1, p0

    const-string v2, "failed  "

    const-string v3, "getEMUVersionForArena"

    .line 1
    invoke-static/range {p0 .. p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v4, 0x0

    const-wide/16 v5, 0x1388

    const/4 v7, 0x1

    .line 2
    :try_start_0
    invoke-static/range {p0 .. p0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v0

    const/4 v8, 0x2

    const/4 v9, 0x0

    invoke-virtual {v0, v8, v8, v9}, Lcom/join/mgps/Util/RequestBeanUtil;->getApkVersion(III)Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/join/mgps/rpc/impl/d;->P1()Lcom/join/mgps/rpc/impl/d;

    move-result-object v8

    invoke-virtual {v8, v0}, Lcom/join/mgps/rpc/impl/d;->C1(Lcom/join/mgps/dto/CommonRequestBean;)Lcom/join/mgps/dto/ResultMainBean;

    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v8, :cond_2

    .line 4
    :try_start_1
    invoke-virtual {v8}, Lcom/join/mgps/dto/ResultMainBean;->getFlag()I

    move-result v0

    if-ne v0, v7, :cond_2

    .line 5
    invoke-virtual {v8}, Lcom/join/mgps/dto/ResultMainBean;->getMessages()Lcom/join/mgps/dto/ResultMessageBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMessageBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 6
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ApkVersionbean;

    .line 7
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v11

    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v11

    .line 8
    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    const-string v13, "tag_id"

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v12, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v13

    invoke-virtual {v13, v12}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v12

    if-eqz v12, :cond_1

    .line 11
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v13

    if-lez v13, :cond_1

    .line 12
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v13

    if-le v13, v7, :cond_0

    const/4 v13, 0x0

    .line 13
    :goto_1
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v14

    if-ge v13, v14, :cond_0

    .line 14
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v14

    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/join/mgps/db/tables/EMUApkArenaTable;

    invoke-virtual {v14, v15}, Lp1/b;->delete(Ljava/lang/Object;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 15
    :cond_0
    :try_start_2
    invoke-interface {v12, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/join/mgps/db/tables/EMUApkArenaTable;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 16
    :try_start_3
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getApk_name()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setApk_name(Ljava/lang/String;)V

    .line 17
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getDown_url()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setDown_url(Ljava/lang/String;)V

    .line 18
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getLaunch_name()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setLaunch_name(Ljava/lang/String;)V

    .line 19
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getLogo()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setLogo(Ljava/lang/String;)V

    .line 20
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getPackage_name()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setPackage_name(Ljava/lang/String;)V

    .line 21
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getRelease_date()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setRelease_date(Ljava/lang/String;)V

    .line 22
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getSize()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setSize(Ljava/lang/String;)V

    .line 23
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setTag_id(Ljava/lang/String;)V

    .line 24
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getTeam_info()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setTeam_info(Ljava/lang/String;)V

    .line 25
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getVer()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setVer(Ljava/lang/String;)V

    .line 26
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getVer_compatible()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setVer_compatible(Ljava/lang/String;)V

    .line 27
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getVer_info()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setVer_info(Ljava/lang/String;)V

    .line 28
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getDown_type()I

    move-result v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setDown_type(I)V

    .line 29
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getPlugin_md5()Lcom/join/mgps/dto/ApkVersionRemarkBean;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setRemark(Ljava/lang/String;)V

    .line 30
    invoke-static {v11, v12}, Lcom/join/android/app/common/utils/l;->H(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/db/tables/EMUApkArenaTable;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v12, v4

    .line 31
    :goto_2
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 32
    :goto_3
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v0

    invoke-virtual {v0, v12}, Lp1/b;->update(Ljava/lang/Object;)I

    .line 33
    invoke-static {v12}, Lcom/join/android/app/common/utils/l;->E(Lcom/join/mgps/db/tables/EMUApkArenaTable;)V

    goto/16 :goto_0

    .line 34
    :cond_1
    new-instance v12, Lcom/join/mgps/db/tables/EMUApkArenaTable;

    invoke-direct {v12}, Lcom/join/mgps/db/tables/EMUApkArenaTable;-><init>()V

    .line 35
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getApk_name()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setApk_name(Ljava/lang/String;)V

    .line 36
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getDown_url()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setDown_url(Ljava/lang/String;)V

    .line 37
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getLaunch_name()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setLaunch_name(Ljava/lang/String;)V

    .line 38
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getLogo()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setLogo(Ljava/lang/String;)V

    .line 39
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getPackage_name()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setPackage_name(Ljava/lang/String;)V

    .line 40
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getRelease_date()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setRelease_date(Ljava/lang/String;)V

    .line 41
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getSize()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setSize(Ljava/lang/String;)V

    .line 42
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setTag_id(Ljava/lang/String;)V

    .line 43
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getTeam_info()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setTeam_info(Ljava/lang/String;)V

    .line 44
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getVer()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setVer(Ljava/lang/String;)V

    .line 45
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getVer_compatible()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setVer_compatible(Ljava/lang/String;)V

    .line 46
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getVer_info()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setVer_info(Ljava/lang/String;)V

    .line 47
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getDown_type()I

    move-result v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setDown_type(I)V

    .line 48
    invoke-virtual {v0}, Lcom/join/mgps/dto/ApkVersionbean;->getPlugin_md5()Lcom/join/mgps/dto/ApkVersionRemarkBean;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->setRemark(Ljava/lang/String;)V

    .line 49
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v0

    invoke-virtual {v0, v12}, Lp1/b;->k(Ljava/lang/Object;)I

    .line 50
    invoke-static {v11, v12}, Lcom/join/android/app/common/utils/l;->H(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/db/tables/EMUApkArenaTable;)Z

    .line 51
    invoke-static {v12}, Lcom/join/android/app/common/utils/l;->E(Lcom/join/mgps/db/tables/EMUApkArenaTable;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    move-object v4, v8

    goto :goto_5

    :catch_2
    move-object v4, v8

    goto :goto_6

    :cond_2
    if-nez v8, :cond_4

    .line 52
    iget v0, v1, Lcom/join/mgps/service/CommonService;->C:I

    if-lez v0, :cond_4

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lcom/join/mgps/service/CommonService;->f:Lcom/join/mgps/dto/RecomDatabean;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    iget v0, v1, Lcom/join/mgps/service/CommonService;->C:I

    sub-int/2addr v0, v7

    iput v0, v1, Lcom/join/mgps/service/CommonService;->C:I

    .line 55
    :goto_4
    :try_start_5
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V

    .line 56
    invoke-direct/range {p0 .. p0}, Lcom/join/mgps/service/CommonService;->S()V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_7

    :catchall_1
    move-exception v0

    :goto_5
    if-nez v4, :cond_3

    .line 57
    iget v4, v1, Lcom/join/mgps/service/CommonService;->C:I

    if-lez v4, :cond_3

    .line 58
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lcom/join/mgps/service/CommonService;->f:Lcom/join/mgps/dto/RecomDatabean;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    iget v2, v1, Lcom/join/mgps/service/CommonService;->C:I

    sub-int/2addr v2, v7

    iput v2, v1, Lcom/join/mgps/service/CommonService;->C:I

    .line 60
    :try_start_6
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V

    .line 61
    invoke-direct/range {p0 .. p0}, Lcom/join/mgps/service/CommonService;->S()V
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_3

    .line 62
    :catch_3
    :cond_3
    throw v0

    :catch_4
    :goto_6
    if-nez v4, :cond_4

    .line 63
    iget v0, v1, Lcom/join/mgps/service/CommonService;->C:I

    if-lez v0, :cond_4

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lcom/join/mgps/service/CommonService;->f:Lcom/join/mgps/dto/RecomDatabean;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    iget v0, v1, Lcom/join/mgps/service/CommonService;->C:I

    sub-int/2addr v0, v7

    iput v0, v1, Lcom/join/mgps/service/CommonService;->C:I

    goto :goto_4

    :catch_5
    :cond_4
    :goto_7
    return-void
.end method

.method private Y(Lcom/join/mgps/dto/DownloadGameArgsBean;)V
    .locals 13

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getGameId()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->isFromRecommend()Z

    move-result v9

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getFrom()I

    move-result v6

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getFromType()I

    move-result v7

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getKeyWord()Ljava/lang/String;

    move-result-object v10

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getRecPosition()Ljava/lang/String;

    move-result-object v3

    .line 7
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getRemarks()Ljava/lang/String;

    move-result-object v4

    .line 8
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getNodeId()Ljava/lang/String;

    move-result-object v5

    .line 9
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 10
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 11
    new-instance v11, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;

    invoke-direct {v11}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;-><init>()V

    .line 12
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 13
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    invoke-virtual {v11, v2}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;->setGameIdList(Ljava/util/List;)V

    .line 15
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getLocation()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;->setLocation(I)V

    .line 16
    invoke-virtual {v1, v11}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 17
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object v0

    invoke-interface {v0, v1}, Le2/i;->g1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object v0

    new-instance v12, Lcom/join/mgps/service/CommonService$g;

    move-object v1, v12

    move-object v2, p0

    move-object v8, p1

    invoke-direct/range {v1 .. v11}, Lcom/join/mgps/service/CommonService$g;-><init>(Lcom/join/mgps/service/CommonService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/join/mgps/dto/DownloadGameArgsBean;ZLjava/lang/String;Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;)V

    invoke-interface {v0, v12}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private Y0()V
    .locals 9

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    .line 3
    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 4
    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {}, Lcom/join/mgps/rpc/impl/g;->A0()Lcom/join/mgps/rpc/impl/g;

    move-result-object v3

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v4

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    const-string v8, ""

    invoke-virtual/range {v3 .. v8}, Lcom/join/mgps/rpc/impl/g;->k(ILjava/lang/String;IILjava/lang/String;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ForumData$ForumProfilePostsData;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    if-eqz v0, :cond_4

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$ForumProfilePostsData;->getUser_info()Lcom/join/mgps/dto/ForumBean$ForumProfilePostUserInfoBean;

    move-result-object v1

    .line 8
    invoke-static {v0}, Lcom/join/mgps/Util/j0;->n1(Lcom/join/mgps/dto/ForumData$ForumProfilePostsData;)V

    .line 9
    invoke-static {p0}, Lcom/join/mgps/Util/k0;->I1(Landroid/content/Context;)Lcom/join/mgps/Util/k0;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/j0;->c1(Lcom/join/mgps/dto/ForumBean$ForumProfilePostUserInfoBean;)V

    goto :goto_1

    :cond_2
    :goto_0
    return-void

    :catchall_0
    move-exception v0

    .line 10
    throw v0

    .line 11
    :cond_3
    new-instance v0, Lcom/join/mgps/dto/ForumBean$ForumProfilePostUserInfoBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ForumBean$ForumProfilePostUserInfoBean;-><init>()V

    .line 12
    :try_start_1
    invoke-static {}, Lb2/t;->p()Lb2/t;

    move-result-object v0

    sget-object v1, Lcom/join/mgps/dto/ForumBean$ForumEvent;->ProfilePosts:Lcom/join/mgps/dto/ForumBean$ForumEvent;

    invoke-virtual {v0, v1}, Lb2/t;->o(Lcom/join/mgps/dto/ForumBean$ForumEvent;)Lcom/join/mgps/db/tables/ForumTable;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/db/tables/ForumTable;->getArgs1()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v0}, Lcom/join/mgps/db/tables/ForumTable;->getArgs1()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\"\""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 14
    invoke-virtual {v0}, Lcom/join/mgps/db/tables/ForumTable;->getArgs1()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/j0;->H(Ljava/lang/String;)Lcom/join/mgps/dto/ForumData$ForumProfilePostsData;

    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$ForumProfilePostsData;->getUser_info()Lcom/join/mgps/dto/ForumBean$ForumProfilePostUserInfoBean;

    move-result-object v0

    .line 16
    invoke-static {p0}, Lcom/join/mgps/Util/k0;->I1(Landroid/content/Context;)Lcom/join/mgps/Util/k0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/join/mgps/Util/j0;->c1(Lcom/join/mgps/dto/ForumBean$ForumProfilePostUserInfoBean;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_4
    :goto_1
    return-void
.end method

.method private Z0()V
    .locals 6

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    .line 3
    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 4
    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {}, Lcom/join/mgps/rpc/impl/g;->A0()Lcom/join/mgps/rpc/impl/g;

    move-result-object v3

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v4

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v2

    const-string v5, ""

    invoke-virtual {v3, v4, v2, v5}, Lcom/join/mgps/rpc/impl/g;->K(ILjava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 6
    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/ForumData$ForumProfileUnreadMessageCountData;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v0, v2

    :cond_1
    if-eqz v0, :cond_3

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$ForumProfileUnreadMessageCountData;->getUnread()I

    move-result v1

    goto :goto_1

    .line 8
    :cond_2
    :goto_0
    invoke-static {v0}, Lcom/join/mgps/Util/j0;->o1(Lcom/join/mgps/dto/ForumData$ForumProfileUnreadMessageCountData;)V

    .line 9
    invoke-static {p0}, Lcom/join/mgps/Util/k0;->I1(Landroid/content/Context;)Lcom/join/mgps/Util/k0;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/j0;->b1(I)V

    return-void

    :catchall_0
    move-exception v2

    goto :goto_2

    :catch_0
    move-exception v2

    .line 10
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    :cond_3
    :goto_1
    invoke-static {v0}, Lcom/join/mgps/Util/j0;->o1(Lcom/join/mgps/dto/ForumData$ForumProfileUnreadMessageCountData;)V

    .line 12
    invoke-static {p0}, Lcom/join/mgps/Util/k0;->I1(Landroid/content/Context;)Lcom/join/mgps/Util/k0;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/j0;->b1(I)V

    goto :goto_3

    .line 13
    :goto_2
    invoke-static {v0}, Lcom/join/mgps/Util/j0;->o1(Lcom/join/mgps/dto/ForumData$ForumProfileUnreadMessageCountData;)V

    .line 14
    invoke-static {p0}, Lcom/join/mgps/Util/k0;->I1(Landroid/content/Context;)Lcom/join/mgps/Util/k0;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/j0;->b1(I)V

    .line 15
    throw v2

    .line 16
    :cond_4
    invoke-static {}, Lb2/t;->p()Lb2/t;

    move-result-object v0

    sget-object v2, Lcom/join/mgps/dto/ForumBean$ForumEvent;->ProfileGetUnreadMessageCount:Lcom/join/mgps/dto/ForumBean$ForumEvent;

    invoke-virtual {v0, v2}, Lb2/t;->o(Lcom/join/mgps/dto/ForumBean$ForumEvent;)Lcom/join/mgps/db/tables/ForumTable;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 17
    invoke-virtual {v0}, Lcom/join/mgps/db/tables/ForumTable;->getArgs1()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 18
    invoke-virtual {v0}, Lcom/join/mgps/db/tables/ForumTable;->getArgs1()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/j0;->I(Ljava/lang/String;)Lcom/join/mgps/dto/ForumData$ForumProfileUnreadMessageCountData;

    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$ForumProfileUnreadMessageCountData;->getUnread()I

    move-result v1

    .line 20
    :cond_5
    invoke-static {p0}, Lcom/join/mgps/Util/k0;->I1(Landroid/content/Context;)Lcom/join/mgps/Util/k0;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/j0;->b1(I)V

    :goto_3
    return-void
.end method

.method public static synthetic a(Lcom/join/mgps/service/CommonService;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/service/CommonService;->r0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lcom/join/mgps/service/CommonService;Ljava/util/LinkedHashMap;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/service/CommonService;->q0(Ljava/util/LinkedHashMap;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c()V
    .locals 0

    invoke-static {}, Lcom/join/mgps/service/CommonService;->p0()V

    return-void
.end method

.method static synthetic h(Lcom/join/mgps/service/CommonService;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    return-object p0
.end method

.method private h1(Lcom/join/mgps/dto/DownloadGameArgsBean;I)V
    .locals 5

    const/16 v0, 0x31

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->z:Lcom/join/mgps/rpc/k;

    if-nez v1, :cond_0

    .line 2
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/service/CommonService;->z:Lcom/join/mgps/rpc/k;

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getGameId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lcom/join/mgps/service/CommonService;->w1(Ljava/lang/String;I)V

    .line 5
    :cond_1
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 6
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 7
    new-instance v2, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;

    invoke-direct {v2}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;-><init>()V

    .line 8
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 9
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getGameId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;->setGameIdList(Ljava/util/List;)V

    .line 11
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getLocation()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;->setLocation(I)V

    .line 12
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 13
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->z:Lcom/join/mgps/rpc/k;

    new-instance v3, Lcom/join/mgps/service/CommonService$f;

    invoke-direct {v3, p0, p1, p2}, Lcom/join/mgps/service/CommonService$f;-><init>(Lcom/join/mgps/service/CommonService;Lcom/join/mgps/dto/DownloadGameArgsBean;I)V

    invoke-interface {v2, v1, v3}, Lcom/join/mgps/rpc/k;->A0(Lcom/join/mgps/dto/RequestModel;Lw1/k;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 14
    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    .line 15
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getGameId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lcom/join/mgps/service/CommonService;->w1(Ljava/lang/String;I)V

    const-string p1, "\u83b7\u53d6\u6e38\u620f\u4fe1\u606f\u5931\u8d25"

    .line 16
    invoke-virtual {p0, p1}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method static synthetic i(Lcom/join/mgps/service/CommonService;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/service/CommonService;->w1(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic j(Lcom/join/mgps/service/CommonService;Lcom/join/mgps/dto/DownloadGameArgsBean;Lcom/join/mgps/dto/CollectionBeanSub;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/service/CommonService;->K1(Lcom/join/mgps/dto/DownloadGameArgsBean;Lcom/join/mgps/dto/CollectionBeanSub;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method static synthetic k(Lcom/join/mgps/service/CommonService;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/service/CommonService;->k0(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private k0(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {}, Lb2/a0;->o()Lb2/a0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lb2/a0;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/JoystickTable;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/db/tables/JoystickTable;->getTime()Ljava/lang/Long;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/g;->g(J)Z

    move-result p1

    return p1
.end method

.method static synthetic l(Lcom/join/mgps/service/CommonService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/service/CommonService;->A()V

    return-void
.end method

.method private l1(Lcom/papa/controller/core/ControllerManager$c;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Lcom/join/mgps/db/tables/JoystickTable;

    invoke-direct {v0}, Lcom/join/mgps/db/tables/JoystickTable;-><init>()V

    .line 2
    invoke-virtual {p1}, Lcom/papa/controller/core/ControllerManager$c;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/db/tables/JoystickTable;->setName(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lcom/papa/controller/core/ControllerManager$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/db/tables/JoystickTable;->setMac(Ljava/lang/String;)V

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/db/tables/JoystickTable;->setTime(Ljava/lang/Long;)V

    .line 5
    invoke-static {}, Lb2/a0;->o()Lb2/a0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lp1/b;->k(Ljava/lang/Object;)I

    return-void
.end method

.method static synthetic m(Lcom/join/mgps/service/CommonService;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/service/CommonService;->w:Z

    return p1
.end method

.method private m0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic n(Lcom/join/mgps/service/CommonService;)Lapp/mgsim/arena/SocketListener$NotifyObserver;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/service/CommonService;->S:Lapp/mgsim/arena/SocketListener$NotifyObserver;

    return-object p0
.end method

.method private n0()Z
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "1"

    const/4 v2, 0x0

    .line 1
    :try_start_0
    invoke-static {}, Lb2/i0;->o()Lb2/i0;

    move-result-object v3

    invoke-virtual {v3}, Lp1/b;->d()Ljava/util/List;

    move-result-object v3

    .line 2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 3
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/db/tables/ShowViewDataBeanTable;

    .line 4
    invoke-virtual {v5}, Lcom/join/mgps/db/tables/ShowViewDataBeanTable;->getShowVieDatabean()Lcom/join/mgps/dto/ShowViewDataBean;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const/4 v3, 0x0

    move-object v7, v3

    const/4 v8, 0x0

    .line 6
    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v9

    if-ge v8, v9, :cond_3

    .line 7
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/join/mgps/dto/ShowViewDataBean;

    .line 8
    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getIs_force()Ljava/lang/String;

    move-result-object v10

    .line 9
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    const/4 v12, 0x2

    const-wide/16 v13, 0x3e8

    if-eqz v11, :cond_1

    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getTag_show()I

    move-result v11

    if-eq v11, v12, :cond_1

    .line 10
    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getBegin_times()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v10

    mul-long v10, v10, v13

    .line 11
    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getEnd_times()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v15

    mul-long v15, v15, v13

    cmp-long v12, v5, v10

    if-lez v12, :cond_2

    cmp-long v10, v5, v15

    if-gez v10, :cond_2

    move-object v3, v9

    goto :goto_2

    .line 12
    :cond_1
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getTag_show()I

    move-result v10

    if-eq v10, v12, :cond_2

    .line 13
    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getBegin_times()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v10

    mul-long v10, v10, v13

    .line 14
    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getEnd_times()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v15

    mul-long v15, v15, v13

    cmp-long v13, v5, v10

    if-lez v13, :cond_2

    cmp-long v10, v5, v15

    if-gez v10, :cond_2

    .line 15
    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getJump_info()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    if-lez v10, :cond_2

    .line 16
    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getTag_show()I

    move-result v10

    if-eq v10, v12, :cond_2

    move-object v7, v9

    :cond_2
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_3
    if-eqz v3, :cond_4

    .line 17
    invoke-virtual {v0, v3}, Lcom/join/mgps/service/CommonService;->D1(Lcom/join/mgps/dto/ShowViewDataBean;)Z

    move-result v1

    return v1

    :cond_4
    if-eqz v7, :cond_5

    .line 18
    invoke-virtual {v0, v7}, Lcom/join/mgps/service/CommonService;->D1(Lcom/join/mgps/dto/ShowViewDataBean;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    :cond_5
    return v2
.end method

.method private n1(Lcom/join/mgps/dto/ForumBannerBean$ForumBannerMessagesData;)V
    .locals 5

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/j0;->n(Lcom/join/mgps/dto/ForumBannerBean$ForumBannerMessagesData;)Ljava/lang/String;

    move-result-object p1

    .line 2
    new-instance v0, Lcom/join/mgps/db/tables/ForumTable;

    invoke-direct {v0}, Lcom/join/mgps/db/tables/ForumTable;-><init>()V

    .line 3
    sget-object v1, Lcom/join/mgps/dto/ForumBean$ForumEvent;->ForumWelcomeBanner:Lcom/join/mgps/dto/ForumBean$ForumEvent;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/db/tables/ForumTable;->setType(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0, p1}, Lcom/join/mgps/db/tables/ForumTable;->setArgs1(Ljava/lang/String;)V

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/db/tables/ForumTable;->setTime(Ljava/lang/String;)V

    .line 6
    invoke-static {}, Lb2/t;->p()Lb2/t;

    move-result-object p1

    invoke-virtual {p1, v0}, Lb2/t;->u(Lcom/join/mgps/db/tables/ForumTable;)V

    return-void
.end method

.method static synthetic o(Lcom/join/mgps/service/CommonService;)Lcom/join/mgps/socket/fight/arena/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/service/CommonService;->v:Lcom/join/mgps/socket/fight/arena/b;

    return-object p0
.end method

.method private o0()V
    .locals 1

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/join/mgps/service/CommonService;->q:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->M1()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private o1(Lcom/join/mgps/dto/ForumData$ForumForumWelcomeData;)V
    .locals 5

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/j0;->p(Lcom/join/mgps/dto/ForumData$ForumForumWelcomeData;)Ljava/lang/String;

    move-result-object p1

    .line 2
    new-instance v0, Lcom/join/mgps/db/tables/ForumTable;

    invoke-direct {v0}, Lcom/join/mgps/db/tables/ForumTable;-><init>()V

    .line 3
    sget-object v1, Lcom/join/mgps/dto/ForumBean$ForumEvent;->ForumWelcome:Lcom/join/mgps/dto/ForumBean$ForumEvent;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/db/tables/ForumTable;->setType(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0, p1}, Lcom/join/mgps/db/tables/ForumTable;->setArgs1(Ljava/lang/String;)V

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/db/tables/ForumTable;->setTime(Ljava/lang/String;)V

    .line 6
    invoke-static {}, Lb2/t;->p()Lb2/t;

    move-result-object p1

    invoke-virtual {p1, v0}, Lb2/t;->u(Lcom/join/mgps/db/tables/ForumTable;)V

    return-void
.end method

.method private static synthetic p0()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/friend/chat/c;->C()V

    return-void
.end method

.method private p1(Lcom/join/mgps/dto/ForumData$ForumForumWelcomePostsData;)V
    .locals 5

    if-eqz p1, :cond_2

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumData$ForumForumWelcomePostsData;->getPosts_list()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumData$ForumForumWelcomePostsData;->getPosts_list()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-static {p1}, Lcom/join/mgps/Util/j0;->q(Lcom/join/mgps/dto/ForumData$ForumForumWelcomePostsData;)Ljava/lang/String;

    move-result-object p1

    .line 4
    new-instance v0, Lcom/join/mgps/db/tables/ForumTable;

    invoke-direct {v0}, Lcom/join/mgps/db/tables/ForumTable;-><init>()V

    .line 5
    sget-object v1, Lcom/join/mgps/dto/ForumBean$ForumEvent;->ForumWelcomePosts:Lcom/join/mgps/dto/ForumBean$ForumEvent;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/db/tables/ForumTable;->setType(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0, p1}, Lcom/join/mgps/db/tables/ForumTable;->setArgs1(Ljava/lang/String;)V

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/db/tables/ForumTable;->setTime(Ljava/lang/String;)V

    .line 8
    invoke-static {}, Lb2/t;->p()Lb2/t;

    move-result-object p1

    invoke-virtual {p1, v0}, Lb2/t;->u(Lcom/join/mgps/db/tables/ForumTable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private synthetic q0(Ljava/util/LinkedHashMap;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/FileInfo;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->Q:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/DownloadScanEvent;

    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/service/CommonService;->i0(Lcom/join/mgps/dto/FileInfo;Lcom/join/mgps/dto/DownloadScanEvent;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->P:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private synthetic r0(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    return-void
.end method

.method private s()V
    .locals 4

    .line 1
    invoke-static {}, Lb2/t;->p()Lb2/t;

    move-result-object v0

    sget-object v1, Lcom/join/mgps/dto/ForumBean$ForumEvent;->PostsPraise:Lcom/join/mgps/dto/ForumBean$ForumEvent;

    invoke-virtual {v0, v1}, Lb2/t;->r(Lcom/join/mgps/dto/ForumBean$ForumEvent;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/db/tables/ForumTable;

    .line 4
    invoke-virtual {v1}, Lcom/join/mgps/db/tables/ForumTable;->getArgs2()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 5
    invoke-static {v2}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 6
    invoke-virtual {v1}, Lcom/join/mgps/db/tables/ForumTable;->getArgs1()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/j0;->G(Ljava/lang/String;)Lcom/join/mgps/dto/ForumRequestBean$ForumPostsPraiseRequestBean;

    move-result-object v1

    .line 7
    invoke-static {v2}, Lcom/join/mgps/Util/j0;->F(Ljava/lang/String;)Lcom/join/mgps/dto/ForumData$ForumPostsPraiseData;

    move-result-object v2

    .line 8
    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumData$ForumPostsPraiseData;->isResult()Z

    move-result v2

    if-nez v2, :cond_1

    .line 9
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsPraiseRequestBean;->getPid()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/join/mgps/service/CommonService;->I0(I)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method private v0()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->A:Lcom/papa/controller/core/d;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/service/CommonService;->o0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method private w()V
    .locals 1

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0}, Lp1/f;->v()Ljava/util/List;

    return-void
.end method

.method private w0(Ljava/lang/String;)V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 4
    :goto_0
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v3

    iget-object v4, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v3, v4}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string p1, "\u8bf7\u5148\u767b\u5f55\uff01"

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v3, ""
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 6
    :try_start_1
    iget-object v4, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    iget-object v5, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 7
    iget v4, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 8
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 9
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "_"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_0
    move-exception v1

    .line 10
    :try_start_2
    invoke-virtual {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    .line 11
    :goto_1
    new-instance v1, Lcom/join/mgps/dto/RequestdetialFolowAndBeSpeak;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestdetialFolowAndBeSpeak;-><init>()V

    .line 12
    invoke-virtual {v1, v3}, Lcom/join/mgps/dto/RequestdetialFolowAndBeSpeak;->setApp_ver(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/RequestdetialFolowAndBeSpeak;->setGame_id(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestdetialFolowAndBeSpeak;->setUid(I)V

    .line 15
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->z()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/RequestdetialFolowAndBeSpeak;->setMobile(Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/RequestBeanUtil;->getDetialFollowAnd(Lcom/join/mgps/dto/RequestdetialFolowAndBeSpeak;)Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object v0

    .line 17
    invoke-static {}, Lcom/join/mgps/rpc/impl/d;->P1()Lcom/join/mgps/rpc/impl/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/rpc/impl/d;->O1()Le2/d;

    move-result-object v1

    invoke-interface {v1, v0}, Le2/d;->d0(Lcom/join/mgps/dto/CommonRequestBean;)Lretrofit2/Call;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/service/CommonService$e;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/service/CommonService$e;-><init>(Lcom/join/mgps/service/CommonService;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    goto :goto_2

    :cond_2
    const-string p1, "\u8bf7\u68c0\u67e5\u7f51\u7edc\uff01"

    .line 18
    invoke-virtual {p0, p1}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_2
    return-void
.end method

.method private w1(Ljava/lang/String;I)V
    .locals 3

    .line 1
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/event/n;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1, p2}, Lcom/join/mgps/event/n;-><init>(Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    return-void
.end method

.method private x1(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onEndGameRecordUpload: broad"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.join.android.app.mgsim.endgame_record_upload_result"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "url"

    .line 3
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 4
    invoke-virtual {p0, v0}, Landroid/app/Service;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method private y1(Lcom/papa/controller/core/ControllerManager$c;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/papa/controller/core/ControllerManager$c;->d()Ljava/lang/String;

    move-result-object v3

    .line 2
    invoke-virtual {p1}, Lcom/papa/controller/core/ControllerManager$c;->a()Ljava/lang/String;

    move-result-object v4

    .line 3
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->isTourist()Z

    move-result v2

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/papa/sim/statistic/p;->b0(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method A0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # I
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.gameMessage"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const-string p1, "battleScoreBoard"

    .line 2
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p0, p6, p5, p7, p3}, Lcom/join/mgps/service/CommonService;->v1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string p1, "loadRomCompleted"

    .line 4
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 5
    invoke-virtual {p0, p6, p5, p7, p3}, Lcom/join/mgps/service/CommonService;->A1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const-string p1, "battleReconnect"

    .line 6
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 7
    invoke-virtual {p0, p6, p5, p7, p3}, Lcom/join/mgps/service/CommonService;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method

.method A1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "sendRomLoadedToSvr"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    aput-object p4, v0, v1

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/service/CommonService;->w:Z

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->r()V

    return-void

    .line 4
    :cond_0
    :try_start_0
    new-instance v0, Lapp/mgsim/arena/ArenaRequest;

    const-string v1, "cmd_send_rom_loaded"

    invoke-direct {v0, v1}, Lapp/mgsim/arena/ArenaRequest;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 5
    :try_start_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    iput-wide v1, v0, Lapp/mgsim/arena/ArenaRequest;->gameId:J

    .line 6
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, v0, Lapp/mgsim/arena/ArenaRequest;->roomId:I

    .line 7
    :cond_2
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, v0, Lapp/mgsim/arena/ArenaRequest;->uid:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 8
    :catch_0
    :cond_3
    :try_start_2
    iput-object p4, v0, Lapp/mgsim/arena/ArenaRequest;->battleScoreBoard:Ljava/lang/String;

    .line 9
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->v:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {p1, v0}, Lcom/join/mgps/socket/fight/arena/b;->f(Lapp/mgsim/arena/ArenaRequest;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method B0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.endgame_record_upload"
        }
    .end annotation

    const-string v0, "/"

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->M:Ljava/lang/String;

    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 2
    :cond_0
    iput-object p1, p0, Lcom/join/mgps/service/CommonService;->M:Ljava/lang/String;

    .line 3
    iget-boolean p1, p0, Lcom/join/mgps/service/CommonService;->L:Z

    if-eqz p1, :cond_1

    return-void

    :cond_1
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/join/mgps/service/CommonService;->L:Z

    .line 5
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    invoke-virtual {p1, p2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x0

    .line 8
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "arc"

    const-string v3, ""

    .line 10
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRomType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 11
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRomType()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->X1(I)Ljava/lang/String;

    move-result-object v2

    .line 12
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lcom/papa91/arc/util/SDCardUtil;->getExternalStorageDirectory(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/papa91/"

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "10000.rec"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->M:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".rec"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 15
    invoke-static {v0}, Lcom/join/mgps/Util/h0;->x(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "10000_v2.rec"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->M:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_v2.rec"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 18
    invoke-static {v0}, Lcom/join/mgps/Util/h0;->x(Ljava/lang/String;)Z

    move-result v2

    :cond_3
    if-nez v2, :cond_4

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "10000_v3.rec"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->M:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "_v3.rec"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 21
    invoke-static {v0}, Lcom/join/mgps/Util/h0;->x(Ljava/lang/String;)Z

    .line 22
    :cond_4
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 23
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 24
    invoke-virtual {p1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 25
    invoke-virtual {p0, p2, v1}, Lcom/join/mgps/service/CommonService;->Z1(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_5
    :goto_0
    return-void
.end method

.method B1(Lcom/join/mgps/dto/SharePostRequest;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, "shareResult "

    .line 1
    :try_start_0
    invoke-static {}, Lcom/join/mgps/rpc/impl/g;->A0()Lcom/join/mgps/rpc/impl/g;

    move-result-object v1

    invoke-virtual {p1}, Lcom/join/mgps/dto/SharePostRequest;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/join/mgps/rpc/impl/g;->f(Ljava/util/Map;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumResponse;->getError_message()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    const-string p1, "\u8bf7\u6c42\u62a5\u9519"

    .line 4
    invoke-static {v0, p1}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public C0(ILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/papa/controller/core/ControllerManager$c;",
            ">;)V"
        }
    .end annotation

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    .line 1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-gtz v0, :cond_1

    return-void

    .line 2
    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_3

    .line 3
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/papa/controller/core/ControllerManager$c;

    .line 4
    invoke-virtual {v0}, Lcom/papa/controller/core/ControllerManager$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/join/mgps/service/CommonService;->k0(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 5
    invoke-direct {p0, v0}, Lcom/join/mgps/service/CommonService;->l1(Lcom/papa/controller/core/ControllerManager$c;)V

    .line 6
    invoke-direct {p0, v0}, Lcom/join/mgps/service/CommonService;->y1(Lcom/papa/controller/core/ControllerManager$c;)V

    :cond_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method C1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->A:Lcom/papa/controller/core/d;

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/service/CommonService$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService$j;-><init>(Lcom/join/mgps/service/CommonService;)V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->A:Lcom/papa/controller/core/d;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Lcom/papa/controller/core/d;->w(Lcom/papa/controller/core/c;Landroid/os/Handler;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->A:Lcom/papa/controller/core/d;

    new-instance v1, Lcom/join/mgps/service/CommonService$k;

    invoke-direct {v1, p0}, Lcom/join/mgps/service/CommonService$k;-><init>(Lcom/join/mgps/service/CommonService;)V

    invoke-virtual {v0, v1}, Lcom/papa/controller/core/d;->v(Lcom/papa/controller/core/ControllerManager$d;)V

    :cond_0
    return-void
.end method

.method D(Ljava/lang/String;Ljava/lang/String;Lcom/github/snowdream/android/app/downloader/DownloadTask;ZLcom/join/mgps/dto/DownloadGameArgsBean;)V
    .locals 9
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, "\u83b7\u53d6\u8d44\u6e90\u5931\u8d25\uff0c\u8bf7\u91cd\u65b0\u518d\u8bd5\u3002"

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v2

    .line 4
    new-instance v3, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v3}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 5
    invoke-virtual {v3, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 6
    new-instance v4, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;

    invoke-direct {v4}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;-><init>()V

    .line 7
    invoke-virtual {v4, p1}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;->setGameId(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v4, v1}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;->setUid(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v4, v2}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;->setToken(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 11
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/join/mgps/rpc/impl/i;->q(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 12
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v2

    const/16 v3, 0x258

    if-ne v2, v3, :cond_1

    .line 13
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    .line 14
    invoke-virtual {p0, v0}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    return-void

    .line 15
    :cond_0
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p3

    move v7, p4

    move-object v8, p5

    invoke-virtual/range {v2 .. v8}, Lcom/join/mgps/service/CommonService;->F1(Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/dto/QueryDownloadInfoResponseData;Lcom/github/snowdream/android/app/downloader/DownloadTask;ZLcom/join/mgps/dto/DownloadGameArgsBean;)V

    goto :goto_0

    .line 16
    :cond_1
    invoke-virtual {p0, v0}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 18
    invoke-virtual {p0, v0}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const p1, 0x7f100299

    .line 19
    invoke-virtual {p0, p1}, Landroid/app/Service;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method D0(Ljava/lang/String;Lcom/join/mgps/dto/SpValue;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Lcom/join/mgps/dto/SpValue;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.overmind.sp.write.mod"
        }
    .end annotation

    :try_start_0
    const-string v0, "PrefDef"

    const/4 v1, 0x4

    .line 1
    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    if-eqz p2, :cond_5

    .line 2
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/SpValue;->getValue()Ljava/io/Serializable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/dto/SpValue;->getValue()Ljava/io/Serializable;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/SpValue;->getValue()Ljava/io/Serializable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Integer;

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {p2}, Lcom/join/mgps/dto/SpValue;->getValue()Ljava/io/Serializable;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {p2}, Lcom/join/mgps/dto/SpValue;->getValue()Ljava/io/Serializable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 8
    invoke-virtual {p2}, Lcom/join/mgps/dto/SpValue;->getValue()Ljava/io/Serializable;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 9
    :cond_2
    invoke-virtual {p2}, Lcom/join/mgps/dto/SpValue;->getValue()Ljava/io/Serializable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Float;

    if-eqz v1, :cond_3

    .line 10
    invoke-virtual {p2}, Lcom/join/mgps/dto/SpValue;->getValue()Ljava/io/Serializable;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 11
    :cond_3
    invoke-virtual {p2}, Lcom/join/mgps/dto/SpValue;->getValue()Ljava/io/Serializable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Long;

    if-eqz v1, :cond_4

    .line 12
    invoke-virtual {p2}, Lcom/join/mgps/dto/SpValue;->getValue()Ljava/io/Serializable;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {v0, p1, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 13
    :cond_4
    :goto_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_5
    :goto_1
    return-void
.end method

.method D1(Lcom/join/mgps/dto/ShowViewDataBean;)Z
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setImageback time ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/ShowViewDataBean;->getIs_force()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/ShowViewDataBean;->getJump_info()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/SplashIntentBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/SplashIntentBean;->getPic_remote()Ljava/lang/String;

    .line 4
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->lastClickPageAD()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v1

    invoke-virtual {v1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/ShowViewDataBean;->getId()I

    move-result p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ""

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v2

    return p1

    .line 6
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/ShowViewDataBean;->getJump_info()Ljava/util/List;

    move-result-object p1

    .line 7
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/SplashIntentBean;

    .line 8
    invoke-virtual {v1}, Lcom/join/mgps/dto/SplashIntentBean;->getTag_show()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v3, 0x2

    if-eq v1, v3, :cond_1

    return v2

    :cond_2
    return v0

    :catch_0
    move-exception p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return v0
.end method

.method E(ZZLjava/lang/String;)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->web_disk_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-class v1, Lcom/join/mgps/dto/WebDiskCfg;

    invoke-virtual {p1, v0, v1}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/WebDiskCfg;

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/WebDiskCfg;->getDown_url()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p1}, Lcom/join/mgps/dto/WebDiskCfg;->getDown_url_phone()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v0, "3875871586"

    const-string v1, "2057111073"

    if-eqz p2, :cond_2

    .line 3
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 4
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v2

    invoke-virtual {v2, v0}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    goto :goto_0

    .line 5
    :cond_2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v2

    invoke-virtual {v2, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_6

    .line 6
    new-instance v2, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;-><init>()V

    const-string v3, "com.quark.browser"

    .line 7
    invoke-virtual {v2, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setPackageName(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p1}, Lcom/join/mgps/dto/WebDiskCfg;->getFile_size()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setActual_size(J)V

    .line 9
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v3

    const/4 v4, 0x2

    if-eqz v3, :cond_3

    if-eqz p2, :cond_3

    .line 10
    invoke-virtual {p1}, Lcom/join/mgps/dto/WebDiskCfg;->getDown_url()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setUrl(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v2, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCrc_link_type_val(Ljava/lang/String;)V

    .line 12
    sget-object p1, Lcom/join/mgps/enums/Dtype;->MOD:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setFileType(Ljava/lang/String;)V

    .line 13
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v2, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setTask_down_type(I)V

    goto :goto_1

    .line 15
    :cond_3
    invoke-virtual {p1}, Lcom/join/mgps/dto/WebDiskCfg;->getDown_url_phone()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setUrl(Ljava/lang/String;)V

    .line 16
    invoke-virtual {v2, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCrc_link_type_val(Ljava/lang/String;)V

    .line 17
    sget-object p1, Lcom/join/mgps/enums/Dtype;->android:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setFileType(Ljava/lang/String;)V

    .line 18
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    .line 19
    invoke-virtual {v2, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setTask_down_type(I)V

    :goto_1
    const/4 p1, 0x0

    .line 20
    invoke-virtual {v2, p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    const-string p2, "\u5938\u514b"

    .line 21
    invoke-virtual {v2, p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setShowName(Ljava/lang/String;)V

    .line 22
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, Lcom/join/mgps/enums/ConstantIntEnum;->MGAME:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v0}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setPlugin_num(Ljava/lang/String;)V

    const/4 p2, 0x1

    .line 23
    invoke-virtual {v2, p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setOther_down_switch(I)V

    .line 24
    invoke-virtual {v2, p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVm_device_switch(I)V

    .line 25
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object p2, Lcom/join/mgps/rpc/h;->L:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "/upload/images/7e/08/7e08da9603ec2dd7c2648418ebc6b766.png"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setPortraitURL(Ljava/lang/String;)V

    .line 26
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getExt()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    .line 27
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 28
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object p2

    const-class v0, Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {p2, p1, v0}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Lcom/join/mgps/dto/ExtBean;

    :cond_4
    if-nez p2, :cond_5

    .line 29
    new-instance p2, Lcom/join/mgps/dto/ExtBean;

    invoke-direct {p2}, Lcom/join/mgps/dto/ExtBean;-><init>()V

    .line 30
    :cond_5
    invoke-virtual {p2, p3}, Lcom/join/mgps/dto/ExtBean;->setPosition(Ljava/lang/String;)V

    .line 31
    invoke-static {p2}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setExt(Ljava/lang/String;)V

    .line 32
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    invoke-virtual {p1, v2}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    :cond_6
    invoke-static {v2, p0}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    :cond_7
    :goto_2
    return-void
.end method

.method E0(Lcom/join/mgps/dto/CollectionBeanSub;)V
    .locals 2
    .param p1    # Lcom/join/mgps/dto/CollectionBeanSub;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
            value = "gameData"
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.paygamefinish"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1
    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb2/e0;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/PurchasedListTable;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/db/tables/PurchasedListTable;

    invoke-direct {v0}, Lcom/join/mgps/db/tables/PurchasedListTable;-><init>()V

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/db/tables/PurchasedListTable;->setGame_id(Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz p1, :cond_2

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/service/CommonService;->y(Ljava/lang/String;)V

    .line 6
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->f1()V

    return-void
.end method

.method E1()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emu.commonpoint"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 2
    new-instance v1, Lcom/papa/sim/statistic/Data;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Data;-><init>()V

    .line 3
    invoke-static {p2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    invoke-virtual {v0, p2}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 5
    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/papa/sim/statistic/Data;->setGameId(J)Lcom/papa/sim/statistic/Data;

    .line 6
    :cond_0
    invoke-static {p4}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 7
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/papa/sim/statistic/Ext;->setUid(I)Lcom/papa/sim/statistic/Ext;

    .line 8
    :cond_1
    invoke-static {p3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 9
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 10
    :cond_2
    invoke-static {p5}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 11
    invoke-virtual {v0, p5}, Lcom/papa/sim/statistic/Ext;->setEndId(Ljava/lang/String;)V

    .line 12
    :cond_3
    sget-object p2, Lcom/papa/sim/statistic/Event;->clickKnowGoRealPage:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    .line 13
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 14
    :cond_4
    sget-object p2, Lcom/papa/sim/statistic/Event;->realNameUpWindows:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    .line 15
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 16
    :cond_5
    sget-object p2, Lcom/papa/sim/statistic/Event;->antiAddtionWindowUp:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    .line 17
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 18
    :cond_6
    sget-object p2, Lcom/papa/sim/statistic/Event;->realNameAuth:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_7

    .line 19
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 20
    :cond_7
    sget-object p2, Lcom/papa/sim/statistic/Event;->nonageAstrictHint:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_8

    .line 21
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 22
    :cond_8
    sget-object p2, Lcom/papa/sim/statistic/Event;->realNameClickSubmit:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_9

    .line 23
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 24
    :cond_9
    sget-object p2, Lcom/papa/sim/statistic/Event;->clickClosedRealNameWindow:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_a

    .line 25
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 26
    :cond_a
    sget-object p2, Lcom/papa/sim/statistic/Event;->realNameDisplayWindow:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_b

    .line 27
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 28
    :cond_b
    sget-object p2, Lcom/papa/sim/statistic/Event;->Emu_PatchAd_Pop:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_c

    .line 29
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 30
    :cond_c
    sget-object p2, Lcom/papa/sim/statistic/Event;->Emu_PatchAd_Close:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_d

    .line 31
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 32
    :cond_d
    sget-object p2, Lcom/papa/sim/statistic/Event;->Emu_PatchAd_Click:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_e

    .line 33
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 34
    :cond_e
    sget-object p2, Lcom/papa/sim/statistic/Event;->Emu_ExitAd_Pop:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_f

    .line 35
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 36
    :cond_f
    sget-object p2, Lcom/papa/sim/statistic/Event;->Emu_ExitAd_Close:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_10

    .line 37
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 38
    :cond_10
    sget-object p2, Lcom/papa/sim/statistic/Event;->Emu_ExitAd_Click:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_11

    .line 39
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 40
    :cond_11
    sget-object p2, Lcom/papa/sim/statistic/Event;->Exit_flowad_pop_tt:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_12

    .line 41
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 42
    :cond_12
    sget-object p2, Lcom/papa/sim/statistic/Event;->Exit_flowad_pop_gdt:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_13

    .line 43
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 44
    :cond_13
    sget-object p2, Lcom/papa/sim/statistic/Event;->Exit_flowad_click:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_14

    .line 45
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 46
    :cond_14
    sget-object p2, Lcom/papa/sim/statistic/Event;->Custom_openGoldfinger:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_15

    .line 47
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 48
    :cond_15
    sget-object p2, Lcom/papa/sim/statistic/Event;->Custom_closeGoldfinger:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_16

    .line 49
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 50
    :cond_16
    sget-object p2, Lcom/papa/sim/statistic/Event;->Customgoldfinger_AdMust_Pop:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_17

    .line 51
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 52
    :cond_17
    sget-object p2, Lcom/papa/sim/statistic/Event;->Customgoldfinger_AdMust_Vedio:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_18

    .line 53
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 54
    :cond_18
    sget-object p2, Lcom/papa/sim/statistic/Event;->Customgoldfinger_AdMust_Buy:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_19

    .line 55
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 56
    :cond_19
    sget-object p2, Lcom/papa/sim/statistic/Event;->Customgoldfinger_AdMust_Close:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1a

    .line 57
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 58
    :cond_1a
    sget-object p2, Lcom/papa/sim/statistic/Event;->Customgoldfinger_AdUnnecessary_Pop:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1b

    .line 59
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 60
    :cond_1b
    sget-object p2, Lcom/papa/sim/statistic/Event;->Customgoldfinger_AdUnnecessary_Vedio:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1c

    .line 61
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 62
    :cond_1c
    sget-object p2, Lcom/papa/sim/statistic/Event;->Customgoldfinger_AdUnnecessary_Buy:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1d

    .line 63
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 64
    :cond_1d
    sget-object p2, Lcom/papa/sim/statistic/Event;->Customgoldfinger_AdUnnecessary_Close:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1e

    .line 65
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto/16 :goto_1

    .line 66
    :cond_1e
    sget-object p2, Lcom/papa/sim/statistic/Event;->showVSTaskList:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1f

    .line 67
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0, v1}, Lcom/papa/sim/statistic/p;->i0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V

    goto/16 :goto_1

    .line 68
    :cond_1f
    sget-object p2, Lcom/papa/sim/statistic/Event;->gameInStartVS:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_20

    .line 69
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0, v1}, Lcom/papa/sim/statistic/p;->i0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V

    goto/16 :goto_1

    .line 70
    :cond_20
    sget-object p2, Lcom/papa/sim/statistic/Event;->gameInExitVS:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_21

    .line 71
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0, v1}, Lcom/papa/sim/statistic/p;->i0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V

    goto/16 :goto_1

    .line 72
    :cond_21
    sget-object p2, Lcom/papa/sim/statistic/Event;->gameVSSuccess:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_22

    .line 73
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0, v1}, Lcom/papa/sim/statistic/p;->i0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V

    goto/16 :goto_1

    .line 74
    :cond_22
    sget-object p2, Lcom/papa/sim/statistic/Event;->gameVSFail:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_23

    .line 75
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0, v1}, Lcom/papa/sim/statistic/p;->i0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V

    goto :goto_1

    .line 76
    :cond_23
    sget-object p2, Lcom/papa/sim/statistic/Event;->vsKjPopWindow:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_24

    .line 77
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0, v1}, Lcom/papa/sim/statistic/p;->i0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V

    goto :goto_1

    .line 78
    :cond_24
    sget-object p2, Lcom/papa/sim/statistic/Event;->clickGameVSAdVideo:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_25

    .line 79
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0, v1}, Lcom/papa/sim/statistic/p;->i0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V

    goto :goto_1

    .line 80
    :cond_25
    sget-object p2, Lcom/papa/sim/statistic/Event;->expGameVSAdVideo:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_26

    .line 81
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, v0, v1}, Lcom/papa/sim/statistic/p;->i0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V

    goto :goto_1

    .line 82
    :cond_26
    invoke-static {}, Lcom/papa/sim/statistic/Event;->values()[Lcom/papa/sim/statistic/Event;

    move-result-object p2

    array-length p3, p2

    const/4 p4, 0x0

    :goto_0
    if-ge p4, p3, :cond_28

    aget-object p5, p2, p4

    .line 83
    invoke-virtual {p5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_27

    .line 84
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p5, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto :goto_1

    :cond_27
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_28
    :goto_1
    return-void
.end method

.method F0(Ljava/lang/String;Z)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Z
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.overmind.sp.write.introduction.show"
        }
    .end annotation

    const-string v0, "PrefDef"

    const/4 v1, 0x4

    .line 1
    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method F1(Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/dto/QueryDownloadInfoResponseData;Lcom/github/snowdream/android/app/downloader/DownloadTask;ZLcom/join/mgps/dto/DownloadGameArgsBean;)V
    .locals 14
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    move-object v12, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v6, p3

    move-object/from16 v0, p4

    move/from16 v3, p5

    move-object/from16 v11, p6

    .line 1
    iget-object v4, v12, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v4}, Lcom/join/mgps/pref/PrefDef_;->noPromptDownload()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v4

    invoke-virtual {v4}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const/4 v5, 0x1

    const/4 v7, 0x0

    if-eqz v6, :cond_1

    .line 2
    invoke-virtual/range {p3 .. p3}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->isForceShow()Z

    move-result v8

    if-eqz v8, :cond_0

    .line 3
    invoke-virtual {v6, v5}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->setSelectedNextTips(Z)V

    const/4 v4, 0x0

    .line 4
    :cond_0
    invoke-virtual/range {p3 .. p3}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getBtnStatus()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_1

    invoke-virtual/range {p3 .. p3}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getBtnStatus()Ljava/lang/String;

    move-result-object v8

    const-string v9, "open"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v4, 0x0

    :cond_1
    if-eqz v0, :cond_2

    .line 5
    invoke-virtual/range {p4 .. p4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isUncheckSelfSupport()Z

    move-result v8

    .line 6
    invoke-virtual/range {p4 .. p4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isDisableShowSpeedUpPrompt()Z

    move-result v9

    goto :goto_0

    :cond_2
    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_0
    if-nez v4, :cond_5

    if-nez v8, :cond_5

    .line 7
    sget-object v4, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v4}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object v4

    instance-of v4, v4, Lcom/join/mgps/activity/EndGameLaunchActivity_;

    if-nez v4, :cond_5

    if-nez v0, :cond_3

    .line 8
    new-instance v0, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;-><init>()V

    .line 9
    :cond_3
    iget-object v4, v12, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v4}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;->y0(Landroid/content/Context;)Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;

    move-result-object v4

    const/high16 v8, 0x30000000

    invoke-virtual {v4, v8}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;

    .line 10
    invoke-virtual {v4, p1}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;->i(Ljava/lang/String;)Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;

    move-result-object v1

    const-string v4, "data"

    invoke-virtual {v1, v4, v6}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/io/Serializable;)Lorg/androidannotations/api/builder/e;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;

    const-string v4, "ext"

    .line 11
    invoke-virtual {v1, v4, v2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;

    const-string v2, "disableShowSpeedUpPrompt"

    .line 12
    invoke-virtual {v1, v2, v9}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Z)Lorg/androidannotations/api/builder/e;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;

    const-string v2, "fromRecomDown"

    .line 13
    invoke-virtual {v1, v2, v3}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Z)Lorg/androidannotations/api/builder/e;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;

    const-string v2, "downloadArgs"

    .line 14
    invoke-virtual {v1, v2, v11}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/io/Serializable;)Lorg/androidannotations/api/builder/e;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;

    .line 15
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->get_from()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;->a(I)Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;

    move-result-object v1

    .line 16
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->get_from_type()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;->b(I)Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;

    move-result-object v0

    if-eqz v6, :cond_4

    .line 17
    invoke-virtual/range {p3 .. p3}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->isForceShow()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {v0, v5}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;->k(Z)Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$k;

    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_3

    .line 19
    :cond_5
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v4

    invoke-virtual {v4, p1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    if-eqz v11, :cond_6

    .line 20
    invoke-virtual/range {p6 .. p6}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getPdInfo()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v7

    invoke-virtual/range {p6 .. p6}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getLocation()I

    move-result v8

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->g0(Lcom/join/mgps/dto/DomainInfoBean;I)Z

    move-result v7

    xor-int/2addr v5, v7

    invoke-virtual {v11, v5}, Lcom/join/mgps/dto/DownloadGameArgsBean;->setShowDownRecommend(Z)V

    :cond_6
    if-eqz v11, :cond_7

    .line 21
    invoke-virtual/range {p6 .. p6}, Lcom/join/mgps/dto/DownloadGameArgsBean;->isShowDownRecommend()Z

    move-result v5

    if-eqz v5, :cond_8

    .line 22
    :cond_7
    invoke-static {p0}, Lcom/join/mgps/service/CommonService_;->S2(Landroid/content/Context;)Lcom/join/mgps/service/CommonService_$h2;

    move-result-object v5

    const-string v7, "getDownloadRecomedData"

    .line 23
    invoke-virtual {v5, v7, p1}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/service/CommonService_$h2;

    .line 24
    invoke-virtual/range {p4 .. p4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "showName"

    invoke-virtual {v5, v8, v7}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/service/CommonService_$h2;

    const-string v7, "fromRecommendDown"

    .line 25
    invoke-virtual {v5, v7, v3}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Z)Lorg/androidannotations/api/builder/e;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/service/CommonService_$h2;

    invoke-virtual {v5}, Lorg/androidannotations/api/builder/g;->a()Landroid/content/ComponentName;

    :cond_8
    if-eqz v6, :cond_a

    if-eqz v4, :cond_a

    .line 26
    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v5

    const/16 v7, 0x9

    if-eq v5, v7, :cond_9

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v5

    if-ne v5, v7, :cond_a

    .line 27
    :cond_9
    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 28
    invoke-static {v4}, Lcom/php25/PDownload/d;->b(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 29
    invoke-static {v4, v4}, Lcom/join/mgps/Util/UtilsMy;->y4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 30
    invoke-virtual/range {p3 .. p3}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getVer()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer(Ljava/lang/String;)V

    .line 31
    invoke-virtual/range {p3 .. p3}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getVer_name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer_name(Ljava/lang/String;)V

    .line 32
    invoke-virtual/range {p3 .. p3}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getDownloadURL()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setUrl(Ljava/lang/String;)V

    .line 33
    invoke-virtual/range {p3 .. p3}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getResourceURL()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setResource_url_remote(Ljava/lang/String;)V

    .line 34
    invoke-virtual/range {p3 .. p3}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getActualSize()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setActual_size(J)V

    .line 35
    invoke-virtual/range {p3 .. p3}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getResourceSize()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRes_actual_size(J)V

    .line 36
    invoke-virtual {v4, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setExt(Ljava/lang/String;)V

    .line 37
    invoke-virtual {v4, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setFromRecomDown(Z)V

    .line 38
    invoke-static {v4, p0}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_3

    :cond_a
    if-nez v4, :cond_b

    if-eqz v0, :cond_b

    if-eqz v6, :cond_b

    .line 39
    invoke-virtual/range {p3 .. p3}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getVer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer(Ljava/lang/String;)V

    .line 40
    invoke-virtual/range {p3 .. p3}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getVer_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer_name(Ljava/lang/String;)V

    .line 41
    invoke-virtual/range {p3 .. p3}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getDownloadURL()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setUrl(Ljava/lang/String;)V

    .line 42
    invoke-virtual/range {p3 .. p3}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getResourceURL()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setResource_url_remote(Ljava/lang/String;)V

    .line 43
    invoke-virtual/range {p3 .. p3}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getActualSize()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setActual_size(J)V

    .line 44
    invoke-virtual/range {p3 .. p3}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getResourceSize()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRes_actual_size(J)V

    .line 45
    invoke-virtual {v0, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setExt(Ljava/lang/String;)V

    .line 46
    invoke-virtual/range {p4 .. p5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setFromRecomDown(Z)V

    .line 47
    invoke-static {v0, p0}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_3

    :cond_b
    const/4 v3, 0x1

    if-eqz v6, :cond_c

    .line 48
    invoke-virtual/range {p3 .. p3}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getResourceSize()J

    move-result-wide v4

    goto :goto_2

    :cond_c
    const-wide/16 v4, 0x0

    .line 49
    :goto_2
    invoke-virtual/range {p4 .. p4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->get_from()I

    move-result v8

    invoke-virtual/range {p4 .. p4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->get_from_type()I

    move-result v10

    const/4 v13, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v6, p3

    move v7, v9

    move v9, v10

    move v10, v13

    move-object/from16 v11, p6

    .line 50
    invoke-virtual/range {v0 .. v11}, Lcom/join/mgps/service/CommonService;->T(Ljava/lang/String;Ljava/lang/String;ZJLcom/join/mgps/dto/QueryDownloadInfoResponseData;ZIIZLcom/join/mgps/dto/DownloadGameArgsBean;)V

    :cond_d
    :goto_3
    return-void
.end method

.method G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emulogcat"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/dto/EmuErrorDto;

    invoke-direct {v0}, Lcom/join/mgps/dto/EmuErrorDto;-><init>()V

    .line 2
    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/EmuErrorDto;->setGame_id(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0, p2}, Lcom/join/mgps/dto/EmuErrorDto;->setUid(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0, p3}, Lcom/join/mgps/dto/EmuErrorDto;->setPlugin_package_name(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, p4}, Lcom/join/mgps/dto/EmuErrorDto;->setPlugin_version(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0, p5}, Lcom/join/mgps/dto/EmuErrorDto;->setError(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object p2

    invoke-virtual {p2, v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/p;->h0(Ljava/lang/String;)V

    return-void
.end method

.method G0(Landroid/content/Intent;)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.action_reward_anim"
        }
    .end annotation

    return-void
.end method

.method G1(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->r:Landroid/os/Handler;

    new-instance v1, Lcom/join/mgps/service/a;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/service/a;-><init>(Lcom/join/mgps/service/CommonService;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method H0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # J
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.playtime"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/app/Service;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {}, Lb2/d0;->n()Lb2/d0;

    move-result-object p1

    invoke-virtual {p1, p3, p2}, Lb2/d0;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    .line 4
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/db/tables/PlayGameTimeTable;

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/db/tables/PlayGameTimeTable;->getGamePlayTotalTime()J

    move-result-wide v0

    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-virtual {p1, v2, v3}, Lcom/join/mgps/db/tables/PlayGameTimeTable;->setGamePlayRecentlyTime(J)V

    add-long/2addr v0, p4

    .line 7
    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/db/tables/PlayGameTimeTable;->setGamePlayTotalTime(J)V

    .line 8
    invoke-static {}, Lb2/d0;->n()Lb2/d0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    :cond_1
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p4, ""

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p5

    invoke-virtual {p5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p1, p2, p4, p3, p5}, Lcom/papa/sim/statistic/p;->N1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method H1(Ljava/lang/String;)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/papa91/arc/ext/ToastManager;->show(Ljava/lang/CharSequence;)V

    return-void
.end method

.method I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p5    # J
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.gameendlocalbattle"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Service;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-wide v4, p5

    invoke-virtual/range {v0 .. v5}, Lcom/papa/sim/statistic/p;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    :cond_1
    :goto_0
    return-void
.end method

.method I0(I)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->Y0(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {p0, p1}, Lcom/join/mgps/Util/j0;->e0(Landroid/content/Context;I)Lcom/join/mgps/dto/ForumRequestBean$ForumPostsPraiseRequestBean;

    move-result-object p1

    const-string v0, ""

    .line 3
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsPraiseRequestBean;->setDevice_id(Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lcom/join/mgps/rpc/impl/g;->A0()Lcom/join/mgps/rpc/impl/g;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumRequestBean$ForumPostsPraiseRequestBean;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/rpc/impl/g;->o(Ljava/util/Map;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 5
    :cond_1
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ForumData$ForumPostsPraiseData;

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$ForumPostsPraiseData;->isResult()Z

    .line 7
    invoke-static {p1, v0}, Lcom/join/mgps/Util/j0;->m1(Lcom/join/mgps/dto/ForumRequestBean$ForumPostsPraiseRequestBean;Lcom/join/mgps/dto/ForumData$ForumPostsPraiseData;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method I1(Lcom/join/mgps/dto/CollectionBeanSub;Z)V
    .locals 8
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const/4 v3, 0x0

    const-string v4, ""

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    .line 1
    invoke-virtual/range {v0 .. v7}, Lcom/join/mgps/service/CommonService;->J1(Lcom/join/mgps/dto/CollectionBeanSub;ZZLjava/lang/String;ZZLcom/join/mgps/dto/DownloadGameArgsBean;)V

    return-void
.end method

.method J(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.gameout"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Service;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    int-to-long v2, p3

    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lp1/f;->L(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    move-object v1, p2

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/papa/sim/statistic/p;->W0(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method J0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emu.psp.countdown"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0}, Landroid/app/Service;->getPackageName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object p2, Lcom/papa/sim/statistic/Event;->OnClickPSPCutDown:Lcom/papa/sim/statistic/Event;

    new-instance p3, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p3}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1, p2, p3}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    :cond_1
    :goto_0
    return-void
.end method

.method J1(Lcom/join/mgps/dto/CollectionBeanSub;ZZLjava/lang/String;ZZLcom/join/mgps/dto/DownloadGameArgsBean;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 2
    invoke-virtual {v0, p5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setDisableShowSpeedUpPrompt(Z)V

    .line 3
    invoke-virtual {v0, p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setUncheckSelfSupport(Z)V

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getResourceSize()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRes_actual_size(J)V

    .line 5
    invoke-virtual {v0, p4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setExt(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0, p6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setFromRecomDown(Z)V

    if-eqz p2, :cond_5

    .line 7
    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object p2

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result p2

    if-lez p2, :cond_3

    .line 8
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 9
    invoke-virtual {p1}, Lcom/wufan/user/service/protobuf/n0;->n2()I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    goto :goto_0

    .line 10
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 11
    :cond_2
    :goto_0
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {p1, p2}, Lcom/join/mgps/Util/IntentUtil;->goMyAccountLoginActivityNewTask(Landroid/content/Context;)V

    goto/16 :goto_1

    .line 12
    :cond_3
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPay_game_amount()I

    move-result p2

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Lcom/join/mgps/Util/UtilsMy;->x0(ILjava/lang/String;)I

    move-result p2

    if-lez p2, :cond_4

    .line 13
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 14
    :cond_4
    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->y1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/CollectionBeanSub;)V

    .line 15
    iget-object p2, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getTp_down_url()Ljava/util/List;

    move-result-object p3

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getOther_down_switch()I

    move-result p4

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getCdn_down_switch()I

    move-result p5

    move-object p1, p2

    move-object p2, v0

    move-object p6, p7

    invoke-static/range {p1 .. p6}, Lcom/join/mgps/Util/UtilsMy;->U0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;IILcom/join/mgps/dto/DownloadGameArgsBean;)V

    goto :goto_1

    .line 16
    :cond_5
    iget-object p2, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {p2, v0}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result p2

    if-eqz p2, :cond_6

    goto :goto_1

    .line 17
    :cond_6
    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getDown_status()I

    move-result p1

    const/4 p2, 0x5

    if-ne p1, p2, :cond_9

    .line 18
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMax_an_compatible_ver()I

    move-result p1

    if-lez p1, :cond_8

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMin_an_compatible_ver()I

    move-result p2

    if-lt p1, p2, :cond_7

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMax_an_compatible_ver()I

    move-result p2

    if-le p1, p2, :cond_8

    :cond_7
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 19
    iput-object v0, p0, Lcom/join/mgps/service/CommonService;->y:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 20
    new-instance p1, Landroid/content/Intent;

    const-string p2, "com.wufun.down.androidversion"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string p2, "gameid"

    .line 21
    iget-object p3, p0, Lcom/join/mgps/service/CommonService;->y:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 22
    invoke-virtual {p0, p1}, Landroid/app/Service;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_1

    .line 23
    :cond_8
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_1

    .line 24
    :cond_9
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_a
    :goto_1
    return-void
.end method

.method K(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # J
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emu.3ds.gameout"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Service;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1, p2, v1}, Lp1/f;->L(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    move-object v1, p2

    move-wide v2, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lcom/papa/sim/statistic/p;->W0(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method K0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emu.exitVippopup"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 2
    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 3
    invoke-static {p4}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 4
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setUid(I)Lcom/papa/sim/statistic/Ext;

    .line 5
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 6
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object p3, Lcom/papa/sim/statistic/Event;->exitVippopup:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2, p3, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method

.method L(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # J
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emu.ps2.gameout"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Service;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1, p2, v1}, Lp1/f;->L(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    move-object v1, p2

    move-wide v2, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lcom/papa/sim/statistic/p;->W0(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method L0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emu.psp.limitmember"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0}, Landroid/app/Service;->getPackageName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object p2, Lcom/papa/sim/statistic/Event;->PSPLimitMember:Lcom/papa/sim/statistic/Event;

    new-instance p3, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p3}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1, p2, p3}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    :cond_1
    :goto_0
    return-void
.end method

.method L1(Ljava/lang/String;I)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lcom/join/mgps/Util/s;->j(Landroid/content/Context;Ljava/lang/String;I)V

    return-void
.end method

.method M(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.gamestart15"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/app/Service;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {p2}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Lp1/f;->L(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, p3, v0}, Lcom/papa/sim/statistic/p;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method M0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emu.psp.limitplay"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0}, Landroid/app/Service;->getPackageName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object p2, Lcom/papa/sim/statistic/Event;->PSPLimitPlay:Lcom/papa/sim/statistic/Event;

    new-instance p3, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p3}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1, p2, p3}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    :cond_1
    :goto_0
    return-void
.end method

.method M1()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->A:Lcom/papa/controller/core/d;

    if-nez v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/papa/controller/core/d;->r(Landroid/content/Context;)Lcom/papa/controller/core/d;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/service/CommonService;->A:Lcom/papa/controller/core/d;

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->C1()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->A:Lcom/papa/controller/core/d;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    .line 5
    invoke-virtual {v0, v1}, Lcom/papa/controller/core/d;->x(Z)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->A:Lcom/papa/controller/core/d;

    invoke-virtual {v0}, Lcom/papa/controller/core/d;->B()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method N(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # I
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.gamestart160"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Service;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Lp1/f;->L(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, p3, p4, v0}, Lcom/papa/sim/statistic/p;->i(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method N0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emu.psp.limitpopup"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0}, Landroid/app/Service;->getPackageName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object p2, Lcom/papa/sim/statistic/Event;->PSPLimitPopup:Lcom/papa/sim/statistic/Event;

    new-instance p3, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p3}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1, p2, p3}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    :cond_1
    :goto_0
    return-void
.end method

.method N1(Ljava/lang/String;Lcom/join/mgps/dto/PayOrderInfo;Lcom/wufan/user/service/protobuf/n0;ZLjava/lang/String;)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/dto/PapayOrder;

    invoke-direct {v0}, Lcom/join/mgps/dto/PapayOrder;-><init>()V

    .line 2
    invoke-virtual {p3}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result p3

    iput p3, v0, Lcom/join/mgps/dto/PapayOrder;->PA_OPEN_UID:I

    const-string p3, ""

    .line 3
    iput-object p3, v0, Lcom/join/mgps/dto/PapayOrder;->APP_ORDER_ID:Ljava/lang/String;

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/dto/PayOrderInfo;->getGame_name()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/join/mgps/dto/PapayOrder;->APP_NAME:Ljava/lang/String;

    .line 5
    iput-object p1, v0, Lcom/join/mgps/dto/PapayOrder;->PRODUCT_ID:Ljava/lang/String;

    .line 6
    invoke-virtual {p2}, Lcom/join/mgps/dto/PayOrderInfo;->getGame_app_key()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/join/mgps/dto/PapayOrder;->APPKEY:Ljava/lang/String;

    .line 7
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/join/mgps/dto/PayOrderInfo;->getPay_game_amount()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    iput-object p3, v0, Lcom/join/mgps/dto/PapayOrder;->MONEY_AMOUNT:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p3

    .line 8
    invoke-virtual {p3}, Ljava/lang/NumberFormatException;->printStackTrace()V

    .line 9
    :goto_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/PayOrderInfo;->getPay_show_type()I

    move-result p3

    iput p3, v0, Lcom/join/mgps/dto/PapayOrder;->PAYSHOWTYPE:I

    .line 10
    invoke-virtual {p2}, Lcom/join/mgps/dto/PayOrderInfo;->getPay_type()I

    move-result p3

    iput p3, v0, Lcom/join/mgps/dto/PapayOrder;->PAYTYPE:I

    .line 11
    invoke-virtual {p2}, Lcom/join/mgps/dto/PayOrderInfo;->getGame_name()Ljava/lang/String;

    move-result-object p2

    iput-object p2, v0, Lcom/join/mgps/dto/PapayOrder;->PRODUCT_NAME:Ljava/lang/String;

    if-eqz p4, :cond_0

    const/4 p2, 0x3

    .line 12
    iput p2, v0, Lcom/join/mgps/dto/PapayOrder;->ORDERTYPE:I

    goto :goto_1

    :cond_0
    const/4 p2, 0x2

    .line 13
    iput p2, v0, Lcom/join/mgps/dto/PapayOrder;->ORDERTYPE:I

    :goto_1
    const/high16 p2, 0x10000000

    if-eqz p4, :cond_1

    .line 14
    new-instance p3, Lcom/join/mgps/dto/ExtBean;

    invoke-direct {p3}, Lcom/join/mgps/dto/ExtBean;-><init>()V

    const-string p4, "1"

    .line 15
    invoke-virtual {p3, p4}, Lcom/join/mgps/dto/ExtBean;->setFrom(Ljava/lang/String;)V

    .line 16
    invoke-virtual {p3, p5}, Lcom/join/mgps/dto/ExtBean;->setFrom_id(Ljava/lang/String;)V

    .line 17
    invoke-virtual {p3, p1}, Lcom/join/mgps/dto/ExtBean;->setPosition(Ljava/lang/String;)V

    .line 18
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/activity/PayNowActivity_;->L0(Landroid/content/Context;)Lcom/join/mgps/activity/PayNowActivity_$k;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/PayNowActivity_$k;->c(Lcom/join/mgps/dto/PapayOrder;)Lcom/join/mgps/activity/PayNowActivity_$k;

    move-result-object p1

    invoke-virtual {p1, p2}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/PayNowActivity_$k;

    invoke-virtual {p1, p3}, Lcom/join/mgps/activity/PayNowActivity_$k;->a(Lcom/join/mgps/dto/ExtBean;)Lcom/join/mgps/activity/PayNowActivity_$k;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_2

    .line 19
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/activity/PayNowActivity_;->L0(Landroid/content/Context;)Lcom/join/mgps/activity/PayNowActivity_$k;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/PayNowActivity_$k;->c(Lcom/join/mgps/dto/PapayOrder;)Lcom/join/mgps/activity/PayNowActivity_$k;

    move-result-object p1

    invoke-virtual {p1, p2}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/PayNowActivity_$k;

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :goto_2
    return-void
.end method

.method O(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.gamestartbattle15"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Service;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lcom/papa/sim/statistic/p;->b2(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method O0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emu.psp.limitquit"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0}, Landroid/app/Service;->getPackageName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object p2, Lcom/papa/sim/statistic/Event;->PSPLimitQuit:Lcom/papa/sim/statistic/Event;

    new-instance p3, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p3}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1, p2, p3}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    :cond_1
    :goto_0
    return-void
.end method

.method O1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->A:Lcom/papa/controller/core/d;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/papa/controller/core/d;->F()V

    :cond_0
    return-void
.end method

.method P(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p5    # J
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.gamestartlocalbattle"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Service;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-wide v4, p5

    invoke-virtual/range {v0 .. v5}, Lcom/papa/sim/statistic/p;->J2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    :cond_1
    :goto_0
    return-void
.end method

.method P0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emu.NotpromptVippopup"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 2
    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 3
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setUid(I)Lcom/papa/sim/statistic/Ext;

    .line 4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 5
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object p3, Lcom/papa/sim/statistic/Event;->NotpromptVippopup:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2, p3, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method

.method P1(Ljava/lang/String;)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    return-void
.end method

.method Q()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/va/overmind/d;->d0()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->R()V

    return-void
.end method

.method Q0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emu.onclickFunction"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 2
    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 3
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setUid(I)Lcom/papa/sim/statistic/Ext;

    .line 4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 5
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object p3, Lcom/papa/sim/statistic/Event;->onclickFunction:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2, p3, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method

.method Q1()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, ""

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/service/CommonService;->m0()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 3
    :cond_0
    :try_start_0
    new-instance v1, Lcom/join/mgps/dto/TouristLoginRequestBean;

    invoke-direct {v1}, Lcom/join/mgps/dto/TouristLoginRequestBean;-><init>()V

    const-string v2, "2"

    .line 4
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/android/app/common/utils/n;->z()Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-virtual {v1, v3}, Lcom/join/mgps/dto/TouristLoginRequestBean;->setVersion(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/TouristLoginRequestBean;->setDevice_id(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/TouristLoginRequestBean;->setMac(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/TouristLoginRequestBean;->setSource(Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->touriseTUID()Lorg/androidannotations/api/sharedpreferences/k;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/join/mgps/dto/TouristLoginRequestBean;->setTuid(J)V

    .line 10
    invoke-static {v1}, Lcom/join/mgps/Util/x1;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/TouristLoginRequestBean;->setSign(Ljava/lang/String;)V

    .line 11
    invoke-static {}, Lcom/join/mgps/rpc/impl/a;->c0()Lcom/join/mgps/rpc/b;

    move-result-object v0

    invoke-virtual {v1}, Lcom/join/mgps/dto/TouristLoginRequestBean;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/join/mgps/rpc/b;->s(Ljava/util/Map;)Lcom/join/mgps/dto/AccountResultMainBean;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 12
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getError()I

    move-result v1

    if-nez v1, :cond_2

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/AccountTokenSuccess;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AccountTokenSuccess;->is_success()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 14
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/AccountTokenSuccess;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountTokenSuccess;->getUser_info()Lcom/join/mgps/dto/AccountBean;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 15
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->d:Lcom/join/mgps/Util/b;

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 16
    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    if-nez v1, :cond_2

    .line 17
    :cond_1
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-static {v0}, Lb3/a;->a(Lcom/join/mgps/dto/AccountBean;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/join/mgps/Util/b;->saveAccountData(Lcom/wufan/user/service/protobuf/n0;Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_0
    return-void
.end method

.method R()V
    .locals 9

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2
    :try_start_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lp1/f;->Q(Lcom/join/mgps/enums/Dtype;)Ljava/util/List;

    move-result-object v0

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 5
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 6
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 7
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    return-void

    .line 8
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    iget v2, p0, Lcom/join/mgps/service/CommonService;->G:I

    rem-int/2addr v0, v2

    if-nez v0, :cond_3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    iget v2, p0, Lcom/join/mgps/service/CommonService;->G:I

    div-int/2addr v0, v2

    goto :goto_1

    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    iget v2, p0, Lcom/join/mgps/service/CommonService;->G:I

    div-int/2addr v0, v2

    add-int/lit8 v0, v0, 0x1

    :goto_1
    iput v0, p0, Lcom/join/mgps/service/CommonService;->H:I

    .line 9
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->D:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v0, :cond_4

    .line 10
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/service/CommonService;->D:Ljava/util/concurrent/ScheduledExecutorService;

    :cond_4
    const/4 v0, 0x0

    .line 11
    iput v0, p0, Lcom/join/mgps/service/CommonService;->I:I

    .line 12
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->D:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v3, Lcom/join/mgps/service/CommonService$l;

    invoke-direct {v3, p0, v1}, Lcom/join/mgps/service/CommonService$l;-><init>(Lcom/join/mgps/service/CommonService;Ljava/util/List;)V

    const-wide/16 v4, 0x1

    const-wide/16 v6, 0x3

    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v2 .. v8}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_5
    :goto_2
    return-void
.end method

.method R0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emu.onclickVippopup"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 2
    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 3
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setUid(I)Lcom/papa/sim/statistic/Ext;

    .line 4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 5
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object p3, Lcom/papa/sim/statistic/Event;->onclickVippopup:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2, p3, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method

.method R1(Ljava/lang/String;)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->e:Landroid/content/Intent;

    const-string v1, "type"

    const-string v2, "4"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->e:Landroid/content/Intent;

    const-string v1, "msg"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 3
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->e:Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Service;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method S0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emu.openGoldfinger"
        }
    .end annotation

    .line 1
    :try_start_0
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 2
    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 3
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setUid(I)Lcom/papa/sim/statistic/Ext;

    .line 4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 5
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object p3, Lcom/papa/sim/statistic/Event;->openGoldfinger:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2, p3, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method S1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{\"content\":\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\",\"color\":6,\"titlename\":\"\",\"vipType\":-1,\"name\":\""

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\",\"userId\":\""

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\"}"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1}, Lcom/join/mgps/service/CommonService;->R1(Ljava/lang/String;)V

    return-void
.end method

.method T(Ljava/lang/String;Ljava/lang/String;ZJLcom/join/mgps/dto/QueryDownloadInfoResponseData;ZIIZLcom/join/mgps/dto/DownloadGameArgsBean;)V
    .locals 13
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    move-object v11, p0

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    :try_start_0
    new-instance v0, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 3
    iget-object v1, v11, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 4
    new-instance v1, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;

    invoke-direct {v1}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;-><init>()V

    .line 5
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move-object v3, p1

    .line 6
    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;->setGameIdList(Ljava/util/List;)V

    if-eqz p11, :cond_0

    .line 8
    invoke-virtual/range {p11 .. p11}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getLocation()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;->setLocation(I)V

    .line 9
    :cond_0
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 10
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object v1

    invoke-interface {v1, v0}, Le2/i;->g1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object v0

    new-instance v12, Lcom/join/mgps/service/CommonService$i;

    move-object v1, v12

    move-object v2, p0

    move/from16 v3, p8

    move/from16 v4, p9

    move-object/from16 v5, p6

    move/from16 v6, p3

    move-object v7, p2

    move/from16 v8, p7

    move/from16 v9, p10

    move-object/from16 v10, p11

    invoke-direct/range {v1 .. v10}, Lcom/join/mgps/service/CommonService$i;-><init>(Lcom/join/mgps/service/CommonService;IILcom/join/mgps/dto/QueryDownloadInfoResponseData;ZLjava/lang/String;ZZLcom/join/mgps/dto/DownloadGameArgsBean;)V

    invoke-interface {v0, v12}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    const-string v0, "\u83b7\u53d6\u6e38\u620f\u4fe1\u606f\u5931\u8d25"

    .line 12
    invoke-virtual {p0, v0}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v0, "\u8bf7\u68c0\u67e5\u7f51\u7edc\u8fde\u63a5"

    .line 13
    invoke-virtual {p0, v0}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method T0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emu.openKeyskill"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 2
    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 3
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setUid(I)Lcom/papa/sim/statistic/Ext;

    .line 4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 5
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object p3, Lcom/papa/sim/statistic/Event;->openKeyskill:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2, p3, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method

.method T1()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->v:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->g()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method U(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0xc8L
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v1

    .line 3
    new-instance v2, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v2}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 4
    iget-object v3, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 5
    new-instance v3, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;

    invoke-direct {v3}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;-><init>()V

    .line 6
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v4

    invoke-virtual {v4, p1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    if-nez v4, :cond_0

    return-void

    .line 7
    :cond_0
    invoke-static {v4}, Lcom/join/android/app/common/utils/APKUtils;->G(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 8
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v5

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v4

    const-class v6, Lcom/join/mgps/dto/ModInfoBean;

    invoke-virtual {v5, v4, v6}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/ModInfoBean;

    .line 9
    invoke-virtual {v4}, Lcom/join/mgps/dto/ModInfoBean;->getMain_game_id()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;->setGameId(Ljava/lang/String;)V

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {v3, p1}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;->setGameId(Ljava/lang/String;)V

    .line 11
    :goto_0
    invoke-virtual {v3, v0}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;->setUid(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v3, v1}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;->setToken(Ljava/lang/String;)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/pref/h;->n(Landroid/content/Context;)Lcom/join/mgps/pref/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/pref/h;->x()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "rec"

    goto :goto_1

    :cond_2
    const-string v0, ""

    .line 14
    :goto_1
    invoke-virtual {v3, v0}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;->setIsRecommend(Ljava/lang/String;)V

    .line 15
    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    if-eqz p3, :cond_3

    return-void

    .line 16
    :cond_3
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object v0

    invoke-interface {v0, v2}, Le2/i;->P0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/service/CommonService$m;

    invoke-direct {v1, p0, p1, p3, p2}, Lcom/join/mgps/service/CommonService$m;-><init>(Lcom/join/mgps/service/CommonService;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-interface {v0, v1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    return-void
.end method

.method U0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emu.selectLevel"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 2
    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 3
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setUid(I)Lcom/papa/sim/statistic/Ext;

    .line 4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 5
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object p3, Lcom/papa/sim/statistic/Event;->selectLevel:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2, p3, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method

.method U1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->K:Lcom/join/mgps/service/CommonService$p;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_0
    return-void
.end method

.method V()V
    .locals 17
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    move-object/from16 v1, p0

    const-string v2, "0"

    const-string v3, "-1"

    .line 1
    iget-object v4, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v4}, Lcom/join/mgps/pref/PrefDef_;->plugHasUpdate()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v4

    invoke-virtual {v4}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_9e

    sget-boolean v4, Lcom/join/mgps/service/CommonService;->W:Z

    if-eqz v4, :cond_0

    goto/16 :goto_5f

    :cond_0
    const/4 v4, 0x1

    .line 2
    sput-boolean v4, Lcom/join/mgps/service/CommonService;->W:Z

    .line 3
    invoke-virtual/range {p0 .. p0}, Landroid/app/Service;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f1000cd

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 4
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v6

    const-class v7, Ljava/util/ArrayList;

    new-array v8, v4, [Ljava/lang/Class;

    const-class v9, Lcom/join/mgps/dto/ApkVersionbean;

    const/4 v10, 0x0

    aput-object v9, v8, v10

    invoke-virtual {v6, v7, v8}, Lcom/join/android/app/common/utils/JsonMapper;->createCollectionType(Ljava/lang/Class;[Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v6

    .line 5
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v7

    invoke-virtual {v7, v5, v6}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    const-string v6, "getEMUVersion"

    const-string v7, "start"

    .line 6
    invoke-static {v6, v7}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const-string v8, "tag_id"

    const-string v9, "31"

    .line 8
    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v11

    invoke-virtual {v11, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v11

    .line 10
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v12

    invoke-virtual {v12, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v7

    if-eqz v11, :cond_2

    .line 11
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v12

    if-nez v12, :cond_1

    goto :goto_0

    .line 12
    :cond_1
    invoke-virtual {v1, v5, v11, v9}, Lcom/join/mgps/service/CommonService;->V1(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    :goto_0
    if-eqz v5, :cond_4

    .line 13
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_3
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/join/mgps/dto/ApkVersionbean;

    .line 14
    invoke-virtual {v12}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_3

    .line 15
    new-instance v13, Lcom/join/mgps/db/tables/EMUApkTable;

    invoke-direct {v13, v12}, Lcom/join/mgps/db/tables/EMUApkTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 16
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v12

    invoke-virtual {v12, v13}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_1

    :cond_4
    :goto_2
    if-eqz v7, :cond_6

    .line 17
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v11

    if-nez v11, :cond_5

    goto :goto_3

    .line 18
    :cond_5
    invoke-virtual {v1, v5, v7, v9}, Lcom/join/mgps/service/CommonService;->W1(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_5

    :cond_6
    :goto_3
    if-eqz v5, :cond_8

    .line 19
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_7
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/join/mgps/dto/ApkVersionbean;

    .line 20
    invoke-virtual {v11}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    .line 21
    new-instance v12, Lcom/join/mgps/db/tables/EMUApkArenaTable;

    invoke-direct {v12, v11}, Lcom/join/mgps/db/tables/EMUApkArenaTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 22
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v11

    invoke-virtual {v11, v12}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_4

    .line 23
    :cond_8
    :goto_5
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const-string v9, "35"

    .line 24
    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v11

    invoke-virtual {v11, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v11

    .line 26
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v12

    invoke-virtual {v12, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v7

    if-eqz v11, :cond_a

    .line 27
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v12

    if-nez v12, :cond_9

    goto :goto_6

    .line 28
    :cond_9
    invoke-virtual {v1, v5, v11, v9}, Lcom/join/mgps/service/CommonService;->V1(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_8

    :cond_a
    :goto_6
    if-eqz v5, :cond_c

    .line 29
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_b
    :goto_7
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_c

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/join/mgps/dto/ApkVersionbean;

    .line 30
    invoke-virtual {v12}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    .line 31
    new-instance v13, Lcom/join/mgps/db/tables/EMUApkTable;

    invoke-direct {v13, v12}, Lcom/join/mgps/db/tables/EMUApkTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 32
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v12

    invoke-virtual {v12, v13}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_7

    :cond_c
    :goto_8
    if-eqz v7, :cond_e

    .line 33
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v11

    if-nez v11, :cond_d

    goto :goto_9

    .line 34
    :cond_d
    invoke-virtual {v1, v5, v7, v9}, Lcom/join/mgps/service/CommonService;->W1(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_b

    :cond_e
    :goto_9
    if-eqz v5, :cond_10

    .line 35
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_f
    :goto_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_10

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/join/mgps/dto/ApkVersionbean;

    .line 36
    invoke-virtual {v11}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    .line 37
    new-instance v12, Lcom/join/mgps/db/tables/EMUApkArenaTable;

    invoke-direct {v12, v11}, Lcom/join/mgps/db/tables/EMUApkArenaTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 38
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v11

    invoke-virtual {v11, v12}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_a

    .line 39
    :cond_10
    :goto_b
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const-string v9, "43"

    .line 40
    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v11

    invoke-virtual {v11, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v11

    .line 42
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v12

    invoke-virtual {v12, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v7

    if-eqz v11, :cond_12

    .line 43
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v12

    if-nez v12, :cond_11

    goto :goto_c

    .line 44
    :cond_11
    invoke-virtual {v1, v5, v11, v9}, Lcom/join/mgps/service/CommonService;->V1(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_e

    :cond_12
    :goto_c
    if-eqz v5, :cond_14

    .line 45
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_13
    :goto_d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_14

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/join/mgps/dto/ApkVersionbean;

    .line 46
    invoke-virtual {v12}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_13

    .line 47
    new-instance v13, Lcom/join/mgps/db/tables/EMUApkTable;

    invoke-direct {v13, v12}, Lcom/join/mgps/db/tables/EMUApkTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 48
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v12

    invoke-virtual {v12, v13}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_d

    :cond_14
    :goto_e
    if-eqz v7, :cond_16

    .line 49
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v11

    if-nez v11, :cond_15

    goto :goto_f

    .line 50
    :cond_15
    invoke-virtual {v1, v5, v7, v9}, Lcom/join/mgps/service/CommonService;->W1(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_11

    :cond_16
    :goto_f
    if-eqz v5, :cond_18

    .line 51
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_17
    :goto_10
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_18

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/join/mgps/dto/ApkVersionbean;

    .line 52
    invoke-virtual {v11}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_17

    .line 53
    new-instance v12, Lcom/join/mgps/db/tables/EMUApkArenaTable;

    invoke-direct {v12, v11}, Lcom/join/mgps/db/tables/EMUApkArenaTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 54
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v11

    invoke-virtual {v11, v12}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_10

    .line 55
    :cond_18
    :goto_11
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const-string v9, "33"

    .line 56
    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v11

    invoke-virtual {v11, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v11

    .line 58
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v12

    invoke-virtual {v12, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v7

    if-eqz v11, :cond_1a

    .line 59
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v12

    if-nez v12, :cond_19

    goto :goto_12

    .line 60
    :cond_19
    invoke-virtual {v1, v5, v11, v9}, Lcom/join/mgps/service/CommonService;->V1(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_14

    :cond_1a
    :goto_12
    if-eqz v5, :cond_1c

    .line 61
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_1b
    :goto_13
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1c

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/join/mgps/dto/ApkVersionbean;

    .line 62
    invoke-virtual {v12}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1b

    .line 63
    new-instance v13, Lcom/join/mgps/db/tables/EMUApkTable;

    invoke-direct {v13, v12}, Lcom/join/mgps/db/tables/EMUApkTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 64
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v12

    invoke-virtual {v12, v13}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_13

    :cond_1c
    :goto_14
    if-eqz v7, :cond_1e

    .line 65
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v11

    if-nez v11, :cond_1d

    goto :goto_15

    .line 66
    :cond_1d
    invoke-virtual {v1, v5, v7, v9}, Lcom/join/mgps/service/CommonService;->W1(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_17

    :cond_1e
    :goto_15
    if-eqz v5, :cond_20

    .line 67
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1f
    :goto_16
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_20

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/join/mgps/dto/ApkVersionbean;

    .line 68
    invoke-virtual {v11}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1f

    .line 69
    new-instance v12, Lcom/join/mgps/db/tables/EMUApkArenaTable;

    invoke-direct {v12, v11}, Lcom/join/mgps/db/tables/EMUApkArenaTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 70
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v11

    invoke-virtual {v11, v12}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_16

    .line 71
    :cond_20
    :goto_17
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const-string v9, "34"

    .line 72
    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v11

    invoke-virtual {v11, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v11

    .line 74
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v12

    invoke-virtual {v12, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v7

    if-eqz v11, :cond_22

    .line 75
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v12

    if-nez v12, :cond_21

    goto :goto_18

    .line 76
    :cond_21
    invoke-virtual {v1, v5, v11, v9}, Lcom/join/mgps/service/CommonService;->V1(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_1a

    :cond_22
    :goto_18
    if-eqz v5, :cond_24

    .line 77
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_23
    :goto_19
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_24

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/join/mgps/dto/ApkVersionbean;

    .line 78
    invoke-virtual {v12}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_23

    .line 79
    new-instance v13, Lcom/join/mgps/db/tables/EMUApkTable;

    invoke-direct {v13, v12}, Lcom/join/mgps/db/tables/EMUApkTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 80
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v12

    invoke-virtual {v12, v13}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_19

    :cond_24
    :goto_1a
    if-eqz v7, :cond_26

    .line 81
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v11

    if-nez v11, :cond_25

    goto :goto_1b

    .line 82
    :cond_25
    invoke-virtual {v1, v5, v7, v9}, Lcom/join/mgps/service/CommonService;->W1(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_1d

    :cond_26
    :goto_1b
    if-eqz v5, :cond_28

    .line 83
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_27
    :goto_1c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_28

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/join/mgps/dto/ApkVersionbean;

    .line 84
    invoke-virtual {v11}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_27

    .line 85
    new-instance v12, Lcom/join/mgps/db/tables/EMUApkArenaTable;

    invoke-direct {v12, v11}, Lcom/join/mgps/db/tables/EMUApkArenaTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 86
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v11

    invoke-virtual {v11, v12}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_1c

    .line 87
    :cond_28
    :goto_1d
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const-string v9, "51"

    .line 88
    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v11

    invoke-virtual {v11, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v11

    .line 90
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v12

    invoke-virtual {v12, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v7

    if-eqz v11, :cond_2a

    .line 91
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v12

    if-nez v12, :cond_29

    goto :goto_1e

    .line 92
    :cond_29
    invoke-virtual {v1, v5, v11, v9}, Lcom/join/mgps/service/CommonService;->V1(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_20

    :cond_2a
    :goto_1e
    if-eqz v5, :cond_2c

    .line 93
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_2b
    :goto_1f
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_2c

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/join/mgps/dto/ApkVersionbean;

    .line 94
    invoke-virtual {v12}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2b

    .line 95
    new-instance v13, Lcom/join/mgps/db/tables/EMUApkTable;

    invoke-direct {v13, v12}, Lcom/join/mgps/db/tables/EMUApkTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 96
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v12

    invoke-virtual {v12, v13}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_1f

    :cond_2c
    :goto_20
    if-eqz v7, :cond_2e

    .line 97
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v11

    if-nez v11, :cond_2d

    goto :goto_21

    .line 98
    :cond_2d
    invoke-virtual {v1, v5, v7, v9}, Lcom/join/mgps/service/CommonService;->W1(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_23

    :cond_2e
    :goto_21
    if-eqz v5, :cond_30

    .line 99
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_2f
    :goto_22
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_30

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/join/mgps/dto/ApkVersionbean;

    .line 100
    invoke-virtual {v11}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2f

    .line 101
    new-instance v12, Lcom/join/mgps/db/tables/EMUApkArenaTable;

    invoke-direct {v12, v11}, Lcom/join/mgps/db/tables/EMUApkArenaTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 102
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v11

    invoke-virtual {v11, v12}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_22

    .line 103
    :cond_30
    :goto_23
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const-string v9, "53"

    .line 104
    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v11

    invoke-virtual {v11, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v11

    .line 106
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v12

    invoke-virtual {v12, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v7

    if-eqz v11, :cond_32

    .line 107
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v12

    if-nez v12, :cond_31

    goto :goto_24

    .line 108
    :cond_31
    invoke-virtual {v1, v5, v11, v9}, Lcom/join/mgps/service/CommonService;->V1(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_26

    :cond_32
    :goto_24
    if-eqz v5, :cond_34

    .line 109
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_33
    :goto_25
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_34

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/join/mgps/dto/ApkVersionbean;

    .line 110
    invoke-virtual {v12}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_33

    .line 111
    new-instance v13, Lcom/join/mgps/db/tables/EMUApkTable;

    invoke-direct {v13, v12}, Lcom/join/mgps/db/tables/EMUApkTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 112
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v12

    invoke-virtual {v12, v13}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_25

    :cond_34
    :goto_26
    if-eqz v7, :cond_36

    .line 113
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v11

    if-nez v11, :cond_35

    goto :goto_27

    .line 114
    :cond_35
    invoke-virtual {v1, v5, v7, v9}, Lcom/join/mgps/service/CommonService;->W1(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_29

    :cond_36
    :goto_27
    if-eqz v5, :cond_38

    .line 115
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_37
    :goto_28
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_38

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/join/mgps/dto/ApkVersionbean;

    .line 116
    invoke-virtual {v11}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_37

    .line 117
    new-instance v12, Lcom/join/mgps/db/tables/EMUApkArenaTable;

    invoke-direct {v12, v11}, Lcom/join/mgps/db/tables/EMUApkArenaTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 118
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v11

    invoke-virtual {v11, v12}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_28

    .line 119
    :cond_38
    :goto_29
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const-string v9, "54"

    .line 120
    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v11

    invoke-virtual {v11, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v11

    .line 122
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v12

    invoke-virtual {v12, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v7

    if-eqz v11, :cond_3a

    .line 123
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v12

    if-nez v12, :cond_39

    goto :goto_2a

    .line 124
    :cond_39
    invoke-virtual {v1, v5, v11, v9}, Lcom/join/mgps/service/CommonService;->V1(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_2c

    :cond_3a
    :goto_2a
    if-eqz v5, :cond_3c

    .line 125
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_3b
    :goto_2b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_3c

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/join/mgps/dto/ApkVersionbean;

    .line 126
    invoke-virtual {v12}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_3b

    .line 127
    new-instance v13, Lcom/join/mgps/db/tables/EMUApkTable;

    invoke-direct {v13, v12}, Lcom/join/mgps/db/tables/EMUApkTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 128
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v12

    invoke-virtual {v12, v13}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_2b

    :cond_3c
    :goto_2c
    if-eqz v7, :cond_3e

    .line 129
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v11

    if-nez v11, :cond_3d

    goto :goto_2d

    .line 130
    :cond_3d
    invoke-virtual {v1, v5, v7, v9}, Lcom/join/mgps/service/CommonService;->W1(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_2f

    :cond_3e
    :goto_2d
    if-eqz v5, :cond_40

    .line 131
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_3f
    :goto_2e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_40

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/join/mgps/dto/ApkVersionbean;

    .line 132
    invoke-virtual {v11}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3f

    .line 133
    new-instance v12, Lcom/join/mgps/db/tables/EMUApkArenaTable;

    invoke-direct {v12, v11}, Lcom/join/mgps/db/tables/EMUApkArenaTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 134
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v11

    invoke-virtual {v11, v12}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_2e

    .line 135
    :cond_40
    :goto_2f
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const-string v9, "32"

    .line 136
    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v11

    invoke-virtual {v11, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v11

    .line 138
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v12

    invoke-virtual {v12, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v7

    if-eqz v11, :cond_41

    .line 139
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v11

    if-nez v11, :cond_43

    :cond_41
    if-eqz v5, :cond_43

    .line 140
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_42
    :goto_30
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_43

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/join/mgps/dto/ApkVersionbean;

    .line 141
    invoke-virtual {v12}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_42

    .line 142
    new-instance v13, Lcom/join/mgps/db/tables/EMUApkTable;

    invoke-direct {v13, v12}, Lcom/join/mgps/db/tables/EMUApkTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 143
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v12

    invoke-virtual {v12, v13}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_30

    :cond_43
    if-eqz v7, :cond_44

    .line 144
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-nez v7, :cond_46

    :cond_44
    if-eqz v5, :cond_46

    .line 145
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_45
    :goto_31
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_46

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/join/mgps/dto/ApkVersionbean;

    .line 146
    invoke-virtual {v11}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_45

    .line 147
    new-instance v12, Lcom/join/mgps/db/tables/EMUApkArenaTable;

    invoke-direct {v12, v11}, Lcom/join/mgps/db/tables/EMUApkArenaTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 148
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v11

    invoke-virtual {v11, v12}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_31

    .line 149
    :cond_46
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const-string v9, "56"

    .line 150
    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v11

    invoke-virtual {v11, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v11

    .line 152
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v12

    invoke-virtual {v12, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v7

    if-eqz v11, :cond_48

    .line 153
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v12

    if-nez v12, :cond_47

    goto :goto_32

    .line 154
    :cond_47
    invoke-virtual {v1, v5, v11, v9}, Lcom/join/mgps/service/CommonService;->V1(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_34

    :cond_48
    :goto_32
    if-eqz v5, :cond_4a

    .line 155
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_49
    :goto_33
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_4a

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/join/mgps/dto/ApkVersionbean;

    .line 156
    invoke-virtual {v12}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_49

    .line 157
    new-instance v13, Lcom/join/mgps/db/tables/EMUApkTable;

    invoke-direct {v13, v12}, Lcom/join/mgps/db/tables/EMUApkTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 158
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v12

    invoke-virtual {v12, v13}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_33

    :cond_4a
    :goto_34
    if-eqz v7, :cond_4c

    .line 159
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v11

    if-nez v11, :cond_4b

    goto :goto_35

    .line 160
    :cond_4b
    invoke-virtual {v1, v5, v7, v9}, Lcom/join/mgps/service/CommonService;->W1(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_37

    :cond_4c
    :goto_35
    if-eqz v5, :cond_4e

    .line 161
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_4d
    :goto_36
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_4e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/join/mgps/dto/ApkVersionbean;

    .line 162
    invoke-virtual {v11}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4d

    .line 163
    new-instance v12, Lcom/join/mgps/db/tables/EMUApkArenaTable;

    invoke-direct {v12, v11}, Lcom/join/mgps/db/tables/EMUApkArenaTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 164
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v11

    invoke-virtual {v11, v12}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_36

    .line 165
    :cond_4e
    :goto_37
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const-string v9, "57"

    .line 166
    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v11

    invoke-virtual {v11, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v11

    .line 168
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v12

    invoke-virtual {v12, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v7

    if-eqz v11, :cond_4f

    .line 169
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v11

    if-nez v11, :cond_51

    :cond_4f
    if-eqz v5, :cond_51

    .line 170
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_50
    :goto_38
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_51

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/join/mgps/dto/ApkVersionbean;

    .line 171
    invoke-virtual {v12}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_50

    .line 172
    new-instance v13, Lcom/join/mgps/db/tables/EMUApkTable;

    invoke-direct {v13, v12}, Lcom/join/mgps/db/tables/EMUApkTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 173
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v12

    invoke-virtual {v12, v13}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_38

    :cond_51
    if-eqz v7, :cond_52

    .line 174
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-nez v7, :cond_54

    :cond_52
    if-eqz v5, :cond_54

    .line 175
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_53
    :goto_39
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_54

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/join/mgps/dto/ApkVersionbean;

    .line 176
    invoke-virtual {v11}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_53

    .line 177
    new-instance v12, Lcom/join/mgps/db/tables/EMUApkArenaTable;

    invoke-direct {v12, v11}, Lcom/join/mgps/db/tables/EMUApkArenaTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 178
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v11

    invoke-virtual {v11, v12}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_39

    .line 179
    :cond_54
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const-string v9, "58"

    .line 180
    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v9

    invoke-virtual {v9, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v9

    .line 182
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v11

    invoke-virtual {v11, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v7

    if-eqz v9, :cond_55

    .line 183
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    if-nez v9, :cond_57

    :cond_55
    if-eqz v5, :cond_57

    .line 184
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_56
    :goto_3a
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_57

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/join/mgps/dto/ApkVersionbean;

    .line 185
    invoke-virtual {v11}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v12

    const-string v13, "58"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_56

    .line 186
    new-instance v12, Lcom/join/mgps/db/tables/EMUApkTable;

    invoke-direct {v12, v11}, Lcom/join/mgps/db/tables/EMUApkTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 187
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v11

    invoke-virtual {v11, v12}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_3a

    :cond_57
    if-eqz v7, :cond_58

    .line 188
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-nez v7, :cond_5a

    :cond_58
    if-eqz v5, :cond_5a

    .line 189
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_59
    :goto_3b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/join/mgps/dto/ApkVersionbean;

    .line 190
    invoke-virtual {v9}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v11

    const-string v12, "58"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_59

    .line 191
    new-instance v11, Lcom/join/mgps/db/tables/EMUApkArenaTable;

    invoke-direct {v11, v9}, Lcom/join/mgps/db/tables/EMUApkArenaTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 192
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v9

    invoke-virtual {v9, v11}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_3b

    .line 193
    :cond_5a
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const-string v9, "60"

    .line 194
    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v9

    invoke-virtual {v9, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v9

    .line 196
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v11

    invoke-virtual {v11, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v7

    if-eqz v9, :cond_5b

    .line 197
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    if-nez v9, :cond_5d

    :cond_5b
    if-eqz v5, :cond_5d

    .line 198
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_5c
    :goto_3c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_5d

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/join/mgps/dto/ApkVersionbean;

    .line 199
    invoke-virtual {v11}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v12

    const-string v13, "60"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5c

    .line 200
    new-instance v12, Lcom/join/mgps/db/tables/EMUApkTable;

    invoke-direct {v12, v11}, Lcom/join/mgps/db/tables/EMUApkTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 201
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v11

    invoke-virtual {v11, v12}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_3c

    :cond_5d
    if-eqz v7, :cond_5e

    .line 202
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-nez v7, :cond_60

    :cond_5e
    if-eqz v5, :cond_60

    .line 203
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_5f
    :goto_3d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_60

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/join/mgps/dto/ApkVersionbean;

    .line 204
    invoke-virtual {v9}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v11

    const-string v12, "60"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5f

    .line 205
    new-instance v11, Lcom/join/mgps/db/tables/EMUApkArenaTable;

    invoke-direct {v11, v9}, Lcom/join/mgps/db/tables/EMUApkArenaTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 206
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v9

    invoke-virtual {v9, v11}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_3d

    .line 207
    :cond_60
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const-string v9, "166"

    .line 208
    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v9

    invoke-virtual {v9, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v9

    .line 210
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v11

    invoke-virtual {v11, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v7

    if-eqz v9, :cond_61

    .line 211
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    if-nez v9, :cond_63

    :cond_61
    if-eqz v5, :cond_63

    .line 212
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_62
    :goto_3e
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_63

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/join/mgps/dto/ApkVersionbean;

    .line 213
    invoke-virtual {v11}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v12

    const-string v13, "166"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_62

    .line 214
    new-instance v12, Lcom/join/mgps/db/tables/EMUApkTable;

    invoke-direct {v12, v11}, Lcom/join/mgps/db/tables/EMUApkTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 215
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v11

    invoke-virtual {v11, v12}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_3e

    :cond_63
    if-eqz v7, :cond_64

    .line 216
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-nez v7, :cond_66

    :cond_64
    if-eqz v5, :cond_66

    .line 217
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_65
    :goto_3f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_66

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/join/mgps/dto/ApkVersionbean;

    .line 218
    invoke-virtual {v7}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v9

    const-string v11, "166"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_65

    .line 219
    new-instance v9, Lcom/join/mgps/db/tables/EMUApkArenaTable;

    invoke-direct {v9, v7}, Lcom/join/mgps/db/tables/EMUApkArenaTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 220
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object v7

    invoke-virtual {v7, v9}, Lp1/b;->k(Ljava/lang/Object;)I

    goto :goto_3f

    .line 221
    :cond_66
    invoke-static/range {p0 .. p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v5

    if-eqz v5, :cond_9c

    const/4 v5, 0x0

    .line 222
    :try_start_0
    invoke-static/range {p0 .. p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v7

    invoke-virtual {v7}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_b
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v7, :cond_67

    .line 223
    :try_start_1
    invoke-virtual {v7}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v7
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_c
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_40

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto/16 :goto_5c

    :cond_67
    const/4 v7, 0x0

    .line 224
    :goto_40
    :try_start_2
    invoke-static/range {p0 .. p0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v9

    const/4 v11, 0x2

    invoke-virtual {v9, v11, v11, v10, v7}, Lcom/join/mgps/Util/RequestBeanUtil;->getApkVersion(IIII)Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object v7

    .line 225
    invoke-static {}, Lcom/join/mgps/rpc/impl/d;->P1()Lcom/join/mgps/rpc/impl/d;

    move-result-object v9

    invoke-virtual {v9, v7}, Lcom/join/mgps/rpc/impl/d;->r1(Lcom/join/mgps/dto/CommonRequestBean;)Lcom/join/mgps/dto/ResultMainBean;

    move-result-object v7
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_b
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v7, :cond_9a

    .line 226
    :try_start_3
    invoke-virtual {v7}, Lcom/join/mgps/dto/ResultMainBean;->getFlag()I

    move-result v9

    if-ne v9, v4, :cond_9a

    const-string v9, "sucess"

    .line 227
    invoke-static {v6, v9}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    iget-object v6, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v6}, Lcom/join/mgps/pref/PrefDef_;->plugHasUpdate()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v6

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v6, v9}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 229
    invoke-virtual {v7}, Lcom/join/mgps/dto/ResultMainBean;->getMessages()Lcom/join/mgps/dto/ResultMessageBean;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/ResultMessageBean;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_9
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-nez v6, :cond_68

    .line 230
    sput-boolean v10, Lcom/join/mgps/service/CommonService;->W:Z

    return-void

    .line 231
    :cond_68
    :try_start_4
    invoke-virtual {v7}, Lcom/join/mgps/dto/ResultMainBean;->getMessages()Lcom/join/mgps/dto/ResultMessageBean;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/ResultMessageBean;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/APKVersionMainBean;

    if-eqz v6, :cond_82

    .line 232
    invoke-virtual {v6}, Lcom/join/mgps/dto/APKVersionMainBean;->getApp()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/join/mgps/dto/ApkVersionbean;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_9
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 233
    :try_start_5
    invoke-virtual {v6}, Lcom/join/mgps/dto/APKVersionMainBean;->getSimulator_run_ad_text_cfg()Ljava/util/List;

    move-result-object v12

    sput-object v12, Lcom/MApplication;->Z:Ljava/util/List;

    .line 234
    invoke-virtual {v6}, Lcom/join/mgps/dto/APKVersionMainBean;->getSingle_game_run_ad_text_cfg()Lcom/join/mgps/dto/SingleGameRunAdTextCfgBean;

    move-result-object v12

    sput-object v12, Lcom/MApplication;->p0:Lcom/join/mgps/dto/SingleGameRunAdTextCfgBean;

    .line 235
    invoke-virtual {v6}, Lcom/join/mgps/dto/APKVersionMainBean;->getPublic_video_cfg()Lcom/join/mgps/dto/PublicVideoCfgBean;

    move-result-object v12

    sput-object v12, Lcom/MApplication;->p1:Lcom/join/mgps/dto/PublicVideoCfgBean;

    .line 236
    sget-object v12, Lcom/MApplication;->p0:Lcom/join/mgps/dto/SingleGameRunAdTextCfgBean;

    if-eqz v12, :cond_69

    .line 237
    invoke-virtual {v12}, Lcom/join/mgps/dto/SingleGameRunAdTextCfgBean;->getCounts()I

    move-result v12

    sput v12, Lcom/MApplication;->v1:I

    .line 238
    :cond_69
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "\u83b7\u5f97\u914d\u7f6e\uff1a"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v13, Lcom/MApplication;->p0:Lcom/join/mgps/dto/SingleGameRunAdTextCfgBean;

    invoke-virtual {v13}, Lcom/join/mgps/dto/SingleGameRunAdTextCfgBean;->getCounts()I

    move-result v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 239
    invoke-virtual {v6}, Lcom/join/mgps/dto/APKVersionMainBean;->getCfg()Ljava/util/List;

    move-result-object v12

    if-eqz v12, :cond_81

    .line 240
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v13

    if-lez v13, :cond_81

    .line 241
    invoke-interface {v12, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/join/mgps/dto/HomeViewSwich;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-eqz v12, :cond_81

    .line 242
    :try_start_6
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getDown_load_speed_limit()Lcom/join/mgps/dto/DownloadCfg;

    move-result-object v13

    invoke-virtual {v13}, Lcom/join/mgps/dto/DownloadCfg;->getCfg_values()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v5}, Lcom/join/mgps/Util/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1, v13}, Lcom/join/mgps/service/CommonService;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 243
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_6a

    .line 244
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getDown_load_speed_limit()Lcom/join/mgps/dto/DownloadCfg;

    move-result-object v14

    invoke-virtual {v14, v13}, Lcom/join/mgps/dto/DownloadCfg;->setCfg_values_express(Ljava/lang/String;)V

    goto :goto_41

    .line 245
    :cond_6a
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getDown_load_speed_limit()Lcom/join/mgps/dto/DownloadCfg;

    move-result-object v13

    const-string v14, "300"

    invoke-virtual {v13, v14}, Lcom/join/mgps/dto/DownloadCfg;->setCfg_values_express(Ljava/lang/String;)V

    .line 246
    :goto_41
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getDown_load_size()Lcom/join/mgps/dto/DownloadCfg;

    move-result-object v13

    invoke-virtual {v13}, Lcom/join/mgps/dto/DownloadCfg;->getCfg_values()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v5}, Lcom/join/mgps/Util/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1, v13}, Lcom/join/mgps/service/CommonService;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 247
    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_6b

    .line 248
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getDown_load_size()Lcom/join/mgps/dto/DownloadCfg;

    move-result-object v14

    invoke-virtual {v14, v13}, Lcom/join/mgps/dto/DownloadCfg;->setCfg_values_express(Ljava/lang/String;)V

    goto :goto_42

    .line 249
    :cond_6b
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getDown_load_size()Lcom/join/mgps/dto/DownloadCfg;

    move-result-object v13

    const-string v14, "500"

    invoke-virtual {v13, v14}, Lcom/join/mgps/dto/DownloadCfg;->setCfg_values_express(Ljava/lang/String;)V

    .line 250
    :goto_42
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getDown_load_cfg_net_game_speed_limit()Lcom/join/mgps/dto/DownloadCfg;

    move-result-object v13

    invoke-virtual {v13}, Lcom/join/mgps/dto/DownloadCfg;->getCfg_switch()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v5}, Lcom/join/mgps/Util/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1, v13}, Lcom/join/mgps/service/CommonService;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 251
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_6c

    .line 252
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getDown_load_cfg_net_game_speed_limit()Lcom/join/mgps/dto/DownloadCfg;

    move-result-object v14

    invoke-virtual {v14, v13}, Lcom/join/mgps/dto/DownloadCfg;->setCfg_switch_express(Ljava/lang/String;)V

    goto :goto_43

    .line 253
    :cond_6c
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getDown_load_cfg_net_game_speed_limit()Lcom/join/mgps/dto/DownloadCfg;

    move-result-object v13

    invoke-virtual {v13, v2}, Lcom/join/mgps/dto/DownloadCfg;->setCfg_switch_express(Ljava/lang/String;)V

    .line 254
    :goto_43
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getDown_load_cfg_simulator_speed_limit()Lcom/join/mgps/dto/DownloadCfg;

    move-result-object v13

    invoke-virtual {v13}, Lcom/join/mgps/dto/DownloadCfg;->getCfg_switch()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v5}, Lcom/join/mgps/Util/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1, v13}, Lcom/join/mgps/service/CommonService;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 255
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_6d

    .line 256
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getDown_load_cfg_simulator_speed_limit()Lcom/join/mgps/dto/DownloadCfg;

    move-result-object v14

    invoke-virtual {v14, v13}, Lcom/join/mgps/dto/DownloadCfg;->setCfg_switch_express(Ljava/lang/String;)V

    goto :goto_44

    .line 257
    :cond_6d
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getDown_load_cfg_simulator_speed_limit()Lcom/join/mgps/dto/DownloadCfg;

    move-result-object v13

    invoke-virtual {v13, v2}, Lcom/join/mgps/dto/DownloadCfg;->setCfg_switch_express(Ljava/lang/String;)V

    .line 258
    :goto_44
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getDown_load_cfg_stand_alone_speed_limit()Lcom/join/mgps/dto/DownloadCfg;

    move-result-object v13

    invoke-virtual {v13}, Lcom/join/mgps/dto/DownloadCfg;->getCfg_switch()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v5}, Lcom/join/mgps/Util/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1, v13}, Lcom/join/mgps/service/CommonService;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 259
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6e

    .line 260
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getDown_load_cfg_stand_alone_speed_limit()Lcom/join/mgps/dto/DownloadCfg;

    move-result-object v2

    invoke-virtual {v2, v13}, Lcom/join/mgps/dto/DownloadCfg;->setCfg_switch_express(Ljava/lang/String;)V

    goto :goto_45

    .line 261
    :cond_6e
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getDown_load_cfg_stand_alone_speed_limit()Lcom/join/mgps/dto/DownloadCfg;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/join/mgps/dto/DownloadCfg;->setCfg_switch_express(Ljava/lang/String;)V

    .line 262
    :goto_45
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getDown_load_unrestricted_speed()Lcom/join/mgps/dto/DownloadCfg;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/DownloadCfg;->getCfg_values()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5}, Lcom/join/mgps/Util/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/service/CommonService;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 263
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getDown_load_unrestricted_speed()Lcom/join/mgps/dto/DownloadCfg;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/join/mgps/dto/DownloadCfg;->setCfg_values_express(Ljava/lang/String;)V

    .line 264
    iget-object v2, v1, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/mgps/pref/h;->n(Landroid/content/Context;)Lcom/join/mgps/pref/h;

    move-result-object v2

    invoke-virtual {v2, v12}, Lcom/join/mgps/pref/h;->N(Lcom/join/mgps/dto/HomeViewSwich;)V

    .line 265
    sput-object v12, Lcom/MApplication;->R:Lcom/join/mgps/dto/HomeViewSwich;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_46

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 266
    :try_start_7
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 267
    :goto_46
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getSeep_up_read_only_number_of_win()Lcom/join/mgps/dto/BattaleSwitchBean;

    move-result-object v2

    if-eqz v2, :cond_6f

    .line 268
    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_switch()I

    move-result v3

    if-ne v3, v4, :cond_6f

    .line 269
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->downloadSpeedUpCount()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_47

    .line 270
    :cond_6f
    iget-object v2, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->downloadSpeedUpCount()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v2

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 271
    :goto_47
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getSeep_up_read_only_game_size()Lcom/join/mgps/dto/BattaleSwitchBean;

    move-result-object v2

    if-eqz v2, :cond_70

    .line 272
    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_switch()I

    move-result v3

    if-ne v3, v4, :cond_70

    .line 273
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->downloadSpeedUpGameSize()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_48

    .line 274
    :cond_70
    iget-object v2, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->downloadSpeedUpGameSize()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v2

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 275
    :goto_48
    iget-object v2, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->downloadSpeedUpLastTime()Lorg/androidannotations/api/sharedpreferences/k;

    move-result-object v2

    invoke-virtual {v2}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 276
    invoke-static {v2, v3}, Lcom/join/mgps/Util/y;->u(J)Z

    move-result v2

    if-nez v2, :cond_71

    .line 277
    iget-object v2, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->downloadSpeedUpCountCurrent()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v2

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 278
    iget-object v2, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->downloadSpeedUpCountCurrentAD()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v2

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 279
    iget-object v2, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->downloadSpeedUpGames()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 280
    :cond_71
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getAn_battle_switch()Lcom/join/mgps/dto/BattaleSwitchBean;

    move-result-object v2

    if-eqz v2, :cond_72

    .line 281
    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_switch()I

    move-result v2

    if-ne v2, v4, :cond_72

    .line 282
    iget-object v2, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->showAnBattle()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_49

    .line 283
    :cond_72
    iget-object v2, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->showAnBattle()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 284
    :goto_49
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getPsp_ad_show_time()Lcom/join/mgps/dto/BattaleSwitchBean;

    move-result-object v2

    if-eqz v2, :cond_73

    .line 285
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->pspAdShowTimeSwitch()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_switch()I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v3, v13}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 286
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->pspAdShowTime()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 287
    :cond_73
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getRanking_menu()Lcom/join/mgps/dto/BattaleSwitchBean;

    move-result-object v2

    if-eqz v2, :cond_74

    .line 288
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->rankingMenu()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 289
    :cond_74
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getSeep_up_read_only_arc_ad_id()Lcom/join/mgps/dto/BattaleSwitchBean;

    move-result-object v2

    if-eqz v2, :cond_75

    .line 290
    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_switch()I

    move-result v3

    if-ne v3, v4, :cond_75

    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_75

    .line 291
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->adIdArc()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 292
    :cond_75
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getSeep_up_read_only_psp_ad_id()Lcom/join/mgps/dto/BattaleSwitchBean;

    move-result-object v2

    if-eqz v2, :cond_76

    .line 293
    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_switch()I

    move-result v3

    if-ne v3, v4, :cond_76

    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_76

    .line 294
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->adIdPsp()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 295
    :cond_76
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getSeep_up_read_only_down_ad_id()Lcom/join/mgps/dto/BattaleSwitchBean;

    move-result-object v2

    if-eqz v2, :cond_77

    .line 296
    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_switch()I

    move-result v3

    if-ne v3, v4, :cond_77

    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_77

    .line 297
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->adIdDownloadSpeedUp()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 298
    :cond_77
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getSeep_up_read_only_common_s_ad_id()Lcom/join/mgps/dto/BattaleSwitchBean;

    move-result-object v2

    if-eqz v2, :cond_78

    .line 299
    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_switch()I

    move-result v3

    if-ne v3, v4, :cond_78

    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_78

    .line 300
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->adIdCommonV()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 301
    :cond_78
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getSeep_up_read_only_common_h_ad_id()Lcom/join/mgps/dto/BattaleSwitchBean;

    move-result-object v2

    if-eqz v2, :cond_79

    .line 302
    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_switch()I

    move-result v3

    if-ne v3, v4, :cond_79

    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_79

    .line 303
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->adIdCommonH()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 304
    :cond_79
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getNick_name_modify_title()Lcom/join/mgps/dto/BattaleSwitchBean;

    move-result-object v2

    if-eqz v2, :cond_7a

    .line 305
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->changeNickNameNotice()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 306
    :cond_7a
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getGame_download_boot()Lcom/join/mgps/dto/BattaleSwitchBean;

    move-result-object v2

    if-eqz v2, :cond_7b

    .line 307
    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v2

    .line 308
    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    if-eqz v3, :cond_7b

    .line 309
    :try_start_8
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->insatllAppFirst()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v3

    invoke-virtual {v3}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 310
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    const/4 v13, -0x8

    if-ne v3, v13, :cond_7b

    .line 311
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->insatllAppFirst()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_4a

    :catch_1
    move-exception v0

    move-object v2, v0

    .line 312
    :try_start_9
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 313
    :cond_7b
    :goto_4a
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getGame_performance_boot()Lcom/join/mgps/dto/BattaleSwitchBean;

    move-result-object v2

    if-eqz v2, :cond_7c

    .line 314
    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v2

    .line 315
    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    if-eqz v3, :cond_7c

    .line 316
    :try_start_a
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 317
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->runRomFirst()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v3

    invoke-virtual {v3}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v13, -0x8

    if-ne v3, v13, :cond_7c

    .line 318
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->runRomFirst()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    goto :goto_4b

    :catch_2
    move-exception v0

    move-object v2, v0

    .line 319
    :try_start_b
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 320
    :cond_7c
    :goto_4b
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getApp_down_wifi_status()Lcom/join/mgps/dto/BattaleSwitchBean;

    move-result-object v2

    if-eqz v2, :cond_7d

    .line 321
    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v2

    .line 322
    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_6
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    if-eqz v3, :cond_7d

    .line 323
    :try_start_c
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 324
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->wifiDownNumber()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v3

    invoke-virtual {v3}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v13, -0x1

    if-ne v3, v13, :cond_7d

    .line 325
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->wifiDownNumber()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    goto :goto_4c

    :catch_3
    move-exception v0

    move-object v2, v0

    .line 326
    :try_start_d
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 327
    :cond_7d
    :goto_4c
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getExt_game_upload_type()Lcom/join/mgps/dto/BattaleSwitchBean;

    move-result-object v2

    if-eqz v2, :cond_7e

    .line 328
    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v3

    .line 329
    invoke-static {v3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_6
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    if-eqz v3, :cond_7e

    .line 330
    :try_start_e
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->uploadType2()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_4
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    goto :goto_4d

    :catch_4
    move-exception v0

    move-object v2, v0

    .line 331
    :try_start_f
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 332
    :cond_7e
    :goto_4d
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getWf_home_page_position()Lcom/join/mgps/dto/BattaleSwitchBean;

    move-result-object v2

    if-eqz v2, :cond_7f

    .line 333
    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_switch()I

    move-result v3

    if-ne v3, v4, :cond_7f

    .line 334
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->showIndex()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_4e

    .line 335
    :cond_7f
    iget-object v2, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->showIndex()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    const-string v3, "2"

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 336
    :goto_4e
    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getMd5_file_tag()Lcom/join/mgps/dto/BattaleSwitchBean;

    move-result-object v2

    if-eqz v2, :cond_80

    .line 337
    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_switch()I

    move-result v3

    if-ne v3, v4, :cond_80

    .line 338
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->md5FileTag()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v3, v13}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 339
    invoke-virtual {v2}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/join/mgps/Util/v;->s:Ljava/lang/String;

    goto :goto_4f

    .line 340
    :cond_80
    iget-object v2, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->md5FileTag()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_6
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    .line 341
    :goto_4f
    :try_start_10
    iget-object v2, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->emulatorStartAdCount()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v2

    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getEmulator_start_ad_count()Lcom/join/mgps/dto/BattaleSwitchBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_5
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    goto :goto_50

    :catch_5
    move-exception v0

    move-object v2, v0

    .line 342
    :try_start_11
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 343
    :goto_50
    iget-object v2, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->emulatorGoldenFingerUrl()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getEmulator_golden_finger_url()Lcom/join/mgps/dto/BattaleSwitchBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 344
    iget-object v2, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->emulatorOneSkillUrl()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getEmulator_one_skill_url()Lcom/join/mgps/dto/BattaleSwitchBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 345
    iget-object v2, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->emulatorCheckpointUrl()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeViewSwich;->getEmulator_checkpoint_url()Lcom/join/mgps/dto/BattaleSwitchBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/BattaleSwitchBean;->getCfg_values()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 346
    :cond_81
    invoke-virtual {v6}, Lcom/join/mgps/dto/APKVersionMainBean;->getPlay_game_time_lv_cfg()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 347
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->gameTimeLvCfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v3

    invoke-virtual {v3, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_6
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    goto :goto_51

    :catch_6
    move-exception v0

    move-object v2, v0

    .line 348
    :try_start_12
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_51

    :cond_82
    move-object v9, v5

    .line 349
    :goto_51
    invoke-virtual {v7}, Lcom/join/mgps/dto/ResultMainBean;->getFlag()I

    move-result v2
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_9
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    const-string v3, "_"

    if-ne v2, v4, :cond_84

    .line 350
    :try_start_13
    invoke-static/range {p0 .. p0}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/android/app/common/utils/n;->A()[Ljava/lang/String;

    move-result-object v2

    .line 351
    invoke-virtual {v9}, Lcom/join/mgps/dto/ApkVersionbean;->getVer()Ljava/lang/String;

    move-result-object v12

    .line 352
    invoke-virtual {v12, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v13

    aget-object v13, v13, v10

    invoke-static {v13}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v13

    .line 353
    invoke-virtual {v9}, Lcom/join/mgps/dto/ApkVersionbean;->getVer_compatible()Ljava/lang/String;

    move-result-object v14

    .line 354
    invoke-virtual {v14, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v14

    aget-object v14, v14, v10

    invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v14

    .line 355
    aget-object v15, v2, v10

    invoke-static {v15}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v15

    if-gt v15, v13, :cond_84

    .line 356
    new-instance v15, Lcom/join/mgps/dto/VersionDto;

    invoke-direct {v15}, Lcom/join/mgps/dto/VersionDto;-><init>()V

    .line 357
    invoke-virtual {v9}, Lcom/join/mgps/dto/ApkVersionbean;->getDown_url()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v15, v5}, Lcom/join/mgps/dto/VersionDto;->setAndroidUrl(Ljava/lang/String;)V

    .line 358
    invoke-virtual {v12, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    aget-object v5, v5, v10

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v15, v5}, Lcom/join/mgps/dto/VersionDto;->setVersionNo(F)V

    .line 359
    invoke-virtual {v9}, Lcom/join/mgps/dto/ApkVersionbean;->getVer_info()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v15, v5}, Lcom/join/mgps/dto/VersionDto;->setInfo(Ljava/lang/String;)V

    .line 360
    invoke-virtual {v9}, Lcom/join/mgps/dto/ApkVersionbean;->getHead_pic()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v15, v5}, Lcom/join/mgps/dto/VersionDto;->setHead_pic(Ljava/lang/String;)V

    .line 361
    invoke-virtual {v9}, Lcom/join/mgps/dto/ApkVersionbean;->getTow_tpl_back_ground_pic()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v15, v5}, Lcom/join/mgps/dto/VersionDto;->setTow_tpl_back_ground_pic(Ljava/lang/String;)V

    .line 362
    invoke-virtual {v9}, Lcom/join/mgps/dto/ApkVersionbean;->getTpl_type()I

    move-result v5

    invoke-virtual {v15, v5}, Lcom/join/mgps/dto/VersionDto;->setTpl_type(I)V

    .line 363
    aget-object v5, v2, v10

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    if-ge v5, v13, :cond_84

    .line 364
    new-instance v5, Landroid/content/Intent;

    const-string v9, "com.join.android.app.mgsim.wufun.broadcast.appUpdate"

    invoke-direct {v5, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 365
    aget-object v2, v2, v10

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    int-to-float v9, v14

    cmpg-float v2, v2, v9

    if-gez v2, :cond_83

    .line 366
    invoke-virtual {v15, v4}, Lcom/join/mgps/dto/VersionDto;->setQiangzhi(Z)V

    const-string v2, "appUpdateBean"

    .line 367
    invoke-virtual {v5, v2, v15}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    goto :goto_52

    .line 368
    :cond_83
    invoke-virtual {v15, v10}, Lcom/join/mgps/dto/VersionDto;->setQiangzhi(Z)V

    const-string v2, "appUpdateBean"

    .line 369
    invoke-virtual {v5, v2, v15}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 370
    :goto_52
    invoke-virtual {v1, v5}, Landroid/app/Service;->sendBroadcast(Landroid/content/Intent;)V

    .line 371
    :cond_84
    invoke-virtual {v6}, Lcom/join/mgps/dto/APKVersionMainBean;->getPlugin()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_99

    .line 372
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_53
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_99

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/ApkVersionbean;

    .line 373
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v6

    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v6

    if-eqz v6, :cond_85

    .line 374
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getVer()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_85

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer_name()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_85

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getDown_type()I

    move-result v9

    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getDown_type()I

    move-result v12

    if-eq v9, v12, :cond_85

    .line 375
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v9

    invoke-virtual {v9, v6}, Lp1/b;->delete(Ljava/lang/Object;)I

    const/4 v6, 0x0

    .line 376
    :cond_85
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 377
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v9, v8, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v12

    invoke-virtual {v12, v9}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v9

    const/16 v12, 0x9

    const/4 v13, 0x5

    if-eqz v9, :cond_90

    .line 379
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v14

    if-lez v14, :cond_90

    .line 380
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v14

    if-le v14, v4, :cond_86

    const/4 v14, 0x0

    .line 381
    :goto_54
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v15

    if-ge v14, v15, :cond_86

    .line 382
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v15

    invoke-interface {v9, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v4, v16

    check-cast v4, Lcom/join/mgps/db/tables/EMUApkTable;

    invoke-virtual {v15, v4}, Lp1/b;->delete(Ljava/lang/Object;)I
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_9
    .catchall {:try_start_13 .. :try_end_13} :catchall_1

    add-int/lit8 v14, v14, 0x1

    const/4 v4, 0x1

    goto :goto_54

    .line 383
    :cond_86
    :try_start_14
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/db/tables/EMUApkTable;
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_8
    .catchall {:try_start_14 .. :try_end_14} :catchall_1

    .line 384
    :try_start_15
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getApk_name()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setApk_name(Ljava/lang/String;)V

    .line 385
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getDown_url()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setDown_url(Ljava/lang/String;)V

    .line 386
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getLaunch_name()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setLaunch_name(Ljava/lang/String;)V

    .line 387
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getLogo()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setLogo(Ljava/lang/String;)V

    .line 388
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getPackage_name()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setPackage_name(Ljava/lang/String;)V

    .line 389
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getRelease_date()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setRelease_date(Ljava/lang/String;)V

    .line 390
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getSize()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setSize(Ljava/lang/String;)V

    .line 391
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setTag_id(Ljava/lang/String;)V

    .line 392
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getTeam_info()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setTeam_info(Ljava/lang/String;)V

    .line 393
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getVer()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setVer(Ljava/lang/String;)V

    .line 394
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getVer_compatible()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setVer_compatible(Ljava/lang/String;)V

    .line 395
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getVer_info()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setVer_info(Ljava/lang/String;)V

    .line 396
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getDown_type()I

    move-result v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setDown_type(I)V

    .line 397
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getPlugin_md5()Lcom/join/mgps/dto/ApkVersionRemarkBean;

    move-result-object v9

    invoke-static {v9}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setRemark(Ljava/lang/String;)V

    .line 398
    invoke-static {v1, v4}, Lcom/join/mgps/Util/UtilsMy;->C0(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;)Z

    move-result v9

    if-eqz v6, :cond_8c

    .line 399
    invoke-virtual {v4}, Lcom/join/mgps/db/tables/EMUApkTable;->getApkPath()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_87

    .line 400
    iget-object v14, v1, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v14, v6, v4}, Lcom/join/android/app/common/utils/l;->I(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/db/tables/EMUApkTable;)Z

    :cond_87
    if-eqz v9, :cond_89

    .line 401
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v14

    if-ne v14, v13, :cond_89

    .line 402
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getDown_url()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v6, v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setUrl(Ljava/lang/String;)V

    .line 403
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_88

    .line 404
    invoke-virtual {v6, v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 405
    :cond_88
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getVer_info()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v6, v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setDescribe(Ljava/lang/String;)V

    .line 406
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getLogo()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v6, v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setPortraitURL(Ljava/lang/String;)V

    .line 407
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getApk_name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setShowName(Ljava/lang/String;)V

    goto :goto_55

    .line 408
    :cond_89
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v5

    if-nez v5, :cond_8a

    .line 409
    invoke-virtual {v6, v13}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 410
    :cond_8a
    :goto_55
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v5

    invoke-virtual {v5, v6}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v5

    if-eq v5, v12, :cond_8b

    if-eqz v9, :cond_8f

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v5

    if-ne v5, v13, :cond_8f

    .line 412
    :cond_8b
    iget-object v5, v1, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v5, v4}, Lcom/join/android/app/common/utils/l;->G(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;)V

    goto :goto_57

    :cond_8c
    if-eqz v9, :cond_8e

    .line 413
    invoke-virtual {v4}, Lcom/join/mgps/db/tables/EMUApkTable;->getDown_type()I

    move-result v5

    if-ne v5, v11, :cond_8d

    .line 414
    iget-object v5, v1, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    new-array v6, v10, [Ljava/lang/String;

    invoke-static {v5, v4, v10, v6}, Lcom/join/android/app/common/utils/l;->t(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;Z[Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8f

    .line 415
    iget-object v5, v1, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v4, v5}, Lcom/join/mgps/Util/UtilsMy;->M2(Lcom/join/mgps/db/tables/EMUApkTable;Landroid/content/Context;)V

    .line 416
    iget-object v5, v1, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v5, v4}, Lcom/join/android/app/common/utils/l;->G(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;)V

    goto :goto_57

    .line 417
    :cond_8d
    iget-object v5, v1, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v4, v5}, Lcom/join/mgps/Util/UtilsMy;->M2(Lcom/join/mgps/db/tables/EMUApkTable;Landroid/content/Context;)V

    goto :goto_57

    .line 418
    :cond_8e
    iget-object v5, v1, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    new-array v6, v10, [Ljava/lang/String;

    invoke-static {v5, v4, v10, v6}, Lcom/join/android/app/common/utils/l;->t(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;Z[Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8f

    .line 419
    iget-object v5, v1, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v4, v5}, Lcom/join/mgps/Util/UtilsMy;->L2(Lcom/join/mgps/db/tables/EMUApkTable;Landroid/content/Context;)V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_7
    .catchall {:try_start_15 .. :try_end_15} :catchall_1

    goto :goto_57

    :catch_7
    move-exception v0

    move-object v5, v0

    goto :goto_56

    :catch_8
    move-exception v0

    move-object v5, v0

    const/4 v4, 0x0

    .line 420
    :goto_56
    :try_start_16
    invoke-virtual {v5}, Ljava/lang/Exception;->printStackTrace()V

    .line 421
    :cond_8f
    :goto_57
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v5

    invoke-virtual {v5, v4}, Lp1/b;->update(Ljava/lang/Object;)I

    .line 422
    invoke-static {v4}, Lcom/join/android/app/common/utils/l;->F(Lcom/join/mgps/db/tables/EMUApkTable;)V

    goto/16 :goto_59

    .line 423
    :cond_90
    new-instance v4, Lcom/join/mgps/db/tables/EMUApkTable;

    invoke-direct {v4}, Lcom/join/mgps/db/tables/EMUApkTable;-><init>()V

    .line 424
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getApk_name()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setApk_name(Ljava/lang/String;)V

    .line 425
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getDown_url()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setDown_url(Ljava/lang/String;)V

    .line 426
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getLaunch_name()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setLaunch_name(Ljava/lang/String;)V

    .line 427
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getLogo()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setLogo(Ljava/lang/String;)V

    .line 428
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getPackage_name()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setPackage_name(Ljava/lang/String;)V

    .line 429
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getRelease_date()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setRelease_date(Ljava/lang/String;)V

    .line 430
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getSize()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setSize(Ljava/lang/String;)V

    .line 431
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setTag_id(Ljava/lang/String;)V

    .line 432
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getTeam_info()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setTeam_info(Ljava/lang/String;)V

    .line 433
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getVer()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setVer(Ljava/lang/String;)V

    .line 434
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getVer_compatible()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setVer_compatible(Ljava/lang/String;)V

    .line 435
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getVer_info()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setVer_info(Ljava/lang/String;)V

    .line 436
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getDown_type()I

    move-result v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setDown_type(I)V

    .line 437
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getPlugin_md5()Lcom/join/mgps/dto/ApkVersionRemarkBean;

    move-result-object v9

    invoke-static {v9}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/join/mgps/db/tables/EMUApkTable;->setRemark(Ljava/lang/String;)V

    .line 438
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v9

    invoke-virtual {v9, v4}, Lp1/b;->k(Ljava/lang/Object;)I

    .line 439
    invoke-static {v4}, Lcom/join/android/app/common/utils/l;->F(Lcom/join/mgps/db/tables/EMUApkTable;)V

    .line 440
    invoke-static {v1, v4}, Lcom/join/mgps/Util/UtilsMy;->C0(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;)Z

    move-result v9

    if-eqz v6, :cond_95

    .line 441
    invoke-virtual {v4}, Lcom/join/mgps/db/tables/EMUApkTable;->getApkPath()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_91

    .line 442
    iget-object v14, v1, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v14, v6, v4}, Lcom/join/android/app/common/utils/l;->I(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/db/tables/EMUApkTable;)Z

    :cond_91
    if-eqz v9, :cond_92

    .line 443
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v14

    if-ne v14, v13, :cond_92

    .line 444
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getDown_url()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v6, v14}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setUrl(Ljava/lang/String;)V

    .line 445
    invoke-virtual {v5}, Lcom/join/mgps/dto/ApkVersionbean;->getApk_name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setShowName(Ljava/lang/String;)V

    .line 446
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_93

    .line 447
    invoke-virtual {v6, v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto :goto_58

    .line 448
    :cond_92
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v5

    if-nez v5, :cond_93

    .line 449
    invoke-virtual {v6, v13}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 450
    :cond_93
    :goto_58
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v5

    invoke-virtual {v5, v6}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v5

    if-eq v5, v12, :cond_94

    if-eqz v9, :cond_98

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v5

    if-ne v5, v13, :cond_98

    .line 452
    :cond_94
    iget-object v5, v1, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v5, v4}, Lcom/join/android/app/common/utils/l;->G(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;)V

    goto :goto_59

    :cond_95
    if-eqz v9, :cond_97

    .line 453
    invoke-virtual {v4}, Lcom/join/mgps/db/tables/EMUApkTable;->getDown_type()I

    move-result v5

    if-ne v5, v11, :cond_96

    .line 454
    iget-object v5, v1, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    new-array v6, v10, [Ljava/lang/String;

    invoke-static {v5, v4, v10, v6}, Lcom/join/android/app/common/utils/l;->t(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;Z[Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_98

    .line 455
    iget-object v5, v1, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v4, v5}, Lcom/join/mgps/Util/UtilsMy;->M2(Lcom/join/mgps/db/tables/EMUApkTable;Landroid/content/Context;)V

    goto :goto_59

    .line 456
    :cond_96
    iget-object v5, v1, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v4, v5}, Lcom/join/mgps/Util/UtilsMy;->M2(Lcom/join/mgps/db/tables/EMUApkTable;Landroid/content/Context;)V

    goto :goto_59

    .line 457
    :cond_97
    iget-object v5, v1, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    new-array v6, v10, [Ljava/lang/String;

    invoke-static {v5, v4, v10, v6}, Lcom/join/android/app/common/utils/l;->t(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;Z[Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_98

    .line 458
    iget-object v5, v1, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v4, v5}, Lcom/join/mgps/Util/UtilsMy;->L2(Lcom/join/mgps/db/tables/EMUApkTable;Landroid/content/Context;)V

    :cond_98
    :goto_59
    const/4 v4, 0x1

    goto/16 :goto_53

    .line 459
    :cond_99
    invoke-virtual/range {p0 .. p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v2

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v3

    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v4

    invoke-virtual {v4}, Lp1/b;->d()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v2, v4, v3}, Lcom/papa/sim/statistic/p;->E2(ZLjava/lang/String;)V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_9
    .catchall {:try_start_16 .. :try_end_16} :catchall_1

    goto :goto_5a

    :catchall_1
    move-exception v0

    move-object v2, v0

    move-object v5, v7

    goto :goto_5c

    :catch_9
    move-object v5, v7

    goto :goto_5d

    .line 460
    :cond_9a
    :goto_5a
    sput-boolean v10, Lcom/join/mgps/service/CommonService;->W:Z

    if-nez v7, :cond_9d

    .line 461
    iget v2, v1, Lcom/join/mgps/service/CommonService;->C:I

    if-lez v2, :cond_9d

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    .line 462
    iput v2, v1, Lcom/join/mgps/service/CommonService;->C:I

    :goto_5b
    const-wide/16 v2, 0x1388

    .line 463
    :try_start_17
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    .line 464
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/service/CommonService;->V()V
    :try_end_17
    .catch Ljava/lang/InterruptedException; {:try_start_17 .. :try_end_17} :catch_d

    goto :goto_5e

    :catchall_2
    move-exception v0

    move-object v2, v0

    const/4 v5, 0x0

    .line 465
    :goto_5c
    sput-boolean v10, Lcom/join/mgps/service/CommonService;->W:Z

    if-nez v5, :cond_9b

    .line 466
    iget v3, v1, Lcom/join/mgps/service/CommonService;->C:I

    if-lez v3, :cond_9b

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    .line 467
    iput v3, v1, Lcom/join/mgps/service/CommonService;->C:I

    const-wide/16 v3, 0x1388

    .line 468
    :try_start_18
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V

    .line 469
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/service/CommonService;->V()V
    :try_end_18
    .catch Ljava/lang/InterruptedException; {:try_start_18 .. :try_end_18} :catch_a

    .line 470
    :catch_a
    :cond_9b
    throw v2

    :catch_b
    const/4 v5, 0x0

    .line 471
    :catch_c
    :goto_5d
    sput-boolean v10, Lcom/join/mgps/service/CommonService;->W:Z

    if-nez v5, :cond_9d

    .line 472
    iget v2, v1, Lcom/join/mgps/service/CommonService;->C:I

    if-lez v2, :cond_9d

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    .line 473
    iput v2, v1, Lcom/join/mgps/service/CommonService;->C:I

    goto :goto_5b

    .line 474
    :cond_9c
    sput-boolean v10, Lcom/join/mgps/service/CommonService;->W:Z

    const-string v2, "nonet"

    .line 475
    invoke-static {v6, v2}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 476
    :catch_d
    :cond_9d
    :goto_5e
    invoke-direct/range {p0 .. p0}, Lcom/join/mgps/service/CommonService;->S()V

    .line 477
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/service/CommonService;->e0()V

    :cond_9e
    :goto_5f
    return-void
.end method

.method V0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emu.shareScreenshot"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 2
    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 3
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setUid(I)Lcom/papa/sim/statistic/Ext;

    .line 4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 5
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object p3, Lcom/papa/sim/statistic/Event;->shareScreenshot:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2, p3, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method

.method V1(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/dto/ApkVersionbean;",
            ">;",
            "Ljava/util/List<",
            "Lcom/join/mgps/db/tables/EMUApkTable;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/android/app/common/utils/n;->y()I

    move-result v0

    const/16 v1, 0x83

    if-lt v0, v1, :cond_3

    if-eqz p2, :cond_3

    .line 2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/db/tables/EMUApkTable;

    invoke-virtual {p2}, Lcom/join/mgps/db/tables/EMUApkTable;->getDown_type()I

    move-result p2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_2

    if-eqz p1, :cond_2

    .line 4
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/ApkVersionbean;

    .line 5
    invoke-virtual {p2}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    new-instance p1, Lcom/join/mgps/db/tables/EMUApkTable;

    invoke-direct {p1, p2}, Lcom/join/mgps/db/tables/EMUApkTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 7
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object p2

    invoke-virtual {p2, p1}, Lp1/b;->k(Ljava/lang/Object;)I

    .line 8
    :cond_2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Lp1/f;->Z(I)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 9
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getDown_type()I

    move-result p2

    if-eq p2, v0, :cond_4

    .line 10
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p2

    invoke-virtual {p2, p1}, Lp1/b;->delete(Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_3
    :goto_0
    return-void

    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_1
    return-void
.end method

.method W()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/dto/RequestEndGameListArgs;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestEndGameListArgs;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestEndGameListArgs;->setUid(Ljava/lang/String;)V

    .line 4
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 5
    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 7
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/rpc/impl/i;->x(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 9
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->endGameConfig()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v1

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method W0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emu.showvippopup"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 2
    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 3
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setUid(I)Lcom/papa/sim/statistic/Ext;

    .line 4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 5
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object p3, Lcom/papa/sim/statistic/Event;->showVippopup:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2, p3, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method

.method W1(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/dto/ApkVersionbean;",
            ">;",
            "Ljava/util/List<",
            "Lcom/join/mgps/db/tables/EMUApkArenaTable;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/android/app/common/utils/n;->y()I

    move-result v0

    const/16 v1, 0x83

    if-lt v0, v1, :cond_3

    if-eqz p2, :cond_3

    .line 2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/db/tables/EMUApkArenaTable;

    invoke-virtual {p2}, Lcom/join/mgps/db/tables/EMUApkArenaTable;->getDown_type()I

    move-result p2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_2

    if-eqz p1, :cond_2

    .line 4
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/ApkVersionbean;

    .line 5
    invoke-virtual {p2}, Lcom/join/mgps/dto/ApkVersionbean;->getTag_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    new-instance p1, Lcom/join/mgps/db/tables/EMUApkArenaTable;

    invoke-direct {p1, p2}, Lcom/join/mgps/db/tables/EMUApkArenaTable;-><init>(Lcom/join/mgps/dto/ApkVersionbean;)V

    .line 7
    invoke-static {}, Lb2/o;->o()Lb2/o;

    move-result-object p2

    invoke-virtual {p2, p1}, Lp1/b;->k(Ljava/lang/Object;)I

    .line 8
    :cond_2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Lp1/f;->Z(I)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 9
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getDown_type()I

    move-result p2

    if-eq p2, v0, :cond_4

    .line 10
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p2

    invoke-virtual {p2, p1}, Lp1/b;->delete(Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_3
    :goto_0
    return-void

    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_1
    return-void
.end method

.method X(Ljava/lang/String;)Lcom/join/mgps/dto/FileInfo;
    .locals 7

    const-string v0, ""

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x1

    .line 2
    invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 3
    new-instance v4, Lcom/join/mgps/dto/FileInfo;

    invoke-direct {v4}, Lcom/join/mgps/dto/FileInfo;-><init>()V

    .line 4
    iget-object v5, v3, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iput-object v5, v4, Lcom/join/mgps/dto/FileInfo;->pkg:Ljava/lang/String;

    .line 5
    iget-object v5, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object v5, v4, Lcom/join/mgps/dto/FileInfo;->versionName:Ljava/lang/String;

    .line 6
    iget v5, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    iput v5, v4, Lcom/join/mgps/dto/FileInfo;->versionCode:I

    .line 7
    iput-object p1, v4, Lcom/join/mgps/dto/FileInfo;->path:Ljava/lang/String;

    .line 8
    iget-wide v5, v3, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    iput-wide v5, v4, Lcom/join/mgps/dto/FileInfo;->time:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 9
    :try_start_1
    iget-object v5, v3, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 10
    iput-object p1, v5, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 11
    iput-object p1, v5, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 12
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v4, Lcom/join/mgps/dto/FileInfo;->title:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 13
    :catch_0
    :try_start_2
    iget-object v1, v3, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v4, Lcom/join/mgps/dto/FileInfo;->title:Ljava/lang/String;

    .line 14
    :goto_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v5

    iput-wide v5, v4, Lcom/join/mgps/dto/FileInfo;->size:J

    new-array p1, v2, [Ljava/lang/String;

    const/4 v1, 0x0

    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, p1, v1

    invoke-static {p1}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return-object v4

    :catch_1
    move-exception p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method X0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emu.uesVippopup"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 2
    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 3
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setUid(I)Lcom/papa/sim/statistic/Ext;

    .line 4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 5
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object p3, Lcom/papa/sim/statistic/Event;->uesVippopup:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2, p3, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method

.method public X1()V
    .locals 0

    return-void
.end method

.method Y1()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.action_update_user_purchase_info",
            "com.join.android.app.mgsim.wufun.broadcast.action_login_success"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->X1()V

    return-void
.end method

.method Z()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
        delay = 0x1f4L
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v1

    .line 4
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "uid"

    .line 5
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "token"

    .line 6
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    invoke-static {}, Lcom/join/mgps/rpc/impl/f;->b()Lcom/join/mgps/rpc/impl/f;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/join/mgps/rpc/impl/f;->a(Ljava/util/Map;)Lcom/join/mgps/dto/ResultMainBean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMainBean;->getFlag()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMainBean;->getMessages()Lcom/join/mgps/dto/ResultMessageBean;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMainBean;->getMessages()Lcom/join/mgps/dto/ResultMessageBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ResultMessageBean;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMainBean;->getMessages()Lcom/join/mgps/dto/ResultMessageBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMessageBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/join/mgps/service/CommonService;->q1(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method Z1(Ljava/lang/String;Ljava/lang/String;)V
    .locals 17
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "remoteUrl"

    const-string v2, "data"

    const-string v3, "code"

    .line 1
    invoke-static/range {p0 .. p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v4, :cond_1

    .line 2
    new-instance v11, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v11}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 3
    invoke-virtual {v11, v1}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 4
    new-instance v4, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveArgs;

    invoke-direct {v4}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveArgs;-><init>()V

    .line 5
    invoke-static/range {p0 .. p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v7

    invoke-virtual {v7}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v7

    move-object/from16 v8, p1

    .line 6
    invoke-virtual {v4, v8}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveArgs;->setGameId(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v7}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v8

    invoke-virtual {v4, v8}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveArgs;->setUid(I)V

    .line 8
    invoke-virtual {v11, v4}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 9
    invoke-static/range {p0 .. p0}, Lcom/papa/sim/statistic/k;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v12

    .line 10
    invoke-static {}, Lcom/join/android/app/common/http/h;->b()Lcom/join/android/app/common/http/h;

    move-result-object v4

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    invoke-virtual {v7}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ""

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 12
    invoke-virtual {v7}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v10

    new-instance v7, Ljava/io/File;

    move-object/from16 v8, p2

    invoke-direct {v7, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x1

    const/4 v15, 0x0

    new-instance v7, Lcom/join/mgps/service/CommonService$a;

    invoke-direct {v7, v1}, Lcom/join/mgps/service/CommonService$a;-><init>(Lcom/join/mgps/service/CommonService;)V

    move-object/from16 v16, v7

    move-object v7, v4

    .line 14
    invoke-virtual/range {v7 .. v16}, Lcom/join/android/app/common/http/h;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/dto/RequestModel;Ljava/lang/String;Ljava/lang/String;IILcom/join/android/app/common/http/g;)Ljava/lang/String;

    move-result-object v4

    .line 15
    :try_start_0
    invoke-static {v4}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 16
    invoke-static {v4}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 17
    invoke-virtual {v4, v3}, Lcom/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v4, v3}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/gson/JsonElement;->getAsInt()I

    move-result v3

    const/16 v7, 0xc8

    if-ne v3, v7, :cond_2

    .line 18
    invoke-virtual {v4, v2}, Lcom/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 19
    invoke-virtual {v4, v2}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object v2

    .line 20
    invoke-virtual {v2}, Lcom/google/gson/JsonArray;->size()I

    move-result v3

    if-lez v3, :cond_2

    .line 21
    invoke-virtual {v2, v6}, Lcom/google/gson/JsonArray;->get(I)Lcom/google/gson/JsonElement;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v2

    .line 22
    invoke-virtual {v2, v0}, Lcom/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 23
    invoke-virtual {v2, v0}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/join/mgps/service/CommonService;->x1(Ljava/lang/String;)V

    .line 24
    iput-boolean v6, v1, Lcom/join/mgps/service/CommonService;->L:Z

    goto :goto_0

    .line 25
    :cond_0
    invoke-direct {v1, v5}, Lcom/join/mgps/service/CommonService;->x1(Ljava/lang/String;)V

    .line 26
    iput-boolean v6, v1, Lcom/join/mgps/service/CommonService;->L:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 28
    invoke-direct {v1, v5}, Lcom/join/mgps/service/CommonService;->x1(Ljava/lang/String;)V

    .line 29
    iput-boolean v6, v1, Lcom/join/mgps/service/CommonService;->L:Z

    goto :goto_0

    .line 30
    :cond_1
    invoke-direct {v1, v5}, Lcom/join/mgps/service/CommonService;->x1(Ljava/lang/String;)V

    .line 31
    iput-boolean v6, v1, Lcom/join/mgps/service/CommonService;->L:Z

    :cond_2
    :goto_0
    return-void
.end method

.method a0(Ljava/lang/String;)V
    .locals 9
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 2
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :try_start_0
    const-string v1, "fromPkg"

    .line 3
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "action"

    const-string v2, "getMiniGameAdConfigResult"

    .line 4
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    invoke-virtual {v1, p1}, Lp1/f;->H(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    const-string v1, ""

    .line 6
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    if-eqz p1, :cond_1

    .line 7
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 8
    invoke-static {v3}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 9
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    .line 10
    :cond_1
    new-instance p1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {p1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 11
    invoke-virtual {p1, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 12
    new-instance v3, Lcom/join/mgps/dto/MiniGameSdkDtoRequestArgs;

    invoke-direct {v3}, Lcom/join/mgps/dto/MiniGameSdkDtoRequestArgs;-><init>()V

    .line 13
    invoke-virtual {v3, v1}, Lcom/join/mgps/dto/MiniGameSdkDtoRequestArgs;->setGameId(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v3, v2}, Lcom/join/mgps/dto/MiniGameSdkDtoRequestArgs;->setUid(Ljava/lang/String;)V

    .line 15
    invoke-virtual {p1, v3}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 16
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/join/mgps/rpc/impl/i;->V(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 17
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_5

    .line 18
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/MiniGameSdkDtoResponseResponseData;

    invoke-virtual {v1}, Lcom/join/mgps/dto/MiniGameSdkDtoResponseResponseData;->getAd_list()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 19
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_5

    .line 20
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    .line 21
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_4

    .line 22
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/MiniGameSdkDtoAdCfgValue;

    .line 23
    new-instance v5, Lc3/b;

    invoke-direct {v5}, Lc3/b;-><init>()V

    .line 24
    invoke-virtual {v4}, Lcom/join/mgps/dto/MiniGameSdkDtoAdCfgValue;->getSdk_app_id()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lc3/b;->b(Ljava/lang/String;)V

    const/4 v6, -0x1

    .line 25
    invoke-virtual {v4}, Lcom/join/mgps/dto/MiniGameSdkDtoAdCfgValue;->getSdk_type()I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v8, :cond_2

    sget-object v4, Lcom/wufun/union/ad/AdChannel$Type;->TT:Lcom/wufun/union/ad/AdChannel$Type;

    iget v6, v4, Lcom/wufun/union/ad/AdChannel$Type;->val:I

    goto :goto_1

    .line 26
    :cond_2
    invoke-virtual {v4}, Lcom/join/mgps/dto/MiniGameSdkDtoAdCfgValue;->getSdk_type()I

    move-result v4

    const/4 v7, 0x2

    if-ne v4, v7, :cond_3

    sget-object v4, Lcom/wufun/union/ad/AdChannel$Type;->GDT:Lcom/wufun/union/ad/AdChannel$Type;

    iget v6, v4, Lcom/wufun/union/ad/AdChannel$Type;->val:I

    .line 27
    :cond_3
    :goto_1
    invoke-virtual {v5, v6}, Lc3/b;->c(I)V

    .line 28
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 29
    :cond_4
    invoke-static {p0, v2}, Lcom/wufun/union/ad/AdService;->b(Landroid/content/Context;Ljava/util/List;)V

    :cond_5
    const-string v1, "data"

    .line 30
    invoke-static {p1}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    invoke-virtual {p0, v0}, Lcom/join/mgps/service/CommonService;->a1(Landroid/os/Bundle;)V

    goto :goto_2

    .line 32
    :cond_6
    invoke-virtual {p0, v0}, Lcom/join/mgps/service/CommonService;->a1(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 34
    invoke-virtual {p0, v0}, Lcom/join/mgps/service/CommonService;->a1(Landroid/os/Bundle;)V

    goto :goto_2

    :cond_7
    const p1, 0x7f100299

    .line 35
    invoke-virtual {p0, p1}, Landroid/app/Service;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method a1(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.wufun.union.ad.action.AdService"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Landroid/app/Service;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 4
    :cond_0
    invoke-virtual {p0, v0}, Landroid/app/Service;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method a2(Ljava/lang/String;Ljava/lang/Long;)V
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Long;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emu.gamePlayTimes"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 3
    invoke-virtual {v0, p1}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    const/4 p1, 0x1

    new-array v1, p1, [Ljava/lang/String;

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "liveTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " receive"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    aput-object v2, v1, v4

    invoke-static {v1}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 5
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-wide/16 v5, 0x0

    cmp-long v7, v1, v5

    if-nez v7, :cond_1

    return-void

    .line 6
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/Ext;->setLiveTime(J)Lcom/papa/sim/statistic/Ext;

    .line 7
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/Ext;->setClearTime(J)V

    new-array p1, p1, [Ljava/lang/String;

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " send"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    aput-object p2, p1, v4

    invoke-static {p1}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object p2, Lcom/papa/sim/statistic/Event;->gamePlayTimes:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method

.method b0(Ljava/lang/String;ILjava/lang/String;)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_2

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->z:Lcom/join/mgps/rpc/k;

    if-nez v0, :cond_0

    .line 3
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/service/CommonService;->z:Lcom/join/mgps/rpc/k;

    .line 4
    :cond_0
    new-instance v0, Lcom/join/mgps/dto/RequestDomainInfoArgs;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestDomainInfoArgs;-><init>()V

    .line 5
    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/RequestDomainInfoArgs;->setGameId(Ljava/lang/String;)V

    .line 6
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/join/mgps/dto/RequestDomainInfoArgs;->setLocation(Ljava/lang/Integer;)V

    .line 7
    invoke-virtual {v0, p3}, Lcom/join/mgps/dto/RequestDomainInfoArgs;->setTypeId(Ljava/lang/String;)V

    .line 8
    new-instance p2, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {p2, p0}, Lcom/join/mgps/dto/RequestModel;-><init>(Landroid/content/Context;)V

    .line 9
    invoke-virtual {p2, v0}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 10
    invoke-virtual {p2}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 11
    :try_start_1
    iget-object p3, p0, Lcom/join/mgps/service/CommonService;->z:Lcom/join/mgps/rpc/k;

    invoke-virtual {p2}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object p2

    invoke-interface {p3, p2}, Lcom/join/mgps/rpc/k;->W(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 12
    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_1

    .line 13
    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {p3, p1}, Lcom/join/mgps/dto/DomainInfoBean;->setGameId(Ljava/lang/String;)V

    .line 14
    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/DomainInfoBean;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lcom/join/mgps/dto/DomainInfoBean;->setLaunchTime(J)V

    .line 15
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p1}, Lcom/join/mgps/pref/PrefDef_;->privateDomainFeedbackInfo()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object p1

    invoke-virtual {p2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_0

    .line 16
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p1}, Lcom/join/mgps/pref/PrefDef_;->privateDomainFeedbackInfo()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object p1

    invoke-virtual {p1, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 17
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 18
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p1}, Lcom/join/mgps/pref/PrefDef_;->privateDomainFeedbackInfo()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object p1

    invoke-virtual {p1, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 20
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p1}, Lcom/join/mgps/pref/PrefDef_;->privateDomainFeedbackInfo()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object p1

    invoke-virtual {p1, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_0

    .line 21
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p1}, Lcom/join/mgps/pref/PrefDef_;->privateDomainFeedbackInfo()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object p1

    invoke-virtual {p1, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method b1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "reconnectJoinRoom"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    aput-object p4, v0, v1

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/service/CommonService;->w:Z

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->r()V

    return-void

    .line 4
    :cond_0
    :try_start_0
    new-instance v0, Lapp/mgsim/arena/ArenaRequest;

    const-string v1, "cmd_send_re_join_room"

    invoke-direct {v0, v1}, Lapp/mgsim/arena/ArenaRequest;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 5
    :try_start_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    iput-wide v1, v0, Lapp/mgsim/arena/ArenaRequest;->gameId:J

    .line 6
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, v0, Lapp/mgsim/arena/ArenaRequest;->roomId:I

    .line 7
    :cond_2
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, v0, Lapp/mgsim/arena/ArenaRequest;->uid:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_3
    :try_start_2
    const-string p1, "register_type_Emulator"

    .line 8
    iput-object p1, v0, Lapp/mgsim/arena/ArenaRequest;->register_type:Ljava/lang/String;

    .line 9
    iput-object p4, v0, Lapp/mgsim/arena/ArenaRequest;->battleScoreBoard:Ljava/lang/String;

    .line 10
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->v:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {p1, v0}, Lcom/join/mgps/socket/fight/arena/b;->f(Lapp/mgsim/arena/ArenaRequest;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method b2(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BluetoothHandleBlackListData$DataInfo;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    .line 3
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 4
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/BluetoothHandleBlackListData$DataInfo;

    .line 5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/join/mgps/dto/BluetoothHandleBlackListData$DataInfo;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/BluetoothHandleBlackListData$DataInfo;->getModel_number()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {}, Lcom/join/mgps/joystick/map/a;->b()Lcom/join/mgps/joystick/map/a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/join/mgps/joystick/map/a;->l(Ljava/util/Map;)V

    :cond_2
    :goto_1
    return-void
.end method

.method c0()V
    .locals 17
    .annotation build Lorg/androidannotations/annotations/Background;
        delay = 0x1388L
    .end annotation

    move-object/from16 v1, p0

    .line 1
    invoke-static/range {p0 .. p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_21

    .line 2
    :try_start_0
    invoke-static/range {p0 .. p0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getShowViewDatas()Lcom/join/mgps/dto/CommonRequestBean;

    .line 3
    new-instance v0, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 4
    iget-object v2, v1, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 5
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object v2

    invoke-interface {v2, v0}, Le2/i;->U0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object v0

    invoke-interface {v0}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ResponseModel;

    if-eqz v0, :cond_20

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getFlag()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_20

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/FirstScreenAdDtoData;

    invoke-virtual {v2}, Lcom/join/mgps/dto/FirstScreenAdDtoData;->getWf_ad_list()Ljava/util/List;

    move-result-object v2

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/FirstScreenAdDtoData;

    invoke-virtual {v4}, Lcom/join/mgps/dto/FirstScreenAdDtoData;->getTh_ad_switch()Lcom/join/mgps/dto/ThAdSwitchDataBean;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v5, ""

    if-eqz v4, :cond_1

    .line 9
    :try_start_1
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/FirstScreenAdDtoData;

    invoke-virtual {v4}, Lcom/join/mgps/dto/FirstScreenAdDtoData;->getTh_ad_switch()Lcom/join/mgps/dto/ThAdSwitchDataBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/ThAdSwitchDataBean;->getFx_ad_switch()I

    move-result v4

    if-ne v4, v3, :cond_0

    .line 10
    iget-object v4, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v4}, Lcom/join/mgps/pref/PrefDef_;->firstNewSplashV2()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v4

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v4, v6}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 11
    :cond_0
    iget-object v4, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v4}, Lcom/join/mgps/pref/PrefDef_;->thAdSwitchCfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v4

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/FirstScreenAdDtoData;

    invoke-virtual {v0}, Lcom/join/mgps/dto/FirstScreenAdDtoData;->getTh_ad_switch()Lcom/join/mgps/dto/ThAdSwitchDataBean;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_0

    .line 12
    :cond_1
    iget-object v0, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->thAdSwitchCfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0, v5}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 13
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1f

    .line 14
    invoke-static {}, Lb2/i0;->o()Lb2/i0;

    move-result-object v0

    invoke-virtual {v0}, Lp1/b;->d()Ljava/util/List;

    move-result-object v0

    .line 15
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 16
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/db/tables/ShowViewDataBeanTable;

    .line 17
    invoke-virtual {v6}, Lcom/join/mgps/db/tables/ShowViewDataBeanTable;->getShowVieDatabean()Lcom/join/mgps/dto/ShowViewDataBean;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 18
    :cond_2
    new-instance v0, Ljava/io/File;

    iget-object v6, v1, Lcom/join/mgps/service/CommonService;->p:Ljava/lang/String;

    invoke-direct {v0, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 19
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_13

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/join/mgps/dto/ShowViewDataBean;

    .line 20
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/join/mgps/dto/ShowViewDataBean;

    .line 21
    invoke-virtual {v7}, Lcom/join/mgps/dto/ShowViewDataBean;->getStrategy_id()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getStrategy_id()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_11

    const/4 v10, 0x0

    .line 22
    invoke-virtual {v9, v10}, Lcom/join/mgps/dto/ShowViewDataBean;->setNeedDelt(Z)V

    .line 23
    invoke-virtual {v7, v10}, Lcom/join/mgps/dto/ShowViewDataBean;->setNeedDelt(Z)V

    .line 24
    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getUp_times()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7}, Lcom/join/mgps/dto/ShowViewDataBean;->getUp_times()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string v12, "0"

    if-eqz v11, :cond_d

    :try_start_2
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v11

    if-nez v11, :cond_4

    goto/16 :goto_6

    .line 25
    :cond_4
    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getJump_info()Ljava/util/List;

    move-result-object v11

    .line 26
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_c

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/join/mgps/dto/SplashIntentBean;

    .line 27
    invoke-virtual {v13}, Lcom/join/mgps/dto/SplashIntentBean;->getPic_remote_local()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v14

    if-nez v14, :cond_5

    new-instance v14, Ljava/io/File;

    invoke-virtual {v13}, Lcom/join/mgps/dto/SplashIntentBean;->getPic_remote_local()Ljava/lang/String;

    move-result-object v15

    invoke-direct {v14, v15}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14}, Ljava/io/File;->exists()Z

    move-result v14

    if-nez v14, :cond_8

    .line 28
    :cond_5
    invoke-virtual {v7}, Lcom/join/mgps/dto/ShowViewDataBean;->getJump_info()Ljava/util/List;

    move-result-object v14

    .line 29
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_4
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_8

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/join/mgps/dto/SplashIntentBean;

    .line 30
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v16, v6

    invoke-virtual {v15}, Lcom/join/mgps/dto/SplashIntentBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v13}, Lcom/join/mgps/dto/SplashIntentBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 31
    invoke-virtual {v15}, Lcom/join/mgps/dto/SplashIntentBean;->getVedio_url()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_6

    .line 32
    invoke-virtual {v15}, Lcom/join/mgps/dto/SplashIntentBean;->getVedio_url()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Lcom/join/mgps/service/CommonService;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 33
    invoke-virtual {v13, v3}, Lcom/join/mgps/dto/SplashIntentBean;->setVedio_url(Ljava/lang/String;)V

    const/4 v10, 0x1

    .line 34
    :cond_6
    invoke-virtual {v15}, Lcom/join/mgps/dto/SplashIntentBean;->getPic_remote()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_7

    .line 35
    invoke-virtual {v15}, Lcom/join/mgps/dto/SplashIntentBean;->getPic_remote()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Lcom/join/mgps/service/CommonService;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 36
    invoke-virtual {v13, v3}, Lcom/join/mgps/dto/SplashIntentBean;->setPic_remote_local(Ljava/lang/String;)V

    const/4 v10, 0x1

    :cond_7
    move-object/from16 v6, v16

    const/4 v3, 0x1

    goto :goto_4

    :cond_8
    move-object/from16 v16, v6

    .line 37
    invoke-virtual {v13}, Lcom/join/mgps/dto/SplashIntentBean;->getVedio_url_local()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_9

    new-instance v3, Ljava/io/File;

    invoke-virtual {v13}, Lcom/join/mgps/dto/SplashIntentBean;->getVedio_url_local()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_b

    .line 38
    :cond_9
    invoke-virtual {v7}, Lcom/join/mgps/dto/ShowViewDataBean;->getJump_info()Ljava/util/List;

    move-result-object v3

    .line 39
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_a
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/SplashIntentBean;

    .line 40
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lcom/join/mgps/dto/SplashIntentBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13}, Lcom/join/mgps/dto/SplashIntentBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    .line 41
    invoke-virtual {v6}, Lcom/join/mgps/dto/SplashIntentBean;->getVedio_url()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v14

    if-nez v14, :cond_a

    .line 42
    invoke-virtual {v6}, Lcom/join/mgps/dto/SplashIntentBean;->getVedio_url()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v1, v6}, Lcom/join/mgps/service/CommonService;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_a

    .line 43
    invoke-virtual {v13, v6}, Lcom/join/mgps/dto/SplashIntentBean;->setVedio_url_local(Ljava/lang/String;)V

    const/4 v10, 0x1

    goto :goto_5

    :cond_b
    move-object/from16 v6, v16

    const/4 v3, 0x1

    goto/16 :goto_3

    :cond_c
    move-object/from16 v16, v6

    if-eqz v10, :cond_12

    .line 44
    invoke-static {}, Lb2/i0;->o()Lb2/i0;

    move-result-object v3

    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getShowVieDatabeanTable()Lcom/join/mgps/db/tables/ShowViewDataBeanTable;

    move-result-object v6

    invoke-virtual {v3, v6}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->lastClickPageAD()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v3

    invoke-virtual {v3}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 46
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getId()I

    move-result v9

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    .line 47
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->lastClickPageAD()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v3

    invoke-virtual {v3, v12}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_d
    :goto_6
    move-object/from16 v16, v6

    .line 48
    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getId()I

    move-result v3

    invoke-virtual {v7, v3}, Lcom/join/mgps/dto/ShowViewDataBean;->setId(I)V

    .line 49
    invoke-virtual {v7}, Lcom/join/mgps/dto/ShowViewDataBean;->getJump_info()Ljava/util/List;

    move-result-object v3

    .line 50
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_e
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/SplashIntentBean;

    .line 51
    invoke-virtual {v6}, Lcom/join/mgps/dto/SplashIntentBean;->getPic_remote()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_f

    .line 52
    invoke-virtual {v6}, Lcom/join/mgps/dto/SplashIntentBean;->getPic_remote()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v1, v10}, Lcom/join/mgps/service/CommonService;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_f

    .line 53
    invoke-virtual {v6, v10}, Lcom/join/mgps/dto/SplashIntentBean;->setPic_remote_local(Ljava/lang/String;)V

    .line 54
    :cond_f
    invoke-virtual {v6}, Lcom/join/mgps/dto/SplashIntentBean;->getVedio_url()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_e

    .line 55
    invoke-virtual {v6}, Lcom/join/mgps/dto/SplashIntentBean;->getVedio_url()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v1, v10}, Lcom/join/mgps/service/CommonService;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_e

    .line 56
    invoke-virtual {v6, v10}, Lcom/join/mgps/dto/SplashIntentBean;->setVedio_url_local(Ljava/lang/String;)V

    goto :goto_7

    .line 57
    :cond_10
    invoke-static {}, Lb2/i0;->o()Lb2/i0;

    move-result-object v3

    invoke-virtual {v7}, Lcom/join/mgps/dto/ShowViewDataBean;->getShowVieDatabeanTable()Lcom/join/mgps/db/tables/ShowViewDataBeanTable;

    move-result-object v6

    invoke-virtual {v3, v6}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->lastClickPageAD()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v3

    invoke-virtual {v3}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 59
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getId()I

    move-result v9

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    .line 60
    iget-object v3, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->lastClickPageAD()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v3

    invoke-virtual {v3, v12}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_8

    :cond_11
    move-object/from16 v16, v6

    :cond_12
    :goto_8
    move-object/from16 v6, v16

    const/4 v3, 0x1

    goto/16 :goto_2

    .line 61
    :cond_13
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_14
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_19

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/ShowViewDataBean;

    .line 62
    invoke-virtual {v3}, Lcom/join/mgps/dto/ShowViewDataBean;->isNeedDelt()Z

    move-result v5

    if-nez v5, :cond_15

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_14

    .line 63
    :cond_15
    invoke-virtual {v3}, Lcom/join/mgps/dto/ShowViewDataBean;->getJump_info()Ljava/util/List;

    move-result-object v5

    .line 64
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_16
    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_18

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/SplashIntentBean;

    .line 65
    invoke-virtual {v6}, Lcom/join/mgps/dto/SplashIntentBean;->getPic_remote()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_17

    .line 66
    invoke-virtual {v6}, Lcom/join/mgps/dto/SplashIntentBean;->getPic_remote()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v1, v7}, Lcom/join/mgps/service/CommonService;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_17

    .line 67
    invoke-virtual {v6, v7}, Lcom/join/mgps/dto/SplashIntentBean;->setPic_remote_local(Ljava/lang/String;)V

    .line 68
    :cond_17
    invoke-virtual {v6}, Lcom/join/mgps/dto/SplashIntentBean;->getVedio_url()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_16

    .line 69
    invoke-virtual {v6}, Lcom/join/mgps/dto/SplashIntentBean;->getVedio_url()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v1, v7}, Lcom/join/mgps/service/CommonService;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_16

    .line 70
    invoke-virtual {v6, v7}, Lcom/join/mgps/dto/SplashIntentBean;->setVedio_url_local(Ljava/lang/String;)V

    goto :goto_a

    .line 71
    :cond_18
    invoke-static {}, Lb2/i0;->o()Lb2/i0;

    move-result-object v5

    invoke-virtual {v3}, Lcom/join/mgps/dto/ShowViewDataBean;->getShowVieDatabeanTable()Lcom/join/mgps/db/tables/ShowViewDataBeanTable;

    move-result-object v3

    invoke-virtual {v5, v3}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    .line 72
    :cond_19
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1a
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/ShowViewDataBean;

    .line 73
    invoke-virtual {v2}, Lcom/join/mgps/dto/ShowViewDataBean;->isNeedDelt()Z

    move-result v3

    if-eqz v3, :cond_1a

    .line 74
    invoke-virtual {v2}, Lcom/join/mgps/dto/ShowViewDataBean;->getJump_info()Ljava/util/List;

    move-result-object v3

    .line 75
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1b
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/SplashIntentBean;

    .line 76
    invoke-virtual {v4}, Lcom/join/mgps/dto/SplashIntentBean;->getPic_remote()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1c

    .line 77
    new-instance v5, Ljava/io/File;

    invoke-virtual {v4}, Lcom/join/mgps/dto/SplashIntentBean;->getPic_remote()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 78
    invoke-static {v5}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    .line 79
    :cond_1c
    invoke-virtual {v4}, Lcom/join/mgps/dto/SplashIntentBean;->getVedio_url()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1b

    .line 80
    new-instance v5, Ljava/io/File;

    invoke-virtual {v4}, Lcom/join/mgps/dto/SplashIntentBean;->getVedio_url()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 81
    invoke-static {v5}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    goto :goto_c

    .line 82
    :cond_1d
    invoke-static {}, Lb2/i0;->o()Lb2/i0;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/ShowViewDataBean;->getShowVieDatabeanTable()Lcom/join/mgps/db/tables/ShowViewDataBeanTable;

    move-result-object v2

    invoke-virtual {v3, v2}, Lp1/b;->delete(Ljava/lang/Object;)I

    goto :goto_b

    .line 83
    :cond_1e
    iget-object v0, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->firstNewSplashV2()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 84
    invoke-direct/range {p0 .. p0}, Lcom/join/mgps/service/CommonService;->n0()Z

    move-result v0

    .line 85
    iget-object v2, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->isShowSplash()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_d

    .line 86
    :cond_1f
    iget-object v0, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isShowSplash()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_d

    .line 87
    :cond_20
    iget-object v0, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isShowSplash()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_d

    :catch_0
    move-exception v0

    .line 88
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_21
    :goto_d
    return-void
.end method

.method c1()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.appfinish"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    return-void
.end method

.method d()V
    .locals 17
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    move-object/from16 v0, p0

    .line 1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v2

    invoke-virtual {v2}, Lp1/f;->v()Ljava/util/List;

    move-result-object v2

    .line 3
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lp1/f;->N(Z)Ljava/util/List;

    move-result-object v3

    const-string v5, ""

    const-string v6, "_"

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x5

    const/16 v10, 0x9

    if-eqz v3, :cond_7

    .line 4
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v11

    if-lez v11, :cond_7

    .line 5
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    .line 6
    :cond_0
    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_7

    .line 7
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 8
    invoke-virtual {v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/join/mgps/Util/UtilsMy;->f0(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v13

    if-eqz v13, :cond_1

    .line 9
    invoke-virtual {v13}, Lcom/join/mgps/db/tables/EMUApkTable;->getDown_type()I

    move-result v14

    if-ne v14, v7, :cond_1

    .line 10
    invoke-static {v13, v4}, Lcom/join/android/app/common/utils/l;->y(Lcom/join/mgps/db/tables/EMUApkTable;Z)Z

    move-result v14

    goto :goto_1

    .line 11
    :cond_1
    invoke-static {v0, v13}, Lcom/join/mgps/Util/UtilsMy;->C0(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;)Z

    move-result v14

    :goto_1
    new-array v15, v8, [Ljava/lang/String;

    .line 12
    invoke-virtual {v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v16

    aput-object v16, v15, v4

    invoke-static {v0, v13, v4, v15}, Lcom/join/android/app/common/utils/l;->t(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;Z[Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_6

    if-eqz v14, :cond_5

    .line 13
    invoke-virtual {v13}, Lcom/join/mgps/db/tables/EMUApkTable;->getVer()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v13

    aget-object v13, v13, v4

    invoke-virtual {v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lcom/join/mgps/Util/UtilsMy;->E0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_2

    .line 14
    invoke-virtual {v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_0

    .line 15
    invoke-virtual {v12, v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 16
    invoke-interface {v11}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 17
    :cond_2
    invoke-virtual {v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_4

    invoke-virtual {v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_4

    .line 18
    invoke-virtual {v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v13

    if-ne v13, v9, :cond_3

    new-instance v13, Ljava/io/File;

    invoke-virtual {v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v14

    invoke-direct {v13, v14}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13}, Ljava/io/File;->exists()Z

    move-result v13

    if-eqz v13, :cond_3

    .line 19
    invoke-virtual {v12, v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto/16 :goto_0

    .line 20
    :cond_3
    invoke-virtual {v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_0

    .line 21
    invoke-virtual {v12, v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 22
    invoke-interface {v11}, Ljava/util/Iterator;->remove()V

    goto/16 :goto_0

    .line 23
    :cond_4
    invoke-virtual {v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_0

    .line 24
    invoke-virtual {v12, v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 25
    invoke-interface {v11}, Ljava/util/Iterator;->remove()V

    goto/16 :goto_0

    .line 26
    :cond_5
    invoke-virtual {v12, v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 27
    invoke-interface {v11}, Ljava/util/Iterator;->remove()V

    goto/16 :goto_0

    .line 28
    :cond_6
    invoke-virtual {v12, v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto/16 :goto_0

    :cond_7
    if-eqz v2, :cond_b

    const/4 v11, 0x0

    .line 29
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_8
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 30
    invoke-static {v0, v13}, Lcom/join/mgps/Util/q1;->c(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v14

    if-eqz v14, :cond_8

    move-object v11, v13

    :cond_9
    if-eqz v11, :cond_a

    .line 31
    invoke-interface {v2, v11}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 32
    :cond_a
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_b
    if-eqz v3, :cond_c

    .line 33
    invoke-interface {v1, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 34
    :cond_c
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_d

    .line 35
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 36
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/16 v3, 0xb

    invoke-static {v0, v2, v1, v3}, Lcom/join/mgps/Util/UtilsMy;->H3(Landroid/content/Context;Ljava/lang/String;II)V

    goto/16 :goto_6

    .line 37
    :cond_d
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    invoke-virtual {v1, v8}, Lp1/f;->N(Z)Ljava/util/List;

    move-result-object v1

    .line 38
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    if-eqz v1, :cond_f

    .line 39
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_f

    .line 40
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 41
    :cond_e
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_f

    .line 42
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 43
    invoke-virtual {v11}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v11

    if-ne v11, v10, :cond_e

    .line 44
    invoke-interface {v2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    .line 45
    :cond_f
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    invoke-virtual {v1}, Lp1/f;->p()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1a

    .line 46
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_1a

    .line 47
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 48
    :cond_10
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_19

    .line 49
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 50
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v11

    sget-object v12, Lcom/join/mgps/enums/Dtype;->chajian:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_18

    .line 51
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/join/mgps/Util/UtilsMy;->f0(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v11

    .line 52
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v12

    if-eqz v11, :cond_11

    .line 53
    invoke-virtual {v11}, Lcom/join/mgps/db/tables/EMUApkTable;->getDown_type()I

    move-result v13

    if-ne v13, v7, :cond_11

    .line 54
    invoke-static {v11, v4}, Lcom/join/android/app/common/utils/l;->y(Lcom/join/mgps/db/tables/EMUApkTable;Z)Z

    move-result v13

    goto :goto_4

    .line 55
    :cond_11
    invoke-static {v0, v11}, Lcom/join/mgps/Util/UtilsMy;->C0(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;)Z

    move-result v13

    :goto_4
    new-array v14, v8, [Ljava/lang/String;

    .line 56
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v15

    aput-object v15, v14, v4

    invoke-static {v0, v11, v4, v14}, Lcom/join/android/app/common/utils/l;->t(Landroid/content/Context;Lcom/join/mgps/db/tables/EMUApkTable;Z[Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_16

    if-eqz v13, :cond_15

    .line 57
    invoke-virtual {v11}, Lcom/join/mgps/db/tables/EMUApkTable;->getVer()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    aget-object v11, v11, v4

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer()Ljava/lang/String;

    move-result-object v13

    invoke-static {v11, v13}, Lcom/join/mgps/Util/UtilsMy;->E0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_12

    .line 58
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_17

    .line 59
    invoke-virtual {v3, v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 60
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_5

    .line 62
    :cond_12
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_14

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_14

    .line 63
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v11

    if-ne v11, v9, :cond_13

    new-instance v11, Ljava/io/File;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v11, v13}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v11

    if-eqz v11, :cond_13

    .line 64
    invoke-virtual {v3, v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto :goto_5

    .line 65
    :cond_13
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_17

    .line 66
    invoke-virtual {v3, v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 67
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_5

    .line 69
    :cond_14
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_17

    .line 70
    invoke-virtual {v3, v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 71
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_5

    .line 73
    :cond_15
    invoke-virtual {v3, v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 74
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_5

    .line 75
    :cond_16
    invoke-virtual {v3, v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 76
    :cond_17
    :goto_5
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v11

    if-eq v12, v11, :cond_10

    .line 77
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v11

    invoke-static {v3, v11}, Lcom/join/mgps/Util/UtilsMy;->S2(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto/16 :goto_3

    .line 78
    :cond_18
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v11

    sget-object v12, Lcom/join/mgps/enums/Dtype;->android:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_10

    .line 79
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v11

    if-ne v11, v10, :cond_10

    .line 80
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_10

    .line 81
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    .line 82
    :cond_19
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1a

    .line 83
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 84
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v0, v1, v2, v10}, Lcom/join/mgps/Util/UtilsMy;->H3(Landroid/content/Context;Ljava/lang/String;II)V

    :cond_1a
    :goto_6
    return-void
.end method

.method d0()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v0, v2}, Lcom/join/mgps/Util/RequestBeanUtil;->getTokenRequestBean(Ljava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/CommentRequest;

    move-result-object v0

    .line 4
    invoke-static {}, Lcom/join/mgps/rpc/impl/e;->m()Lcom/join/mgps/rpc/impl/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/join/mgps/rpc/impl/e;->c(Lcom/join/mgps/dto/CommentRequest;)Lcom/join/mgps/dto/CommentResponse;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getCode()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getData_info()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getData_info()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/CommentTokenBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CommentTokenBean;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getData_info()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CommentTokenBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommentTokenBean;->getToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getData_info()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CommentTokenBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentTokenBean;->getTimes()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AESUtils;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "getToken"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    .line 7
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "token="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v1}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->commentToken()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v1

    invoke-virtual {v1, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->lastCheckInTime()Lorg/androidannotations/api/sharedpreferences/k;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method d1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.action_login_701"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/b;->accountLoginOut(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->Q1()V

    return-void
.end method

.method e()V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, ""

    const/4 v1, 0x0

    .line 1
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MG=>LOGIN1--"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v3, Lcom/MApplication;->V:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v2

    .line 3
    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    .line 4
    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v4

    .line 5
    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getNickname()Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-static {v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 7
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/join/mgps/rpc/h;->n:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "/im/account/login?uid="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "&nickname="

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "&battleRoomId="

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v2, Lcom/MApplication;->V:I

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "&token="

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 8
    new-instance v3, Ljava/net/URL;

    invoke-direct {v3, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v2

    check-cast v2, Ljava/net/HttpURLConnection;

    const-string v3, "GET"

    .line 10
    invoke-virtual {v2, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->connect()V

    const/16 v3, 0xc8

    .line 12
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v4

    if-ne v3, v4, :cond_3

    .line 13
    new-instance v3, Ljava/io/InputStreamReader;

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    const-string v4, "utf-8"

    invoke-direct {v3, v2, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 14
    new-instance v2, Ljava/io/BufferedReader;

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 15
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    .line 16
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v2, "data"

    .line 17
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "uid"

    .line 18
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    const-string v3, "token"

    .line 19
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    const-string v3, "quickMessages"

    .line 20
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 21
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, v3}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object v5, v0

    const/4 v3, 0x0

    .line 22
    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v3, v6, :cond_0

    .line 23
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "|"

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 25
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->e:Landroid/content/Intent;

    const-string v3, "type"

    const-string v4, "12"

    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 26
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->e:Landroid/content/Intent;

    const-string v3, "msg"

    invoke-virtual {v0, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 27
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->e:Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/app/Service;->sendBroadcast(Landroid/content/Intent;)V

    .line 28
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5f39\u5e55"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "chatRoomId"

    .line 29
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/service/CommonService;->J:Ljava/lang/String;

    .line 30
    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/friend/chat/c;->F()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 31
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->z1()V

    goto :goto_1

    .line 32
    :cond_2
    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/friend/chat/c;->K()V

    goto :goto_1

    .line 33
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MG=>LOGIN200!"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 34
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-->"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    sput-boolean v1, Lcom/join/mgps/service/CommonService;->X:Z

    .line 36
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method e0()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, "com.join.intent.initAdVideoConfig"

    .line 1
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    if-nez v1, :cond_0

    .line 3
    invoke-static {}, Lcom/wufan/user/service/protobuf/n0;->b5()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    .line 4
    :cond_0
    new-instance v2, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v2}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 5
    new-instance v3, Lcom/join/mgps/dto/VideoAdCfgRequestArgs;

    invoke-direct {v3}, Lcom/join/mgps/dto/VideoAdCfgRequestArgs;-><init>()V

    .line 6
    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/VideoAdCfgRequestArgs;->setUid(I)V

    .line 7
    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/join/mgps/dto/VideoAdCfgRequestArgs;->setToken(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v2, v1}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 10
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v1

    invoke-virtual {v2}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/rpc/impl/i;->D(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 11
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v2

    const/16 v3, 0xc8

    if-ne v2, v3, :cond_3

    .line 12
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/VideoAdCfgBean;

    .line 13
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->arcadeGameAdCfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/VideoAdCfgBean;->getArcade_game_ad_cfg()Lcom/join/mgps/dto/ArcadeGameAdCfgBean;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/dto/BaseBean;->toJsonStringOrEmpty(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 14
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->singleGameAdCfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/VideoAdCfgBean;->getSingle_game_ad_cfg()Lcom/join/mgps/dto/SingleGameAdCfgBean;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/dto/BaseBean;->toJsonStringOrEmpty(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 15
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->pspGameAdCfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/VideoAdCfgBean;->getPsp_game_ad_cfg()Lcom/join/mgps/dto/PspGameAdCfgBean;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/dto/BaseBean;->toJsonStringOrEmpty(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 16
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->pspAdShowTimeSwitch()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/VideoAdCfgBean;->getPsp_game_ad_cfg()Lcom/join/mgps/dto/PspGameAdCfgBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/PspGameAdCfgBean;->getSwitch_state()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 17
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->pspAdShowTime()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/VideoAdCfgBean;->getPsp_game_ad_cfg()Lcom/join/mgps/dto/PspGameAdCfgBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/PspGameAdCfgBean;->getCount_down()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 18
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->downloadSpeedupCfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/VideoAdCfgBean;->getDownload_speedup_cfg()Lcom/join/mgps/dto/DownloadSpeedupCfgBean;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/dto/BaseBean;->toJsonStringOrEmpty(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 19
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->mod_normal_ad_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/VideoAdCfgBean;->getMod_normal_ad_cfg()Lcom/join/mgps/dto/SingleGameAdCfgBean;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/dto/BaseBean;->toJsonStringOrEmpty(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 20
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->mod_enhance_ad_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/VideoAdCfgBean;->getMod_enhance_ad_cfg()Lcom/join/mgps/dto/SingleGameAdCfgBean;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/dto/BaseBean;->toJsonStringOrEmpty(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 21
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->simulator_path_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/VideoAdCfgBean;->getSimulator_path_cfg()Lcom/join/mgps/dto/SimulatorPathCfgBean;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/dto/BaseBean;->toJsonStringOrEmpty(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 22
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->simulator_fc_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/VideoAdCfgBean;->getSimulator_fc_cfg()Lcom/join/mgps/dto/SimulatorAdCfgBean;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/dto/BaseBean;->toJsonStringOrEmpty(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 23
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->simulator_gba_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/VideoAdCfgBean;->getSimulator_gba_cfg()Lcom/join/mgps/dto/SimulatorAdCfgBean;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/dto/BaseBean;->toJsonStringOrEmpty(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 24
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->simulator_psp_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/VideoAdCfgBean;->getSimulator_psp_cfg()Lcom/join/mgps/dto/SimulatorAdCfgBean;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/dto/BaseBean;->toJsonStringOrEmpty(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 25
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->simulator_jj_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/VideoAdCfgBean;->getSimulator_jj_cfg()Lcom/join/mgps/dto/SimulatorAdCfgBean;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/dto/BaseBean;->toJsonStringOrEmpty(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 26
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->simulator_gold_finger_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/VideoAdCfgBean;->getSimulator_gold_finger_cfg()Lcom/join/mgps/dto/SimulatorAdCfgBean;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/dto/BaseBean;->toJsonStringOrEmpty(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 27
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->simulator_exit_information_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/VideoAdCfgBean;->getSimulator_exit_information_cfg()Lcom/join/mgps/dto/SimulatorAdCfgBean;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/dto/BaseBean;->toJsonStringOrEmpty(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 28
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->simulator_exit_open_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/VideoAdCfgBean;->getSimulator_exit_open_cfg()Lcom/join/mgps/dto/SimulatorAdCfgBean;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/dto/BaseBean;->toJsonStringOrEmpty(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 29
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->ssp_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/VideoAdCfgBean;->getSsp_cfg()Lcom/join/mgps/dto/SimulatorAdCfgBean;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/dto/BaseBean;->toJsonStringOrEmpty(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 30
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->video_init_cfg()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/VideoAdCfgBean;->getVideo_init_cfg()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/dto/BaseBean;->toJsonStringOrEmpty(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 31
    invoke-virtual {v1}, Lcom/join/mgps/dto/VideoAdCfgBean;->getDownload_speedup_cfg()Lcom/join/mgps/dto/DownloadSpeedupCfgBean;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    .line 32
    invoke-virtual {v1}, Lcom/join/mgps/dto/VideoAdCfgBean;->getDownload_speedup_cfg()Lcom/join/mgps/dto/DownloadSpeedupCfgBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/DownloadSpeedupCfgBean;->getSwitch_state()I

    move-result v2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_1

    .line 33
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->downloadSpeedUpCountAD()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/VideoAdCfgBean;->getDownload_speedup_cfg()Lcom/join/mgps/dto/DownloadSpeedupCfgBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/DownloadSpeedupCfgBean;->getSpeedup_times()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_0

    .line 34
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->downloadSpeedUpCountAD()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_0

    .line 35
    :cond_2
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->downloadSpeedUpCountAD()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    if-eqz v1, :cond_4

    .line 36
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/join/mgps/service/CommonService;->G1(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    :cond_4
    :goto_0
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_0
    move-exception v1

    .line 38
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 39
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f100348

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/join/mgps/service/CommonService;->G1(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v1, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_3

    :goto_2
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 41
    throw v1

    .line 42
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f100299

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/service/CommonService;->G1(Ljava/lang/String;)V

    :goto_3
    return-void
.end method

.method e1(Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Integer;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.wufun.share.image"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/service/CommonService;->L1(Ljava/lang/String;I)V

    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->e:Landroid/content/Intent;

    const-string v1, "type"

    const-string v2, "4"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->e:Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ""

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "msg"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 3
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->e:Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Service;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method f0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    .line 2
    :try_start_0
    invoke-static {p0, v0}, Lcom/join/mgps/Util/j0;->V(Landroid/content/Context;I)Lcom/join/mgps/dto/ForumBannerBean$ForumBannerRequestBean;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/join/mgps/rpc/impl/d;->P1()Lcom/join/mgps/rpc/impl/d;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/join/mgps/rpc/impl/d;->Z(Lcom/join/mgps/dto/ForumBannerBean$ForumBannerRequestBean;)Lcom/join/mgps/dto/ForumBannerBean$ForumBannerResponseBean;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBannerBean$ForumBannerResponseBean;->getFlag()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBannerBean$ForumBannerResponseBean;->getMessages()Lcom/join/mgps/dto/ForumBannerBean$ForumBannerMessages;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBannerBean$ForumBannerResponseBean;->getMessages()Lcom/join/mgps/dto/ForumBannerBean$ForumBannerMessages;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumBannerBean$ForumBannerMessages;->getData()Lcom/join/mgps/dto/ForumBannerBean$ForumBannerMessagesData;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBannerBean$ForumBannerResponseBean;->getMessages()Lcom/join/mgps/dto/ForumBannerBean$ForumBannerMessages;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBannerBean$ForumBannerMessages;->getData()Lcom/join/mgps/dto/ForumBannerBean$ForumBannerMessagesData;

    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, Lcom/join/mgps/service/CommonService;->n1(Lcom/join/mgps/dto/ForumBannerBean$ForumBannerMessagesData;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_1
    return-void
.end method

.method f1()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.account_status_uidchange",
            "com.join.android.app.mgsim.wufun.broadcast.refreshPurchasedGame"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->Z()V

    return-void
.end method

.method g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->l:Lcom/join/mgps/service/CommonService$r;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService;->g:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.loginNim"

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4
    new-instance v0, Lcom/join/mgps/service/CommonService$r;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService$r;-><init>(Lcom/join/mgps/service/CommonService;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService;->l:Lcom/join/mgps/service/CommonService$r;

    .line 5
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->g:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->m:Lcom/join/mgps/service/CommonService$s;

    if-nez v0, :cond_1

    .line 7
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService;->k:Landroid/content/IntentFilter;

    const-string v1, "com.join.android.app.mgsim.wufun.SendTextMsg"

    .line 8
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 9
    new-instance v0, Lcom/join/mgps/service/CommonService$s;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService$s;-><init>(Lcom/join/mgps/service/CommonService;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService;->m:Lcom/join/mgps/service/CommonService$s;

    .line 10
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->k:Landroid/content/IntentFilter;

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_1
    return-void
.end method

.method g0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Lcom/join/mgps/rpc/impl/g;->A0()Lcom/join/mgps/rpc/impl/g;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Lcom/join/mgps/rpc/impl/g;->i0(Ljava/lang/String;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ForumData$ForumForumWelcomeData;

    :cond_0
    if-eqz v0, :cond_1

    .line 4
    invoke-direct {p0, v0}, Lcom/join/mgps/service/CommonService;->o1(Lcom/join/mgps/dto/ForumData$ForumForumWelcomeData;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method g1()V
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/service/CommonService$p;

    invoke-direct {v0, p0}, Lcom/join/mgps/service/CommonService$p;-><init>(Lcom/join/mgps/service/CommonService;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService;->K:Lcom/join/mgps/service/CommonService$p;

    .line 2
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->K:Lcom/join/mgps/service/CommonService$p;

    iget-object v1, v1, Lcom/join/mgps/service/CommonService$p;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->K:Lcom/join/mgps/service/CommonService$p;

    iget-object v1, v1, Lcom/join/mgps/service/CommonService$p;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->K:Lcom/join/mgps/service/CommonService$p;

    iget-object v1, v1, Lcom/join/mgps/service/CommonService$p;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->K:Lcom/join/mgps/service/CommonService$p;

    iget-object v1, v1, Lcom/join/mgps/service/CommonService$p;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->K:Lcom/join/mgps/service/CommonService$p;

    iget-object v1, v1, Lcom/join/mgps/service/CommonService$p;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->K:Lcom/join/mgps/service/CommonService$p;

    iget-object v1, v1, Lcom/join/mgps/service/CommonService$p;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->K:Lcom/join/mgps/service/CommonService$p;

    iget-object v1, v1, Lcom/join/mgps/service/CommonService$p;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 10
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->K:Lcom/join/mgps/service/CommonService$p;

    invoke-virtual {p0, v1, v0}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method h0(I)V
    .locals 8
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->T(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/j0;->Y0(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    invoke-static {}, Lcom/join/mgps/rpc/impl/g;->A0()Lcom/join/mgps/rpc/impl/g;

    move-result-object v2

    sget v4, Lcom/join/mgps/Util/j0;->d:I

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v5

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v6

    const-string v7, ""

    move v3, p1

    invoke-virtual/range {v2 .. v7}, Lcom/join/mgps/rpc/impl/g;->V(IIILjava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object p1

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {}, Lcom/join/mgps/rpc/impl/g;->A0()Lcom/join/mgps/rpc/impl/g;

    move-result-object v0

    sget v1, Lcom/join/mgps/Util/j0;->d:I

    const-string v2, ""

    invoke-virtual {v0, p1, v1, v2}, Lcom/join/mgps/rpc/impl/g;->t0(IILjava/lang/String;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ForumData$ForumForumWelcomePostsData;

    if-eqz p1, :cond_2

    .line 7
    invoke-direct {p0, p1}, Lcom/join/mgps/service/CommonService;->p1(Lcom/join/mgps/dto/ForumData$ForumForumWelcomePostsData;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    return-void

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_1
    return-void
.end method

.method i0(Lcom/join/mgps/dto/FileInfo;Lcom/join/mgps/dto/DownloadScanEvent;)V
    .locals 5

    if-eqz p1, :cond_8

    if-nez p2, :cond_0

    goto/16 :goto_2

    .line 1
    :cond_0
    iget-object v0, p1, Lcom/join/mgps/dto/FileInfo;->pkg:Ljava/lang/String;

    .line 2
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/DownloadScanEvent;->getTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p2, :cond_7

    .line 3
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-static {v1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Lcom/join/mgps/dto/FileInfo;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/FileInfo;->getPath()Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-virtual {p2, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setPath(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p1}, Lcom/join/mgps/dto/FileInfo;->getFileType()I

    move-result v3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    invoke-virtual {p1}, Lcom/join/mgps/dto/FileInfo;->getFileType()I

    move-result v3

    if-ne v3, v2, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/FileInfo;->getFileType()I

    move-result v1

    const/4 v3, 0x3

    if-ne v1, v3, :cond_3

    const/16 v1, 0x1f

    .line 9
    invoke-virtual {p2, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto :goto_1

    .line 10
    :cond_2
    :goto_0
    invoke-virtual {p2, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setGameZipPath(Ljava/lang/String;)V

    const/16 v1, 0xb

    .line 11
    invoke-virtual {p2, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 12
    :cond_3
    :goto_1
    invoke-static {p2}, Lcom/php25/PDownload/d;->h(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 13
    invoke-virtual {p1}, Lcom/join/mgps/dto/FileInfo;->getSize()J

    move-result-wide v3

    invoke-virtual {p2, v3, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setSize(J)V

    const-wide/16 v3, 0xa

    .line 14
    invoke-virtual {p2, v3, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setDuration(J)V

    .line 15
    invoke-virtual {p1}, Lcom/join/mgps/dto/FileInfo;->getSize()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/join/mgps/Util/UtilsMy;->d(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setShowSize(Ljava/lang/String;)V

    .line 16
    :cond_4
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getExt()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    .line 17
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 18
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v3, Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v1, p1, v3}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/join/mgps/dto/ExtBean;

    :cond_5
    if-nez v1, :cond_6

    .line 19
    new-instance v1, Lcom/join/mgps/dto/ExtBean;

    invoke-direct {v1}, Lcom/join/mgps/dto/ExtBean;-><init>()V

    :cond_6
    const-string p1, "qk"

    .line 20
    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/ExtBean;->setQkPosition(Ljava/lang/String;)Lcom/join/mgps/dto/ExtBean;

    .line 21
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/ExtBean;->setDown_from(I)V

    .line 22
    invoke-static {v1}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setExt(Ljava/lang/String;)V

    .line 23
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    invoke-virtual {p1, p2}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    new-instance p1, Lcom/join/mgps/dto/DownloadScanEvent;

    invoke-direct {p1}, Lcom/join/mgps/dto/DownloadScanEvent;-><init>()V

    .line 25
    invoke-virtual {p1, p2}, Lcom/join/mgps/dto/DownloadScanEvent;->setTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 26
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    const/4 v1, 0x1

    :cond_7
    if-eqz v1, :cond_8

    .line 27
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->Q:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->P:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->r1()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_8
    :goto_2
    return-void
.end method

.method i1(Ljava/lang/String;)V
    .locals 8
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const/16 v0, 0x31

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->z:Lcom/join/mgps/rpc/k;

    if-nez v1, :cond_0

    .line 2
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/service/CommonService;->z:Lcom/join/mgps/rpc/k;

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 4
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 6
    :goto_0
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v4

    iget-object v5, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v4, v5}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v1, "\u8bf7\u5148\u767b\u5f55\uff01"

    .line 7
    invoke-virtual {p0, v1}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    .line 8
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/service/CommonService;->w1(Ljava/lang/String;I)V

    return-void

    .line 9
    :cond_2
    new-instance v4, Lcom/join/mgps/dto/RequestGameBespeakArgs;

    invoke-direct {v4}, Lcom/join/mgps/dto/RequestGameBespeakArgs;-><init>()V

    .line 10
    invoke-virtual {v4, p1}, Lcom/join/mgps/dto/RequestGameBespeakArgs;->setGameId(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v4, v3}, Lcom/join/mgps/dto/RequestGameBespeakArgs;->setUid(I)V

    .line 12
    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->z()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/join/mgps/dto/RequestGameBespeakArgs;->setMobile(Ljava/lang/String;)V

    .line 13
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    iget-object v3, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-direct {v1, v3}, Lcom/join/mgps/dto/RequestModel;-><init>(Landroid/content/Context;)V

    .line 14
    invoke-virtual {v1, v4}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 15
    iget-object v3, p0, Lcom/join/mgps/service/CommonService;->z:Lcom/join/mgps/rpc/k;

    invoke-interface {v3, v1}, Lcom/join/mgps/rpc/k;->q0(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 16
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getFlag()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_5

    .line 17
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/GameBespeakBean;

    if-eqz v1, :cond_8

    .line 18
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameBespeakBean;->getPdInfo()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 19
    iget-object v3, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v3}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v3

    sget-object v5, Lcom/papa/sim/statistic/Event;->pdGameSearchSubscribe:Lcom/papa/sim/statistic/Event;

    new-instance v6, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v6}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {v6, p1}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v6

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameBespeakBean;->getPdInfo()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v7

    invoke-virtual {v7}, Lcom/join/mgps/dto/DomainInfoBean;->getAb_test_number()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/papa/sim/statistic/Ext;->setTestAbNumber(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v6

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameBespeakBean;->getPdInfo()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v7

    invoke-virtual {v7}, Lcom/join/mgps/dto/DomainInfoBean;->getIs_join()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/papa/sim/statistic/Ext;->setIsJoin(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 20
    :cond_3
    new-instance v3, Landroid/content/Intent;

    const-string v5, "com.broadcast.bespeak.sussess"

    invoke-direct {v3, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v5, "gameid"

    .line 21
    invoke-virtual {v3, v5, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v5, "game_book"

    .line 22
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameBespeakBean;->isBespeak()Z

    move-result v6

    if-eqz v6, :cond_4

    const/4 v2, 0x1

    :cond_4
    invoke-virtual {v3, v5, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v2, "message"

    .line 23
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameBespeakBean;->getHint()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "pd_info"

    .line 24
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameBespeakBean;->getPdInfo()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v1

    invoke-virtual {v3, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 25
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    const-string v1, "\u6536\u5230\uff0c\u6e38\u620f\u4e0a\u67b6\u540e\u4f1a\u901a\u77e5\u60a8"

    .line 26
    invoke-virtual {p0, v1}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    goto :goto_1

    .line 27
    :cond_5
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/service/CommonService;->w1(Ljava/lang/String;I)V

    goto :goto_1

    :cond_6
    const-string v1, "\u8bf7\u6c42\u5931\u8d25\uff01"

    .line 28
    invoke-virtual {p0, v1}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    .line 29
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/service/CommonService;->w1(Ljava/lang/String;I)V

    goto :goto_1

    :cond_7
    const-string v1, "\u8bf7\u68c0\u67e5\u7f51\u7edc\uff01"

    .line 30
    invoke-virtual {p0, v1}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    .line 31
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/service/CommonService;->w1(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 33
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/service/CommonService;->w1(Ljava/lang/String;I)V

    :cond_8
    :goto_1
    return-void
.end method

.method j0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.broadcast.action_insufficient_storage"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u5b58\u50a8\u7a7a\u95f4\u4e0d\u8db3\uff0c\u8bf7\u6e05\u7406\u7a7a\u95f4\u540e\u518d\u4e0b\u8f7d"

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method j1()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    const-string v0, ""

    .line 2
    new-instance v1, Lcom/join/mgps/dto/BluetoothHandleBlackListRequestBean;

    invoke-direct {v1}, Lcom/join/mgps/dto/BluetoothHandleBlackListRequestBean;-><init>()V

    .line 3
    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/BluetoothHandleBlackListRequestBean;->setDevice_id(Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lcom/join/mgps/rpc/impl/a;->c0()Lcom/join/mgps/rpc/b;

    move-result-object v0

    invoke-virtual {v1}, Lcom/join/mgps/dto/BluetoothHandleBlackListRequestBean;->getParams()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/join/mgps/rpc/b;->X(Ljava/util/Map;)Lcom/join/mgps/dto/AccountResultMainBean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/BluetoothHandleBlackListData;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/BluetoothHandleBlackListData;->is_success()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/BluetoothHandleBlackListData;->getData_info()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/service/CommonService;->b2(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method k1(Ljava/lang/String;)V
    .locals 8
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const/16 v0, 0x31

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 2
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->z:Lcom/join/mgps/rpc/k;

    if-nez v1, :cond_0

    .line 3
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/service/CommonService;->z:Lcom/join/mgps/rpc/k;

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 6
    :goto_0
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v4

    iget-object v5, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v4, v5}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v1, "\u8bf7\u5148\u767b\u5f55\uff01"

    .line 7
    invoke-virtual {p0, v1}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    .line 8
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/service/CommonService;->w1(Ljava/lang/String;I)V

    return-void

    .line 9
    :cond_2
    new-instance v4, Lcom/join/mgps/dto/RequestGameBespeakArgs;

    invoke-direct {v4}, Lcom/join/mgps/dto/RequestGameBespeakArgs;-><init>()V

    .line 10
    invoke-virtual {v4, p1}, Lcom/join/mgps/dto/RequestGameBespeakArgs;->setGameId(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v4, v3}, Lcom/join/mgps/dto/RequestGameBespeakArgs;->setUid(I)V

    .line 12
    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->z()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/join/mgps/dto/RequestGameBespeakArgs;->setMobile(Ljava/lang/String;)V

    .line 13
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    iget-object v3, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-direct {v1, v3}, Lcom/join/mgps/dto/RequestModel;-><init>(Landroid/content/Context;)V

    .line 14
    invoke-virtual {v1, v4}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 15
    iget-object v3, p0, Lcom/join/mgps/service/CommonService;->z:Lcom/join/mgps/rpc/k;

    invoke-interface {v3, v1}, Lcom/join/mgps/rpc/k;->m0(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 16
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getFlag()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_6

    .line 17
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/GameBespeakBean;

    if-eqz v1, :cond_5

    .line 18
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameBespeakBean;->getPdInfo()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 19
    iget-object v3, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v3}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v3

    sget-object v5, Lcom/papa/sim/statistic/Event;->pdGameSearchSubscribe:Lcom/papa/sim/statistic/Event;

    new-instance v6, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v6}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {v6, p1}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v6

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameBespeakBean;->getPdInfo()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v7

    invoke-virtual {v7}, Lcom/join/mgps/dto/DomainInfoBean;->getAb_test_number()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/papa/sim/statistic/Ext;->setTestAbNumber(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v6

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameBespeakBean;->getPdInfo()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v7

    invoke-virtual {v7}, Lcom/join/mgps/dto/DomainInfoBean;->getIs_join()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/papa/sim/statistic/Ext;->setIsJoin(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 20
    :cond_3
    new-instance v3, Landroid/content/Intent;

    const-string v5, "com.broadcast.bespeak.sussess"

    invoke-direct {v3, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v5, "gameid"

    .line 21
    invoke-virtual {v3, v5, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v5, "game_book"

    .line 22
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameBespeakBean;->isBespeak()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v2, 0x1

    :goto_1
    invoke-virtual {v3, v5, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 23
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :cond_5
    const-string v1, "\u53d6\u6d88\u9884\u7ea6\u6210\u529f"

    .line 24
    invoke-virtual {p0, v1}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    goto :goto_2

    .line 25
    :cond_6
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/service/CommonService;->w1(Ljava/lang/String;I)V

    goto :goto_2

    :cond_7
    const-string v1, "\u8bf7\u6c42\u5931\u8d25\uff01"

    .line 26
    invoke-virtual {p0, v1}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    .line 27
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/service/CommonService;->w1(Ljava/lang/String;I)V

    goto :goto_2

    :cond_8
    const-string v1, "\u8bf7\u68c0\u67e5\u7f51\u7edc\uff01"

    .line 28
    invoke-virtual {p0, v1}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    .line 29
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/service/CommonService;->w1(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 31
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/service/CommonService;->w1(Ljava/lang/String;I)V

    :goto_2
    return-void
.end method

.method l0(Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x1

    .line 2
    :try_start_0
    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method m1(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emu.adInfo"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->hasShowAdInfo()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->g()V

    .line 3
    invoke-static {}, Lcom/join/android/app/common/http/h;->b()Lcom/join/android/app/common/http/h;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/android/app/common/http/h;->c(Landroid/content/Context;)V

    .line 4
    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    const-string v0, "FriendPresenter srv login"

    .line 5
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 6
    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/friend/chat/c;->K()V

    .line 7
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/c;->m(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/c;->t(Ljava/lang/Object;)V

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->g1()V

    .line 9
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->c0()V

    .line 10
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->r()V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/service/CommonService;->q:Z

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->b:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->b:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->O1()V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->l:Lcom/join/mgps/service/CommonService$r;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->m:Lcom/join/mgps/service/CommonService$s;

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 6
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->s:Lcom/github/snowdream/android/app/downloader/b;

    if-eqz v0, :cond_3

    .line 7
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/b;->n()V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->u:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 9
    :cond_3
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/c;->m(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/c;->y(Ljava/lang/Object;)V

    .line 10
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->U1()V

    .line 11
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->T1()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 13
    :goto_0
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public onFriendEvent(Lcom/wufan/friend/chat/protocol/w1;)V
    .locals 4
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lcom/wufan/friend/chat/protocol/w1;->C()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 2
    invoke-virtual {p1}, Lcom/wufan/friend/chat/protocol/w1;->I()I

    move-result v0

    if-ne v0, v1, :cond_2

    .line 3
    invoke-virtual {p1}, Lcom/wufan/friend/chat/protocol/w1;->getData()Lcom/wufan/friend/chat/protocol/x1;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "channel"

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {p1}, Lcom/wufan/friend/chat/protocol/w1;->getData()Lcom/wufan/friend/chat/protocol/x1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/friend/chat/protocol/x1;->z2()Lcom/wufan/friend/chat/protocol/v0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/wufan/friend/chat/protocol/w1;->getData()Lcom/wufan/friend/chat/protocol/x1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/friend/chat/protocol/x1;->z2()Lcom/wufan/friend/chat/protocol/v0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/friend/chat/protocol/v0;->D0()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "\u767b\u5f55\u6210\u529f\uff01"

    .line 4
    filled-new-array {v2, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 5
    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/wufan/friend/chat/c;->T(Z)V

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->z1()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v0, v3

    .line 7
    invoke-virtual {p1}, Lcom/wufan/friend/chat/protocol/w1;->getData()Lcom/wufan/friend/chat/protocol/x1;

    move-result-object v2

    invoke-virtual {v2}, Lcom/wufan/friend/chat/protocol/x1;->z2()Lcom/wufan/friend/chat/protocol/v0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/wufan/friend/chat/protocol/v0;->getMessage()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->r:Landroid/os/Handler;

    sget-object v1, Lcom/join/mgps/service/c;->b:Lcom/join/mgps/service/c;

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 9
    :cond_2
    :goto_0
    invoke-virtual {p1}, Lcom/wufan/friend/chat/protocol/w1;->B1()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_5

    .line 10
    invoke-virtual {p1}, Lcom/wufan/friend/chat/protocol/w1;->getData()Lcom/wufan/friend/chat/protocol/x1;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/wufan/friend/chat/protocol/w1;->getData()Lcom/wufan/friend/chat/protocol/x1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/friend/chat/protocol/x1;->getNotification()Lcom/wufan/friend/chat/protocol/y0;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_1

    .line 11
    :cond_3
    invoke-virtual {p1}, Lcom/wufan/friend/chat/protocol/w1;->getData()Lcom/wufan/friend/chat/protocol/x1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/wufan/friend/chat/protocol/x1;->getNotification()Lcom/wufan/friend/chat/protocol/y0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/wufan/friend/chat/protocol/y0;->s0()Lcom/wufan/friend/chat/protocol/m;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 12
    invoke-virtual {p1}, Lcom/wufan/friend/chat/protocol/m;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/service/CommonService;->R1(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :cond_4
    :goto_1
    return-void

    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_5
    :goto_2
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 29

    move-object/from16 v13, p0

    move-object/from16 v14, p1

    .line 1
    iput-object v13, v13, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz v14, :cond_5

    const-string v2, "action"

    .line 2
    invoke-virtual {v14, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    const-string v3, "launchVGame"

    .line 4
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v0, "packageName"

    .line 5
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v2

    invoke-virtual {v2, v13, v1, v0}, Lcom/join/mgps/va/overmind/d;->U(Landroid/content/Context;ILjava/lang/String;)V

    .line 7
    invoke-super/range {p0 .. p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0

    :cond_0
    const-string v3, "getMiniGameConfig"

    .line 8
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "fromPkg"

    if-eqz v3, :cond_1

    .line 9
    invoke-virtual {v14, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 10
    invoke-virtual {v13, v2}, Lcom/join/mgps/service/CommonService;->a0(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v3, "adStatisticEvent"

    .line 11
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 12
    invoke-virtual {v14, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "event"

    .line 13
    invoke-virtual {v14, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "adId"

    .line 14
    invoke-virtual {v14, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 15
    invoke-virtual {v13, v2, v3, v4}, Lcom/join/mgps/service/CommonService;->t1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const-string v3, "downloadQuark"

    .line 16
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v2, "silent"

    .line 17
    invoke-virtual {v14, v2, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    const-string v3, "isOm"

    .line 18
    invoke-virtual {v14, v3, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v3

    const-string v4, "qkPosition"

    .line 19
    invoke-virtual {v14, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 20
    invoke-virtual {v13, v2, v3, v4}, Lcom/join/mgps/service/CommonService;->E(ZZLjava/lang/String;)V

    goto :goto_0

    :cond_3
    const-string v3, "retrieveQuarkScanEvent"

    .line 21
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 22
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/service/CommonService;->s0()V

    goto :goto_0

    :cond_4
    const-string v3, "quarkScan"

    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 24
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/service/CommonService;->s1()V

    :cond_5
    :goto_0
    if-eqz v14, :cond_6

    const-string v2, "paygameid"

    .line 25
    invoke-virtual {v14, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    const-string v0, "fromSdk"

    .line 26
    invoke-virtual {v14, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    const-string v1, "appkey"

    .line 27
    invoke-virtual {v14, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 28
    invoke-virtual {v14, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2, v0, v1}, Lcom/join/mgps/service/CommonService;->t(Ljava/lang/String;ZLjava/lang/String;)V

    goto/16 :goto_4

    :cond_6
    const-string v2, "_from_type"

    const-string v3, "_from"

    const-string v4, "fromRecomDown"

    const-string v5, "ext"

    const/4 v6, 0x0

    const-string v7, "_downloadArgs"

    if-eqz v14, :cond_8

    const-string v8, "downGameId"

    .line 29
    invoke-virtual {v14, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_8

    const-string v9, "uncheckSelfSupport"

    .line 30
    invoke-virtual {v14, v9, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v9

    const-string v10, "disableShowSpeedUpPrompt"

    .line 31
    invoke-virtual {v14, v10, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v10

    const-wide/16 v11, 0x0

    const-string v15, "resourceSize"

    .line 32
    invoke-virtual {v14, v15, v11, v12}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v11

    .line 33
    invoke-virtual {v14, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 34
    invoke-virtual {v14, v4, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v15

    const-string v4, "showRecommend"

    .line 35
    invoke-virtual {v14, v4, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    const-string v0, "data"

    .line 36
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v14, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v4

    instance-of v4, v4, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    if-eqz v4, :cond_7

    .line 37
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    goto :goto_1

    :cond_7
    move-object v0, v6

    .line 38
    :goto_1
    invoke-virtual {v14, v7}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v4

    move-object/from16 v16, v4

    check-cast v16, Lcom/join/mgps/dto/DownloadGameArgsBean;

    .line 39
    invoke-virtual {v14, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 40
    invoke-virtual {v14, v3, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v17

    invoke-virtual {v14, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v18

    move-object/from16 v1, p0

    move-object v2, v4

    move-object v3, v5

    move v4, v9

    move-wide v5, v11

    move-object v7, v0

    move v8, v10

    move/from16 v9, v17

    move/from16 v10, v18

    move v11, v15

    move-object/from16 v12, v16

    .line 41
    invoke-virtual/range {v1 .. v12}, Lcom/join/mgps/service/CommonService;->T(Ljava/lang/String;Ljava/lang/String;ZJLcom/join/mgps/dto/QueryDownloadInfoResponseData;ZIIZLcom/join/mgps/dto/DownloadGameArgsBean;)V

    goto/16 :goto_4

    :cond_8
    if-eqz v14, :cond_a

    const-string v8, "requestAndDownloadGameById"

    .line 42
    invoke-virtual {v14, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_a

    .line 43
    invoke-virtual {v14, v7}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/DownloadGameArgsBean;

    if-nez v0, :cond_9

    .line 44
    new-instance v0, Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/DownloadGameArgsBean;-><init>()V

    .line 45
    invoke-virtual {v14, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/dto/DownloadGameArgsBean;->setGameId(Ljava/lang/String;)V

    .line 46
    :cond_9
    invoke-direct {v13, v0, v1}, Lcom/join/mgps/service/CommonService;->h1(Lcom/join/mgps/dto/DownloadGameArgsBean;I)V

    goto/16 :goto_4

    :cond_a
    if-eqz v14, :cond_c

    const-string v8, "requestAndUpdateGameById"

    .line 47
    invoke-virtual {v14, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_c

    .line 48
    invoke-virtual {v14, v7}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/DownloadGameArgsBean;

    if-nez v1, :cond_b

    .line 49
    new-instance v1, Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-direct {v1}, Lcom/join/mgps/dto/DownloadGameArgsBean;-><init>()V

    .line 50
    invoke-virtual {v14, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/DownloadGameArgsBean;->setGameId(Ljava/lang/String;)V

    .line 51
    :cond_b
    invoke-direct {v13, v1, v0}, Lcom/join/mgps/service/CommonService;->h1(Lcom/join/mgps/dto/DownloadGameArgsBean;I)V

    goto/16 :goto_4

    :cond_c
    if-eqz v14, :cond_e

    const-string v0, "requestAndChoiceUpdateGameById"

    .line 52
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_e

    .line 53
    invoke-virtual {v14, v7}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/DownloadGameArgsBean;

    if-nez v1, :cond_d

    .line 54
    new-instance v1, Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-direct {v1}, Lcom/join/mgps/dto/DownloadGameArgsBean;-><init>()V

    .line 55
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/DownloadGameArgsBean;->setGameId(Ljava/lang/String;)V

    :cond_d
    const/4 v0, 0x2

    .line 56
    invoke-direct {v13, v1, v0}, Lcom/join/mgps/service/CommonService;->h1(Lcom/join/mgps/dto/DownloadGameArgsBean;I)V

    goto/16 :goto_4

    :cond_e
    const-string v0, "location"

    if-eqz v14, :cond_11

    const-string v8, "getPrivateDomainById"

    .line 57
    invoke-virtual {v14, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_11

    const-string v2, "_ArgMaps"

    .line 58
    invoke-virtual {v14, v2}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/util/HashMap;

    if-eqz v2, :cond_1f

    .line 59
    :try_start_0
    invoke-virtual {v14, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "0"

    .line 60
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v5, v5, Ljava/lang/Integer;

    if-eqz v5, :cond_f

    .line 61
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :cond_f
    const-string v0, "typeId"

    .line 62
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/String;

    if-eqz v0, :cond_10

    const-string v0, "typeId"

    .line 63
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 64
    :cond_10
    invoke-static {v3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1f

    if-eqz v1, :cond_1f

    .line 65
    invoke-virtual {v13, v3, v1, v4}, Lcom/join/mgps/service/CommonService;->b0(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_4

    :catch_0
    move-exception v0

    .line 66
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_4

    :cond_11
    if-eqz v14, :cond_12

    const-string v8, "gameDownloadDetail"

    .line 67
    invoke-virtual {v14, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_12

    .line 68
    new-instance v6, Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-direct {v6}, Lcom/join/mgps/dto/DownloadGameArgsBean;-><init>()V

    .line 69
    invoke-virtual {v14, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/join/mgps/dto/DownloadGameArgsBean;->setGameId(Ljava/lang/String;)V

    .line 70
    invoke-virtual {v14, v4, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v6, v4}, Lcom/join/mgps/dto/DownloadGameArgsBean;->setFromRecommend(Z)V

    .line 71
    invoke-virtual {v14, v3, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v6, v3}, Lcom/join/mgps/dto/DownloadGameArgsBean;->setFrom(I)V

    .line 72
    invoke-virtual {v14, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v6, v2}, Lcom/join/mgps/dto/DownloadGameArgsBean;->setFromType(I)V

    const-string v2, "keyWord"

    .line 73
    invoke-virtual {v14, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Lcom/join/mgps/dto/DownloadGameArgsBean;->setKeyWord(Ljava/lang/String;)V

    const-string v2, "recPosition"

    .line 74
    invoke-virtual {v14, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Lcom/join/mgps/dto/DownloadGameArgsBean;->setRecPosition(Ljava/lang/String;)V

    const-string v2, "remarks"

    .line 75
    invoke-virtual {v14, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Lcom/join/mgps/dto/DownloadGameArgsBean;->setRemarks(Ljava/lang/String;)V

    const-string v2, "nodeId"

    .line 76
    invoke-virtual {v14, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Lcom/join/mgps/dto/DownloadGameArgsBean;->setNodeId(Ljava/lang/String;)V

    const-string v2, "volcanoOther"

    .line 77
    invoke-virtual {v14, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Lcom/join/mgps/dto/DownloadGameArgsBean;->setVolcanoOther(Ljava/lang/String;)V

    .line 78
    invoke-virtual {v14, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/join/mgps/dto/DownloadGameArgsBean;->setLocation(I)V

    const-string v0, "downType"

    .line 79
    invoke-virtual {v14, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/join/mgps/dto/DownloadGameArgsBean;->setDownType(I)V

    .line 80
    invoke-virtual {v14, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/join/mgps/dto/DownloadGameArgsBean;->setExt(Ljava/lang/String;)V

    const-string v0, "packagePath"

    .line 81
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 82
    invoke-virtual {v6, v0}, Lcom/join/mgps/dto/DownloadGameArgsBean;->setPackagePath(Ljava/lang/String;)V

    .line 83
    invoke-direct {v13, v6}, Lcom/join/mgps/service/CommonService;->Y(Lcom/join/mgps/dto/DownloadGameArgsBean;)V

    goto/16 :goto_4

    :cond_12
    if-eqz v14, :cond_14

    const-string v0, "gameDownloadDetail2"

    .line 84
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_14

    .line 85
    iget-object v1, v13, Lcom/join/mgps/service/CommonService;->y:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_1f

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 86
    iget-object v0, v13, Lcom/join/mgps/service/CommonService;->y:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getDown_status()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_13

    .line 87
    iget-object v0, v13, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    iget-object v1, v13, Lcom/join/mgps/service/CommonService;->y:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->n1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_4

    .line 88
    :cond_13
    iget-object v0, v13, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    iget-object v1, v13, Lcom/join/mgps/service/CommonService;->y:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTp_down_url()Ljava/util/List;

    move-result-object v2

    iget-object v3, v13, Lcom/join/mgps/service/CommonService;->y:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getOther_down_switch()I

    move-result v3

    iget-object v4, v13, Lcom/join/mgps/service/CommonService;->y:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCdn_down_switch()I

    move-result v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/join/mgps/Util/UtilsMy;->T0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;II)V

    goto/16 :goto_4

    :cond_14
    if-eqz v14, :cond_16

    const-string v0, "downGameIdNotSelfSupport"

    .line 89
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_16

    .line 90
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "downloadTask"

    .line 91
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v3

    if-eqz v3, :cond_15

    invoke-virtual {v14, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v3

    instance-of v3, v3, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v3, :cond_15

    .line 92
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 93
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getExt()Ljava/lang/String;

    move-result-object v1

    .line 94
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isFromRecomDown()Z

    move-result v3

    move-object v4, v0

    move v5, v3

    move-object v3, v1

    goto :goto_2

    :cond_15
    const-string v0, ""

    move-object v3, v0

    move-object v4, v6

    const/4 v5, 0x0

    .line 95
    :goto_2
    invoke-virtual {v14, v7}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/join/mgps/dto/DownloadGameArgsBean;

    move-object/from16 v1, p0

    .line 96
    invoke-virtual/range {v1 .. v6}, Lcom/join/mgps/service/CommonService;->D(Ljava/lang/String;Ljava/lang/String;Lcom/github/snowdream/android/app/downloader/DownloadTask;ZLcom/join/mgps/dto/DownloadGameArgsBean;)V

    goto/16 :goto_4

    :cond_16
    if-eqz v14, :cond_17

    const-string v0, "accountloginSuccess"

    .line 97
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 98
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/service/CommonService;->Q()V

    .line 99
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/service/CommonService;->W()V

    goto/16 :goto_4

    :cond_17
    if-eqz v14, :cond_18

    const-string v0, "checkcoin"

    .line 100
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v2

    if-eqz v2, :cond_18

    .line 101
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 102
    invoke-virtual {v13, v0}, Lcom/join/mgps/service/CommonService;->v(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_4

    :cond_18
    if-eqz v14, :cond_19

    const-string v0, "sharePostData"

    .line 103
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    if-eqz v0, :cond_19

    const-string v0, "sharePostData"

    .line 104
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/SharePostRequest;

    .line 105
    invoke-virtual {v13, v0}, Lcom/join/mgps/service/CommonService;->B1(Lcom/join/mgps/dto/SharePostRequest;)V

    goto/16 :goto_4

    :cond_19
    if-eqz v14, :cond_1a

    const-string v0, "getDownloadRecomedData"

    .line 106
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    if-eqz v0, :cond_1a

    const-string v0, "getDownloadRecomedData"

    .line 107
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v2, "showName"

    .line 108
    invoke-virtual {v14, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "fromRecommendDown"

    .line 109
    invoke-virtual {v14, v3, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 110
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v13, v0, v2, v1}, Lcom/join/mgps/service/CommonService;->U(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_4

    :cond_1a
    if-eqz v14, :cond_1b

    const-string v0, "onClickGamebeSpeakGameId"

    .line 111
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    if-eqz v0, :cond_1b

    const-string v0, "onClickGamebeSpeakGameId"

    .line 112
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 113
    invoke-virtual {v13, v0}, Lcom/join/mgps/service/CommonService;->i1(Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_1b
    if-eqz v14, :cond_1c

    const-string v0, "onClickUnGamebeSpeakGameId"

    .line 114
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    if-eqz v0, :cond_1c

    const-string v0, "onClickUnGamebeSpeakGameId"

    .line 115
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 116
    invoke-virtual {v13, v0}, Lcom/join/mgps/service/CommonService;->k1(Ljava/lang/String;)V

    goto :goto_4

    :cond_1c
    if-eqz v14, :cond_1d

    const-string v0, "downloadByQuark"

    .line 117
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    if-eqz v0, :cond_1d

    const-string v0, "downloadByQuark"

    .line 118
    invoke-virtual {v14, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/DownloadScanEvent;

    .line 119
    invoke-virtual {v13, v0}, Lcom/join/mgps/service/CommonService;->z0(Lcom/join/mgps/dto/DownloadScanEvent;)V

    goto :goto_4

    .line 120
    :cond_1d
    :try_start_1
    invoke-static {}, Lcom/join/mgps/wrapper/a$a;->a()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-direct/range {p0 .. p0}, Lcom/join/mgps/service/CommonService;->o0()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v0

    .line 121
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 122
    :cond_1e
    :goto_3
    iget-object v0, v13, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/v;->d(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v13, Lcom/join/mgps/service/CommonService;->p:Ljava/lang/String;

    .line 123
    iget-object v15, v13, Lcom/join/mgps/service/CommonService;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v0, Lcom/join/mgps/service/CommonService$q;

    invoke-direct {v0, v13}, Lcom/join/mgps/service/CommonService$q;-><init>(Lcom/join/mgps/service/CommonService;)V

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x32

    sget-object v21, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    move-object/from16 v16, v0

    invoke-interface/range {v15 .. v21}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 124
    iget-object v0, v13, Lcom/join/mgps/service/CommonService;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/join/mgps/service/CommonService$n;

    invoke-direct {v1, v13, v6}, Lcom/join/mgps/service/CommonService$n;-><init>(Lcom/join/mgps/service/CommonService;Lcom/join/mgps/service/CommonService$e;)V

    const-wide/16 v24, 0xa

    const-wide/16 v26, 0x1e

    sget-object v28, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-object/from16 v22, v0

    move-object/from16 v23, v1

    invoke-interface/range {v22 .. v28}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 125
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/service/CommonService;->Q()V

    .line 126
    :cond_1f
    :goto_4
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/service/CommonService;->f1()V

    .line 127
    invoke-super/range {p0 .. p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0
.end method

.method p(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    :try_start_0
    const-string v0, "_"

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    .line 2
    aget-object v0, p1, v0

    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/join/android/app/common/utils/n;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 3
    aget-object p1, p1, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    const-string p1, "-1"

    return-object p1
.end method

.method q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->v:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->v:Lcom/join/mgps/socket/fight/arena/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->v:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/ArenaService;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/join/mgps/service/CommonService;->b1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p4, "register_type_Emulator"

    .line 4
    invoke-static {p4}, Lapp/mgsim/arena/ArenaRequestFactory;->login(Ljava/lang/String;)Lapp/mgsim/arena/ArenaRequest;

    move-result-object p4

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p4, Lapp/mgsim/arena/ArenaRequest;->isRefreshing:Z

    .line 6
    :try_start_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p4, Lapp/mgsim/arena/ArenaRequest;->gameId:J

    .line 7
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p4, Lapp/mgsim/arena/ArenaRequest;->roomId:I

    .line 8
    :cond_2
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p4, Lapp/mgsim/arena/ArenaRequest;->uid:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    :catch_0
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->v:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {p1, p4}, Lcom/join/mgps/socket/fight/arena/b;->f(Lapp/mgsim/arena/ArenaRequest;)V

    goto :goto_0

    .line 10
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->v:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {p1}, Lcom/join/mgps/socket/fight/arena/b;->bindService()V

    :goto_0
    return-void
.end method

.method q1(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/AppBean;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object v0

    invoke-virtual {v0}, Lp1/b;->a()I

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lp1/e;->d(Landroid/content/Context;)Lp1/e;

    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/AppBean;

    .line 4
    new-instance v1, Lcom/join/mgps/db/tables/PurchasedListTable;

    invoke-direct {v1, v0}, Lcom/join/mgps/db/tables/PurchasedListTable;-><init>(Lcom/join/mgps/dto/AppBean;)V

    .line 5
    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object v0

    invoke-virtual {v0, v1}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->Q2(Landroid/content/Context;)V

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->x()V

    return-void
.end method

.method r()V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lcom/join/mgps/socket/fight/arena/b;

    new-instance v1, Lcom/join/mgps/service/CommonService$c;

    invoke-direct {v1, p0}, Lcom/join/mgps/service/CommonService$c;-><init>(Lcom/join/mgps/service/CommonService;)V

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/socket/fight/arena/b;-><init>(Landroid/content/Context;Lcom/join/mgps/socket/fight/arena/b$b;)V

    iput-object v0, p0, Lcom/join/mgps/service/CommonService;->v:Lcom/join/mgps/socket/fight/arena/b;

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->bindService()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method declared-synchronized r1()V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->quarkGameDownload()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->Q:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method s0()V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->quarkGameDownload()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 3
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v2

    const-class v3, Ljava/util/HashMap;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Class;

    const/4 v5, 0x0

    const-class v6, Ljava/lang/String;

    aput-object v6, v4, v5

    const-class v5, Lcom/join/mgps/dto/DownloadScanEvent;

    const/4 v6, 0x1

    aput-object v5, v4, v6

    invoke-virtual {v2, v3, v4}, Lcom/join/android/app/common/utils/JsonMapper;->createCollectionType(Ljava/lang/Class;[Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    if-eqz v0, :cond_1

    .line 4
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->Q:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->Q:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->O:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->s1()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method s1()V
    .locals 17
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    move-object/from16 v1, p0

    const-string v2, "quark scan..end"

    const-wide/16 v3, 0x2710

    const/4 v5, 0x0

    .line 1
    :try_start_0
    iget-boolean v0, v1, Lcom/join/mgps/service/CommonService;->N:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    .line 2
    iput-boolean v5, v1, Lcom/join/mgps/service/CommonService;->N:Z

    .line 3
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 4
    iget-object v0, v1, Lcom/join/mgps/service/CommonService;->O:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, v1, Lcom/join/mgps/service/CommonService;->O:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    .line 6
    :cond_0
    :try_start_1
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V

    .line 7
    invoke-static {}, Lcom/MApplication;->g()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, v1, Lcom/join/mgps/service/CommonService;->Q:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 8
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/service/CommonService;->s1()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void

    :cond_2
    const/4 v6, 0x1

    .line 10
    :try_start_2
    iput-boolean v6, v1, Lcom/join/mgps/service/CommonService;->N:Z

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, "/Quark/Download"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v7, "quark scan..start"

    .line 12
    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 13
    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 14
    invoke-static {v0}, Lcom/join/mgps/service/CommonService;->H(Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    if-eqz v8, :cond_10

    .line 15
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_10

    const/4 v9, 0x0

    .line 16
    :goto_1
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_10

    .line 17
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-array v10, v6, [Ljava/lang/String;

    aput-object v0, v10, v5

    .line 18
    invoke-static {v10}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    const-string v10, ".zip"

    .line 19
    invoke-virtual {v0, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v10
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const-string v11, ".apk"

    if-eqz v10, :cond_e

    .line 20
    :try_start_4
    new-instance v10, Ljava/io/RandomAccessFile;

    const-string v12, "r"

    invoke-direct {v10, v0, v12}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    new-instance v12, Lnet/sf/sevenzipjbinding/impl/RandomAccessFileInStream;

    invoke-direct {v12, v10}, Lnet/sf/sevenzipjbinding/impl/RandomAccessFileInStream;-><init>(Ljava/io/RandomAccessFile;)V

    .line 22
    sget-object v10, Lnet/sf/sevenzipjbinding/ArchiveFormat;->ZIP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    invoke-static {v10, v12}, Lnet/sf/sevenzipjbinding/SevenZip;->openInArchive(Lnet/sf/sevenzipjbinding/ArchiveFormat;Lnet/sf/sevenzipjbinding/IInStream;)Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object v10

    .line 23
    invoke-interface {v10}, Lnet/sf/sevenzipjbinding/IInArchive;->getSimpleInterface()Lnet/sf/sevenzipjbinding/simple/ISimpleInArchive;

    move-result-object v12

    .line 24
    invoke-interface {v12}, Lnet/sf/sevenzipjbinding/simple/ISimpleInArchive;->getArchiveItems()[Lnet/sf/sevenzipjbinding/simple/ISimpleInArchiveItem;

    move-result-object v13

    array-length v14, v13

    const/4 v15, 0x0

    :goto_2
    if-ge v15, v14, :cond_4

    aget-object v16, v13, v15

    .line 25
    invoke-interface/range {v16 .. v16}, Lnet/sf/sevenzipjbinding/simple/ISimpleInArchiveItem;->getPath()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v3, 0x1

    goto :goto_3

    :cond_3
    add-int/lit8 v15, v15, 0x1

    const-wide/16 v3, 0x2710

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    :goto_3
    if-eqz v3, :cond_b

    .line 26
    invoke-interface {v12}, Lnet/sf/sevenzipjbinding/simple/ISimpleInArchive;->getArchiveItems()[Lnet/sf/sevenzipjbinding/simple/ISimpleInArchiveItem;

    move-result-object v3

    array-length v4, v3

    const/4 v12, 0x0

    :goto_4
    if-ge v12, v4, :cond_a

    aget-object v13, v3, v12

    .line 27
    invoke-interface {v13}, Lnet/sf/sevenzipjbinding/simple/ISimpleInArchiveItem;->isFolder()Z

    move-result v14

    if-eqz v14, :cond_5

    goto/16 :goto_5

    .line 28
    :cond_5
    invoke-interface {v13}, Lnet/sf/sevenzipjbinding/simple/ISimpleInArchiveItem;->getPath()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v14

    if-nez v14, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v14, "extract start: "

    .line 29
    filled-new-array {v14}, [Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 30
    iget-object v14, v1, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    const-string v15, ".extract"

    invoke-virtual {v14, v15}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v14

    .line 31
    invoke-virtual {v14}, Ljava/io/File;->exists()Z

    move-result v15

    if-nez v15, :cond_7

    .line 32
    invoke-virtual {v14}, Ljava/io/File;->mkdirs()Z

    .line 33
    :cond_7
    new-instance v15, Ljava/io/File;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0}, Lcom/join/mgps/Util/x0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v15, v14, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 34
    invoke-virtual {v15}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-virtual {v15}, Ljava/io/File;->delete()Z

    .line 35
    :cond_8
    new-instance v5, Lcom/join/mgps/service/CommonService$b;

    invoke-direct {v5, v1, v15}, Lcom/join/mgps/service/CommonService$b;-><init>(Lcom/join/mgps/service/CommonService;Ljava/io/File;)V

    invoke-interface {v13, v5}, Lnet/sf/sevenzipjbinding/simple/ISimpleInArchiveItem;->extractSlow(Lnet/sf/sevenzipjbinding/ISequentialOutStream;)Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    move-result-object v5

    .line 36
    sget-object v6, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->OK:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    if-ne v5, v6, :cond_9

    .line 37
    invoke-virtual {v15}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/join/mgps/service/CommonService;->X(Ljava/lang/String;)Lcom/join/mgps/dto/FileInfo;

    move-result-object v6

    if-eqz v6, :cond_9

    .line 38
    iput-object v0, v6, Lcom/join/mgps/dto/FileInfo;->path:Ljava/lang/String;

    const/4 v13, 0x1

    .line 39
    invoke-virtual {v6, v13}, Lcom/join/mgps/dto/FileInfo;->setFileType(I)V

    .line 40
    iget-object v13, v6, Lcom/join/mgps/dto/FileInfo;->pkg:Ljava/lang/String;

    invoke-virtual {v7, v13, v6}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    const/4 v6, 0x1

    new-array v13, v6, [Ljava/lang/String;

    .line 41
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "extract end: "

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v13, v6

    invoke-static {v13}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 42
    invoke-interface {v10}, Lnet/sf/sevenzipjbinding/IInArchive;->close()V

    .line 43
    invoke-virtual {v15}, Ljava/io/File;->delete()Z

    :goto_5
    add-int/lit8 v12, v12, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    goto/16 :goto_4

    :cond_a
    const/4 v3, 0x1

    goto/16 :goto_9

    .line 44
    :cond_b
    invoke-interface {v12}, Lnet/sf/sevenzipjbinding/simple/ISimpleInArchive;->getArchiveItems()[Lnet/sf/sevenzipjbinding/simple/ISimpleInArchiveItem;

    move-result-object v3

    array-length v4, v3
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const/4 v5, 0x0

    :goto_6
    const-string v6, ""

    if-ge v5, v4, :cond_d

    :try_start_5
    aget-object v10, v3, v5

    .line 45
    invoke-interface {v10}, Lnet/sf/sevenzipjbinding/simple/ISimpleInArchiveItem;->isFolder()Z

    move-result v11

    if-eqz v11, :cond_c

    .line 46
    invoke-interface {v10}, Lnet/sf/sevenzipjbinding/simple/ISimpleInArchiveItem;->getPath()Ljava/lang/String;

    move-result-object v3

    goto :goto_7

    :cond_c
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_d
    move-object v3, v6

    .line 47
    :goto_7
    invoke-static {v3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_a

    const-string v4, "/"

    .line 48
    invoke-virtual {v3, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v4

    const/4 v5, 0x0

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 49
    new-instance v4, Lcom/join/mgps/dto/FileInfo;

    invoke-direct {v4}, Lcom/join/mgps/dto/FileInfo;-><init>()V

    .line 50
    iput-object v3, v4, Lcom/join/mgps/dto/FileInfo;->pkg:Ljava/lang/String;

    .line 51
    iput-object v0, v4, Lcom/join/mgps/dto/FileInfo;->path:Ljava/lang/String;

    .line 52
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v10

    iput-wide v10, v4, Lcom/join/mgps/dto/FileInfo;->size:J

    const/4 v0, 0x3

    .line 53
    invoke-virtual {v4, v0}, Lcom/join/mgps/dto/FileInfo;->setFileType(I)V

    .line 54
    iget-object v0, v4, Lcom/join/mgps/dto/FileInfo;->pkg:Ljava/lang/String;

    invoke-virtual {v7, v0, v4}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const/4 v3, 0x1

    :try_start_6
    new-array v0, v3, [Ljava/lang/String;

    .line 55
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v0, v5

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    goto :goto_9

    :cond_e
    const/4 v3, 0x1

    .line 56
    invoke-virtual {v0, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_f

    .line 57
    invoke-virtual {v1, v0}, Lcom/join/mgps/service/CommonService;->X(Ljava/lang/String;)Lcom/join/mgps/dto/FileInfo;

    move-result-object v0

    if-eqz v0, :cond_f

    const/4 v4, 0x2

    .line 58
    invoke-virtual {v0, v4}, Lcom/join/mgps/dto/FileInfo;->setFileType(I)V

    .line 59
    iget-object v4, v0, Lcom/join/mgps/dto/FileInfo;->pkg:Ljava/lang/String;

    invoke-virtual {v7, v4, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_9

    :catch_1
    move-exception v0

    goto :goto_8

    :catch_2
    move-exception v0

    const/4 v3, 0x1

    .line 60
    :goto_8
    :try_start_7
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    :cond_f
    :goto_9
    add-int/lit8 v9, v9, 0x1

    const-wide/16 v3, 0x2710

    const/4 v5, 0x0

    const/4 v6, 0x1

    goto/16 :goto_1

    .line 61
    :cond_10
    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 62
    iget-object v5, v1, Lcom/join/mgps/service/CommonService;->Q:Ljava/util/HashMap;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_11

    goto :goto_a

    .line 63
    :cond_11
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v5

    invoke-virtual {v5, v4}, Lp1/f;->H(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_12

    .line 64
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_12

    .line 65
    iget-object v5, v1, Lcom/join/mgps/service/CommonService;->Q:Ljava/util/HashMap;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    iget-object v5, v1, Lcom/join/mgps/service/CommonService;->P:Ljava/util/HashMap;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    or-int/lit8 v3, v3, 0x1

    goto :goto_a

    .line 67
    :cond_12
    iget-object v5, v1, Lcom/join/mgps/service/CommonService;->P:Ljava/util/HashMap;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_13

    goto :goto_a

    .line 68
    :cond_13
    iget-object v5, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v5}, Lcom/join/mgps/pref/PrefDef_;->isQuarkEnable()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v5

    invoke-virtual {v5}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_14

    .line 69
    iget-object v5, v1, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v5}, Lcom/join/mgps/pref/PrefDef_;->isQuarkEnable()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v5

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v5, v6}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 70
    :cond_14
    iget-object v5, v1, Lcom/join/mgps/service/CommonService;->R:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v6, Lcom/join/mgps/service/b;

    invoke-direct {v6, v1, v7, v4}, Lcom/join/mgps/service/b;-><init>(Lcom/join/mgps/service/CommonService;Ljava/util/LinkedHashMap;Ljava/lang/String;)V

    const-wide/16 v8, 0x0

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v5, v6, v8, v9, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    goto :goto_a

    :cond_15
    if-eqz v3, :cond_16

    .line 71
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/service/CommonService;->r1()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :cond_16
    const/4 v3, 0x0

    .line 72
    iput-boolean v3, v1, Lcom/join/mgps/service/CommonService;->N:Z

    .line 73
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 74
    iget-object v0, v1, Lcom/join/mgps/service/CommonService;->O:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_17

    .line 75
    iget-object v0, v1, Lcom/join/mgps/service/CommonService;->O:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :cond_17
    const-wide/16 v2, 0x2710

    .line 76
    :try_start_8
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    .line 77
    invoke-static {}, Lcom/MApplication;->g()I

    move-result v0

    if-lez v0, :cond_19

    iget-object v0, v1, Lcom/join/mgps/service/CommonService;->Q:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-lez v0, :cond_19

    .line 78
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/service/CommonService;->s1()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    goto :goto_b

    :catchall_0
    move-exception v0

    move-object v3, v0

    const/4 v4, 0x0

    goto :goto_c

    :catch_3
    move-exception v0

    .line 79
    :try_start_9
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    const/4 v3, 0x0

    .line 80
    iput-boolean v3, v1, Lcom/join/mgps/service/CommonService;->N:Z

    .line 81
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 82
    iget-object v0, v1, Lcom/join/mgps/service/CommonService;->O:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_18

    .line 83
    iget-object v0, v1, Lcom/join/mgps/service/CommonService;->O:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :cond_18
    const-wide/16 v2, 0x2710

    .line 84
    :try_start_a
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    .line 85
    invoke-static {}, Lcom/MApplication;->g()I

    move-result v0

    if-lez v0, :cond_19

    iget-object v0, v1, Lcom/join/mgps/service/CommonService;->Q:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-lez v0, :cond_19

    .line 86
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/service/CommonService;->s1()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4

    goto :goto_b

    :catch_4
    move-exception v0

    .line 87
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_19
    :goto_b
    return-void

    .line 88
    :goto_c
    iput-boolean v4, v1, Lcom/join/mgps/service/CommonService;->N:Z

    .line 89
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 90
    iget-object v0, v1, Lcom/join/mgps/service/CommonService;->O:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 91
    iget-object v0, v1, Lcom/join/mgps/service/CommonService;->O:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :cond_1a
    const-wide/16 v4, 0x2710

    .line 92
    :try_start_b
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V

    .line 93
    invoke-static {}, Lcom/MApplication;->g()I

    move-result v0

    if-lez v0, :cond_1b

    iget-object v0, v1, Lcom/join/mgps/service/CommonService;->Q:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-lez v0, :cond_1b

    .line 94
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/service/CommonService;->s1()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_5

    goto :goto_d

    :catch_5
    move-exception v0

    .line 95
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 96
    :cond_1b
    :goto_d
    goto :goto_f

    :goto_e
    throw v3

    :goto_f
    goto :goto_e
.end method

.method t(Ljava/lang/String;ZLjava/lang/String;)V
    .locals 8

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v6

    const/4 v0, 0x0

    if-eqz v6, :cond_0

    .line 3
    invoke-virtual {v6}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    .line 4
    :cond_0
    sget-object v1, Lcom/MApplication;->H:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/MApplication;->H:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v2, "android_id"

    invoke-static {v1, v2}, Landroid/provider/Settings$System;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 5
    :goto_0
    new-instance v7, Lcom/join/mgps/dto/RequestAppDetialArgs;

    invoke-direct {v7}, Lcom/join/mgps/dto/RequestAppDetialArgs;-><init>()V

    .line 6
    invoke-virtual {v7, v1}, Lcom/join/mgps/dto/RequestAppDetialArgs;->setDeviceid(Ljava/lang/String;)V

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/android/app/common/utils/n;->y()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/android/app/common/utils/n;->z()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Lcom/join/mgps/dto/RequestAppDetialArgs;->setVersion(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v7, p1}, Lcom/join/mgps/dto/RequestAppDetialArgs;->setGame_id(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v7, v0}, Lcom/join/mgps/dto/RequestAppDetialArgs;->setUid(I)V

    .line 10
    invoke-virtual {v6}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/join/mgps/dto/RequestAppDetialArgs;->setToken(Ljava/lang/String;)V

    .line 11
    new-instance v0, Lcom/join/mgps/service/CommonService$h;

    move-object v1, v0

    move-object v2, p0

    move v3, p2

    move-object v4, p3

    move-object v5, p1

    invoke-direct/range {v1 .. v6}, Lcom/join/mgps/service/CommonService$h;-><init>(Lcom/join/mgps/service/CommonService;ZLjava/lang/String;Ljava/lang/String;Lcom/wufan/user/service/protobuf/n0;)V

    invoke-static {v7, v0}, Lcom/join/mgps/rpc/n;->c(Lcom/join/mgps/dto/RequestAppDetialArgs;Lcom/join/android/app/common/http/b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    const-string p1, "\u83b7\u53d6\u6e38\u620f\u4fe1\u606f\u5931\u8d25"

    .line 13
    invoke-virtual {p0, p1}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const-string p1, "\u8bf7\u68c0\u67e5\u7f51\u7edc\u8fde\u63a5"

    .line 14
    invoke-virtual {p0, p1}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method t0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.action_local_battle_finish"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->apName()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/WifiUtils;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/WifiUtils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/WifiUtils;->getApSSID()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "papa_"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    invoke-static {p0}, Lcom/join/mgps/Util/WifiUtils;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/WifiUtils;

    move-result-object v1

    invoke-static {p0}, Lcom/join/mgps/Util/WifiUtils;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/WifiUtils;

    move-result-object v2

    const-string v3, "12345678"

    invoke-virtual {v2, v0, v3}, Lcom/join/mgps/Util/WifiUtils;->createAPInfo(Ljava/lang/String;Ljava/lang/String;)Landroid/net/wifi/WifiConfiguration;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/join/mgps/Util/WifiUtils;->createWiFiAP(Landroid/net/wifi/WifiConfiguration;Z)V

    .line 5
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isWifiConnectedBefore()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    invoke-static {p0}, Lcom/join/mgps/Util/WifiUtils;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/WifiUtils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/WifiUtils;->OpenWifi()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method t1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v0, ""

    .line 2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    invoke-virtual {v1, p1}, Lp1/f;->H(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 3
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 4
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 5
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    .line 6
    :cond_2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    const/4 p1, 0x0

    .line 7
    sget-object v1, Lcom/papa/sim/statistic/Event;->smallGameStartSDK:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    :goto_0
    move-object p1, v1

    goto :goto_1

    .line 8
    :cond_4
    sget-object v1, Lcom/papa/sim/statistic/Event;->smallRequestAdSDK:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_0

    .line 9
    :cond_5
    sget-object v1, Lcom/papa/sim/statistic/Event;->smallExpAdSDK:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_0

    .line 10
    :cond_6
    sget-object v1, Lcom/papa/sim/statistic/Event;->smallVideoDoneAdSDK:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    goto :goto_0

    :cond_7
    :goto_1
    if-nez p1, :cond_8

    return-void

    .line 11
    :cond_8
    iget-object p2, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {p2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object p2

    .line 12
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    invoke-virtual {v1, p1, v0, p3, p2}, Lcom/papa/sim/statistic/p;->q(Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :cond_9
    :goto_2
    return-void

    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_3
    return-void
.end method

.method u(Ljava/util/List;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 3
    new-instance v2, Lcom/join/mgps/dto/CheckGameVersionRequestArgs;

    invoke-direct {v2}, Lcom/join/mgps/dto/CheckGameVersionRequestArgs;-><init>()V

    .line 4
    invoke-virtual {v2, p1}, Lcom/join/mgps/dto/CheckGameVersionRequestArgs;->setGameList(Ljava/util/List;)V

    .line 5
    invoke-virtual {v1, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 6
    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->getArgs()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/CheckGameVersionRequestArgs;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/join/mgps/dto/CheckGameVersionRequestArgs;->setUid(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->getArgs()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/CheckGameVersionRequestArgs;

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/CheckGameVersionRequestArgs;->setToken(Ljava/lang/String;)V

    .line 8
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/join/mgps/rpc/impl/i;->y(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object p1

    if-eqz p1, :cond_37

    .line 9
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_37

    .line 10
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CheckGameVersionResponseData;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CheckGameVersionResponseData;->getGameList()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_37

    .line 11
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getFlag()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_37

    .line 12
    invoke-static {}, Lb2/q;->o()Lb2/q;

    move-result-object v0

    invoke-virtual {v0}, Lp1/b;->a()I

    .line 13
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/CheckGameVersionResponseData;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CheckGameVersionResponseData;->getGameList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_36

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CheckGameVersionResponseData$VersionInfo;

    .line 14
    new-instance v2, Lcom/join/mgps/db/tables/EMUUpdateTable;

    invoke-direct {v2, v0}, Lcom/join/mgps/db/tables/EMUUpdateTable;-><init>(Lcom/join/mgps/dto/CheckGameVersionResponseData$VersionInfo;)V

    .line 15
    invoke-static {}, Lb2/q;->o()Lb2/q;

    move-result-object v4

    invoke-virtual {v4, v2}, Lp1/b;->k(Ljava/lang/Object;)I

    .line 16
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v2

    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    if-nez v2, :cond_1

    goto/16 :goto_12

    .line 17
    :cond_1
    invoke-static {v2}, Lcom/join/android/app/common/utils/APKUtils;->K(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v4

    .line 18
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getIs_network()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setIs_network(I)V

    .line 19
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getPlugin_screenshot()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setPlugin_screenshot(I)V

    .line 20
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getIs_fight()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setIs_fight(I)V

    .line 21
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getFight_type()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setFight_type(I)V

    .line 22
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getFight_funv2()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setFight_fun(Ljava/lang/String;)V

    .line 23
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getDown_count()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setDown_count(I)V

    .line 24
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getSp_tpl_two_position()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setSp_tpl_two_position(I)V

    .line 25
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getGift_package_switch()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setGift_package_switch(I)V

    .line 26
    invoke-virtual {v0}, Lcom/join/mgps/dto/CheckGameVersionResponseData$VersionInfo;->getAd_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_5

    .line 27
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getAd_info_str()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/dto/CheckGameVersionResponseData$VersionInfo;->getAd_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v5

    invoke-static {v5}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/join/mgps/Util/x0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getAd_info_str()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/join/mgps/Util/x0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    :cond_2
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getAd_info_str()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 28
    :cond_3
    invoke-virtual {v2, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setAd_info_switch(I)V

    .line 29
    :cond_4
    invoke-virtual {v0}, Lcom/join/mgps/dto/CheckGameVersionResponseData$VersionInfo;->getAd_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setAd_info(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    .line 30
    invoke-virtual {v0}, Lcom/join/mgps/dto/CheckGameVersionResponseData$VersionInfo;->getAd_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v5

    invoke-static {v5}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setAd_info_str(Ljava/lang/String;)V

    goto :goto_1

    .line 31
    :cond_5
    invoke-virtual {v2, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setAd_info_switch(I)V

    const/4 v5, 0x0

    .line 32
    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setAd_info(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    .line 33
    invoke-virtual {v2, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setAd_info_str(Ljava/lang/String;)V

    :goto_1
    if-eqz v4, :cond_7

    .line 34
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v5

    if-eqz v5, :cond_6

    .line 35
    invoke-virtual {v5}, Lcom/join/mgps/dto/TipNew;->getSingle_game_vm()Lcom/join/mgps/dto/TipBean;

    move-result-object v5

    if-eqz v5, :cond_6

    .line 36
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v7

    if-eqz v7, :cond_6

    .line 37
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v7

    invoke-virtual {v7, v5}, Lcom/join/mgps/dto/TipNew;->setSingle_game_vm(Lcom/join/mgps/dto/TipBean;)V

    .line 38
    :cond_6
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setSp_tag_info(Lcom/join/mgps/dto/TipNew;)V

    goto :goto_2

    .line 39
    :cond_7
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setSp_tag_info(Lcom/join/mgps/dto/TipNew;)V

    .line 40
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSingle_game_mod_info()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 41
    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->C2(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 42
    :cond_8
    :goto_2
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getAllow_start_up_ad()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setAllow_start_up_ad(Ljava/lang/String;)V

    .line 43
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getDown_status()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setDown_status(I)V

    .line 44
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getMax_an_compatible_ver()I

    move-result v5

    if-eqz v5, :cond_9

    .line 45
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getMax_an_compatible_ver()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setMax_an_compatible_ver(I)V

    .line 46
    :cond_9
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getMin_an_compatible_ver()I

    move-result v5

    if-eqz v5, :cond_a

    .line 47
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getMin_an_compatible_ver()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setMin_an_compatible_ver(I)V

    .line 48
    :cond_a
    :try_start_0
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 49
    sget-object v7, Lcom/join/mgps/enums/ConstantIntEnum;->MGAME:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v7}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v7

    if-ne v5, v7, :cond_19

    .line 50
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v5

    if-eqz v5, :cond_b

    const/4 v5, 0x1

    goto :goto_3

    :cond_b
    const/4 v5, 0x0

    :goto_3
    if-eqz v5, :cond_10

    .line 51
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v5

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v7

    const-class v8, Lcom/join/mgps/dto/ModInfoBean;

    invoke-virtual {v5, v7, v8}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/ModInfoBean;

    if-eqz v5, :cond_10

    .line 52
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_f

    .line 53
    invoke-virtual {v5}, Lcom/join/mgps/dto/ModInfoBean;->getDown_url()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setResource_url_remote(Ljava/lang/String;)V

    .line 54
    sget-object v5, Lcom/join/mgps/enums/Dtype;->MOD:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setFileType(Ljava/lang/String;)V

    .line 55
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    .line 56
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTipBeans()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_f

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/join/mgps/dto/TipBean;

    .line 57
    invoke-virtual {v7}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v10, Lcom/join/mgps/enums/ConstantIntEnum;->DATA:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v10}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    .line 58
    sget-object v8, Lcom/join/mgps/enums/Dtype;->androiddata:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    goto :goto_4

    .line 59
    :cond_d
    invoke-virtual {v7}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v10, Lcom/join/mgps/enums/ConstantIntEnum;->OBB:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v10}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_e

    .line 60
    sget-object v8, Lcom/join/mgps/enums/Dtype;->androidobb:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    .line 61
    :cond_e
    :goto_4
    invoke-virtual {v7}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v9, Lcom/join/mgps/enums/ConstantIntEnum;->OBBDATA:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v9}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    .line 62
    sget-object v5, Lcom/join/mgps/enums/Dtype;->androidobbdata:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    .line 63
    :cond_f
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object v5

    if-eqz v5, :cond_10

    .line 64
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setTipBeans(Ljava/util/ArrayList;)V

    .line 65
    :cond_10
    invoke-static {v2}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v5

    if-eqz v5, :cond_14

    .line 66
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTipBeans()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_11
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_14

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/join/mgps/dto/TipBean;

    .line 67
    invoke-virtual {v7}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v10, Lcom/join/mgps/enums/ConstantIntEnum;->DATA:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v10}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_12

    .line 68
    sget-object v8, Lcom/join/mgps/enums/Dtype;->androiddata:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    goto :goto_5

    .line 69
    :cond_12
    invoke-virtual {v7}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v10, Lcom/join/mgps/enums/ConstantIntEnum;->OBB:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v10}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_13

    .line 70
    sget-object v8, Lcom/join/mgps/enums/Dtype;->androidobb:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    .line 71
    :cond_13
    :goto_5
    invoke-virtual {v7}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v9, Lcom/join/mgps/enums/ConstantIntEnum;->OBBDATA:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v9}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_11

    .line 72
    sget-object v5, Lcom/join/mgps/enums/Dtype;->androidobbdata:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    :cond_14
    if-nez v6, :cond_19

    .line 73
    sget-object v5, Lcom/join/mgps/enums/Dtype;->android:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setFileType(Ljava/lang/String;)V

    .line 74
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    .line 75
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTipBeans()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_15
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_18

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/TipBean;

    .line 76
    invoke-virtual {v6}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v9, Lcom/join/mgps/enums/ConstantIntEnum;->DATA:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v9}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_16

    .line 77
    sget-object v7, Lcom/join/mgps/enums/Dtype;->androiddata:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    goto :goto_6

    .line 78
    :cond_16
    invoke-virtual {v6}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v9, Lcom/join/mgps/enums/ConstantIntEnum;->OBB:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v9}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_17

    .line 79
    sget-object v7, Lcom/join/mgps/enums/Dtype;->androidobb:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    .line 80
    :cond_17
    :goto_6
    invoke-virtual {v6}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v8, Lcom/join/mgps/enums/ConstantIntEnum;->OBBDATA:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v8}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_15

    .line 81
    sget-object v5, Lcom/join/mgps/enums/Dtype;->androidobbdata:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    .line 82
    :cond_18
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object v5

    if-eqz v5, :cond_19

    .line 83
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setTipBeans(Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_7

    :catch_0
    move-exception v5

    .line 84
    invoke-virtual {v5}, Ljava/lang/Exception;->printStackTrace()V

    .line 85
    :cond_19
    :goto_7
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getLock_sp()I

    move-result v5

    if-ne v5, v1, :cond_1b

    .line 86
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getLock_sp()I

    move-result v5

    if-eq v5, v1, :cond_1c

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getLock_sp()I

    move-result v5

    const/4 v6, 0x2

    if-ne v5, v6, :cond_1a

    goto :goto_8

    .line 87
    :cond_1a
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getLock_sp()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setLock_sp(I)V

    goto :goto_8

    .line 88
    :cond_1b
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getLock_sp()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setLock_sp(I)V

    .line 89
    :cond_1c
    :goto_8
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getSync_memory()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setSync_memory(Ljava/lang/String;)V

    .line 90
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/join/mgps/enums/Dtype;->chajian:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1d

    goto/16 :goto_0

    .line 91
    :cond_1d
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/join/mgps/enums/Dtype;->android:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/16 v7, 0xb

    const/4 v8, 0x5

    const/16 v9, 0x9

    if-eqz v5, :cond_2e

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v5

    const/16 v10, 0x2a

    if-eq v5, v8, :cond_1e

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v5

    if-eq v5, v9, :cond_1e

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v5

    if-ne v5, v10, :cond_2e

    .line 92
    :cond_1e
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getDown_url_remote()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setUrl(Ljava/lang/String;)V

    .line 93
    invoke-virtual {v0}, Lcom/join/mgps/dto/CheckGameVersionResponseData$VersionInfo;->getResource_url_remote()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setResource_url_remote(Ljava/lang/String;)V

    .line 94
    invoke-virtual {v0}, Lcom/join/mgps/dto/CheckGameVersionResponseData$VersionInfo;->getResource_size()J

    move-result-wide v11

    invoke-virtual {v2, v11, v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRes_actual_size(J)V

    .line 95
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v5

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v11

    sget-object v12, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;->ALL:Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;

    invoke-virtual {v5, p0, v11, v12}, Lcom/join/android/app/common/utils/APKUtils;->e(Landroid/content/Context;Ljava/lang/String;Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    .line 96
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_21

    .line 97
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v5

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, p0, v7, v12}, Lcom/join/android/app/common/utils/APKUtils;->m(Landroid/content/Context;Ljava/lang/String;Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v5

    .line 98
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getVer()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_20

    invoke-virtual {v5}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v5

    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getVer()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    if-ge v5, v7, :cond_20

    .line 99
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getMod_info()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_22

    .line 100
    invoke-virtual {v0}, Lcom/join/mgps/dto/CheckGameVersionResponseData$VersionInfo;->getGame_upgrade_state()I

    move-result v5

    if-ne v5, v1, :cond_1f

    .line 101
    invoke-virtual {v2, v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto :goto_9

    .line 102
    :cond_1f
    invoke-virtual {v2, v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto :goto_9

    .line 103
    :cond_20
    invoke-virtual {v2, v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto :goto_9

    .line 104
    :cond_21
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2d

    new-instance v5, Ljava/io/File;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v5, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_2d

    .line 105
    invoke-virtual {v2, v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 106
    :cond_22
    :goto_9
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v5

    if-eqz v5, :cond_25

    .line 107
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getModInfoBean()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v5

    if-eqz v5, :cond_24

    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/ModInfoBean;->getVer()I

    move-result v5

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getModInfoBean()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v7

    invoke-virtual {v7}, Lcom/join/mgps/dto/ModInfoBean;->getVer()I

    move-result v7

    if-le v5, v7, :cond_24

    .line 108
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/ModInfoBean;->getDown_url()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_23

    .line 109
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v5

    invoke-virtual {v5, v9}, Lcom/join/mgps/dto/ModInfoBean;->setStatus(I)V

    goto :goto_a

    .line 110
    :cond_23
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CheckGameVersionResponseData$VersionInfo;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ", mod url is null"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    :cond_24
    :goto_a
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v5

    invoke-static {v5}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setMod_info(Ljava/lang/String;)V

    .line 112
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v5

    invoke-virtual {v5, v2}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    .line 113
    :cond_25
    invoke-static {v2}, Lcom/join/android/app/common/utils/APKUtils;->G(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v5

    if-eqz v5, :cond_26

    .line 114
    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->y3(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_b

    .line 115
    :cond_26
    invoke-virtual {v2, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setMod_info(Ljava/lang/String;)V

    .line 116
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v5

    invoke-virtual {v5, v2}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    :goto_b
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getSingle_game_mod_info()Lcom/join/mgps/dto/SingleGameModInfoBean;

    move-result-object v5

    if-eqz v5, :cond_2b

    .line 118
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSingleGameModInfoBean()Lcom/join/mgps/dto/SingleGameModInfoBean;

    move-result-object v4

    if-eqz v4, :cond_28

    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getSingle_game_mod_info()Lcom/join/mgps/dto/SingleGameModInfoBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/SingleGameModInfoBean;->getVersion()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSingleGameModInfoBean()Lcom/join/mgps/dto/SingleGameModInfoBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/SingleGameModInfoBean;->getVersion()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-le v4, v5, :cond_28

    .line 119
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getSingle_game_mod_info()Lcom/join/mgps/dto/SingleGameModInfoBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/SingleGameModInfoBean;->getDownUrl()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_27

    .line 120
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getSingle_game_mod_info()Lcom/join/mgps/dto/SingleGameModInfoBean;

    move-result-object v4

    invoke-virtual {v4, v9}, Lcom/join/mgps/dto/SingleGameModInfoBean;->setStatus(I)V

    goto :goto_c

    .line 121
    :cond_27
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CheckGameVersionResponseData$VersionInfo;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", single mod url is null"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    :cond_28
    :goto_c
    invoke-static {v2}, Lcom/join/android/app/common/utils/APKUtils;->K(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v4

    if-eqz v4, :cond_29

    .line 123
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getSingle_game_mod_info()Lcom/join/mgps/dto/SingleGameModInfoBean;

    move-result-object v4

    if-eqz v4, :cond_2a

    .line 124
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getSingle_game_mod_info()Lcom/join/mgps/dto/SingleGameModInfoBean;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setSingle_game_mod_info(Ljava/lang/String;)V

    goto :goto_d

    .line 125
    :cond_29
    invoke-virtual {v2, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setSingle_game_mod_info(Ljava/lang/String;)V

    .line 126
    :cond_2a
    :goto_d
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0, v2}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_f

    :cond_2b
    if-eqz v4, :cond_2c

    .line 127
    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->y3(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_e

    .line 128
    :cond_2c
    invoke-virtual {v2, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setSingle_game_mod_info(Ljava/lang/String;)V

    .line 129
    :goto_e
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0, v2}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    :goto_f
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v0

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/join/android/app/common/servcie/i;->f(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_31

    .line 131
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto :goto_11

    .line 132
    :cond_2d
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lp1/f;->n(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 133
    :cond_2e
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0, v2}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-ne v0, v7, :cond_30

    .line 135
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2f

    new-instance v0, Ljava/io/File;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2f

    goto :goto_10

    .line 136
    :cond_2f
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lp1/f;->n(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 137
    :cond_30
    :goto_10
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v0

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/join/android/app/common/servcie/i;->f(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_31

    .line 138
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 139
    :cond_31
    :goto_11
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_32

    invoke-static {v2}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-nez v0, :cond_32

    invoke-static {v2}, Lcom/join/android/app/common/utils/APKUtils;->G(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_33

    :cond_32
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-ne v0, v8, :cond_33

    .line 140
    invoke-static {v2}, Lcom/join/android/app/common/utils/APKUtils;->j(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 141
    :cond_33
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-ne v0, v9, :cond_0

    .line 142
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_34

    .line 143
    new-instance v0, Ljava/io/File;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 144
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_34

    .line 145
    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    .line 146
    :cond_34
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_35

    .line 147
    new-instance v0, Ljava/io/File;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 148
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_35

    .line 149
    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    .line 150
    :cond_35
    invoke-virtual {v2, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setGameZipPath(Ljava/lang/String;)V

    .line 151
    invoke-virtual {v2, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setPath(Ljava/lang/String;)V

    .line 152
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0, v2}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 153
    :cond_36
    :goto_12
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->d()V

    :cond_37
    return-void
.end method

.method u0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.netbattlematchefficiency"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Service;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    invoke-virtual {p1, p2, p3, p4}, Lcom/papa/sim/statistic/p;->A1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method u1(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "sendBattleScoreToEmu"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    aput-object p2, v0, v1

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 2
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.emu.battle.score"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "roomId"

    .line 3
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "battleScore"

    .line 4
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0, v0}, Landroid/app/Service;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method v(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 14
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, "\u94dc\u677f\u652f\u4ed8\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5"

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_c

    const/4 v1, 0x0

    const/high16 v2, 0x10000000

    .line 2
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 3
    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 4
    :goto_0
    invoke-static {p0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v5

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v3, v4, v7}, Lcom/join/mgps/Util/RequestBeanUtil;->getDownDeductCoin(Ljava/lang/String;Ljava/lang/String;ILcom/join/mgps/dto/ExtBean;)Lcom/join/mgps/dto/RecomRequestBean;

    move-result-object v3

    .line 5
    invoke-static {}, Lcom/join/mgps/rpc/impl/d;->P1()Lcom/join/mgps/rpc/impl/d;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/join/mgps/rpc/impl/d;->t1(Lcom/join/mgps/dto/RecomRequestBean;)Lcom/join/mgps/dto/ResultMainBean;

    move-result-object v3

    if-eqz v3, :cond_b

    .line 6
    invoke-virtual {v3}, Lcom/join/mgps/dto/ResultMainBean;->getFlag()I

    move-result v5

    if-eqz v5, :cond_b

    .line 7
    invoke-virtual {v3}, Lcom/join/mgps/dto/ResultMainBean;->getMessages()Lcom/join/mgps/dto/ResultMessageBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/ResultMessageBean;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/DownDeductCoinResponse;

    if-eqz v3, :cond_d

    .line 8
    invoke-virtual {v3}, Lcom/join/mgps/dto/DownDeductCoinResponse;->getKey()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_d

    .line 9
    invoke-static {v5}, Lcom/join/mgps/Util/AESUtils;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "\\|"

    .line 10
    invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 11
    array-length v6, v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v7, ""

    if-lez v6, :cond_1

    .line 12
    :try_start_1
    aget-object v6, v5, v1

    goto :goto_1

    :cond_1
    move-object v6, v7

    .line 13
    :goto_1
    array-length v8, v5

    const/4 v9, 0x1

    if-le v8, v9, :cond_2

    .line 14
    aget-object v8, v5, v9

    goto :goto_2

    :cond_2
    move-object v8, v7

    .line 15
    :goto_2
    array-length v10, v5

    const/4 v11, 0x2

    if-le v10, v11, :cond_3

    .line 16
    aget-object v10, v5, v11

    goto :goto_3

    :cond_3
    move-object v10, v7

    .line 17
    :goto_3
    array-length v12, v5

    const/4 v13, 0x3

    if-le v12, v13, :cond_4

    .line 18
    aget-object v5, v5, v13

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    goto :goto_4

    :cond_4
    const/4 v5, 0x0

    .line 19
    :goto_4
    invoke-static {v8}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_a

    invoke-virtual {v3}, Lcom/join/mgps/dto/DownDeductCoinResponse;->getNum()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-static {v6}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_a

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v4, :cond_a

    if-eqz v5, :cond_9

    const-string v4, "\u3011</strong>\u82b1\u8d39<font color=#FFDD1C>"

    const-string v6, "\u6b63\u5728\u4e0b\u8f7d<strong>\u3010"

    const-string v7, "</font>"

    if-eq v5, v9, :cond_8

    if-eq v5, v11, :cond_7

    if-eq v5, v13, :cond_6

    const/4 v3, 0x6

    if-eq v5, v3, :cond_5

    goto/16 :goto_5

    .line 20
    :cond_5
    :try_start_2
    iget-object v3, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v3}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;->n0(Landroid/content/Context;)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object v3

    invoke-virtual {v3, v2}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/TipNew;->getCoin()Lcom/join/mgps/dto/TipBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/TipBean;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;->b(Ljava/lang/String;)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;->c(I)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object v3

    invoke-virtual {v3}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 21
    iget-object v3, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {p1, v3}, Lcom/php25/PDownload/d;->e(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_5

    .line 22
    :cond_6
    iget-object v4, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v4}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;->n0(Landroid/content/Context;)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object v4

    invoke-virtual {v4, v2}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "\u9700\u8981<font color=#F47500>"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/TipNew;->getCoin()Lcom/join/mgps/dto/TipBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/TipBean;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;->b(Ljava/lang/String;)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object p1

    invoke-virtual {p1, v5}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;->c(I)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object p1

    invoke-virtual {v3}, Lcom/join/mgps/dto/DownDeductCoinResponse;->getBalance()I

    move-result v3

    invoke-virtual {p1, v3}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;->a(I)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_5

    .line 23
    :cond_7
    iget-object v3, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {p1, v3}, Lcom/php25/PDownload/d;->e(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_5

    .line 24
    :cond_8
    iget-object v3, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v3}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;->n0(Landroid/content/Context;)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object v3

    invoke-virtual {v3, v2}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/TipNew;->getCoin()Lcom/join/mgps/dto/TipBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/TipBean;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;->b(Ljava/lang/String;)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;->c(I)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object v3

    invoke-virtual {v3}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 25
    iget-object v3, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {p1, v3}, Lcom/php25/PDownload/d;->e(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_5

    .line 26
    :cond_9
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;->n0(Landroid/content/Context;)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object p1

    invoke-virtual {p1, v2}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;->b(Ljava/lang/String;)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object p1

    invoke-virtual {p1, v5}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;->c(I)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_5

    .line 27
    :cond_a
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;->n0(Landroid/content/Context;)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;->b(Ljava/lang/String;)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object p1

    invoke-virtual {p1, v2}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;->c(I)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_5

    .line 28
    :cond_b
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;->n0(Landroid/content/Context;)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;->b(Ljava/lang/String;)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object p1

    invoke-virtual {p1, v2}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;->c(I)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_5

    :catch_0
    move-exception p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 30
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_;->n0(Landroid/content/Context;)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;->b(Ljava/lang/String;)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object p1

    invoke-virtual {p1, v2}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;->c(I)Lcom/join/mgps/activity/NoticeTopAnimActivityDialog_$f;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_5

    :cond_c
    const-string p1, "\u8bf7\u68c0\u67e5\u7f51\u7edc\u8fde\u63a5"

    .line 31
    invoke-virtual {p0, p1}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    :cond_d
    :goto_5
    return-void
.end method

.method v1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "sendBattleScoreToSvr"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    aput-object p4, v0, v1

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/service/CommonService;->w:Z

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->r()V

    return-void

    .line 4
    :cond_0
    :try_start_0
    new-instance v0, Lapp/mgsim/arena/ArenaRequest;

    const-string v1, "cmd_send_score_board"

    invoke-direct {v0, v1}, Lapp/mgsim/arena/ArenaRequest;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 5
    :try_start_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    iput-wide v1, v0, Lapp/mgsim/arena/ArenaRequest;->gameId:J

    .line 6
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, v0, Lapp/mgsim/arena/ArenaRequest;->roomId:I

    .line 7
    :cond_2
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, v0, Lapp/mgsim/arena/ArenaRequest;->uid:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 8
    :catch_0
    :cond_3
    :try_start_2
    iput-object p4, v0, Lapp/mgsim/arena/ArenaRequest;->battleScoreBoard:Ljava/lang/String;

    .line 9
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->v:Lcom/join/mgps/socket/fight/arena/b;

    invoke-virtual {p1, v0}, Lcom/join/mgps/socket/fight/arena/b;->f(Lapp/mgsim/arena/ArenaRequest;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method x()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    return-void
.end method

.method x0(Landroid/content/Intent;)V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "android.net.wifi.WIFI_STATE_CHANGED",
            "android.net.wifi.STATE_CHANGE",
            "android.net.conn.CONNECTIVITY_CHANGE",
            "android.net.wifi.SCAN_RESULTS"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 2
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    const-string v4, "android.net.wifi.STATE_CHANGE"

    if-nez v2, :cond_0

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u7f51\u7edc\u72b6\u6001\uff1a"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 5
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/android/app/common/utils/j;->k(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 6
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->isFightActivity()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v2

    invoke-virtual {v2}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_1

    .line 7
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->isWifiConnectedBefore()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v2

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2, v5}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 8
    :cond_1
    iput-boolean v3, p0, Lcom/join/mgps/service/CommonService;->B:Z

    goto :goto_0

    .line 9
    :cond_2
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->isFightActivity()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v2

    invoke-virtual {v2}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_3

    .line 10
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->isWifiConnectedBefore()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v2

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, v5}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    :cond_3
    const/4 v2, 0x0

    .line 11
    iput-boolean v2, p0, Lcom/join/mgps/service/CommonService;->B:Z

    .line 12
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "wifi\u72b6\u6001\uff1a"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v5}, Lcom/join/android/app/common/utils/j;->k(Landroid/content/Context;)Z

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u79fb\u52a8\u7f51\u7edc\u72b6\u6001\uff1a"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v5}, Lcom/join/android/app/common/utils/j;->i(Landroid/content/Context;)Z

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u7f51\u7edc\u8fde\u63a5\u7c7b\u578b\uff1a"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/join/mgps/service/CommonService;->n:Landroid/content/Context;

    invoke-static {v5}, Lcom/join/android/app/common/utils/j;->c(Landroid/content/Context;)I

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "getEMUVersion"

    const-string v5, "net connect"

    .line 15
    invoke-static {v2, v5}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v1, :cond_4

    .line 16
    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->plugHasUpdate()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v2

    invoke-virtual {v2}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_4

    .line 17
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->V()V

    :cond_4
    if-eqz v1, :cond_5

    const-string v1, "onConnectivityChanged"

    .line 18
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 19
    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/wufan/friend/chat/c;->K()V

    :cond_5
    const-string v1, "android.net.wifi.SCAN_RESULTS"

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 21
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p1}, Lcom/join/mgps/pref/PrefDef_;->isFightActivity()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_9

    .line 22
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p1}, Lcom/join/mgps/pref/PrefDef_;->isWifiConnectedBefore()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_6
    const-string v1, "android.net.wifi.WIFI_STATE_CHANGED"

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "android.net.wifi.WIFI_STATE_CHANGED | "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "wifi_state"

    const/4 v2, -0x1

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " | "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "previous_wifi_state"

    invoke-virtual {p1, v4, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isFightActivity()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_9

    .line 26
    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    if-ne p1, v3, :cond_9

    .line 27
    :cond_7
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p1}, Lcom/join/mgps/pref/PrefDef_;->isWifiConnectedBefore()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_1

    .line 28
    :cond_8
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 29
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p1}, Lcom/join/mgps/pref/PrefDef_;->isFightActivity()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_9

    .line 30
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p1}, Lcom/join/mgps/pref/PrefDef_;->isWifiConnectedBefore()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    :cond_9
    :goto_1
    return-void
.end method

.method y(Ljava/lang/String;)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    return-void
.end method

.method public y0(ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/papa/controller/core/ControllerManager$c;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/service/CommonService;->C0(ILjava/util/List;)V

    return-void
.end method

.method z(Ljava/lang/String;Z)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .param p2    # Z
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.emu.show.hide"
        }
    .end annotation

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    .line 1
    sget-object p2, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {p2, p1}, Lcom/MApplication;->onActivityStarted(Landroid/app/Activity;)V

    goto :goto_0

    .line 2
    :cond_0
    sget-object p2, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {p2, p1}, Lcom/MApplication;->onActivityStopped(Landroid/app/Activity;)V

    :goto_0
    return-void
.end method

.method z0(Lcom/join/mgps/dto/DownloadScanEvent;)V
    .locals 3

    if-eqz p1, :cond_3

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadScanEvent;->getPkg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->Q:Ljava/util/HashMap;

    monitor-enter v0

    .line 3
    :try_start_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadScanEvent;->getStatus()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 4
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->Q:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadScanEvent;->getPkg()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object p1, p0, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p1}, Lcom/join/mgps/pref/PrefDef_;->quarkGameDownload()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object p1

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/service/CommonService;->Q:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->r1()V

    .line 7
    monitor-exit v0

    return-void

    .line 8
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->O:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 9
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->O:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 10
    :cond_2
    iget-object v1, p0, Lcom/join/mgps/service/CommonService;->Q:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadScanEvent;->getPkg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->r1()V

    .line 12
    invoke-virtual {p0}, Lcom/join/mgps/service/CommonService;->s1()V

    .line 13
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_3
    :goto_0
    return-void
.end method

.method z1()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->e:Landroid/content/Intent;

    const-string v1, "type"

    const-string v2, "1"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->e:Landroid/content/Intent;

    const-string v1, "msg"

    const-string v2, "\u767b\u5f55\u6210\u529f"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 3
    iget-object v0, p0, Lcom/join/mgps/service/CommonService;->e:Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/app/Service;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
