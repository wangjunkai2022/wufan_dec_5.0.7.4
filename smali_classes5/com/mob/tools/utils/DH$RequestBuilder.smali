.class public Lcom/mob/tools/utils/DH$RequestBuilder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mob/tools/utils/DH;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RequestBuilder"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mob/tools/utils/DH$RequestBuilder$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lcom/mob/tools/utils/DH$RequestBuilder$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    .line 4
    iput-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lcom/mob/tools/utils/DH$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/mob/tools/utils/DH$RequestBuilder;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method private a()Lcom/mob/tools/utils/DH$DHResponse;
    .locals 5

    .line 5
    new-instance v0, Lcom/mob/tools/utils/DH$DHResponse;

    invoke-direct {v0}, Lcom/mob/tools/utils/DH$DHResponse;-><init>()V

    const/4 v1, 0x0

    .line 6
    :goto_0
    iget-object v2, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/LinkedList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 7
    iget-object v2, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    invoke-virtual {v2, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    .line 8
    :try_start_0
    iget-object v3, v2, Lcom/mob/tools/utils/DH$RequestBuilder$a;->a:Ljava/lang/String;

    iget-object v4, v2, Lcom/mob/tools/utils/DH$RequestBuilder$a;->b:[Ljava/lang/Object;

    invoke-direct {p0, v3, v4}, Lcom/mob/tools/utils/DH$RequestBuilder;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/mob/tools/utils/DH$DHResponse;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    .line 9
    :try_start_1
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Throwable;)I

    .line 10
    iget-object v2, v2, Lcom/mob/tools/utils/DH$RequestBuilder$a;->a:Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-virtual {v0, v2, v3, v4}, Lcom/mob/tools/utils/DH$DHResponse;->a(Ljava/lang/String;Ljava/lang/Object;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v2

    .line 11
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Throwable;)I

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method static synthetic a(Lcom/mob/tools/utils/DH$RequestBuilder;)Lcom/mob/tools/utils/DH$DHResponse;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/mob/tools/utils/DH$RequestBuilder;->a()Lcom/mob/tools/utils/DH$DHResponse;

    move-result-object p0

    return-object p0
.end method

.method private a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const-string v0, "gmpfo"

    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    const-string v2, "params illegal: "

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    .line 13
    array-length p1, p2

    if-ne p1, v1, :cond_0

    .line 14
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/String;

    .line 15
    aget-object p2, p2, v3

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 16
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object v0

    invoke-interface {v0, v4, v4, p1, p2}, Lcom/mob/tools/b/a;->b(ZILjava/lang/String;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const-string v0, "gmpfofce"

    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v5, 0x3

    if-eqz v0, :cond_3

    if-eqz p2, :cond_2

    .line 19
    array-length p1, p2

    if-ne p1, v5, :cond_2

    .line 20
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 21
    aget-object v0, p2, v3

    check-cast v0, Ljava/lang/String;

    .line 22
    aget-object p2, p2, v1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 23
    iget-object v1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object v1

    invoke-interface {v1, p1, v4, v0, p2}, Lcom/mob/tools/b/a;->b(ZILjava/lang/String;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 24
    :cond_2
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const-string v0, "getMpfos"

    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz p2, :cond_4

    .line 26
    array-length p1, p2

    if-ne p1, v5, :cond_4

    .line 27
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 28
    aget-object v0, p2, v3

    check-cast v0, Ljava/lang/String;

    .line 29
    aget-object p2, p2, v1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 30
    iget-object v1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object v1

    invoke-interface {v1, v4, p1, v0, p2}, Lcom/mob/tools/b/a;->b(ZILjava/lang/String;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 31
    :cond_4
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    const-string v0, "cird"

    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 33
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->a()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_6
    const-string v0, "gsimt"

    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 35
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1, v4}, Lcom/mob/tools/b/a;->a(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_7
    const-string v0, "gsimtfce"

    .line 36
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    if-eqz p2, :cond_8

    .line 37
    array-length p1, p2

    if-ne p1, v3, :cond_8

    .line 38
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 39
    iget-object p2, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p2

    invoke-virtual {p2}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/mob/tools/b/a;->a(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 40
    :cond_8
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    const-string v0, "gbsi"

    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 42
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1, v4}, Lcom/mob/tools/b/a;->b(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_a
    const-string v0, "gbsifce"

    .line 43
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    if-eqz p2, :cond_b

    .line 44
    array-length p1, p2

    if-ne p1, v3, :cond_b

    .line 45
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 46
    iget-object p2, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p2

    invoke-virtual {p2}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/mob/tools/b/a;->b(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 47
    :cond_b
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    const-string v0, "gstmpts"

    .line 48
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    if-eqz p2, :cond_d

    .line 49
    array-length p1, p2

    if-ne p1, v3, :cond_d

    .line 50
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/String;

    .line 51
    iget-object p2, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p2

    invoke-virtual {p2}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/mob/tools/b/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 52
    :cond_d
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    const-string v0, "gscsz"

    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 54
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->C()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_f
    const-string v0, "gcrie"

    .line 55
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 56
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1, v4}, Lcom/mob/tools/b/a;->c(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_10
    const-string v0, "gcriefce"

    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    if-eqz p2, :cond_11

    .line 58
    array-length p1, p2

    if-ne p1, v3, :cond_11

    .line 59
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 60
    iget-object p2, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p2

    invoke-virtual {p2}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/mob/tools/b/a;->c(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 61
    :cond_11
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_12
    const-string v0, "gcrnm"

    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 63
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1, v4}, Lcom/mob/tools/b/a;->d(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_13
    const-string v0, "gcrnmfce"

    .line 64
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    if-eqz p2, :cond_14

    .line 65
    array-length p1, p2

    if-ne p1, v3, :cond_14

    .line 66
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 67
    iget-object p2, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p2

    invoke-virtual {p2}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/mob/tools/b/a;->d(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 68
    :cond_14
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_15
    const-string v0, "gsnmd"

    .line 69
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 70
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->S()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_16
    const-string v0, "gsnmdfp"

    .line 71
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    if-eqz p2, :cond_17

    .line 72
    array-length p1, p2

    if-ne p1, v3, :cond_17

    .line 73
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/String;

    .line 74
    iget-object p2, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p2

    invoke-virtual {p2}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/mob/tools/b/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 75
    :cond_17
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_18
    const-string v0, "gneyp"

    .line 76
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 77
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1, v4}, Lcom/mob/tools/b/a;->f(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_19
    const-string v0, "gneypnw"

    .line 78
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 79
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->D()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1a
    const-string v0, "gneypfce"

    .line 80
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    if-eqz p2, :cond_1b

    .line 81
    array-length p1, p2

    if-ne p1, v3, :cond_1b

    .line 82
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 83
    iget-object p2, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p2

    invoke-virtual {p2}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/mob/tools/b/a;->f(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 84
    :cond_1b
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1c
    const-string v0, "cknavbl"

    .line 85
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 86
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->G()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_1d
    const-string v0, "gnktpfs"

    .line 87
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 88
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->E()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1e
    const-string v0, "gdtlnktpfs"

    .line 89
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 90
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->F()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1f
    const-string v0, "gdvk"

    .line 91
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    .line 92
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->Q()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_20
    const-string v0, "gdvkfc"

    .line 93
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_22

    if-eqz p2, :cond_21

    .line 94
    array-length p1, p2

    if-ne p1, v3, :cond_21

    .line 95
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 96
    iget-object p2, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p2

    invoke-virtual {p2}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/mob/tools/b/a;->g(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 97
    :cond_21
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_22
    const-string v0, "gpnmmt"

    .line 98
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_23

    .line 99
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->U()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_23
    const-string v0, "gpnmfp"

    .line 100
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_25

    if-eqz p2, :cond_24

    .line 101
    array-length p1, p2

    if-ne p1, v3, :cond_24

    .line 102
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/String;

    .line 103
    iget-object p2, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p2

    invoke-virtual {p2}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/mob/tools/b/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 104
    :cond_24
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_25
    const-string v0, "gia"

    .line 105
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_27

    if-eqz p2, :cond_26

    .line 106
    array-length p1, p2

    if-ne p1, v3, :cond_26

    .line 107
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 108
    iget-object p2, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p2

    invoke-virtual {p2}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p2

    invoke-interface {p2, p1, v4}, Lcom/mob/tools/b/a;->a(ZZ)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    .line 109
    :cond_26
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_27
    const-string v0, "giafce"

    .line 110
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_29

    if-eqz p2, :cond_28

    .line 111
    array-length p1, p2

    if-ne p1, v1, :cond_28

    .line 112
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 113
    aget-object p2, p2, v3

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    .line 114
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/mob/tools/b/a;->a(ZZ)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    .line 115
    :cond_28
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_29
    const-string v0, "gsl"

    .line 116
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2a

    .line 117
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->P()Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :cond_2a
    const-string v0, "gscpt"

    .line 118
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2b

    .line 119
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->R()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2b
    const-string v0, "gavti"

    .line 120
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2c

    .line 121
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->j()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2c
    const-string v0, "glctn"

    .line 122
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2e

    if-eqz p2, :cond_2d

    .line 123
    array-length p1, p2

    if-ne p1, v5, :cond_2d

    .line 124
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 125
    aget-object v0, p2, v3

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 126
    aget-object p2, p2, v1

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    .line 127
    iget-object v1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object v1

    invoke-interface {v1, p1, v0, p2}, Lcom/mob/tools/b/a;->a(IIZ)Landroid/location/Location;

    move-result-object p1

    return-object p1

    .line 128
    :cond_2d
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2e
    const-string v0, "gtecloc"

    .line 129
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2f

    .line 130
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->p()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2f
    const-string v0, "gnbclin"

    .line 131
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_30

    .line 132
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->q()Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :cond_30
    const-string v0, "gdvtp"

    .line 133
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_31

    .line 134
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->o()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_31
    const-string v0, "wmcwi"

    .line 135
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_32

    .line 136
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->r()Ljava/util/HashMap;

    move-result-object p1

    return-object p1

    :cond_32
    const-string v0, "ipgist"

    .line 137
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_34

    if-eqz p2, :cond_33

    .line 138
    array-length p1, p2

    if-ne p1, v3, :cond_33

    .line 139
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/String;

    .line 140
    iget-object p2, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p2

    invoke-virtual {p2}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/mob/tools/b/a;->b(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 141
    :cond_33
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_34
    const-string v0, "gcuin"

    .line 142
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_35

    .line 143
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->w()Ljava/util/HashMap;

    move-result-object p1

    return-object p1

    :cond_35
    const-string v0, "gtydvin"

    .line 144
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_36

    .line 145
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->x()Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :cond_36
    const-string v0, "gqmkn"

    .line 146
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_37

    .line 147
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->y()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_37
    const-string v0, "gszin"

    .line 148
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_38

    .line 149
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->z()Ljava/util/HashMap;

    move-result-object p1

    return-object p1

    :cond_38
    const-string v0, "gmrin"

    .line 150
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_39

    .line 151
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->A()Ljava/util/HashMap;

    move-result-object p1

    return-object p1

    :cond_39
    const-string v0, "gmivsn"

    .line 152
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3a

    .line 153
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->k()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3a
    const-string v0, "cx"

    .line 154
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3b

    .line 155
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->b()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_3b
    const-string v0, "ckpd"

    .line 156
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3c

    .line 157
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->c()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_3c
    const-string v0, "ubenbl"

    .line 158
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3d

    .line 159
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->h()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_3d
    const-string v0, "dvenbl"

    .line 160
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3e

    .line 161
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->g()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_3e
    const-string v0, "ckua"

    .line 162
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3f

    .line 163
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->f()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_3f
    const-string v0, "vnmt"

    .line 164
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_40

    .line 165
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->e()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_40
    const-string v0, "degb"

    .line 166
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_41

    .line 167
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->d()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_41
    const-string v0, "iwpxy"

    .line 168
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_42

    .line 169
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->i()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_42
    const-string v0, "gflv"

    .line 170
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_43

    .line 171
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->J()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_43
    const-string v0, "gbsbd"

    .line 172
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_44

    .line 173
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->K()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_44
    const-string v0, "gbfspy"

    .line 174
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_45

    .line 175
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->L()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_45
    const-string v0, "gbplfo"

    .line 176
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_46

    .line 177
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->M()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_46
    const-string v0, "gdntp"

    .line 178
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_47

    .line 179
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->H()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_47
    const-string v0, "qritsvc"

    .line 180
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_49

    if-eqz p2, :cond_48

    .line 181
    array-length p1, p2

    if-ne p1, v1, :cond_48

    .line 182
    aget-object p1, p2, v4

    check-cast p1, Landroid/content/Intent;

    .line 183
    aget-object p2, p2, v3

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 184
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/mob/tools/b/a;->a(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 185
    :cond_48
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_49
    const-string v0, "rsaciy"

    .line 186
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4b

    if-eqz p2, :cond_4a

    .line 187
    array-length p1, p2

    if-ne p1, v1, :cond_4a

    .line 188
    aget-object p1, p2, v4

    check-cast p1, Landroid/content/Intent;

    .line 189
    aget-object p2, p2, v3

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 190
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/mob/tools/b/a;->b(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object p1

    return-object p1

    .line 191
    :cond_4a
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4b
    const-string v0, "gpgif"

    .line 192
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4d

    if-eqz p2, :cond_4c

    .line 193
    array-length p1, p2

    if-ne p1, v1, :cond_4c

    .line 194
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/String;

    .line 195
    aget-object p2, p2, v3

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 196
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object v0

    invoke-interface {v0, v4, v4, p1, p2}, Lcom/mob/tools/b/a;->a(ZILjava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    return-object p1

    .line 197
    :cond_4c
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4d
    const-string v0, "gpgiffcin"

    .line 198
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4f

    if-eqz p2, :cond_4e

    .line 199
    array-length p1, p2

    if-ne p1, v5, :cond_4e

    .line 200
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 201
    aget-object v0, p2, v3

    check-cast v0, Ljava/lang/String;

    .line 202
    aget-object p2, p2, v1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 203
    iget-object v1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object v1

    invoke-interface {v1, p1, v4, v0, p2}, Lcom/mob/tools/b/a;->a(ZILjava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    return-object p1

    .line 204
    :cond_4e
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4f
    const-string v0, "gpgifstrg"

    .line 205
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_51

    if-eqz p2, :cond_50

    .line 206
    array-length p1, p2

    if-ne p1, v5, :cond_50

    .line 207
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 208
    aget-object v0, p2, v3

    check-cast v0, Ljava/lang/String;

    .line 209
    aget-object p2, p2, v1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 210
    iget-object v1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object v1

    invoke-interface {v1, v4, p1, v0, p2}, Lcom/mob/tools/b/a;->a(ZILjava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    return-object p1

    .line 211
    :cond_50
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_51
    const-string v0, "giads"

    .line 212
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_52

    .line 213
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->N()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_52
    const-string v0, "gdvda"

    .line 214
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_53

    .line 215
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->ab()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_53
    const-string v0, "gdvdtnas"

    .line 216
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_54

    .line 217
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->ac()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_54
    const-string v0, "galtut"

    .line 218
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_55

    .line 219
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->ad()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :cond_55
    const-string v0, "gdvme"

    .line 220
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_56

    .line 221
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->ae()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_56
    const-string v0, "gcrup"

    .line 222
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_57

    .line 223
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->af()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_57
    const-string v0, "gcifm"

    .line 224
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_58

    .line 225
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->ag()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_58
    const-string v0, "godm"

    .line 226
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_59

    .line 227
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->ah()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_59
    const-string v0, "godhm"

    .line 228
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5a

    .line 229
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->ai()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_5a
    const-string v0, "galdm"

    .line 230
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5b

    .line 231
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->aj()Ljava/util/HashMap;

    move-result-object p1

    return-object p1

    :cond_5b
    const-string v0, "gtaif"

    .line 232
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5c

    .line 233
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->ak()Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    return-object p1

    :cond_5c
    const-string v0, "gtaifprm"

    .line 234
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5e

    if-eqz p2, :cond_5d

    .line 235
    array-length p1, p2

    if-ne p1, v1, :cond_5d

    .line 236
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/String;

    .line 237
    aget-object p2, p2, v3

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 238
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/mob/tools/b/a;->a(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    return-object p1

    .line 239
    :cond_5d
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5e
    const-string v0, "gtaifprmfce"

    .line 240
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_60

    if-eqz p2, :cond_5f

    .line 241
    array-length p1, p2

    if-ne p1, v5, :cond_5f

    .line 242
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 243
    aget-object v0, p2, v3

    check-cast v0, Ljava/lang/String;

    .line 244
    aget-object p2, p2, v1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 245
    iget-object v1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object v1

    invoke-interface {v1, p1, v0, p2}, Lcom/mob/tools/b/a;->a(ZLjava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    return-object p1

    .line 246
    :cond_5f
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_60
    const-string v0, "gtbdt"

    .line 247
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_61

    .line 248
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->am()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :cond_61
    const-string v0, "gtscnin"

    .line 249
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_62

    .line 250
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->an()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :cond_62
    const-string v0, "gtscnppi"

    .line 251
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_63

    .line 252
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->ao()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_63
    const-string v0, "ishmos"

    .line 253
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_64

    .line 254
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->ap()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_64
    const-string v0, "gthmosv"

    .line 255
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_65

    .line 256
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->aq()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_65
    const-string v0, "gthmosdtlv"

    .line 257
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_66

    .line 258
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->ar()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_66
    const-string v0, "gthmpmst"

    .line 259
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_67

    .line 260
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->as()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_67
    const-string v0, "gthmepmst"

    .line 261
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_68

    .line 262
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->at()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_68
    const-string v0, "gtinnerlangmt"

    .line 263
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_69

    .line 264
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->au()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_69
    const-string v0, "gtgramgendt"

    .line 265
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6a

    .line 266
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->av()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_6a
    const-string v0, "gtelcmefce"

    .line 267
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6b

    .line 268
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 269
    aget-object v0, p2, v3

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 270
    aget-object v1, p2, v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 271
    aget-object p2, p2, v5

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    .line 272
    iget-object v2, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object v2

    invoke-interface {v2, p1, v0, v1, p2}, Lcom/mob/tools/b/a;->a(IIZZ)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_6b
    const-string v0, "gtmwfo"

    .line 273
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6c

    .line 274
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1, v4}, Lcom/mob/tools/b/a;->e(Z)Ljava/util/HashMap;

    move-result-object p1

    return-object p1

    :cond_6c
    const-string v0, "wmcwifce"

    .line 275
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6e

    if-eqz p2, :cond_6d

    .line 276
    array-length p1, p2

    if-ne p1, v3, :cond_6d

    .line 277
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 278
    iget-object p2, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p2

    invoke-virtual {p2}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/mob/tools/b/a;->e(Z)Ljava/util/HashMap;

    move-result-object p1

    return-object p1

    .line 279
    :cond_6d
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6e
    const-string v0, "gtaifok"

    .line 280
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6f

    .line 281
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->al()Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :cond_6f
    const-string v0, "gtmcdi"

    .line 282
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_70

    .line 283
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1, v4}, Lcom/mob/tools/b/a;->a(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_70
    const-string v0, "gtmcdifce"

    .line 284
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_72

    if-eqz p2, :cond_71

    .line 285
    array-length p1, p2

    if-ne p1, v3, :cond_71

    .line 286
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 287
    iget-object p2, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p2

    invoke-virtual {p2}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/mob/tools/b/a;->a(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 288
    :cond_71
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_72
    const-string v0, "gtmbcdi"

    .line 289
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_73

    .line 290
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1, v4}, Lcom/mob/tools/b/a;->b(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_73
    const-string v0, "gtmbcdifce"

    .line 291
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_75

    if-eqz p2, :cond_74

    .line 292
    array-length p1, p2

    if-ne p1, v3, :cond_74

    .line 293
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 294
    iget-object p2, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p2

    invoke-virtual {p2}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/mob/tools/b/a;->b(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 295
    :cond_74
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_75
    const-string v0, "miwpy"

    .line 296
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_76

    .line 297
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->i()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_76
    const-string v0, "gtmnbclfo"

    .line 298
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_77

    .line 299
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->q()Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :cond_77
    const-string v0, "ctedebbing"

    .line 300
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_78

    .line 301
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->aw()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_78
    const-string v0, "gteacifo"

    .line 302
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_79

    .line 303
    iget-object p1, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/mob/tools/b/a;->ax()Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :cond_79
    const-string v0, "gtdm"

    .line 304
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7b

    if-eqz p2, :cond_7a

    .line 305
    array-length p1, p2

    if-ne p1, v3, :cond_7a

    .line 306
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 307
    iget-object p2, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p2

    invoke-virtual {p2}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/mob/tools/b/a;->h(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 308
    :cond_7a
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7b
    const-string v0, "gtlstactme"

    .line 309
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7d

    if-eqz p2, :cond_7c

    .line 310
    array-length p1, p2

    if-ne p1, v3, :cond_7c

    .line 311
    aget-object p1, p2, v4

    check-cast p1, Ljava/lang/String;

    .line 312
    iget-object p2, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object p2

    invoke-virtual {p2}, Lcom/mob/tools/b/c;->d()Lcom/mob/tools/b/a;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/mob/tools/b/a;->f(Ljava/lang/String;)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    .line 313
    :cond_7c
    new-instance p1, Ljava/lang/Throwable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7d
    const/4 p1, 0x0

    return-object p1
.end method

.method private a(Lcom/mob/tools/utils/DH$DHResponder;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 3
    :try_start_0
    new-instance v0, Lcom/mob/tools/utils/DH$DHResponse;

    invoke-direct {v0}, Lcom/mob/tools/utils/DH$DHResponse;-><init>()V

    invoke-interface {p1, v0}, Lcom/mob/tools/utils/DH$DHResponder;->onResponse(Lcom/mob/tools/utils/DH$DHResponse;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 4
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Error from caller"

    invoke-virtual {v0, p1, v2, v1}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I

    :cond_0
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/mob/tools/utils/DH$RequestBuilder;Lcom/mob/tools/utils/DH$DHResponder;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/mob/tools/utils/DH$RequestBuilder;->a(Lcom/mob/tools/utils/DH$DHResponder;)V

    return-void
.end method


# virtual methods
.method public checkDebbing()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "ctedebbing"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public checkNetworkAvailable()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "cknavbl"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public checkPad()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "ckpd"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public checkUA()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "ckua"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public cx()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "cx"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public debugable()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "degb"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public devEnable()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "dvenbl"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getACIfo()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gteacifo"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getAInfo()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gtaif"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getAInfoForPkg(Ljava/lang/String;I)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v2, p2

    const-string p1, "gtaifprm"

    const/4 p2, 0x0

    invoke-direct {v1, p1, v2, p2}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getAInfoForPkgForce(ZLjava/lang/String;I)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object p2, v2, p1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v2, p2

    const-string p1, "gtaifprmfce"

    const/4 p2, 0x0

    invoke-direct {v1, p1, v2, p2}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getALLD()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "galdm"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getAdvertisingID()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gavti"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getAppLastUpdateTime()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "galtut"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getAppName()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gpnmmt"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getAppNameForPkg(Ljava/lang/String;)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "gpnmfp"

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getBaseband()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gbsbd"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getBdT()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gtbdt"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getBoardFromSysProperty()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gbfspy"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getBoardPlatform()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gbplfo"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getBssid()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gbsi"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getBssidForce(Z)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "gbsifce"

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getBtM()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 0

    return-object p0
.end method

.method public getCInfo()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gcifm"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getCLoc()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gtecloc"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getCPUInfo()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gcuin"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getCarrier()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gcrie"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getCarrierForce(Z)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "gcriefce"

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getCarrierName()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gcrnm"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getCarrierNameForce(Z)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "gcrnmfce"

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getCgroup()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gcrup"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getCurrentWifiInfo()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "wmcwi"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getDM(Z)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "gtdm"

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getDataNtType()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gdntp"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getDetailNetworkTypeForStatic()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gdtlnktpfs"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getDeviceData()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gdvda"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getDeviceDataNotAES()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gdvdtnas"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getDeviceId()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 0

    return-object p0
.end method

.method public getDeviceKey()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gdvk"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getDeviceKeyFromCache(Z)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "gdvkfc"

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getDeviceName()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gdvme"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getDeviceType()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gdvtp"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getDrID()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 0

    return-object p0
.end method

.method public getFlavor()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gflv"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getGrammaticalGender()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gtgramgendt"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getHmEPMState()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gthmepmst"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getHmOsDetailedVer()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gthmosdtlv"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getHmOsVer()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gthmosv"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getHmPMState()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gthmpmst"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getIA(Z)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "gia"

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getIAForce(ZZ)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v2, p2

    const-string p1, "giafce"

    const/4 p2, 0x0

    invoke-direct {v1, p1, v2, p2}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getIMEI()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 0

    return-object p0
.end method

.method public getIMSI()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 0

    return-object p0
.end method

.method public getIPAddress()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "giads"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getInnerAppLanguage()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gtinnerlangmt"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getLATime(Ljava/lang/String;)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "gtlstactme"

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getLocation(IIZ)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v2, p2

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v2, p2

    const-string p1, "glctn"

    const/4 p2, 0x0

    invoke-direct {v1, p1, v2, p2}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getMIUIVersion()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gmivsn"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getMbcdi()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gtmbcdi"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getMbcdiForce(Z)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "gtmbcdifce"

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getMcdi()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gtmcdi"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getMcdiForce(Z)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "gtmcdifce"

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getMemoryInfo()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gmrin"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getMnbclfo()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gtmnbclfo"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getMpfo(Ljava/lang/String;I)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v2, p2

    const-string p1, "gmpfo"

    const/4 p2, 0x0

    invoke-direct {v1, p1, v2, p2}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getMpfof(ZLjava/lang/String;I)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object p2, v2, p1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v2, p2

    const-string p1, "gmpfofce"

    const/4 p2, 0x0

    invoke-direct {v1, p1, v2, p2}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getMpfos(ILjava/lang/String;I)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object p2, v2, p1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v2, p2

    const-string p1, "getMpfos"

    const/4 p2, 0x0

    invoke-direct {v1, p1, v2, p2}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getMwfo()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gtmwfo"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getMwfoForce(Z)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "wmcwifce"

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getMwlfo()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gtaifok"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getNeighboringCellInfo()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gnbclin"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getNetworkType()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gneyp"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getNetworkTypeForStatic()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gnktpfs"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getNetworkTypeForce(Z)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "gneypfce"

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getNetworkTypeNew()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gneypnw"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getOD()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "godm"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getODH()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "godhm"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getPInfo(Ljava/lang/String;I)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v2, p2

    const-string p1, "gpgif"

    const/4 p2, 0x0

    invoke-direct {v1, p1, v2, p2}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getPInfoForce(ZLjava/lang/String;I)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object p2, v2, p1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v2, p2

    const-string p1, "gpgiffcin"

    const/4 p2, 0x0

    invoke-direct {v1, p1, v2, p2}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getPInfoStrategy(ILjava/lang/String;I)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object p2, v2, p1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v2, p2

    const-string p1, "gpgifstrg"

    const/4 p2, 0x0

    invoke-direct {v1, p1, v2, p2}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getPosCommForce(IIZZ)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v2, p2

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v2, p2

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v2, p2

    const-string p1, "gtelcmefce"

    const/4 p2, 0x0

    invoke-direct {v1, p1, v2, p2}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getQemuKernel()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gqmkn"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getSA()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gsl"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getSSID()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gsimt"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getSSIDForce(Z)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "gsimtfce"

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getScreenInch()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gtscnin"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getScreenPpi()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gtscnppi"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getScreenSize()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gscsz"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getSdcardState()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 0

    return-object p0
.end method

.method public getSerialno()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 0

    return-object p0
.end method

.method public getSignMD5()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gsnmd"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getSignMD5ForPkg(Ljava/lang/String;)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "gsnmdfp"

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getSimSerialNumber()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 0

    return-object p0
.end method

.method public getSizeInfo()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gszin"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getSystemProperties(Ljava/lang/String;)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "gstmpts"

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getTTYDriversInfo()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "gtydvin"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getTopActivity()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 0

    return-object p0
.end method

.method public getUpM()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 0

    return-object p0
.end method

.method public isHmOs()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "ishmos"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public isMwpy()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "miwpy"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public isPackageInstalled(Ljava/lang/String;)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "ipgist"

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public isRooted()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "cird"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public isWifiProxy()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "iwpxy"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public queryIMEI()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 0

    return-object p0
.end method

.method public queryIMSI()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 0

    return-object p0
.end method

.method public queryIntentServices(Landroid/content/Intent;I)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v2, p2

    const-string p1, "qritsvc"

    const/4 p2, 0x0

    invoke-direct {v1, p1, v2, p2}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public request(Lcom/mob/tools/utils/DH$DHResponder;)V
    .locals 8

    .line 1
    :try_start_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    sget-object v1, Lcom/mob/tools/c/a;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/Boolean;

    .line 3
    sget-object v1, Lcom/mob/tools/c/a;->c:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/Boolean;

    .line 4
    new-instance v7, Lcom/mob/tools/utils/DH$RequestBuilder$1;

    move-object v1, v7

    move-object v2, p0

    move-object v5, p1

    move v6, v0

    invoke-direct/range {v1 .. v6}, Lcom/mob/tools/utils/DH$RequestBuilder$1;-><init>(Lcom/mob/tools/utils/DH$RequestBuilder;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/mob/tools/utils/DH$DHResponder;Z)V

    if-eqz v0, :cond_1

    .line 5
    sget-object v0, Lcom/mob/commons/z;->g:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v7}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 6
    :cond_1
    invoke-interface {v7}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 7
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Throwable;)I

    if-eqz p1, :cond_2

    .line 8
    invoke-direct {p0, p1}, Lcom/mob/tools/utils/DH$RequestBuilder;->a(Lcom/mob/tools/utils/DH$DHResponder;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public resolveActivity(Landroid/content/Intent;I)Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v2, p2

    const-string p1, "rsaciy"

    const/4 p2, 0x0

    invoke-direct {v1, p1, v2, p2}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public usbEnable()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "ubenbl"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public vpn()Lcom/mob/tools/utils/DH$RequestBuilder;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/mob/tools/utils/DH$RequestBuilder;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/mob/tools/utils/DH$RequestBuilder$a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "vnmt"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/mob/tools/utils/DH$RequestBuilder$a;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lcom/mob/tools/utils/DH$1;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method
