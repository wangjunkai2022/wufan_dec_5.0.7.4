.class public Lcom/umeng/ccg/c;
.super Ljava/lang/Object;
.source "Dispatch.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/ccg/c$a;
    }
.end annotation


# static fields
.field public static final a:I = 0x65

.field public static final b:I = 0x66

.field public static final c:I = 0x67

.field public static final d:I = 0x68

.field public static final e:I = 0x69

.field public static final f:I = 0x6a

.field public static final g:I = 0x6b

.field public static final h:I = 0x0

.field public static final i:I = 0x1

.field public static final j:I = 0x2

.field public static final k:I = 0xc9

.field public static final l:I = 0xca

.field public static final m:I = 0xcb

.field public static final n:I = 0x12d

.field public static final o:I = 0x12e

.field public static final p:I = 0x12f

.field private static q:Landroid/os/HandlerThread; = null

.field private static r:Landroid/os/Handler; = null

.field private static s:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/umeng/ccg/c$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final t:I = 0x100


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static declared-synchronized a()V
    .locals 3

    const-class v0, Lcom/umeng/ccg/c;

    monitor-enter v0

    .line 17
    :try_start_0
    sget-object v1, Lcom/umeng/ccg/c;->q:Landroid/os/HandlerThread;

    if-nez v1, :cond_0

    .line 18
    new-instance v1, Landroid/os/HandlerThread;

    const-string v2, "ccg_dispatch"

    invoke-direct {v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    sput-object v1, Lcom/umeng/ccg/c;->q:Landroid/os/HandlerThread;

    .line 19
    invoke-virtual {v1}, Landroid/os/HandlerThread;->start()V

    .line 20
    sget-object v1, Lcom/umeng/ccg/c;->r:Landroid/os/Handler;

    if-nez v1, :cond_0

    .line 21
    new-instance v1, Lcom/umeng/ccg/c$1;

    sget-object v2, Lcom/umeng/ccg/c;->q:Landroid/os/HandlerThread;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/umeng/ccg/c$1;-><init>(Landroid/os/Looper;)V

    sput-object v1, Lcom/umeng/ccg/c;->r:Landroid/os/Handler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    :catchall_0
    :cond_0
    monitor-exit v0

    return-void
.end method

.method public static a(Landroid/content/Context;IILcom/umeng/ccg/c$a;Ljava/lang/Object;J)V
    .locals 1

    if-eqz p0, :cond_5

    if-nez p3, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    sget-object p0, Lcom/umeng/ccg/c;->s:Ljava/util/HashMap;

    if-nez p0, :cond_1

    .line 3
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    sput-object p0, Lcom/umeng/ccg/c;->s:Ljava/util/HashMap;

    .line 4
    :cond_1
    div-int/lit8 p0, p2, 0x64

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    .line 5
    sget-object v0, Lcom/umeng/ccg/c;->s:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 6
    sget-object v0, Lcom/umeng/ccg/c;->s:Ljava/util/HashMap;

    invoke-virtual {v0, p0, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    :cond_2
    sget-object p0, Lcom/umeng/ccg/c;->q:Landroid/os/HandlerThread;

    if-eqz p0, :cond_3

    sget-object p0, Lcom/umeng/ccg/c;->r:Landroid/os/Handler;

    if-nez p0, :cond_4

    .line 8
    :cond_3
    invoke-static {}, Lcom/umeng/ccg/c;->a()V

    .line 9
    :cond_4
    :try_start_0
    sget-object p0, Lcom/umeng/ccg/c;->r:Landroid/os/Handler;

    if-eqz p0, :cond_5

    .line 10
    invoke-virtual {p0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object p0

    .line 11
    iput p1, p0, Landroid/os/Message;->what:I

    .line 12
    iput p2, p0, Landroid/os/Message;->arg1:I

    .line 13
    iput-object p4, p0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 14
    sget-object p1, Lcom/umeng/ccg/c;->r:Landroid/os/Handler;

    invoke-virtual {p1, p0, p5, p6}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_5
    :goto_0
    return-void
.end method

.method public static a(Landroid/content/Context;ILcom/umeng/ccg/c$a;Ljava/lang/Object;)V
    .locals 7

    const/16 v1, 0x100

    const-wide/16 v5, 0x0

    move-object v0, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    .line 15
    invoke-static/range {v0 .. v6}, Lcom/umeng/ccg/c;->a(Landroid/content/Context;IILcom/umeng/ccg/c$a;Ljava/lang/Object;J)V

    return-void
.end method

.method public static a(Landroid/content/Context;ILcom/umeng/ccg/c$a;Ljava/lang/Object;J)V
    .locals 7

    const/16 v1, 0x100

    move-object v0, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    .line 16
    invoke-static/range {v0 .. v6}, Lcom/umeng/ccg/c;->a(Landroid/content/Context;IILcom/umeng/ccg/c$a;Ljava/lang/Object;J)V

    return-void
.end method

.method static synthetic a(Landroid/os/Message;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/umeng/ccg/c;->b(Landroid/os/Message;)V

    return-void
.end method

.method private static b(Landroid/os/Message;)V
    .locals 4

    .line 1
    iget v0, p0, Landroid/os/Message;->arg1:I

    .line 2
    iget-object p0, p0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 3
    div-int/lit8 v1, v0, 0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 4
    sget-object v2, Lcom/umeng/ccg/c;->s:Ljava/util/HashMap;

    if-nez v2, :cond_0

    return-void

    :cond_0
    const/4 v3, 0x0

    .line 5
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 6
    sget-object v2, Lcom/umeng/ccg/c;->s:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/umeng/ccg/c$a;

    :cond_1
    if-eqz v3, :cond_2

    .line 7
    invoke-interface {v3, p0, v0}, Lcom/umeng/ccg/c$a;->a(Ljava/lang/Object;I)V

    :cond_2
    return-void
.end method
