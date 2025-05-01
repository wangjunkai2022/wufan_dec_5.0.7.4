.class public final Lcom/kwad/components/core/request/model/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/request/model/b$a;
    }
.end annotation


# instance fields
.field private SA:Z

.field private SB:I

.field private SC:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/core/request/model/b$a;",
            ">;"
        }
    .end annotation
.end field

.field private SD:Lcom/kwad/sdk/k/a/f;

.field private SE:Lcom/kwad/sdk/k/a/d;

.field private SF:Lcom/kwad/sdk/k/a/b;

.field private SG:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/k/a/e;",
            ">;"
        }
    .end annotation
.end field

.field private Sj:I

.field private Sk:Ljava/lang/String;

.field private Sl:I

.field private Sm:Ljava/lang/Long;

.field private Sn:Ljava/lang/Long;

.field private So:Ljava/lang/Long;

.field private Sp:Ljava/lang/Long;

.field private Sq:Ljava/lang/String;

.field private Sr:Ljava/lang/String;

.field private Ss:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/utils/bv$a;",
            ">;"
        }
    .end annotation
.end field

.field private St:J

.field private Su:Ljava/lang/String;

.field private Sv:Ljava/lang/String;

.field private Sw:J

.field private Sx:I

.field private Sy:Ljava/lang/String;

.field private Sz:Ljava/lang/String;

.field private screenBrightness:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/request/model/b;->Ss:Ljava/util/List;

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lcom/kwad/components/core/request/model/b;->Sx:I

    const/high16 v1, -0x40800000    # -1.0f

    .line 4
    iput v1, p0, Lcom/kwad/components/core/request/model/b;->screenBrightness:F

    .line 5
    iput v0, p0, Lcom/kwad/components/core/request/model/b;->SB:I

    return-void
.end method

.method private aq(Landroid/content/Context;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-wide/16 v0, 0x200

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/config/d;->ab(J)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.ACTION_POWER_CONNECTED"

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.ACTION_POWER_DISCONNECTED"

    .line 4
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.BATTERY_CHANGED"

    .line 5
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_6

    const-string v0, "status"

    const/4 v1, -0x1

    .line 7
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq v0, v4, :cond_2

    const/4 v5, 0x5

    if-ne v0, v5, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 8
    :goto_1
    iput-boolean v0, p0, Lcom/kwad/components/core/request/model/b;->SA:Z

    const-string v0, "plugged"

    .line 9
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    if-ne p1, v4, :cond_3

    .line 10
    iput v3, p0, Lcom/kwad/components/core/request/model/b;->SB:I

    goto :goto_2

    :cond_3
    if-ne p1, v3, :cond_4

    .line 11
    iput v4, p0, Lcom/kwad/components/core/request/model/b;->SB:I

    goto :goto_2

    :cond_4
    const/4 v0, 0x4

    if-ne p1, v0, :cond_5

    const/4 p1, 0x3

    .line 12
    iput p1, p0, Lcom/kwad/components/core/request/model/b;->SB:I

    goto :goto_2

    :cond_5
    if-nez p1, :cond_6

    .line 13
    iput v2, p0, Lcom/kwad/components/core/request/model/b;->SB:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_6
    return-void

    :catch_0
    move-exception p1

    .line 14
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method

.method private static getContext()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lw()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public static rb()Lcom/kwad/components/core/request/model/b;
    .locals 4
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/components/core/request/model/b;

    invoke-direct {v0}, Lcom/kwad/components/core/request/model/b;-><init>()V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NH()I

    move-result v1

    iput v1, v0, Lcom/kwad/components/core/request/model/b;->Sj:I

    .line 3
    invoke-static {}, Lcom/kwad/components/core/request/model/b;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/utils/AbiUtil;->bQ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/core/request/model/b;->Sk:Ljava/lang/String;

    .line 4
    invoke-static {}, Lcom/kwad/components/core/request/model/b;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/utils/bj;->dk(Landroid/content/Context;)I

    move-result v1

    iput v1, v0, Lcom/kwad/components/core/request/model/b;->Sl:I

    .line 5
    invoke-static {}, Lcom/kwad/components/core/request/model/b;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/utils/bj;->dl(Landroid/content/Context;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/core/request/model/b;->Sm:Ljava/lang/Long;

    .line 6
    invoke-static {}, Lcom/kwad/components/core/request/model/b;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/utils/bj;->dj(Landroid/content/Context;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/core/request/model/b;->Sn:Ljava/lang/Long;

    .line 7
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NE()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/core/request/model/b;->So:Ljava/lang/Long;

    .line 8
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NF()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/core/request/model/b;->Sp:Ljava/lang/Long;

    .line 9
    invoke-static {}, Lcom/kwad/components/core/request/model/b;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/utils/aw;->cN(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/core/request/model/b;->Sq:Ljava/lang/String;

    .line 10
    invoke-static {}, Lcom/kwad/components/core/request/model/b;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/utils/aw;->cO(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/core/request/model/b;->Sr:Ljava/lang/String;

    .line 11
    iget-object v1, v0, Lcom/kwad/components/core/request/model/b;->Ss:Ljava/util/List;

    invoke-static {}, Lcom/kwad/components/core/request/model/b;->getContext()Landroid/content/Context;

    move-result-object v2

    const/16 v3, 0xf

    invoke-static {v2, v3}, Lcom/kwad/sdk/utils/aw;->o(Landroid/content/Context;I)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 12
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NL()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/kwad/components/core/request/model/b;->St:J

    .line 13
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NM()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/kwad/components/core/request/model/b;->Sw:J

    .line 14
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NN()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/core/request/model/b;->Sz:Ljava/lang/String;

    .line 15
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NO()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/core/request/model/b;->Sy:Ljava/lang/String;

    .line 16
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NP()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/core/request/model/b;->Su:Ljava/lang/String;

    .line 17
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NQ()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/core/request/model/b;->Sv:Ljava/lang/String;

    .line 18
    invoke-static {}, Lcom/kwad/components/core/request/model/b;->getContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 19
    invoke-static {v1}, Lcom/kwad/sdk/utils/bj;->ds(Landroid/content/Context;)I

    move-result v2

    iput v2, v0, Lcom/kwad/components/core/request/model/b;->Sx:I

    .line 20
    new-instance v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-static {v1}, Lcom/kwad/components/core/request/model/b$a;->ar(Landroid/content/Context;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, Lcom/kwad/components/core/request/model/b;->SC:Ljava/util/List;

    .line 21
    invoke-direct {v0, v1}, Lcom/kwad/components/core/request/model/b;->aq(Landroid/content/Context;)V

    .line 22
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/n;->LO()Lcom/kwad/sdk/k/a/d;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/core/request/model/b;->SE:Lcom/kwad/sdk/k/a/d;

    .line 23
    invoke-static {}, Lcom/kwad/sdk/utils/aw;->Lg()Lcom/kwad/sdk/k/a/b;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/core/request/model/b;->SF:Lcom/kwad/sdk/k/a/b;

    .line 24
    invoke-static {}, Lcom/kwad/sdk/utils/bc;->No()Lcom/kwad/sdk/utils/bc;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/sdk/utils/bc;->Np()Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/core/request/model/b;->SG:Ljava/util/List;

    .line 25
    invoke-static {}, Lcom/kwad/sdk/utils/aw;->Lh()Lcom/kwad/sdk/k/a/f;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/core/request/model/b;->SD:Lcom/kwad/sdk/k/a/f;

    return-object v0
.end method


# virtual methods
.method public final parseJson(Lorg/json/JSONObject;)V
    .locals 0
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public final toJson()Lorg/json/JSONObject;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2
    iget v1, p0, Lcom/kwad/components/core/request/model/b;->Sj:I

    const-string v2, "cpuCount"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 3
    iget-object v1, p0, Lcom/kwad/components/core/request/model/b;->Sk:Ljava/lang/String;

    const-string v2, "cpuAbi"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget v1, p0, Lcom/kwad/components/core/request/model/b;->Sl:I

    const-string v2, "batteryPercent"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 5
    iget-object v1, p0, Lcom/kwad/components/core/request/model/b;->Sm:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-string v3, "totalMemorySize"

    invoke-static {v0, v3, v1, v2}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 6
    iget-object v1, p0, Lcom/kwad/components/core/request/model/b;->Sn:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-string v3, "availableMemorySize"

    invoke-static {v0, v3, v1, v2}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 7
    iget-object v1, p0, Lcom/kwad/components/core/request/model/b;->So:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-string v3, "totalDiskSize"

    invoke-static {v0, v3, v1, v2}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 8
    iget-object v1, p0, Lcom/kwad/components/core/request/model/b;->Sp:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-string v3, "availableDiskSize"

    invoke-static {v0, v3, v1, v2}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 9
    iget-object v1, p0, Lcom/kwad/components/core/request/model/b;->Sq:Ljava/lang/String;

    const-string v2, "imsi"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    iget-object v1, p0, Lcom/kwad/components/core/request/model/b;->Sr:Ljava/lang/String;

    const-string v2, "iccid"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    iget-object v1, p0, Lcom/kwad/components/core/request/model/b;->Ss:Ljava/util/List;

    const-string v2, "wifiList"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/List;)V

    .line 12
    iget-wide v1, p0, Lcom/kwad/components/core/request/model/b;->St:J

    const-string v3, "bootTime"

    invoke-static {v0, v3, v1, v2}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 13
    iget-object v1, p0, Lcom/kwad/components/core/request/model/b;->Su:Ljava/lang/String;

    const-string v2, "romName"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    iget-object v1, p0, Lcom/kwad/components/core/request/model/b;->Sv:Ljava/lang/String;

    const-string v2, "romVersion"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    iget-wide v1, p0, Lcom/kwad/components/core/request/model/b;->Sw:J

    const-string v3, "romBuildTimestamp"

    invoke-static {v0, v3, v1, v2}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 16
    iget v1, p0, Lcom/kwad/components/core/request/model/b;->Sx:I

    const-string v2, "ringerMode"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 17
    iget-object v1, p0, Lcom/kwad/components/core/request/model/b;->SC:Ljava/util/List;

    const-string v2, "audioStreamInfo"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/List;)V

    .line 18
    iget-object v1, p0, Lcom/kwad/components/core/request/model/b;->Sy:Ljava/lang/String;

    const-string v2, "baseBandVersion"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    iget-object v1, p0, Lcom/kwad/components/core/request/model/b;->Sz:Ljava/lang/String;

    const-string v2, "fingerPrint"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    iget v1, p0, Lcom/kwad/components/core/request/model/b;->screenBrightness:F

    const-string v2, "screenBrightness"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;F)V

    .line 21
    iget-boolean v1, p0, Lcom/kwad/components/core/request/model/b;->SA:Z

    const-string v2, "isCharging"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Z)V

    .line 22
    iget v1, p0, Lcom/kwad/components/core/request/model/b;->SB:I

    const-string v2, "chargeType"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 23
    iget-object v1, p0, Lcom/kwad/components/core/request/model/b;->SD:Lcom/kwad/sdk/k/a/f;

    if-eqz v1, :cond_0

    const-string v2, "simCardInfo"

    .line 24
    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/kwad/sdk/core/b;)V

    .line 25
    :cond_0
    iget-object v1, p0, Lcom/kwad/components/core/request/model/b;->SE:Lcom/kwad/sdk/k/a/d;

    if-eqz v1, :cond_1

    const-string v2, "environmentInfo"

    .line 26
    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/kwad/sdk/core/b;)V

    .line 27
    :cond_1
    iget-object v1, p0, Lcom/kwad/components/core/request/model/b;->SF:Lcom/kwad/sdk/k/a/b;

    if-eqz v1, :cond_2

    const-string v2, "baseStationInfo"

    .line 28
    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/kwad/sdk/core/b;)V

    .line 29
    :cond_2
    iget-object v1, p0, Lcom/kwad/components/core/request/model/b;->SG:Ljava/util/List;

    if-eqz v1, :cond_3

    const-string v2, "sensorEventInfoList"

    .line 30
    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/List;)V

    :cond_3
    return-object v0
.end method
