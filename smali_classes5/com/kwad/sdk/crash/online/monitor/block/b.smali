.class public final Lcom/kwad/sdk/crash/online/monitor/block/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static aHR:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static aHS:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static aHT:I = 0x5


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Lcom/kwad/sdk/crash/online/monitor/a/a;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/kwad/sdk/crash/online/monitor/block/b;->aHR:Ljava/util/List;

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/crash/online/monitor/a/a;->aIe:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    sget-object v0, Lcom/kwad/sdk/crash/online/monitor/block/b;->aHR:Ljava/util/List;

    iget-object v1, p0, Lcom/kwad/sdk/crash/online/monitor/a/a;->aIe:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 5
    :cond_0
    sget-object v0, Lcom/kwad/sdk/crash/online/monitor/block/b;->aHR:Ljava/util/List;

    const-string v1, "com.kwad"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    sget-object v0, Lcom/kwad/sdk/crash/online/monitor/block/b;->aHR:Ljava/util/List;

    const-string v1, "com.kwai"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    sget-object v0, Lcom/kwad/sdk/crash/online/monitor/block/b;->aHR:Ljava/util/List;

    const-string v1, "com.ksad"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    sget-object v0, Lcom/kwad/sdk/crash/online/monitor/block/b;->aHR:Ljava/util/List;

    const-string v1, "tkruntime"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    sget-object v0, Lcom/kwad/sdk/crash/online/monitor/block/b;->aHR:Ljava/util/List;

    const-string v1, "tachikoma"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    sget-object v0, Lcom/kwad/sdk/crash/online/monitor/block/b;->aHR:Ljava/util/List;

    const-string v1, "kuaishou"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    :goto_0
    iget v0, p0, Lcom/kwad/sdk/crash/online/monitor/a/a;->aIj:I

    sput v0, Lcom/kwad/sdk/crash/online/monitor/block/b;->aHT:I

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/kwad/sdk/crash/online/monitor/block/b;->aHS:Ljava/util/List;

    .line 13
    iget-object v0, p0, Lcom/kwad/sdk/crash/online/monitor/a/a;->aId:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 14
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 15
    sget-object v0, Lcom/kwad/sdk/crash/online/monitor/block/b;->aHS:Ljava/util/List;

    iget-object p0, p0, Lcom/kwad/sdk/crash/online/monitor/a/a;->aId:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void

    .line 16
    :cond_1
    sget-object p0, Lcom/kwad/sdk/crash/online/monitor/block/b;->aHS:Ljava/util/List;

    const-string v0, "android."

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    sget-object p0, Lcom/kwad/sdk/crash/online/monitor/block/b;->aHS:Ljava/util/List;

    const-string v0, "androidx."

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    sget-object p0, Lcom/kwad/sdk/crash/online/monitor/block/b;->aHS:Ljava/util/List;

    const-string v0, "org."

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    sget-object p0, Lcom/kwad/sdk/crash/online/monitor/block/b;->aHS:Ljava/util/List;

    const-string v0, "java."

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static fF(Ljava/lang/String;)Z
    .locals 3

    .line 1
    sget-object v0, Lcom/kwad/sdk/crash/online/monitor/block/b;->aHS:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 3
    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method

.method private static fG(Ljava/lang/String;)Z
    .locals 3

    .line 1
    sget-object v0, Lcom/kwad/sdk/crash/online/monitor/block/b;->aHR:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 3
    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method

.method public static fH(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const-string v0, "\n"

    .line 2
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "stacks after split:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "perfMonitor.Filter"

    invoke-static {v3, v2}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v3, v2, :cond_5

    aget-object v6, v0, v3

    if-nez v4, :cond_1

    .line 5
    invoke-static {v6}, Lcom/kwad/sdk/crash/online/monitor/block/b;->fF(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_4

    .line 6
    :cond_1
    sget v4, Lcom/kwad/sdk/crash/online/monitor/block/b;->aHT:I

    if-lt v5, v4, :cond_2

    return-object v1

    .line 7
    :cond_2
    invoke-static {v6}, Lcom/kwad/sdk/crash/online/monitor/block/b;->fG(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    return-object p0

    :cond_3
    add-int/lit8 v5, v5, 0x1

    const/4 v4, 0x1

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    return-object v1
.end method
