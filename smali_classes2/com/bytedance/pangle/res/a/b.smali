.class public final Lcom/bytedance/pangle/res/a/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/pangle/res/a/b$a;
    }
.end annotation


# instance fields
.field a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field b:Z

.field c:Lcom/bytedance/pangle/res/a/g;

.field d:I

.field e:I

.field f:I

.field g:I

.field h:I

.field private final i:Lcom/bytedance/pangle/res/a/h;

.field private final j:[B

.field private k:Z

.field private l:[I

.field private final m:Lcom/bytedance/pangle/res/a/b$a;

.field private n:Z

.field private o:I

.field private p:[I

.field private q:I


# direct methods
.method public constructor <init>([BLcom/bytedance/pangle/res/a/h;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/bytedance/pangle/res/a/b;->a:Ljava/util/HashMap;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/bytedance/pangle/res/a/b;->b:Z

    .line 4
    iput-boolean v0, p0, Lcom/bytedance/pangle/res/a/b;->k:Z

    .line 5
    new-instance v1, Lcom/bytedance/pangle/res/a/b$a;

    invoke-direct {v1}, Lcom/bytedance/pangle/res/a/b$a;-><init>()V

    iput-object v1, p0, Lcom/bytedance/pangle/res/a/b;->m:Lcom/bytedance/pangle/res/a/b$a;

    .line 6
    iput v0, p0, Lcom/bytedance/pangle/res/a/b;->d:I

    const/4 v0, 0x1

    .line 7
    iput v0, p0, Lcom/bytedance/pangle/res/a/b;->e:I

    const/4 v0, 0x2

    .line 8
    iput v0, p0, Lcom/bytedance/pangle/res/a/b;->f:I

    const/4 v0, 0x3

    .line 9
    iput v0, p0, Lcom/bytedance/pangle/res/a/b;->g:I

    const/4 v0, 0x4

    .line 10
    iput v0, p0, Lcom/bytedance/pangle/res/a/b;->h:I

    .line 11
    iput-object p2, p0, Lcom/bytedance/pangle/res/a/b;->i:Lcom/bytedance/pangle/res/a/h;

    .line 12
    iput-object p1, p0, Lcom/bytedance/pangle/res/a/b;->j:[B

    .line 13
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/b;->c()V

    return-void
.end method

.method private c()V
    .locals 2

    const/4 v0, -0x1

    .line 1
    iput v0, p0, Lcom/bytedance/pangle/res/a/b;->o:I

    const/4 v1, 0x0

    .line 2
    iput-object v1, p0, Lcom/bytedance/pangle/res/a/b;->p:[I

    .line 3
    iput v0, p0, Lcom/bytedance/pangle/res/a/b;->q:I

    return-void
.end method

.method private d()V
    .locals 15

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/pangle/res/a/b;->k:Z

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x4

    const/4 v5, 0x1

    if-nez v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    .line 3
    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    move-result v0

    const v6, 0x80003

    if-eq v0, v6, :cond_1

    const v7, 0x80001

    if-ne v0, v7, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    new-instance v4, Ljava/io/IOException;

    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v1, v3

    const-string v0, "Expected: 0x%08x or 0x%08x, got: 0x%08x"

    .line 6
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 7
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    .line 8
    invoke-virtual {v0, v4}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 9
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-static {v0}, Lcom/bytedance/pangle/res/a/l;->a(Lcom/bytedance/pangle/res/a/g;)V

    .line 10
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/b;->m:Lcom/bytedance/pangle/res/a/b$a;

    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/b$a;->a()V

    .line 11
    iput-boolean v5, p0, Lcom/bytedance/pangle/res/a/b;->k:Z

    .line 12
    :cond_2
    iget v0, p0, Lcom/bytedance/pangle/res/a/b;->o:I

    iget v6, p0, Lcom/bytedance/pangle/res/a/b;->e:I

    if-ne v0, v6, :cond_3

    return-void

    .line 13
    :cond_3
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/b;->c()V

    .line 14
    :cond_4
    :goto_1
    iget-boolean v6, p0, Lcom/bytedance/pangle/res/a/b;->n:Z

    if-eqz v6, :cond_5

    .line 15
    iput-boolean v2, p0, Lcom/bytedance/pangle/res/a/b;->n:Z

    .line 16
    iget-object v6, p0, Lcom/bytedance/pangle/res/a/b;->m:Lcom/bytedance/pangle/res/a/b$a;

    .line 17
    iget v7, v6, Lcom/bytedance/pangle/res/a/b$a;->b:I

    if-eqz v7, :cond_5

    add-int/lit8 v8, v7, -0x1

    .line 18
    iget-object v9, v6, Lcom/bytedance/pangle/res/a/b$a;->a:[I

    aget v9, v9, v8

    sub-int/2addr v8, v5

    mul-int/lit8 v9, v9, 0x2

    sub-int/2addr v8, v9

    if-eqz v8, :cond_5

    add-int/lit8 v9, v9, 0x2

    sub-int/2addr v7, v9

    .line 19
    iput v7, v6, Lcom/bytedance/pangle/res/a/b$a;->b:I

    .line 20
    iget v7, v6, Lcom/bytedance/pangle/res/a/b$a;->c:I

    sub-int/2addr v7, v5

    iput v7, v6, Lcom/bytedance/pangle/res/a/b$a;->c:I

    .line 21
    :cond_5
    iget v6, p0, Lcom/bytedance/pangle/res/a/b;->g:I

    if-ne v0, v6, :cond_7

    iget-object v6, p0, Lcom/bytedance/pangle/res/a/b;->m:Lcom/bytedance/pangle/res/a/b$a;

    .line 22
    iget v7, v6, Lcom/bytedance/pangle/res/a/b$a;->c:I

    if-ne v7, v5, :cond_7

    .line 23
    iget v7, v6, Lcom/bytedance/pangle/res/a/b$a;->b:I

    if-nez v7, :cond_6

    const/4 v6, 0x0

    goto :goto_2

    :cond_6
    add-int/lit8 v7, v7, -0x1

    .line 24
    iget-object v6, v6, Lcom/bytedance/pangle/res/a/b$a;->a:[I

    aget v6, v6, v7

    :goto_2
    if-nez v6, :cond_7

    .line 25
    iget v0, p0, Lcom/bytedance/pangle/res/a/b;->e:I

    iput v0, p0, Lcom/bytedance/pangle/res/a/b;->o:I

    return-void

    .line 26
    :cond_7
    iget v6, p0, Lcom/bytedance/pangle/res/a/b;->d:I

    const v7, 0x100102

    if-ne v0, v6, :cond_8

    const v6, 0x100102

    goto :goto_3

    .line 27
    :cond_8
    iget-object v6, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-virtual {v6}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    move-result v6

    :goto_3
    const v8, 0x80180

    const-string v9, ")."

    if-ne v6, v8, :cond_c

    .line 28
    iget-object v6, p0, Lcom/bytedance/pangle/res/a/b;->a:Ljava/util/HashMap;

    invoke-virtual {v6}, Ljava/util/HashMap;->clear()V

    .line 29
    iget-object v6, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-virtual {v6}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    move-result v6

    const/16 v7, 0x8

    if-lt v6, v7, :cond_b

    .line 30
    rem-int/lit8 v7, v6, 0x4

    if-nez v7, :cond_b

    .line 31
    iget-object v7, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-static {v7}, Lcom/bytedance/pangle/res/a/k;->a(Lcom/bytedance/pangle/res/a/g;)I

    move-result v7

    .line 32
    iget-object v8, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    div-int/lit8 v6, v6, 0x4

    sub-int/2addr v6, v3

    invoke-virtual {v8, v6}, Lcom/bytedance/pangle/res/a/g;->a(I)[I

    move-result-object v6

    iput-object v6, p0, Lcom/bytedance/pangle/res/a/b;->l:[I

    .line 33
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v8, 0x0

    .line 34
    :goto_4
    iget-object v9, p0, Lcom/bytedance/pangle/res/a/b;->l:[I

    array-length v10, v9

    if-ge v8, v10, :cond_a

    .line 35
    iget-object v10, p0, Lcom/bytedance/pangle/res/a/b;->j:[B

    aget v9, v9, v8

    mul-int/lit8 v11, v8, 0x4

    add-int/2addr v11, v7

    iget-object v12, p0, Lcom/bytedance/pangle/res/a/b;->i:Lcom/bytedance/pangle/res/a/h;

    invoke-static {v10, v9, v11, v12}, Lcom/bytedance/pangle/res/a/k;->a([BIILcom/bytedance/pangle/res/a/h;)I

    move-result v9

    const/high16 v10, 0x7f000000

    if-lt v9, v10, :cond_9

    .line 36
    iget-object v10, p0, Lcom/bytedance/pangle/res/a/b;->a:Ljava/util/HashMap;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    .line 38
    :cond_a
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 39
    invoke-static {v7}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 40
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    .line 41
    iput-boolean v5, p0, Lcom/bytedance/pangle/res/a/b;->b:Z

    goto/16 :goto_1

    .line 42
    :cond_b
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid resource ids size ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    const v8, 0x100100

    if-lt v6, v8, :cond_1b

    const v10, 0x100104

    if-gt v6, v10, :cond_1b

    if-ne v6, v7, :cond_d

    const/4 v9, -0x1

    if-ne v0, v9, :cond_d

    .line 43
    iget v0, p0, Lcom/bytedance/pangle/res/a/b;->d:I

    iput v0, p0, Lcom/bytedance/pangle/res/a/b;->o:I

    return-void

    .line 44
    :cond_d
    iget-object v9, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    .line 45
    invoke-virtual {v9, v4}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 46
    iget-object v9, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-virtual {v9}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 47
    iget-object v9, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    .line 48
    invoke-virtual {v9, v4}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    if-eq v6, v8, :cond_18

    const v9, 0x100101

    if-ne v6, v9, :cond_e

    goto/16 :goto_7

    :cond_e
    if-ne v6, v7, :cond_16

    .line 49
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 50
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 51
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    .line 52
    invoke-virtual {v0, v4}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 53
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    move-result v0

    const v6, 0xffff

    and-int/2addr v0, v6

    .line 54
    iget-object v7, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-virtual {v7}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    move-result v7

    iput v7, p0, Lcom/bytedance/pangle/res/a/b;->q:I

    and-int/2addr v6, v7

    sub-int/2addr v6, v5

    .line 55
    iput v6, p0, Lcom/bytedance/pangle/res/a/b;->q:I

    .line 56
    iget-object v6, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-static {v6}, Lcom/bytedance/pangle/res/a/k;->a(Lcom/bytedance/pangle/res/a/g;)I

    move-result v6

    .line 57
    iget-object v7, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    mul-int/lit8 v8, v0, 0x5

    invoke-virtual {v7, v8}, Lcom/bytedance/pangle/res/a/g;->a(I)[I

    move-result-object v7

    iput-object v7, p0, Lcom/bytedance/pangle/res/a/b;->p:[I

    .line 58
    :goto_5
    iget-object v7, p0, Lcom/bytedance/pangle/res/a/b;->p:[I

    array-length v9, v7

    if-ge v1, v9, :cond_f

    .line 59
    aget v9, v7, v1

    ushr-int/lit8 v9, v9, 0x18

    aput v9, v7, v1

    add-int/lit8 v1, v1, 0x5

    goto :goto_5

    .line 60
    :cond_f
    array-length v1, v7

    if-ne v1, v8, :cond_15

    const/4 v1, 0x0

    :goto_6
    if-ge v2, v0, :cond_13

    .line 61
    iget-object v7, p0, Lcom/bytedance/pangle/res/a/b;->p:[I

    mul-int/lit8 v8, v2, 0x5

    add-int/lit8 v9, v8, 0x1

    aget v7, v7, v9

    .line 62
    iget-object v9, p0, Lcom/bytedance/pangle/res/a/b;->a:Ljava/util/HashMap;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v9, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_10

    const/4 v1, 0x1

    .line 63
    :cond_10
    iget-object v7, p0, Lcom/bytedance/pangle/res/a/b;->p:[I

    add-int/lit8 v9, v8, 0x3

    aget v9, v7, v9

    if-eq v9, v5, :cond_11

    if-ne v9, v3, :cond_12

    :cond_11
    add-int/lit8 v8, v8, 0x4

    .line 64
    aget v7, v7, v8

    .line 65
    iget-object v9, p0, Lcom/bytedance/pangle/res/a/b;->j:[B

    mul-int/lit8 v8, v8, 0x4

    add-int/2addr v8, v6

    iget-object v10, p0, Lcom/bytedance/pangle/res/a/b;->i:Lcom/bytedance/pangle/res/a/h;

    invoke-static {v9, v7, v8, v10}, Lcom/bytedance/pangle/res/a/k;->a([BIILcom/bytedance/pangle/res/a/h;)I

    :cond_12
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_13
    if-eqz v1, :cond_14

    .line 66
    iget-boolean v1, p0, Lcom/bytedance/pangle/res/a/b;->b:Z

    if-eqz v1, :cond_14

    .line 67
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/b;->j:[B

    iget-object v2, p0, Lcom/bytedance/pangle/res/a/b;->p:[I

    iget-object v3, p0, Lcom/bytedance/pangle/res/a/b;->a:Ljava/util/HashMap;

    invoke-static {v6, v1, v2, v0, v3}, Lcom/bytedance/pangle/res/a/k;->a(I[B[IILjava/util/HashMap;)V

    .line 68
    :cond_14
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/b;->m:Lcom/bytedance/pangle/res/a/b$a;

    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/b$a;->a()V

    .line 69
    iget v0, p0, Lcom/bytedance/pangle/res/a/b;->f:I

    iput v0, p0, Lcom/bytedance/pangle/res/a/b;->o:I

    return-void

    .line 70
    :cond_15
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_16
    const v7, 0x100103

    if-ne v6, v7, :cond_17

    .line 71
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 72
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 73
    iget v0, p0, Lcom/bytedance/pangle/res/a/b;->g:I

    iput v0, p0, Lcom/bytedance/pangle/res/a/b;->o:I

    .line 74
    iput-boolean v5, p0, Lcom/bytedance/pangle/res/a/b;->n:Z

    return-void

    :cond_17
    if-ne v6, v10, :cond_4

    .line 75
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-virtual {v0}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    .line 76
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    .line 77
    invoke-virtual {v0, v4}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 78
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    .line 79
    invoke-virtual {v0, v4}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 80
    iget v0, p0, Lcom/bytedance/pangle/res/a/b;->h:I

    iput v0, p0, Lcom/bytedance/pangle/res/a/b;->o:I

    return-void

    :cond_18
    :goto_7
    if-ne v6, v8, :cond_1a

    .line 81
    iget-object v6, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-virtual {v6}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    move-result v6

    .line 82
    iget-object v7, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    invoke-virtual {v7}, Lcom/bytedance/pangle/res/a/f;->readInt()I

    move-result v7

    .line 83
    iget-object v8, p0, Lcom/bytedance/pangle/res/a/b;->m:Lcom/bytedance/pangle/res/a/b$a;

    .line 84
    iget v9, v8, Lcom/bytedance/pangle/res/a/b$a;->c:I

    if-nez v9, :cond_19

    .line 85
    invoke-virtual {v8}, Lcom/bytedance/pangle/res/a/b$a;->a()V

    .line 86
    :cond_19
    invoke-virtual {v8}, Lcom/bytedance/pangle/res/a/b$a;->b()V

    .line 87
    iget v9, v8, Lcom/bytedance/pangle/res/a/b$a;->b:I

    add-int/lit8 v10, v9, -0x1

    .line 88
    iget-object v11, v8, Lcom/bytedance/pangle/res/a/b$a;->a:[I

    aget v12, v11, v10

    add-int/lit8 v13, v10, -0x1

    mul-int/lit8 v14, v12, 0x2

    sub-int/2addr v13, v14

    add-int/2addr v12, v5

    .line 89
    aput v12, v11, v13

    .line 90
    aput v6, v11, v10

    add-int/lit8 v6, v10, 0x1

    .line 91
    aput v7, v11, v6

    add-int/2addr v10, v3

    .line 92
    aput v12, v11, v10

    add-int/2addr v9, v3

    .line 93
    iput v9, v8, Lcom/bytedance/pangle/res/a/b$a;->b:I

    goto/16 :goto_1

    .line 94
    :cond_1a
    iget-object v6, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    .line 95
    invoke-virtual {v6, v4}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 96
    iget-object v6, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    .line 97
    invoke-virtual {v6, v4}, Lcom/bytedance/pangle/res/a/g;->skipBytes(I)I

    .line 98
    iget-object v6, p0, Lcom/bytedance/pangle/res/a/b;->m:Lcom/bytedance/pangle/res/a/b$a;

    .line 99
    iget v7, v6, Lcom/bytedance/pangle/res/a/b$a;->b:I

    if-eqz v7, :cond_4

    add-int/lit8 v8, v7, -0x1

    .line 100
    iget-object v9, v6, Lcom/bytedance/pangle/res/a/b$a;->a:[I

    aget v10, v9, v8

    if-eqz v10, :cond_4

    add-int/lit8 v10, v10, -0x1

    add-int/lit8 v8, v8, -0x2

    .line 101
    aput v10, v9, v8

    mul-int/lit8 v11, v10, 0x2

    add-int/2addr v11, v5

    sub-int/2addr v8, v11

    .line 102
    aput v10, v9, v8

    add-int/lit8 v7, v7, -0x2

    .line 103
    iput v7, v6, Lcom/bytedance/pangle/res/a/b$a;->b:I

    goto/16 :goto_1

    .line 104
    :cond_1b
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid chunk type ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_9

    :goto_8
    throw v0

    :goto_9
    goto :goto_8
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/pangle/res/a/b;->k:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/bytedance/pangle/res/a/b;->k:Z

    const/4 v1, 0x0

    .line 3
    iput-object v1, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    .line 4
    iput-object v1, p0, Lcom/bytedance/pangle/res/a/b;->l:[I

    .line 5
    iget-object v1, p0, Lcom/bytedance/pangle/res/a/b;->m:Lcom/bytedance/pangle/res/a/b$a;

    .line 6
    iput v0, v1, Lcom/bytedance/pangle/res/a/b$a;->b:I

    .line 7
    iput v0, v1, Lcom/bytedance/pangle/res/a/b$a;->c:I

    .line 8
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/b;->c()V

    return-void
.end method

.method public final b()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/pangle/res/a/b;->c:Lcom/bytedance/pangle/res/a/g;

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/bytedance/pangle/res/a/b;->d()V

    .line 3
    iget v0, p0, Lcom/bytedance/pangle/res/a/b;->o:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {p0}, Lcom/bytedance/pangle/res/a/b;->a()V

    .line 5
    throw v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Parser is not opened."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
