.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;",
        ">;"
    }
.end annotation


# instance fields
.field public b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public c:I

.field private d:J

.field private e:J


# direct methods
.method public constructor <init>(Ljava/lang/Object;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0x1b7740

    iput-wide v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;->e:J

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;->b:Ljava/lang/Object;

    iput p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;->c:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;->d:J

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;->d:J

    return-wide v0
.end method


# virtual methods
.method public a()Z
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;->e:J

    iget-wide v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;->d:J

    sub-long/2addr v0, v4

    cmp-long v4, v2, v0

    if-lez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;)I
    .locals 4

    iget v0, p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;->c:I

    iget v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;->c:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_2

    iget-wide v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;->d:J

    iget-wide v2, p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;->d:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-gez p1, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    return v0
.end method

.method public b()V
    .locals 4

    const-string v0, "ACCDTAG"

    const-string v1, "nr "

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;->b:Ljava/lang/Object;

    instance-of v1, v0, Lcom/aggmoread/sdk/z/c/a/a/c/a;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/c/a;

    iget v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;->c:I

    add-int/lit8 v1, v1, 0xa

    const/4 v2, 0x1

    const-string v3, ""

    invoke-interface {v0, v2, v1, v3}, Lcom/aggmoread/sdk/z/c/a/a/c/a;->a(IILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;

    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;->b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;)I

    move-result p1

    return p1
.end method
