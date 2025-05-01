.class public Lcom/googlecode/mp4parser/util/f;
.super Ljava/lang/Object;
.source "IntHashMap.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/mp4parser/util/f$a;
    }
.end annotation


# instance fields
.field private transient a:[Lcom/googlecode/mp4parser/util/f$a;

.field private transient b:I

.field private c:I

.field private d:F


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x14

    const/high16 v1, 0x3f400000    # 0.75f

    .line 1
    invoke-direct {p0, v0, v1}, Lcom/googlecode/mp4parser/util/f;-><init>(IF)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/high16 v0, 0x3f400000    # 0.75f

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/googlecode/mp4parser/util/f;-><init>(IF)V

    return-void
.end method

.method public constructor <init>(IF)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_2

    const/4 v0, 0x0

    cmpg-float v0, p2, v0

    if-lez v0, :cond_1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 4
    :cond_0
    iput p2, p0, Lcom/googlecode/mp4parser/util/f;->d:F

    .line 5
    new-array v0, p1, [Lcom/googlecode/mp4parser/util/f$a;

    iput-object v0, p0, Lcom/googlecode/mp4parser/util/f;->a:[Lcom/googlecode/mp4parser/util/f$a;

    int-to-float p1, p1

    mul-float p1, p1, p2

    float-to-int p1, p1

    .line 6
    iput p1, p0, Lcom/googlecode/mp4parser/util/f;->c:I

    return-void

    .line 7
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Illegal Load: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 8
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Illegal Capacity: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/f;->a:[Lcom/googlecode/mp4parser/util/f$a;

    .line 2
    array-length v1, v0

    :goto_0
    add-int/lit8 v1, v1, -0x1

    if-gez v1, :cond_0

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/googlecode/mp4parser/util/f;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit p0

    return-void

    :cond_0
    const/4 v2, 0x0

    .line 5
    :try_start_1
    aput-object v2, v0, v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public b(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/f;->a:[Lcom/googlecode/mp4parser/util/f$a;

    .line 3
    array-length v1, v0

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-gtz v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 4
    :cond_0
    aget-object v1, v0, v2

    :goto_1
    if-nez v1, :cond_1

    move v1, v2

    goto :goto_0

    .line 5
    :cond_1
    iget-object v3, v1, Lcom/googlecode/mp4parser/util/f$a;->c:Ljava/lang/Object;

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 p1, 0x1

    return p1

    .line 6
    :cond_2
    iget-object v1, v1, Lcom/googlecode/mp4parser/util/f$a;->d:Lcom/googlecode/mp4parser/util/f$a;

    goto :goto_1
.end method

.method public c(I)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/f;->a:[Lcom/googlecode/mp4parser/util/f$a;

    const v1, 0x7fffffff

    and-int/2addr v1, p1

    .line 2
    array-length v2, v0

    rem-int/2addr v1, v2

    .line 3
    aget-object v0, v0, v1

    :goto_0
    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 4
    :cond_0
    iget v1, v0, Lcom/googlecode/mp4parser/util/f$a;->a:I

    if-ne v1, p1, :cond_1

    const/4 p1, 0x1

    return p1

    .line 5
    :cond_1
    iget-object v0, v0, Lcom/googlecode/mp4parser/util/f$a;->d:Lcom/googlecode/mp4parser/util/f$a;

    goto :goto_0
.end method

.method public d(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/util/f;->b(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public e(I)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/f;->a:[Lcom/googlecode/mp4parser/util/f$a;

    const v1, 0x7fffffff

    and-int/2addr v1, p1

    .line 2
    array-length v2, v0

    rem-int/2addr v1, v2

    .line 3
    aget-object v0, v0, v1

    :goto_0
    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 4
    :cond_0
    iget v1, v0, Lcom/googlecode/mp4parser/util/f$a;->a:I

    if-ne v1, p1, :cond_1

    .line 5
    iget-object p1, v0, Lcom/googlecode/mp4parser/util/f$a;->c:Ljava/lang/Object;

    return-object p1

    .line 6
    :cond_1
    iget-object v0, v0, Lcom/googlecode/mp4parser/util/f$a;->d:Lcom/googlecode/mp4parser/util/f$a;

    goto :goto_0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/googlecode/mp4parser/util/f;->b:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public g(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/f;->a:[Lcom/googlecode/mp4parser/util/f$a;

    const v1, 0x7fffffff

    and-int/2addr v1, p1

    .line 2
    array-length v2, v0

    rem-int v2, v1, v2

    .line 3
    aget-object v3, v0, v2

    :goto_0
    if-nez v3, :cond_1

    .line 4
    iget v3, p0, Lcom/googlecode/mp4parser/util/f;->b:I

    iget v4, p0, Lcom/googlecode/mp4parser/util/f;->c:I

    if-lt v3, v4, :cond_0

    .line 5
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/util/f;->h()V

    .line 6
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/f;->a:[Lcom/googlecode/mp4parser/util/f$a;

    .line 7
    array-length v2, v0

    rem-int v2, v1, v2

    .line 8
    :cond_0
    new-instance v1, Lcom/googlecode/mp4parser/util/f$a;

    aget-object v3, v0, v2

    invoke-direct {v1, p1, p1, p2, v3}, Lcom/googlecode/mp4parser/util/f$a;-><init>(IILjava/lang/Object;Lcom/googlecode/mp4parser/util/f$a;)V

    .line 9
    aput-object v1, v0, v2

    .line 10
    iget p1, p0, Lcom/googlecode/mp4parser/util/f;->b:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/googlecode/mp4parser/util/f;->b:I

    const/4 p1, 0x0

    return-object p1

    .line 11
    :cond_1
    iget v4, v3, Lcom/googlecode/mp4parser/util/f$a;->a:I

    if-ne v4, p1, :cond_2

    .line 12
    iget-object p1, v3, Lcom/googlecode/mp4parser/util/f$a;->c:Ljava/lang/Object;

    .line 13
    iput-object p2, v3, Lcom/googlecode/mp4parser/util/f$a;->c:Ljava/lang/Object;

    return-object p1

    .line 14
    :cond_2
    iget-object v3, v3, Lcom/googlecode/mp4parser/util/f$a;->d:Lcom/googlecode/mp4parser/util/f$a;

    goto :goto_0
.end method

.method protected h()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/f;->a:[Lcom/googlecode/mp4parser/util/f$a;

    array-length v1, v0

    mul-int/lit8 v2, v1, 0x2

    add-int/lit8 v2, v2, 0x1

    .line 2
    new-array v3, v2, [Lcom/googlecode/mp4parser/util/f$a;

    int-to-float v4, v2

    .line 3
    iget v5, p0, Lcom/googlecode/mp4parser/util/f;->d:F

    mul-float v4, v4, v5

    float-to-int v4, v4

    iput v4, p0, Lcom/googlecode/mp4parser/util/f;->c:I

    .line 4
    iput-object v3, p0, Lcom/googlecode/mp4parser/util/f;->a:[Lcom/googlecode/mp4parser/util/f$a;

    :goto_0
    add-int/lit8 v4, v1, -0x1

    if-gtz v1, :cond_0

    return-void

    .line 5
    :cond_0
    aget-object v1, v0, v4

    :goto_1
    if-nez v1, :cond_1

    move v1, v4

    goto :goto_0

    .line 6
    :cond_1
    iget-object v5, v1, Lcom/googlecode/mp4parser/util/f$a;->d:Lcom/googlecode/mp4parser/util/f$a;

    .line 7
    iget v6, v1, Lcom/googlecode/mp4parser/util/f$a;->a:I

    const v7, 0x7fffffff

    and-int/2addr v6, v7

    rem-int/2addr v6, v2

    .line 8
    aget-object v7, v3, v6

    iput-object v7, v1, Lcom/googlecode/mp4parser/util/f$a;->d:Lcom/googlecode/mp4parser/util/f$a;

    .line 9
    aput-object v1, v3, v6

    move-object v1, v5

    goto :goto_1
.end method

.method public i(I)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/util/f;->a:[Lcom/googlecode/mp4parser/util/f$a;

    const v1, 0x7fffffff

    and-int/2addr v1, p1

    .line 2
    array-length v2, v0

    rem-int/2addr v1, v2

    .line 3
    aget-object v2, v0, v1

    const/4 v3, 0x0

    move-object v4, v3

    :goto_0
    if-nez v2, :cond_0

    return-object v3

    .line 4
    :cond_0
    iget v5, v2, Lcom/googlecode/mp4parser/util/f$a;->a:I

    if-ne v5, p1, :cond_2

    if-eqz v4, :cond_1

    .line 5
    iget-object p1, v2, Lcom/googlecode/mp4parser/util/f$a;->d:Lcom/googlecode/mp4parser/util/f$a;

    iput-object p1, v4, Lcom/googlecode/mp4parser/util/f$a;->d:Lcom/googlecode/mp4parser/util/f$a;

    goto :goto_1

    .line 6
    :cond_1
    iget-object p1, v2, Lcom/googlecode/mp4parser/util/f$a;->d:Lcom/googlecode/mp4parser/util/f$a;

    aput-object p1, v0, v1

    .line 7
    :goto_1
    iget p1, p0, Lcom/googlecode/mp4parser/util/f;->b:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/googlecode/mp4parser/util/f;->b:I

    .line 8
    iget-object p1, v2, Lcom/googlecode/mp4parser/util/f$a;->c:Ljava/lang/Object;

    .line 9
    iput-object v3, v2, Lcom/googlecode/mp4parser/util/f$a;->c:Ljava/lang/Object;

    return-object p1

    .line 10
    :cond_2
    iget-object v4, v2, Lcom/googlecode/mp4parser/util/f$a;->d:Lcom/googlecode/mp4parser/util/f$a;

    move-object v6, v4

    move-object v4, v2

    move-object v2, v6

    goto :goto_0
.end method

.method public j()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/googlecode/mp4parser/util/f;->b:I

    return v0
.end method
