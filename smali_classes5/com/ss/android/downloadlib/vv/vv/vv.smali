.class public Lcom/ss/android/downloadlib/vv/vv/vv;
.super Ljava/lang/Object;


# static fields
.field private static i:Ljava/lang/String; = ""

.field private static volatile n:Lcom/ss/android/downloadlib/vv/vv/vv; = null

.field private static o:Ljava/lang/String; = ""

.field private static u:Ljava/lang/String; = ""


# instance fields
.field private b:Landroid/content/Context;

.field private final jh:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Lcom/ss/android/downloadlib/vv/vv/m;",
            "Lcom/ss/android/downloadlib/vv/vv/i;",
            ">;>;"
        }
    .end annotation
.end field

.field private volatile k:Z

.field public final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final p:Ljava/lang/Object;

.field private qv:Z

.field private final r:Landroid/content/ServiceConnection;

.field private t:Ljava/lang/String;

.field public vv:Lcom/ss/android/downloadlib/vv/vv/p;

.field private wv:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->qv:Z

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->wv:Z

    .line 4
    iput-boolean v0, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->k:Z

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->jh:Ljava/util/List;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->m:Ljava/util/List;

    .line 7
    new-instance v0, Lcom/ss/android/downloadlib/vv/vv/vv$1;

    invoke-direct {v0, p0}, Lcom/ss/android/downloadlib/vv/vv/vv$1;-><init>(Lcom/ss/android/downloadlib/vv/vv/vv;)V

    iput-object v0, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->r:Landroid/content/ServiceConnection;

    const-string v0, ""

    .line 8
    iput-object v0, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->t:Ljava/lang/String;

    .line 9
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->p:Ljava/lang/Object;

    return-void
.end method

.method public static vv()Lcom/ss/android/downloadlib/vv/vv/vv;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/vv/vv/vv;->n:Lcom/ss/android/downloadlib/vv/vv/vv;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/downloadlib/vv/vv/vv;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/downloadlib/vv/vv/vv;->n:Lcom/ss/android/downloadlib/vv/vv/vv;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/ss/android/downloadlib/vv/vv/vv;

    invoke-direct {v1}, Lcom/ss/android/downloadlib/vv/vv/vv;-><init>()V

    sput-object v1, Lcom/ss/android/downloadlib/vv/vv/vv;->n:Lcom/ss/android/downloadlib/vv/vv/vv;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/ss/android/downloadlib/vv/vv/vv;->n:Lcom/ss/android/downloadlib/vv/vv/vv;

    return-object v0
.end method


# virtual methods
.method public i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->k:Z

    return v0
.end method

.method public m()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->vv:Lcom/ss/android/downloadlib/vv/vv/p;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->r:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->vv:Lcom/ss/android/downloadlib/vv/vv/p;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 5
    iget-object v0, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->jh:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public p()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->jh:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    .line 2
    :try_start_0
    iget-object v2, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->vv:Lcom/ss/android/downloadlib/vv/vv/p;

    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Lcom/ss/android/downloadlib/vv/vv/m;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Lcom/ss/android/downloadlib/vv/vv/i;

    invoke-interface {v2, v3, v1}, Lcom/ss/android/downloadlib/vv/vv/p;->vv(Lcom/ss/android/downloadlib/vv/vv/m;Lcom/ss/android/downloadlib/vv/vv/i;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 3
    invoke-virtual {v1}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->jh:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public vv(Landroid/content/Context;)Landroid/content/Intent;
    .locals 5

    .line 21
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 22
    sget-object v1, Lcom/ss/android/downloadlib/vv/vv/vv;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 24
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_0

    goto :goto_0

    .line 25
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/ResolveInfo;

    .line 26
    iget-object v2, v2, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v3, v2, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 27
    iget-object v2, v2, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 28
    sget-object v4, Lcom/ss/android/downloadlib/vv/vv/vv;->o:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 29
    new-instance p1, Landroid/content/ComponentName;

    invoke-direct {p1, v3, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 31
    invoke-virtual {v1, p1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    :cond_2
    :goto_0
    return-object v1
.end method

.method public vv(Lcom/ss/android/downloadlib/vv/vv/m;Lcom/ss/android/downloadlib/vv/vv/i;)V
    .locals 3

    .line 32
    iget-object v0, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->p:Ljava/lang/Object;

    monitor-enter v0

    .line 33
    :try_start_0
    sget-object v1, Lcom/ss/android/downloadlib/vv/vv/vv;->u:Ljava/lang/String;

    iput-object v1, p1, Lcom/ss/android/downloadlib/vv/vv/m;->o:Ljava/lang/String;

    .line 34
    iget-object v1, p1, Lcom/ss/android/downloadlib/vv/vv/m;->u:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 35
    iget-object v1, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->t:Ljava/lang/String;

    iput-object v1, p1, Lcom/ss/android/downloadlib/vv/vv/m;->u:Ljava/lang/String;

    .line 36
    :cond_0
    iget-object v1, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->vv:Lcom/ss/android/downloadlib/vv/vv/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 37
    :try_start_1
    invoke-interface {v1, p1, p2}, Lcom/ss/android/downloadlib/vv/vv/p;->vv(Lcom/ss/android/downloadlib/vv/vv/m;Lcom/ss/android/downloadlib/vv/vv/i;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 38
    :try_start_2
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/vv/vv/vv;->i()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->b:Landroid/content/Context;

    iget-boolean v2, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->wv:Z

    invoke-virtual {p0, v1, v2}, Lcom/ss/android/downloadlib/vv/vv/vv;->vv(Landroid/content/Context;Z)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 40
    :cond_2
    iget-object v1, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->jh:Ljava/util/List;

    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    :cond_3
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public vv(Z)V
    .locals 0

    .line 42
    iput-boolean p1, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->k:Z

    return-void
.end method

.method public vv(Landroid/content/Context;Z)Z
    .locals 3

    .line 7
    sget-object v0, Lcom/ss/android/downloadlib/vv/vv/vv;->i:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->wv()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "s"

    .line 9
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "q"

    .line 10
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/ss/android/socialbase/appdownloader/u/p;->vv(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/ss/android/downloadlib/vv/vv/vv;->i:Ljava/lang/String;

    const-string v2, "u"

    .line 11
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/ss/android/socialbase/appdownloader/u/p;->vv(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/ss/android/downloadlib/vv/vv/vv;->o:Ljava/lang/String;

    const-string v2, "w"

    .line 12
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/appdownloader/u/p;->vv(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/downloadlib/vv/vv/vv;->u:Ljava/lang/String;

    .line 13
    :cond_0
    iput-boolean p2, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->wv:Z

    if-eqz p1, :cond_2

    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->b:Landroid/content/Context;

    .line 15
    sget-object p2, Lcom/ss/android/downloadlib/vv/vv/vv;->u:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 16
    iget-object p2, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->b:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p2

    sput-object p2, Lcom/ss/android/downloadlib/vv/vv/vv;->u:Ljava/lang/String;

    .line 17
    :cond_1
    iget-object p2, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->vv:Lcom/ss/android/downloadlib/vv/vv/p;

    if-nez p2, :cond_2

    .line 18
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/vv/vv/vv;->i()Z

    move-result p2

    if-nez p2, :cond_2

    .line 19
    invoke-virtual {p0, p1}, Lcom/ss/android/downloadlib/vv/vv/vv;->vv(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    .line 20
    iget-object p2, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->b:Landroid/content/Context;

    iget-object v0, p0, Lcom/ss/android/downloadlib/vv/vv/vv;->r:Landroid/content/ServiceConnection;

    const/16 v1, 0x21

    invoke-virtual {p2, p1, v0, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method
