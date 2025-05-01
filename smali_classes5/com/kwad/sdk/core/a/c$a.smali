.class public final Lcom/kwad/sdk/core/a/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/core/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field static final avY:Lcom/kwad/sdk/core/a/c$a;

.field static final avZ:Lcom/kwad/sdk/core/a/c$a;

.field private static final awa:[I

.field private static final awb:[I


# instance fields
.field private final awc:Z

.field private final awd:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/a/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/kwad/sdk/core/a/c$a;-><init>(ZZ)V

    sput-object v0, Lcom/kwad/sdk/core/a/c$a;->avY:Lcom/kwad/sdk/core/a/c$a;

    .line 2
    new-instance v0, Lcom/kwad/sdk/core/a/c$a;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lcom/kwad/sdk/core/a/c$a;-><init>(ZZ)V

    sput-object v0, Lcom/kwad/sdk/core/a/c$a;->avZ:Lcom/kwad/sdk/core/a/c$a;

    const/16 v0, 0x100

    new-array v2, v0, [I

    .line 3
    sput-object v2, Lcom/kwad/sdk/core/a/c$a;->awa:[I

    new-array v0, v0, [I

    .line 4
    sput-object v0, Lcom/kwad/sdk/core/a/c$a;->awb:[I

    const/4 v0, -0x1

    .line 5
    invoke-static {v2, v0}, Ljava/util/Arrays;->fill([II)V

    const/4 v2, 0x0

    .line 6
    :goto_0
    invoke-static {}, Lcom/kwad/sdk/core/a/c$b;->Eh()[C

    move-result-object v3

    array-length v3, v3

    if-ge v2, v3, :cond_0

    .line 7
    sget-object v3, Lcom/kwad/sdk/core/a/c$a;->awa:[I

    invoke-static {}, Lcom/kwad/sdk/core/a/c$b;->Eh()[C

    move-result-object v4

    aget-char v4, v4, v2

    aput v2, v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 8
    :cond_0
    sget-object v2, Lcom/kwad/sdk/core/a/c$a;->awa:[I

    const/16 v3, 0x3d

    const/4 v4, -0x2

    aput v4, v2, v3

    .line 9
    sget-object v2, Lcom/kwad/sdk/core/a/c$a;->awb:[I

    invoke-static {v2, v0}, Ljava/util/Arrays;->fill([II)V

    .line 10
    :goto_1
    invoke-static {}, Lcom/kwad/sdk/core/a/c$b;->Ei()[C

    move-result-object v0

    array-length v0, v0

    if-ge v1, v0, :cond_1

    .line 11
    sget-object v0, Lcom/kwad/sdk/core/a/c$a;->awb:[I

    invoke-static {}, Lcom/kwad/sdk/core/a/c$b;->Ei()[C

    move-result-object v2

    aget-char v2, v2, v1

    aput v1, v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 12
    :cond_1
    sget-object v0, Lcom/kwad/sdk/core/a/c$a;->awb:[I

    aput v4, v0, v3

    return-void
.end method

.method private constructor <init>(ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/kwad/sdk/core/a/c$a;->awc:Z

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/kwad/sdk/core/a/c$a;->awd:Z

    return-void
.end method

.method private a([BII)I
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/core/a/c$a;->awc:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/kwad/sdk/core/a/c$a;->awb:[I

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/kwad/sdk/core/a/c$a;->awa:[I

    :goto_0
    add-int/lit8 v1, p3, 0x0

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    const/4 v3, -0x1

    const/4 v4, 0x2

    if-ge v1, v4, :cond_3

    .line 2
    iget-boolean p1, p0, Lcom/kwad/sdk/core/a/c$a;->awd:Z

    if-eqz p1, :cond_2

    aget p1, v0, v2

    if-ne p1, v3, :cond_2

    return v2

    .line 3
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Input byte[] should at least have 2 bytes for base64 bytes"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4
    :cond_3
    iget-boolean v5, p0, Lcom/kwad/sdk/core/a/c$a;->awd:Z

    const/16 v6, 0x3d

    const/4 v7, 0x1

    if-eqz v5, :cond_7

    const/4 v4, 0x0

    :goto_1
    if-ge p2, p3, :cond_6

    add-int/lit8 v5, p2, 0x1

    .line 5
    aget-byte p2, p1, p2

    and-int/lit16 p2, p2, 0xff

    if-ne p2, v6, :cond_4

    sub-int/2addr p3, v5

    add-int/2addr p3, v7

    sub-int/2addr v1, p3

    goto :goto_2

    .line 6
    :cond_4
    aget p2, v0, p2

    if-ne p2, v3, :cond_5

    add-int/lit8 v4, v4, 0x1

    :cond_5
    move p2, v5

    goto :goto_1

    :cond_6
    :goto_2
    sub-int/2addr v1, v4

    goto :goto_3

    :cond_7
    add-int/lit8 p2, p3, -0x1

    .line 7
    aget-byte p2, p1, p2

    if-ne p2, v6, :cond_9

    sub-int/2addr p3, v4

    .line 8
    aget-byte p1, p1, p3

    if-ne p1, v6, :cond_8

    const/4 v2, 0x2

    goto :goto_3

    :cond_8
    const/4 v2, 0x1

    :cond_9
    :goto_3
    if-nez v2, :cond_a

    and-int/lit8 p1, v1, 0x3

    if-eqz p1, :cond_a

    rsub-int/lit8 v2, p1, 0x4

    :cond_a
    add-int/lit8 v1, v1, 0x3

    .line 9
    div-int/lit8 v1, v1, 0x4

    mul-int/lit8 v1, v1, 0x3

    sub-int/2addr v1, v2

    return v1
.end method

.method private a([BII[B)I
    .locals 10

    .line 10
    iget-boolean v0, p0, Lcom/kwad/sdk/core/a/c$a;->awc:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/kwad/sdk/core/a/c$a;->awb:[I

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/kwad/sdk/core/a/c$a;->awa:[I

    :goto_0
    const/16 v1, 0x12

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v4, 0x12

    const/4 v5, 0x0

    :goto_1
    const/4 v6, 0x6

    const/16 v7, 0x10

    if-ge p2, p3, :cond_7

    add-int/lit8 v8, p2, 0x1

    .line 11
    aget-byte p2, p1, p2

    and-int/lit16 p2, p2, 0xff

    .line 12
    aget p2, v0, p2

    if-gez p2, :cond_5

    const/4 v9, -0x2

    if-ne p2, v9, :cond_3

    if-ne v4, v6, :cond_1

    if-eq v8, p3, :cond_2

    add-int/lit8 p2, v8, 0x1

    .line 13
    aget-byte v2, p1, v8

    const/16 v8, 0x3d

    if-ne v2, v8, :cond_2

    goto :goto_2

    :cond_1
    move p2, v8

    :goto_2
    if-eq v4, v1, :cond_2

    goto :goto_4

    .line 14
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Input byte array has wrong 4-byte ending unit"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 15
    :cond_3
    iget-boolean p2, p0, Lcom/kwad/sdk/core/a/c$a;->awd:Z

    if-eqz p2, :cond_4

    goto :goto_3

    .line 16
    :cond_4
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Illegal base64 character "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v8, v8, -0x1

    aget-byte p1, p1, v8

    .line 17
    invoke-static {p1, v7}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_5
    shl-int/2addr p2, v4

    or-int/2addr p2, v3

    add-int/lit8 v4, v4, -0x6

    if-gez v4, :cond_6

    add-int/lit8 v3, v5, 0x1

    shr-int/lit8 v4, p2, 0x10

    int-to-byte v4, v4

    .line 18
    aput-byte v4, p4, v5

    add-int/lit8 v4, v3, 0x1

    shr-int/lit8 v5, p2, 0x8

    int-to-byte v5, v5

    .line 19
    aput-byte v5, p4, v3

    add-int/lit8 v5, v4, 0x1

    int-to-byte p2, p2

    .line 20
    aput-byte p2, p4, v4

    const/4 v3, 0x0

    const/16 v4, 0x12

    goto :goto_3

    :cond_6
    move v3, p2

    :goto_3
    move p2, v8

    goto :goto_1

    :cond_7
    :goto_4
    if-ne v4, v6, :cond_8

    add-int/lit8 v1, v5, 0x1

    shr-int/lit8 v2, v3, 0x10

    int-to-byte v2, v2

    .line 21
    aput-byte v2, p4, v5

    move v5, v1

    goto :goto_5

    :cond_8
    if-nez v4, :cond_9

    add-int/lit8 v1, v5, 0x1

    shr-int/lit8 v2, v3, 0x10

    int-to-byte v2, v2

    .line 22
    aput-byte v2, p4, v5

    add-int/lit8 v5, v1, 0x1

    shr-int/lit8 v2, v3, 0x8

    int-to-byte v2, v2

    .line 23
    aput-byte v2, p4, v1

    goto :goto_5

    :cond_9
    const/16 p4, 0xc

    if-eq v4, p4, :cond_d

    :goto_5
    if-ge p2, p3, :cond_c

    .line 24
    iget-boolean p4, p0, Lcom/kwad/sdk/core/a/c$a;->awd:Z

    if-eqz p4, :cond_b

    add-int/lit8 p4, p2, 0x1

    aget-byte p2, p1, p2

    aget p2, v0, p2

    if-gez p2, :cond_a

    move p2, p4

    goto :goto_5

    :cond_a
    move p2, p4

    .line 25
    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Input byte array has incorrect ending byte at "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    return v5

    .line 26
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Last unit does not have enough valid bits"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_7

    :goto_6
    throw p1

    :goto_7
    goto :goto_6
.end method


# virtual methods
.method public final decode(Ljava/lang/String;)[B
    .locals 1

    .line 4
    invoke-static {}, Lcom/kwad/sdk/core/a/c;->Eg()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/kwad/sdk/core/a/c$a;->decode([B)[B

    move-result-object p1

    return-object p1
.end method

.method public final decode([B)[B
    .locals 4

    .line 1
    array-length v0, p1

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Lcom/kwad/sdk/core/a/c$a;->a([BII)I

    move-result v0

    new-array v2, v0, [B

    .line 2
    array-length v3, p1

    invoke-direct {p0, p1, v1, v3, v2}, Lcom/kwad/sdk/core/a/c$a;->a([BII[B)I

    move-result p1

    if-eq p1, v0, :cond_0

    .line 3
    invoke-static {v2, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    :cond_0
    return-object v2
.end method
