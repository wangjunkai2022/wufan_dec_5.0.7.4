.class public Lcom/beizi/ad/lance/b;
.super Ljava/lang/Object;
.source "OnLineState.java"


# static fields
.field private static c:Lcom/beizi/ad/lance/b;


# instance fields
.field public a:Lcom/beizi/ad/lance/c;

.field private b:Ljava/lang/String;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "OnLineState"

    .line 2
    iput-object v0, p0, Lcom/beizi/ad/lance/b;->b:Ljava/lang/String;

    if-nez p1, :cond_0

    const-string p1, "OnLineState init failed,because context cann\'t be null "

    .line 3
    invoke-static {v0, p1}, Lcom/beizi/ad/lance/a/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    new-instance v0, Lcom/beizi/ad/lance/c;

    invoke-direct {v0}, Lcom/beizi/ad/lance/c;-><init>()V

    iput-object v0, p0, Lcom/beizi/ad/lance/b;->a:Lcom/beizi/ad/lance/c;

    .line 5
    invoke-virtual {v0, p1}, Lcom/beizi/ad/lance/c;->a(Landroid/content/Context;)V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/beizi/ad/lance/b;
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/ad/lance/b;->c:Lcom/beizi/ad/lance/b;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/beizi/ad/lance/b;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/beizi/ad/lance/b;->c:Lcom/beizi/ad/lance/b;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/beizi/ad/lance/b;

    invoke-direct {v1, p0}, Lcom/beizi/ad/lance/b;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/beizi/ad/lance/b;->c:Lcom/beizi/ad/lance/b;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 6
    :cond_1
    :goto_0
    sget-object p0, Lcom/beizi/ad/lance/b;->c:Lcom/beizi/ad/lance/b;

    return-object p0
.end method


# virtual methods
.method public a(Lcom/beizi/ad/lance/a;)V
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/beizi/ad/lance/b;->a:Lcom/beizi/ad/lance/c;

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {v0, p1}, Lcom/beizi/ad/lance/c;->a(Lcom/beizi/ad/lance/a;)V

    goto :goto_0

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/beizi/ad/lance/b;->b:Ljava/lang/String;

    const-string v0, "please init OnLineState first ,you can init it with \'OnLineState.init(context);\' in you BaseApplication "

    invoke-static {p1, v0}, Lcom/beizi/ad/lance/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
