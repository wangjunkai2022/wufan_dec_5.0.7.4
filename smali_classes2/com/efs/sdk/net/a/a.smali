.class public final Lcom/efs/sdk/net/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lcom/efs/sdk/net/a/a;


# instance fields
.field private a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/efs/sdk/net/a/c;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/efs/sdk/net/a/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-direct {p0}, Lcom/efs/sdk/net/a/a;->b()V

    return-void
.end method

.method public static a()Lcom/efs/sdk/net/a/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/efs/sdk/net/a/a;->c:Lcom/efs/sdk/net/a/a;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/efs/sdk/net/a/a;

    invoke-direct {v0}, Lcom/efs/sdk/net/a/a;-><init>()V

    sput-object v0, Lcom/efs/sdk/net/a/a;->c:Lcom/efs/sdk/net/a/a;

    .line 3
    :cond_0
    sget-object v0, Lcom/efs/sdk/net/a/a;->c:Lcom/efs/sdk/net/a/a;

    return-object v0
.end method

.method private b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->a:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/efs/sdk/net/a/a;->a:Ljava/util/HashMap;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/efs/sdk/net/a/c;
    .locals 3

    .line 4
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->a:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 5
    invoke-direct {p0}, Lcom/efs/sdk/net/a/a;->b()V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/efs/sdk/net/a/c;

    if-nez v0, :cond_1

    .line 7
    new-instance v0, Lcom/efs/sdk/net/a/c;

    invoke-direct {v0}, Lcom/efs/sdk/net/a/c;-><init>()V

    .line 8
    iput-object p1, v0, Lcom/efs/sdk/net/a/c;->a:Ljava/lang/String;

    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 10
    iput-wide v1, v0, Lcom/efs/sdk/net/a/c;->b:J

    .line 11
    iget-object v1, p0, Lcom/efs/sdk/net/a/a;->a:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->a:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/String;)Lcom/efs/sdk/net/a/d;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->b:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/efs/sdk/net/a/a;->b:Ljava/util/HashMap;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/efs/sdk/net/a/d;

    return-object p1

    .line 5
    :cond_1
    new-instance v0, Lcom/efs/sdk/net/a/d;

    invoke-direct {v0}, Lcom/efs/sdk/net/a/d;-><init>()V

    .line 6
    iput-object p1, v0, Lcom/efs/sdk/net/a/d;->A:Ljava/lang/String;

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 8
    iput-wide v1, v0, Lcom/efs/sdk/net/a/d;->D:J

    .line 9
    iget-object v1, p0, Lcom/efs/sdk/net/a/a;->b:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->b:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/efs/sdk/net/a/a;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
