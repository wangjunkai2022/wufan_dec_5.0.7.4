.class public Lcom/xinzhu/overmind/server/i;
.super Ljava/lang/Object;
.source "ServiceManager.java"


# static fields
.field private static b:Lcom/xinzhu/overmind/server/i; = null

.field public static final c:Ljava/lang/String; = "activity_manager"

.field public static final d:Ljava/lang/String; = "job_manager"

.field public static final e:Ljava/lang/String; = "notification_manager"

.field public static final f:Ljava/lang/String; = "package_manager"

.field public static final g:Ljava/lang/String; = "storage_manager"

.field public static final h:Ljava/lang/String; = "user_manager"

.field public static final i:Ljava/lang/String; = "file_share"

.field public static final j:Ljava/lang/String; = "Xposed_manager"

.field public static final k:Ljava/lang/String; = "v_service"

.field public static final l:Ljava/lang/String; = "account_manager"

.field public static final m:Ljava/lang/String; = "device_manager"

.field public static final n:Ljava/lang/String; = "content_manager"

.field public static final o:Ljava/lang/String; = "widget_manager"


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/os/IBinder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/xinzhu/overmind/server/i;->a:Ljava/util/Map;

    .line 3
    invoke-static {}, Lcom/xinzhu/overmind/server/am/f;->get()Lcom/xinzhu/overmind/server/am/f;

    move-result-object v1

    const-string v2, "activity_manager"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v0, p0, Lcom/xinzhu/overmind/server/i;->a:Ljava/util/Map;

    invoke-static {}, Lcom/xinzhu/overmind/server/am/g;->get()Lcom/xinzhu/overmind/server/am/g;

    move-result-object v1

    const-string v2, "job_manager"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object v0, p0, Lcom/xinzhu/overmind/server/i;->a:Ljava/util/Map;

    invoke-static {}, Lcom/xinzhu/overmind/server/pm/i;->get()Lcom/xinzhu/overmind/server/pm/i;

    move-result-object v1

    const-string v2, "package_manager"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iget-object v0, p0, Lcom/xinzhu/overmind/server/i;->a:Ljava/util/Map;

    invoke-static {}, Lcom/xinzhu/overmind/server/os/h;->get()Lcom/xinzhu/overmind/server/os/h;

    move-result-object v1

    const-string v2, "storage_manager"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    iget-object v0, p0, Lcom/xinzhu/overmind/server/i;->a:Ljava/util/Map;

    invoke-static {}, Lcom/xinzhu/overmind/server/user/c;->get()Lcom/xinzhu/overmind/server/user/c;

    move-result-object v1

    const-string v2, "user_manager"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    iget-object v0, p0, Lcom/xinzhu/overmind/server/i;->a:Ljava/util/Map;

    invoke-static {}, Lcom/xinzhu/overmind/server/os/g;->get()Lcom/xinzhu/overmind/server/os/g;

    move-result-object v1

    const-string v2, "notification_manager"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    iget-object v0, p0, Lcom/xinzhu/overmind/server/i;->a:Ljava/util/Map;

    invoke-static {}, Lcom/xinzhu/overmind/server/os/f;->get()Lcom/xinzhu/overmind/server/os/f;

    move-result-object v1

    const-string v2, "file_share"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    iget-object v0, p0, Lcom/xinzhu/overmind/server/i;->a:Ljava/util/Map;

    invoke-static {}, Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService;->get()Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService;

    move-result-object v1

    const-string v2, "account_manager"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    iget-object v0, p0, Lcom/xinzhu/overmind/server/i;->a:Ljava/util/Map;

    invoke-static {}, Lcom/xinzhu/overmind/server/os/e;->get()Lcom/xinzhu/overmind/server/os/e;

    move-result-object v1

    const-string v2, "device_manager"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    iget-object v0, p0, Lcom/xinzhu/overmind/server/i;->a:Ljava/util/Map;

    invoke-static {}, Lcom/xinzhu/overmind/server/h;->get()Lcom/xinzhu/overmind/server/h;

    move-result-object v1

    const-string v2, "widget_manager"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    iget-object v0, p0, Lcom/xinzhu/overmind/server/i;->a:Ljava/util/Map;

    invoke-static {}, Lcom/xinzhu/overmind/server/content/b;->get()Lcom/xinzhu/overmind/server/content/b;

    move-result-object v1

    const-string v2, "content_manager"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static a()Lcom/xinzhu/overmind/server/i;
    .locals 2

    .line 1
    sget-object v0, Lcom/xinzhu/overmind/server/i;->b:Lcom/xinzhu/overmind/server/i;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/xinzhu/overmind/server/i;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/xinzhu/overmind/server/i;->b:Lcom/xinzhu/overmind/server/i;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/xinzhu/overmind/server/i;

    invoke-direct {v1}, Lcom/xinzhu/overmind/server/i;-><init>()V

    sput-object v1, Lcom/xinzhu/overmind/server/i;->b:Lcom/xinzhu/overmind/server/i;

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
    sget-object v0, Lcom/xinzhu/overmind/server/i;->b:Lcom/xinzhu/overmind/server/i;

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Landroid/os/IBinder;
    .locals 1

    .line 1
    invoke-static {}, Lcom/xinzhu/overmind/server/i;->a()Lcom/xinzhu/overmind/server/i;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/xinzhu/overmind/server/i;->c(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public c(Ljava/lang/String;)Landroid/os/IBinder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/i;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/IBinder;

    return-object p1
.end method
