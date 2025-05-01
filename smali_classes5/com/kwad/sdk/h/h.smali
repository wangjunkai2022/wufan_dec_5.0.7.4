.class public final Lcom/kwad/sdk/h/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/h/h$a;
    }
.end annotation


# static fields
.field private static final aoT:F


# instance fields
.field private final Kc:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final aKu:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private aKv:Lcom/kwad/sdk/h/d;

.field private aKw:Lcom/kwad/sdk/h/g;

.field private aKx:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/h/i;",
            ">;"
        }
    .end annotation
.end field

.field private aKy:Lcom/kwad/sdk/h/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F

    move-result v0

    sput v0, Lcom/kwad/sdk/h/h;->aoT:F

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/kwad/sdk/h/h;->Kc:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/kwad/sdk/h/h;->aKu:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/h/h;-><init>()V

    return-void
.end method

.method public static JN()Lcom/kwad/sdk/h/h;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/h/h$a;->JV()Lcom/kwad/sdk/h/h;

    move-result-object v0

    return-object v0
.end method

.method private JU()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/h/h;->aKx:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/h/i;

    .line 3
    invoke-direct {p0, v1}, Lcom/kwad/sdk/h/h;->b(Lcom/kwad/sdk/h/i;)V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/kwad/sdk/h/h;->aKx:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/kwad/sdk/h/h;->aKx:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/kwad/sdk/h/h;)Lcom/kwad/sdk/h/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/h/h;->aKv:Lcom/kwad/sdk/h/d;

    return-object p0
.end method

.method private a(Lcom/kwad/sdk/h/d;Lcom/kwad/sdk/h/i;)Lcom/kwad/sdk/h/e;
    .locals 7

    .line 14
    iget-object p1, p1, Lcom/kwad/sdk/h/d;->aKh:Ljava/util/List;

    .line 15
    invoke-static {p1}, Lcom/kwad/sdk/h/j;->I(Ljava/util/List;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 16
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/h/e;

    .line 17
    iget-object v2, v0, Lcom/kwad/sdk/h/e;->aKj:Lcom/kwad/sdk/h/e$b;

    invoke-direct {p0, v2}, Lcom/kwad/sdk/h/h;->a(Lcom/kwad/sdk/h/e$b;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v0, Lcom/kwad/sdk/h/e;->aKk:Lcom/kwad/sdk/h/e$a;

    .line 18
    invoke-direct {p0, v2, p2}, Lcom/kwad/sdk/h/h;->a(Lcom/kwad/sdk/h/e$a;Lcom/kwad/sdk/h/i;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-wide v2, v0, Lcom/kwad/sdk/h/e;->apu:D

    const-wide/16 v4, 0x0

    cmpl-double v6, v2, v4

    if-lez v6, :cond_1

    sget v4, Lcom/kwad/sdk/h/h;->aoT:F

    float-to-double v4, v4

    cmpg-double v6, v4, v2

    if-gtz v6, :cond_1

    return-object v0

    :cond_2
    return-object v1
.end method

.method static synthetic a(Lcom/kwad/sdk/h/h;Lcom/kwad/sdk/h/d;Lcom/kwad/sdk/h/i;)Lcom/kwad/sdk/h/e;
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/h/h;->a(Lcom/kwad/sdk/h/d;Lcom/kwad/sdk/h/i;)Lcom/kwad/sdk/h/e;

    move-result-object p0

    return-object p0
.end method

.method private a(Lcom/kwad/sdk/h/i;)V
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/kwad/sdk/h/h;->aKx:Ljava/util/List;

    if-nez v0, :cond_0

    .line 12
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/h/h;->aKx:Ljava/util/List;

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/h/h;->aKx:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private a(Lcom/kwad/sdk/h/e$a;Lcom/kwad/sdk/h/i;)Z
    .locals 1

    .line 25
    iget-object v0, p2, Lcom/kwad/sdk/h/i;->aKC:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/kwad/sdk/h/h;->a(Lcom/kwad/sdk/h/e$a;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p2, Lcom/kwad/sdk/h/i;->aKD:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/kwad/sdk/h/h;->b(Lcom/kwad/sdk/h/e$a;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p2, Lcom/kwad/sdk/h/i;->aKE:Ljava/lang/String;

    .line 26
    invoke-static {p1, p2}, Lcom/kwad/sdk/h/h;->c(Lcom/kwad/sdk/h/e$a;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private static a(Lcom/kwad/sdk/h/e$a;Ljava/lang/String;)Z
    .locals 2

    .line 27
    iget-object p0, p0, Lcom/kwad/sdk/h/e$a;->aKl:Ljava/util/List;

    .line 28
    invoke-static {p0}, Lcom/kwad/sdk/h/j;->I(Ljava/util/List;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 29
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 30
    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private a(Lcom/kwad/sdk/h/e$b;)Z
    .locals 2

    .line 19
    iget v0, p1, Lcom/kwad/sdk/h/e$b;->aKr:I

    sget v1, Lcom/kwad/sdk/h/e$b;->aKo:I

    if-eq v0, v1, :cond_0

    .line 20
    invoke-virtual {p1}, Lcom/kwad/sdk/h/e$b;->JH()Z

    move-result p1

    return p1

    .line 21
    :cond_0
    invoke-direct {p0, p1}, Lcom/kwad/sdk/h/h;->b(Lcom/kwad/sdk/h/e$b;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lcom/kwad/sdk/h/h;->c(Lcom/kwad/sdk/h/e$b;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 22
    invoke-direct {p0, p1}, Lcom/kwad/sdk/h/h;->d(Lcom/kwad/sdk/h/e$b;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 23
    :goto_0
    invoke-virtual {p1, v0}, Lcom/kwad/sdk/h/e$b;->bD(Z)V

    .line 24
    invoke-virtual {p1}, Lcom/kwad/sdk/h/e$b;->JH()Z

    move-result p1

    return p1
.end method

.method private b(Lcom/kwad/sdk/h/i;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/h/h;->aKv:Lcom/kwad/sdk/h/d;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/kwad/sdk/h/d;->aKh:Ljava/util/List;

    invoke-static {v0}, Lcom/kwad/sdk/h/j;->I(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/kwad/sdk/h/h;->aKw:Lcom/kwad/sdk/h/g;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/kwad/sdk/h/h;->aKy:Lcom/kwad/sdk/h/f;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Lcom/kwad/sdk/h/h$1;

    invoke-direct {v0, p0, p1}, Lcom/kwad/sdk/h/h$1;-><init>(Lcom/kwad/sdk/h/h;Lcom/kwad/sdk/h/i;)V

    invoke-static {v0}, Lcom/kwad/sdk/h/j;->a(Lcom/kwad/sdk/h/n;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private static b(Lcom/kwad/sdk/h/e$a;Ljava/lang/String;)Z
    .locals 2

    .line 7
    iget-object p0, p0, Lcom/kwad/sdk/h/e$a;->aKm:Ljava/util/List;

    .line 8
    invoke-static {p0}, Lcom/kwad/sdk/h/j;->I(Ljava/util/List;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 10
    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private b(Lcom/kwad/sdk/h/e$b;)Z
    .locals 3

    .line 3
    iget-object p1, p1, Lcom/kwad/sdk/h/e$b;->aGm:Ljava/util/List;

    .line 4
    invoke-static {p1}, Lcom/kwad/sdk/h/j;->I(Ljava/util/List;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 5
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 6
    iget-object v2, p0, Lcom/kwad/sdk/h/h;->aKw:Lcom/kwad/sdk/h/g;

    invoke-virtual {v2}, Lcom/kwad/sdk/h/g;->getAppId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private static c(Lcom/kwad/sdk/h/e$a;Ljava/lang/String;)Z
    .locals 2

    .line 5
    iget-object p0, p0, Lcom/kwad/sdk/h/e$a;->aKn:Ljava/util/List;

    .line 6
    invoke-static {p0}, Lcom/kwad/sdk/h/j;->I(Ljava/util/List;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 7
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private c(Lcom/kwad/sdk/h/e$b;)Z
    .locals 3

    .line 1
    iget-object p1, p1, Lcom/kwad/sdk/h/e$b;->aGn:Ljava/util/List;

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/h/j;->I(Ljava/util/List;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 3
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 4
    iget-object v2, p0, Lcom/kwad/sdk/h/h;->aKw:Lcom/kwad/sdk/h/g;

    invoke-virtual {v2}, Lcom/kwad/sdk/h/g;->getSdkVersion()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private d(Lcom/kwad/sdk/h/e$b;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/h/h;->aKw:Lcom/kwad/sdk/h/g;

    invoke-virtual {v0}, Lcom/kwad/sdk/h/g;->getAndroidId()Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/kwad/sdk/h/h;->aKw:Lcom/kwad/sdk/h/g;

    invoke-virtual {v1}, Lcom/kwad/sdk/h/g;->getDeviceId()Ljava/lang/String;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/kwad/sdk/h/h;->aKw:Lcom/kwad/sdk/h/g;

    invoke-virtual {v2}, Lcom/kwad/sdk/h/g;->getImei()Ljava/lang/String;

    move-result-object v2

    .line 4
    iget-object v3, p0, Lcom/kwad/sdk/h/h;->aKw:Lcom/kwad/sdk/h/g;

    invoke-virtual {v3}, Lcom/kwad/sdk/h/g;->getOaid()Ljava/lang/String;

    move-result-object v3

    .line 5
    iget-object p1, p1, Lcom/kwad/sdk/h/e$b;->aKq:Ljava/util/List;

    .line 6
    invoke-static {p1}, Lcom/kwad/sdk/h/j;->I(Ljava/util/List;)Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    return v5

    .line 7
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 8
    invoke-static {v4, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_2

    return v5

    .line 9
    :cond_2
    invoke-static {v4, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_3

    return v5

    .line 10
    :cond_3
    invoke-static {v4, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_4

    return v5

    .line 11
    :cond_4
    invoke-static {v4, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    return v5

    :cond_5
    const/4 p1, 0x0

    return p1
.end method

.method private static gh(Ljava/lang/String;)Lcom/kwad/sdk/h/d;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 3
    new-instance p0, Lcom/kwad/sdk/h/d;

    invoke-direct {p0}, Lcom/kwad/sdk/h/d;-><init>()V

    .line 4
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/h/d;->parseJson(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    .line 5
    :catchall_0
    invoke-static {}, Lcom/kwad/sdk/h/j;->JX()V

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final JO()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/h/h;->Kc:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/sdk/h/h;->aKv:Lcom/kwad/sdk/h/d;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/kwad/sdk/h/j;->JY()V

    .line 3
    invoke-static {}, Lcom/kwad/sdk/h/m;->Ka()V

    :cond_0
    return-void
.end method

.method public final declared-synchronized JP()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/h/h;->aKu:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
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

.method public final declared-synchronized JQ()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/h/h;->aKu:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
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

.method public final JR()Lcom/kwad/sdk/h/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/h/h;->aKw:Lcom/kwad/sdk/h/g;

    return-object v0
.end method

.method public final JS()Lcom/kwad/sdk/h/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/h/h;->aKy:Lcom/kwad/sdk/h/f;

    return-object v0
.end method

.method public final JT()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/h/h;->aKv:Lcom/kwad/sdk/h/d;

    invoke-virtual {v0}, Lcom/kwad/sdk/h/d;->JG()J

    move-result-wide v0

    return-wide v0
.end method

.method public final a(Ljava/lang/String;Lcom/kwad/sdk/h/g;Lcom/kwad/sdk/h/f;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/h/h;->Kc:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 4
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/h/j;->JY()V

    .line 5
    iput-object p2, p0, Lcom/kwad/sdk/h/h;->aKw:Lcom/kwad/sdk/h/g;

    .line 6
    iput-object p3, p0, Lcom/kwad/sdk/h/h;->aKy:Lcom/kwad/sdk/h/f;

    .line 7
    invoke-static {p1}, Lcom/kwad/sdk/h/h;->gh(Ljava/lang/String;)Lcom/kwad/sdk/h/d;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/h/h;->aKv:Lcom/kwad/sdk/h/d;

    .line 8
    iget-object p1, p0, Lcom/kwad/sdk/h/h;->Kc:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 9
    invoke-direct {p0}, Lcom/kwad/sdk/h/h;->JU()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 10
    :catchall_0
    invoke-static {}, Lcom/kwad/sdk/h/j;->JX()V

    return-void
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/h/h;->aKu:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    invoke-static {}, Lcom/kwad/sdk/h/j;->JY()V

    return-void

    .line 4
    :cond_1
    invoke-static {}, Lcom/kwad/sdk/h/i;->JW()Lcom/kwad/sdk/h/i;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/kwad/sdk/h/i;->gi(Ljava/lang/String;)Lcom/kwad/sdk/h/i;

    move-result-object p1

    .line 6
    invoke-virtual {p1, p2}, Lcom/kwad/sdk/h/i;->gj(Ljava/lang/String;)Lcom/kwad/sdk/h/i;

    move-result-object p1

    .line 7
    invoke-virtual {p1, p3}, Lcom/kwad/sdk/h/i;->gk(Ljava/lang/String;)Lcom/kwad/sdk/h/i;

    move-result-object p1

    .line 8
    iget-object p2, p0, Lcom/kwad/sdk/h/h;->Kc:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 9
    invoke-direct {p0, p1}, Lcom/kwad/sdk/h/h;->b(Lcom/kwad/sdk/h/i;)V

    goto :goto_1

    .line 10
    :cond_2
    invoke-static {}, Lcom/kwad/sdk/h/j;->JY()V

    .line 11
    invoke-direct {p0, p1}, Lcom/kwad/sdk/h/h;->a(Lcom/kwad/sdk/h/i;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    :goto_0
    return-void

    .line 12
    :catchall_0
    invoke-static {}, Lcom/kwad/sdk/h/j;->JX()V

    :goto_1
    return-void
.end method
