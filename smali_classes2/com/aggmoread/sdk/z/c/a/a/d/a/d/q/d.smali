.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;",
            "Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static volatile b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;->a:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;->a:Ljava/util/Map;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;->e:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;

    new-instance v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/m;

    invoke-direct {v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/m;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;->f:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;

    new-instance v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/g;

    invoke-direct {v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/g;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;

    new-instance v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/l;

    invoke-direct {v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/l;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;->g:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;

    new-instance v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/k;

    invoke-direct {v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/k;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;->d:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;

    new-instance v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/i;

    invoke-direct {v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/i;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;->i:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;

    new-instance v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/h;

    invoke-direct {v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/h;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;

    new-instance v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/a;

    invoke-direct {v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/a;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;->h:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;

    new-instance v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/f;

    invoke-direct {v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/f;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private a(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/aggmoread/sdk/z/c/a/a/d/b/d;",
            "Lcom/aggmoread/sdk/z/c/a/a/d/b/e;",
            ")",
            "Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b<",
            "*>;"
        }
    .end annotation

    const-string v0, "2"

    iget-object v1, p2, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->U:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    iget-object v2, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->e:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    invoke-virtual {v2}, Lcom/aggmoread/sdk/z/c/a/a/c/i;->a()I

    move-result v2

    if-ne v2, v1, :cond_1

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$a;->a:[I

    iget-object v2, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->e:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;->a:Ljava/util/Map;

    sget-object p2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;->h:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;

    :goto_0
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_1
    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;->a:Ljava/util/Map;

    sget-object p2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;->i:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;

    goto :goto_0

    :pswitch_2
    iget-object p2, p2, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->S:Ljava/lang/Object;

    invoke-virtual {p2, v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "xxx"

    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "v1 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", v2 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->f:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->f:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;->a:Ljava/util/Map;

    sget-object p2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;->e:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;->a:Ljava/util/Map;

    sget-object p2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;->f:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;

    goto :goto_0

    :pswitch_3
    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;->a:Ljava/util/Map;

    sget-object p2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;->g:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;

    goto :goto_0

    :pswitch_4
    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;->a:Ljava/util/Map;

    sget-object p2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;->d:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;

    goto :goto_0

    :pswitch_5
    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;->a:Ljava/util/Map;

    sget-object p2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;

    goto :goto_0

    :pswitch_6
    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;->a:Ljava/util/Map;

    sget-object p2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;

    goto :goto_0

    :cond_1
    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->e:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/i;->a()I

    move-result p1

    sget-object p2, Lcom/aggmoread/sdk/z/c/a/a/c/i;->i:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    invoke-virtual {p2}, Lcom/aggmoread/sdk/z/c/a/a/c/i;->a()I

    move-result p2

    if-ne p1, p2, :cond_2

    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;->a:Ljava/util/Map;

    sget-object p2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;->h:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d$b;

    goto :goto_0

    :goto_1
    check-cast p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->a(Ljava/lang/String;)V

    :cond_2
    :goto_2
    const/4 p1, 0x0

    :goto_3
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static a()Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;
    .locals 2

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;

    if-nez v0, :cond_1

    const-class v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;

    if-nez v1, :cond_0

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;

    invoke-direct {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;-><init>()V

    sput-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;

    return-object v0
.end method


# virtual methods
.method public b(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Z
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/d;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const-string p1, "ADCBH"

    const-string p2, "\u4e0d\u652f\u6301\u7684\u7c7b\u578b!"

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method
