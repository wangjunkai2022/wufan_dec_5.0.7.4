.class public Lcom/umeng/analytics/pro/aj;
.super Ljava/lang/Object;
.source "TimePeriodChain.java"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/umeng/analytics/pro/ak;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 2
    iput-object v0, p0, Lcom/umeng/analytics/pro/aj;->a:Ljava/lang/String;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/umeng/analytics/pro/aj;->b:Ljava/util/ArrayList;

    .line 4
    iput-object p1, p0, Lcom/umeng/analytics/pro/aj;->a:Ljava/lang/String;

    .line 5
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 6
    invoke-direct {p0}, Lcom/umeng/analytics/pro/aj;->a()V

    :cond_0
    return-void
.end method

.method private a()V
    .locals 5

    const-string v0, ","

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/umeng/analytics/pro/aj;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2
    iget-object v1, p0, Lcom/umeng/analytics/pro/aj;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 3
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 4
    aget-object v3, v0, v2

    .line 5
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 6
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 7
    iget-object v4, p0, Lcom/umeng/analytics/pro/aj;->b:Ljava/util/ArrayList;

    if-eqz v4, :cond_0

    .line 8
    new-instance v4, Lcom/umeng/analytics/pro/ak;

    invoke-direct {v4, v3}, Lcom/umeng/analytics/pro/ak;-><init>(Ljava/lang/String;)V

    .line 9
    iget-object v3, p0, Lcom/umeng/analytics/pro/aj;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 10
    :cond_1
    iget-object v0, p0, Lcom/umeng/analytics/pro/aj;->a:Ljava/lang/String;

    .line 11
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 12
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/umeng/analytics/pro/aj;->b:Ljava/util/ArrayList;

    if-eqz v1, :cond_2

    .line 14
    new-instance v1, Lcom/umeng/analytics/pro/ak;

    invoke-direct {v1, v0}, Lcom/umeng/analytics/pro/ak;-><init>(Ljava/lang/String;)V

    .line 15
    iget-object v0, p0, Lcom/umeng/analytics/pro/aj;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_2
    return-void
.end method


# virtual methods
.method public a(I)Z
    .locals 4

    const/4 v0, 0x0

    .line 16
    :try_start_0
    iget-object v1, p0, Lcom/umeng/analytics/pro/aj;->b:Ljava/util/ArrayList;

    if-eqz v1, :cond_1

    .line 17
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 18
    iget-object v3, p0, Lcom/umeng/analytics/pro/aj;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/umeng/analytics/pro/ak;

    if-eqz v3, :cond_0

    .line 19
    invoke-virtual {v3, p1}, Lcom/umeng/analytics/pro/ak;->a(I)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_0

    const/4 p1, 0x1

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    :cond_1
    :goto_1
    return v0
.end method
