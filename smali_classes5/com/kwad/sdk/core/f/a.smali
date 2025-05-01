.class public final Lcom/kwad/sdk/core/f/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static ayi:Ljava/lang/String; = ""

.field private static final ayj:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final ayk:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static sGetOaidFail:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    sput-object v0, Lcom/kwad/sdk/core/f/a;->ayj:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    sput-object v0, Lcom/kwad/sdk/core/f/a;->ayk:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method private static Fd()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/f/a;->ayk:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v0, "ksadsdk_pref"

    const-string v1, "kasd_oaid_key"

    const-string v2, ""

    .line 3
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic Fe()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/f/a;->Fd()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic Ff()V
    .locals 0

    return-void
.end method

.method static synthetic Fg()Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/f/a;->ayj:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic access$000()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    return-object v0
.end method

.method public static bp(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/av;->Na()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/kwad/sdk/utils/av;->Nb()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-static {}, Lcom/kwad/sdk/utils/av;->Nb()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 4
    :cond_0
    sget-object v0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    sget-object p0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    return-object p0

    .line 6
    :cond_1
    invoke-static {}, Lcom/kwad/sdk/utils/av;->Na()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {}, Lcom/kwad/sdk/utils/o;->LS()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 7
    :cond_2
    invoke-static {p0}, Lcom/kwad/sdk/core/f/a;->initAsync(Landroid/content/Context;)V

    .line 8
    sget-object p0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    return-object p0

    .line 9
    :cond_3
    :goto_0
    invoke-static {}, Lcom/kwad/sdk/core/f/a;->Fd()Ljava/lang/String;

    move-result-object p0

    .line 10
    sput-object p0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    return-object p0
.end method

.method private static bq(Landroid/content/Context;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    if-nez p0, :cond_0

    goto/16 :goto_2

    .line 2
    :cond_0
    sget-boolean v0, Lcom/kwad/sdk/core/f/a;->sGetOaidFail:Z

    if-eqz v0, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 4
    :try_start_0
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, 0x1

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v2, "HUAWEI"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v1, 0x0

    goto/16 :goto_0

    :sswitch_1
    const-string v2, "FERRMEOS"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v1, 0xd

    goto/16 :goto_0

    :sswitch_2
    const-string v2, "MOTOLORA"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v1, 0x7

    goto/16 :goto_0

    :sswitch_3
    const-string v2, "NUBIA"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v1, 0x9

    goto/16 :goto_0

    :sswitch_4
    const-string v2, "MEIZU"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v1, 0x8

    goto/16 :goto_0

    :sswitch_5
    const-string v2, "VIVO"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v1, 0x5

    goto :goto_0

    :sswitch_6
    const-string v2, "SSUI"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v1, 0xe

    goto :goto_0

    :sswitch_7
    const-string v2, "OPPO"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v1, 0x3

    goto :goto_0

    :sswitch_8
    const-string v2, "ASUS"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v1, 0xb

    goto :goto_0

    :sswitch_9
    const-string v2, "ZTE"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v1, 0xc

    goto :goto_0

    :sswitch_a
    const-string v2, "ONEPLUS"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v1, 0x4

    goto :goto_0

    :sswitch_b
    const-string v2, "BLACKSHARK"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v1, 0x2

    goto :goto_0

    :sswitch_c
    const-string v2, "XIAOMI"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :sswitch_d
    const-string v2, "SAMSUNG"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v1, 0xa

    goto :goto_0

    :sswitch_e
    const-string v2, "LENOVO"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v1, 0x6

    :cond_2
    :goto_0
    packed-switch v1, :pswitch_data_0

    goto/16 :goto_1

    .line 6
    :pswitch_0
    new-instance v1, Lcom/kwad/sdk/core/f/a/j;

    invoke-direct {v1, p0}, Lcom/kwad/sdk/core/f/a/j;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/kwad/sdk/core/f/a/j;->getOAID()Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    goto :goto_1

    .line 7
    :pswitch_1
    new-instance v1, Lcom/kwad/sdk/core/f/a/a;

    invoke-direct {v1, p0}, Lcom/kwad/sdk/core/f/a/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/kwad/sdk/core/f/a/a;->getOAID()Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    goto :goto_1

    .line 8
    :pswitch_2
    new-instance v1, Lcom/kwad/sdk/core/f/a/g;

    invoke-direct {v1, p0}, Lcom/kwad/sdk/core/f/a/g;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/kwad/sdk/core/f/a/g;->getOAID()Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    goto :goto_1

    .line 9
    :pswitch_3
    new-instance v1, Lcom/kwad/sdk/core/f/a/e;

    invoke-direct {v1, p0}, Lcom/kwad/sdk/core/f/a/e;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/kwad/sdk/core/f/a/e;->getOAID()Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    goto :goto_1

    .line 10
    :pswitch_4
    new-instance v1, Lcom/kwad/sdk/core/f/a/d;

    invoke-direct {v1, p0}, Lcom/kwad/sdk/core/f/a/d;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/kwad/sdk/core/f/a/d;->getOAID()Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    goto :goto_1

    .line 11
    :pswitch_5
    new-instance v1, Lcom/kwad/sdk/core/f/a/c;

    invoke-direct {v1, p0}, Lcom/kwad/sdk/core/f/a/c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/kwad/sdk/core/f/a/c;->getOAID()Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    goto :goto_1

    .line 12
    :pswitch_6
    new-instance v1, Lcom/kwad/sdk/core/f/a/h;

    invoke-direct {v1, p0}, Lcom/kwad/sdk/core/f/a/h;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/kwad/sdk/core/f/a/h;->getOAID()Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    goto :goto_1

    .line 13
    :pswitch_7
    new-instance v1, Lcom/kwad/sdk/core/f/a/f;

    invoke-direct {v1, p0}, Lcom/kwad/sdk/core/f/a/f;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/kwad/sdk/core/f/a/f;->getOAID()Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    goto :goto_1

    .line 14
    :pswitch_8
    new-instance v1, Lcom/kwad/sdk/core/f/a/i;

    invoke-direct {v1, p0}, Lcom/kwad/sdk/core/f/a/i;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/kwad/sdk/core/f/a/i;->getOAID()Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    goto :goto_1

    .line 15
    :pswitch_9
    new-instance v1, Lcom/kwad/sdk/core/f/a/b;

    invoke-direct {v1, p0}, Lcom/kwad/sdk/core/f/a/b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/kwad/sdk/core/f/a/b;->getOAID()Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    :goto_1
    const-string p0, "OAIDHelper"

    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "manufacturer:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "--OAID:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    sget-object p0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_3

    .line 18
    sput-boolean v3, Lcom/kwad/sdk/core/f/a;->sGetOaidFail:Z

    .line 19
    :cond_3
    sget-object p0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    invoke-static {p0}, Lcom/kwad/sdk/core/f/a;->et(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 20
    invoke-static {p0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a5eb2cd -> :sswitch_e
        -0x660bb426 -> :sswitch_d
        -0x65b21745 -> :sswitch_c
        -0x43a32cba -> :sswitch_b
        -0x23e7db20 -> :sswitch_a
        0x15c4b -> :sswitch_9
        0x1ece50 -> :sswitch_8
        0x251fa0 -> :sswitch_7
        0x26fcf4 -> :sswitch_6
        0x2834ac -> :sswitch_5
        0x45d8cac -> :sswitch_4
        0x472cdb3 -> :sswitch_3
        0x259adc0f -> :sswitch_2
        0x3a35353b -> :sswitch_1
        0x7fa995e7 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic br(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/core/f/a;->bq(Landroid/content/Context;)V

    return-void
.end method

.method private static et(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ksadsdk_pref"

    const-string v1, "kasd_oaid_key"

    .line 2
    invoke-static {v0, v1, p0}, Lcom/kwad/sdk/utils/y;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method static synthetic eu(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    sput-object p0, Lcom/kwad/sdk/core/f/a;->ayi:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic ev(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/core/f/a;->et(Ljava/lang/String;)V

    return-void
.end method

.method private static initAsync(Landroid/content/Context;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    sget-object v0, Lcom/kwad/sdk/core/f/a;->ayj:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 2
    :cond_1
    new-instance v0, Lcom/kwad/sdk/core/f/a$1;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/core/f/a$1;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
