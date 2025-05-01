.class public Lcom/mob/commons/cc/a;
.super Ljava/lang/Object;


# static fields
.field private static final a:Lcom/mob/commons/cc/r;

.field private static final b:Lcom/mob/commons/cc/j;

.field private static final c:Lcom/mob/commons/cc/o;

.field private static volatile d:Lcom/mob/commons/cc/m;

.field private static volatile e:Lcom/mob/commons/cc/m;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/mob/commons/cc/r;

    invoke-direct {v0}, Lcom/mob/commons/cc/r;-><init>()V

    sput-object v0, Lcom/mob/commons/cc/a;->a:Lcom/mob/commons/cc/r;

    .line 2
    new-instance v0, Lcom/mob/commons/cc/j;

    invoke-direct {v0}, Lcom/mob/commons/cc/j;-><init>()V

    sput-object v0, Lcom/mob/commons/cc/a;->b:Lcom/mob/commons/cc/j;

    .line 3
    new-instance v0, Lcom/mob/commons/cc/o;

    invoke-direct {v0}, Lcom/mob/commons/cc/o;-><init>()V

    sput-object v0, Lcom/mob/commons/cc/a;->c:Lcom/mob/commons/cc/o;

    .line 4
    :try_start_0
    new-instance v0, Lcom/mob/commons/cc/m;

    new-instance v1, Lcom/mob/commons/cc/a$1;

    invoke-direct {v1}, Lcom/mob/commons/cc/a$1;-><init>()V

    invoke-direct {v0, v1}, Lcom/mob/commons/cc/m;-><init>(Lcom/mob/commons/cc/m$a;)V

    sput-object v0, Lcom/mob/commons/cc/a;->d:Lcom/mob/commons/cc/m;

    .line 5
    new-instance v0, Lcom/mob/commons/cc/m;

    new-instance v1, Lcom/mob/commons/cc/a$2;

    invoke-direct {v1}, Lcom/mob/commons/cc/a$2;-><init>()V

    invoke-direct {v0, v1}, Lcom/mob/commons/cc/m;-><init>(Lcom/mob/commons/cc/m$a;)V

    sput-object v0, Lcom/mob/commons/cc/a;->e:Lcom/mob/commons/cc/m;

    .line 6
    sget-object v0, Lcom/mob/commons/cc/a;->d:Lcom/mob/commons/cc/m;

    const-string v1, "tt"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/mob/commons/cc/m;->a(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a()I
    .locals 1

    .line 1
    invoke-static {}, Lcom/mob/commons/cc/x;->a()I

    move-result v0

    return v0
.end method

.method public static varargs a(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/LinkedList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "[",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/LinkedList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 7
    check-cast p0, Lcom/mob/commons/cc/z;

    invoke-virtual {p0, p1}, Lcom/mob/commons/cc/z;->b([Ljava/lang/Object;)Ljava/util/LinkedList;

    move-result-object p0

    return-object p0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 3
    invoke-static {v0}, Lcom/mob/commons/cc/x;->a([Ljava/lang/String;)Lcom/mob/commons/cc/x$c;

    move-result-object p1

    invoke-static {p1, p0, p2, p3}, Lcom/mob/commons/cc/a;->a(Lcom/mob/commons/cc/x$c;Landroid/content/Context;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 4
    invoke-static {v0}, Lcom/mob/commons/cc/x;->a([Ljava/lang/String;)Lcom/mob/commons/cc/x$c;

    move-result-object p1

    const-string v0, "ss_dhMap"

    .line 5
    invoke-virtual {p1, v0, p3}, Lcom/mob/commons/cc/x$c;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mob/commons/cc/x$d;

    move-result-object p3

    const-string v0, "ss_dataMaps"

    invoke-virtual {p3, v0, p4}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mob/commons/cc/x$d;

    const/4 p3, 0x0

    .line 6
    invoke-static {p1, p0, p2, p3}, Lcom/mob/commons/cc/a;->a(Lcom/mob/commons/cc/x$c;Landroid/content/Context;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    return-void
.end method

.method public static a(Landroid/content/Context;[BLjava/lang/String;Ljava/lang/reflect/Method;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [[B

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 2
    invoke-static {v0}, Lcom/mob/commons/cc/x;->a([[B)Lcom/mob/commons/cc/x$c;

    move-result-object p1

    invoke-static {p1, p0, p2, p3}, Lcom/mob/commons/cc/a;->a(Lcom/mob/commons/cc/x$c;Landroid/content/Context;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    return-void
.end method

.method private static a(Lcom/mob/commons/cc/x$c;Landroid/content/Context;Ljava/lang/String;Ljava/lang/reflect/Method;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 8
    const-class v0, Lcom/mob/commons/cc/r;

    const-class v1, Lcom/mob/commons/cc/g;

    const-class v2, Lcom/mob/commons/cc/n;

    const-class v3, Lcom/mob/commons/cc/o;

    const-class v4, Lcom/mob/commons/cc/d;

    const-class v5, Lcom/mob/commons/cc/j;

    const-string v6, "012%ef hdYbh2bgAbgbi%c:cjMdg"

    invoke-static {v6}, Lcom/mob/commons/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6, v5}, Lcom/mob/commons/cc/x$c;->a(Ljava/lang/String;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v6

    const-string v7, "003?faceda"

    .line 9
    invoke-static {v7}, Lcom/mob/commons/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7, v4}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v6

    const-string v7, "SBSP"

    .line 10
    invoke-virtual {v6, v7, v3}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v6

    const-string v7, "004Tfacjejdi"

    .line 11
    invoke-static {v7}, Lcom/mob/commons/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7, v1}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v6

    const-string v7, "015_cjdhdi(bcWbaTedYbhda:fHbh@db4ba"

    .line 12
    invoke-static {v7}, Lcom/mob/commons/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-class v8, Lcom/mob/tools/MobHandlerThread;

    invoke-virtual {v6, v7, v8}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v6

    const-string v7, "019?cjdhdhbhbi4bGbaOab*dg1g>eh$dadGbgbbKd!bh"

    .line 13
    invoke-static {v7}, Lcom/mob/commons/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-class v8, Lcom/mob/commons/cc/i;

    invoke-virtual {v6, v7, v8}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v6

    const-string v7, "017@cjdhcbbiWcgdcg,ehJd%dgbi\'e.bbSdXbh"

    .line 14
    invoke-static {v7}, Lcom/mob/commons/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-class v8, Lcom/mob/commons/cc/l;

    invoke-virtual {v6, v7, v8}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v6

    const-string v7, "0197cjdhcj,d_bhbbbg%ad<cbbi.ccdag7bgbiNc"

    .line 15
    invoke-static {v7}, Lcom/mob/commons/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-class v8, Lcom/mob/commons/cc/p;

    invoke-virtual {v6, v7, v8}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v6

    const-string v7, "017QcjdhcbbiCcgdcg1efdddgNd@bhbb2dVbh"

    .line 16
    invoke-static {v7}, Lcom/mob/commons/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-class v8, Lcom/mob/commons/cc/k;

    invoke-virtual {v6, v7, v8}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v6

    const-string v7, "017+cjdhceIdgNdebibhcfcb[beeEddSba_cf"

    .line 17
    invoke-static {v7}, Lcom/mob/commons/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7, v2}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v6

    const-string v7, "009Lcjdhdi*bc)baLed!bh"

    .line 18
    invoke-static {v7}, Lcom/mob/commons/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-class v8, Lcom/mob/commons/cc/m;

    invoke-virtual {v6, v7, v8}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v6

    const-string v7, "003Ufacecb"

    .line 19
    invoke-static {v7}, Lcom/mob/commons/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-class v8, Lcom/mob/tools/network/NetCommunicator;

    invoke-virtual {v6, v7, v8}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v6

    const-string v7, "004Sfacedaef"

    .line 20
    invoke-static {v7}, Lcom/mob/commons/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-class v8, Lcom/mob/tools/network/NetworkHelper$NetworkTimeOut;

    invoke-virtual {v6, v7, v8}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v6

    const-class v7, Lcom/mob/tools/utils/MobPersistence$NoValidDataException;

    const-string v8, "NoVaDataException"

    .line 21
    invoke-virtual {v6, v8, v7}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v6

    const-string v7, "003Wdibicc"

    .line 22
    invoke-static {v7}, Lcom/mob/commons/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-class v8, Lcom/mob/commons/n;

    invoke-virtual {v6, v7, v8}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v6

    const-class v7, Lcom/mob/commons/cc/i;

    const-class v8, Lcom/mob/commons/cc/i;

    .line 23
    invoke-virtual {v6, v7, v8}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v6

    const-class v7, Lcom/mob/commons/cc/k;

    const-class v8, Lcom/mob/commons/cc/k;

    .line 24
    invoke-virtual {v6, v7, v8}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v6

    const-class v7, Lcom/mob/commons/cc/p;

    const-class v8, Lcom/mob/commons/cc/q;

    .line 25
    invoke-virtual {v6, v7, v8}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v6

    .line 26
    invoke-virtual {v6, v2, v2}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v2

    .line 27
    invoke-virtual {v2, v0, v0}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v0

    .line 28
    invoke-virtual {v0, v5, v5}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v0

    .line 29
    invoke-virtual {v0, v4, v4}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v0

    const-class v2, Lcom/mob/commons/cc/h;

    .line 30
    invoke-virtual {v0, v1, v2}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    const-class v2, Lcom/mob/commons/cc/c;

    .line 31
    invoke-virtual {v0, v1, v2}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v0

    const-class v1, Landroid/content/pm/PackageManager;

    const-class v2, Lcom/mob/commons/cc/f;

    .line 32
    invoke-virtual {v0, v1, v2}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v0

    const-class v1, Landroid/app/NotificationManager;

    const-class v2, Lcom/mob/commons/cc/e;

    .line 33
    invoke-virtual {v0, v1, v2}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v0

    .line 34
    invoke-virtual {v0, v3, v3}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v0

    const-class v1, Lcom/mob/commons/n;

    const-class v2, Lcom/mob/commons/cc/b;

    .line 35
    invoke-virtual {v0, v1, v2}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/mob/commons/cc/x$d;

    move-result-object v0

    sget-object v1, Lcom/mob/commons/cc/a;->c:Lcom/mob/commons/cc/o;

    const-string v2, "ss_sdh"

    .line 36
    invoke-virtual {v0, v2, v1}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mob/commons/cc/x$d;

    move-result-object v0

    sget-object v1, Lcom/mob/commons/cc/a;->b:Lcom/mob/commons/cc/j;

    const-string v2, "ss_opSet"

    .line 37
    invoke-virtual {v0, v2, v1}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mob/commons/cc/x$d;

    move-result-object v0

    sget-object v1, Lcom/mob/commons/cc/a;->a:Lcom/mob/commons/cc/r;

    const-string v2, "ss_suls"

    .line 38
    invoke-virtual {v0, v2, v1}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mob/commons/cc/x$d;

    move-result-object v0

    const-string v1, "015UdgdgbfIa]biKcgd.cg1g@ejZbGbhNbYbd"

    .line 39
    invoke-static {v1}, Lcom/mob/commons/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mob/commons/cc/x$d;

    move-result-object p1

    const-string v0, "014.dgdgbfdg*gbIbhJgZej?bPbhSb]bddg"

    .line 40
    invoke-static {v0}, Lcom/mob/commons/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mob/commons/cc/x$d;

    move-result-object p1

    const-string p2, "012?dgdgbfdgLgbDbhLg-dabgbdTd"

    .line 41
    invoke-static {p2}, Lcom/mob/commons/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mob/commons/cc/x$d;

    move-result-object p1

    const-string p2, "006^dgdgbfbdbaIh"

    .line 42
    invoke-static {p2}, Lcom/mob/commons/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, p3}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/mob/commons/cc/x$d;

    move-result-object p1

    const-string p2, "016aXbibdbdbi)cbh%bjdgbacfbjGa%baRa"

    .line 43
    invoke-static {p2}, Lcom/mob/commons/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/mob/commons/cc/x$d;->a(Ljava/lang/String;)Lcom/mob/commons/cc/x$d;

    .line 44
    invoke-virtual {p0}, Lcom/mob/commons/cc/x$c;->a()V

    return-void
.end method

.method static synthetic b()Lcom/mob/commons/cc/m;
    .locals 1

    .line 1
    sget-object v0, Lcom/mob/commons/cc/a;->e:Lcom/mob/commons/cc/m;

    return-object v0
.end method
