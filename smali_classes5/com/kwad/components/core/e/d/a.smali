.class public final Lcom/kwad/components/core/e/d/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/e/d/a$a;,
        Lcom/kwad/components/core/e/d/a$b;
    }
.end annotation


# static fields
.field private static KR:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/kwad/components/core/webview/tachikoma/a/k$b;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static a(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/e/d/a$b;Lcom/kwad/components/core/e/d/c;ZZZZ)I
    .locals 4
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/kwad/components/core/e/d/a$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/kwad/components/core/e/d/c;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    .line 1
    invoke-static {p1, v0}, Lcom/kwad/sdk/commercial/d/a;->f(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)V

    .line 2
    iput-boolean v0, p1, Lcom/kwad/sdk/core/response/model/AdTemplate;->converted:Z

    const/4 v1, 0x0

    .line 3
    invoke-static {v1}, Lcom/kwad/components/core/e/d/d;->ax(Z)V

    .line 4
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v2

    .line 5
    const-class v3, Lcom/kwad/components/a/a/a;

    invoke-static {v3}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    .line 6
    new-instance v3, Lcom/kwad/components/core/e/d/a$a;

    invoke-direct {v3, p0}, Lcom/kwad/components/core/e/d/a$a;-><init>(Landroid/content/Context;)V

    .line 7
    invoke-virtual {v3, p1}, Lcom/kwad/components/core/e/d/a$a;->ar(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p0

    .line 8
    invoke-virtual {p0, p2}, Lcom/kwad/components/core/e/d/a$a;->a(Lcom/kwad/components/core/e/d/a$b;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p0

    .line 9
    invoke-virtual {p0, p3}, Lcom/kwad/components/core/e/d/a$a;->b(Lcom/kwad/components/core/e/d/c;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p0

    .line 10
    invoke-virtual {p0, p4}, Lcom/kwad/components/core/e/d/a$a;->ao(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p0

    .line 11
    invoke-virtual {p0, p5}, Lcom/kwad/components/core/e/d/a$a;->ap(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p0

    .line 12
    invoke-virtual {p0, p7}, Lcom/kwad/components/core/e/d/a$a;->al(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p0

    .line 13
    invoke-virtual {p0, v1}, Lcom/kwad/components/core/e/d/a$a;->ar(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p0

    .line 14
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->am(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result p1

    const/4 p2, 0x2

    if-nez p6, :cond_0

    .line 15
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->or()I

    move-result p3

    if-eq p3, p2, :cond_0

    .line 16
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->or()I

    move-result p3

    if-ne p3, v0, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    const/16 p3, 0x10

    const/16 p4, 0xd

    if-nez v1, :cond_7

    .line 17
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->aR(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p5

    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p5

    if-nez p5, :cond_7

    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->on()Z

    move-result p5

    if-nez p5, :cond_7

    if-ne p1, v0, :cond_3

    .line 18
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->bg(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 19
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->k(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p0

    return p0

    .line 20
    :cond_2
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->l(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p0

    return p0

    :cond_3
    if-ne p1, p2, :cond_7

    .line 21
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->h(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p1

    if-ne p1, v0, :cond_4

    return p4

    :cond_4
    if-ne p1, p2, :cond_5

    return p3

    .line 22
    :cond_5
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->bg(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 23
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->k(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p0

    return p0

    .line 24
    :cond_6
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->l(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p0

    return p0

    .line 25
    :cond_7
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->h(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p1

    if-ne p1, v0, :cond_8

    return p4

    :cond_8
    if-ne p1, p2, :cond_9

    return p3

    .line 26
    :cond_9
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->aE(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-nez p1, :cond_b

    .line 27
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->j(Lcom/kwad/components/core/e/d/a$a;)Z

    move-result p1

    if-eqz p1, :cond_a

    const/16 p0, 0xb

    return p0

    .line 28
    :cond_a
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->l(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p0

    return p0

    .line 29
    :cond_b
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->m(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p1

    .line 30
    iget p3, v2, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    if-eq p3, p2, :cond_c

    const/4 p2, 0x3

    if-eq p3, p2, :cond_c

    .line 31
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->e(Lcom/kwad/components/core/e/d/a$a;)V

    :cond_c
    return p1
.end method

.method public static a(Lcom/kwad/components/core/e/d/a$a;)I
    .locals 9

    .line 32
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 33
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    .line 34
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v2

    const/4 v3, 0x0

    .line 35
    invoke-static {v3}, Lcom/kwad/components/core/e/d/d;->ax(Z)V

    .line 36
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->of()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 37
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->b(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p0

    return p0

    .line 38
    :cond_0
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->oo()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 39
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->ob()Lcom/kwad/components/core/e/d/a$b;

    move-result-object v2

    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->ha()Lcom/kwad/components/core/e/d/c;

    move-result-object v3

    .line 40
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a$a;->o(Lcom/kwad/components/core/e/d/a$a;)Z

    move-result v4

    .line 41
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->oi()Z

    move-result v5

    const/4 v6, 0x0

    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->oe()Z

    move-result v7

    .line 42
    invoke-static/range {v0 .. v7}, Lcom/kwad/components/core/e/d/a;->a(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/e/d/a$b;Lcom/kwad/components/core/e/d/c;ZZZZ)I

    move-result p0

    return p0

    .line 43
    :cond_1
    invoke-static {v1, v3}, Lcom/kwad/sdk/commercial/d/a;->f(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)V

    .line 44
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->c(Lcom/kwad/components/core/e/d/a$a;)Z

    move-result v0

    const/4 v4, 0x1

    if-eqz v0, :cond_2

    .line 45
    invoke-static {v1, v4}, Lcom/kwad/components/core/e/d/a;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return v4

    .line 46
    :cond_2
    iput-boolean v4, v1, Lcom/kwad/sdk/core/response/model/AdTemplate;->converted:Z

    .line 47
    const-class v0, Lcom/kwad/components/a/a/a;

    invoke-static {v0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    .line 48
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->am(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v0

    .line 49
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->or()I

    move-result v5

    const/4 v6, 0x2

    if-eq v5, v6, :cond_4

    .line 50
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->or()I

    move-result v5

    if-ne v5, v4, :cond_3

    goto :goto_0

    :cond_3
    const/4 v5, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v5, 0x1

    :goto_1
    const/16 v7, 0x10

    const/16 v8, 0xd

    if-nez v5, :cond_a

    .line 51
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->aR(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_a

    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->on()Z

    move-result v5

    if-nez v5, :cond_a

    if-ne v0, v4, :cond_6

    .line 52
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->bg(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 53
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->k(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p0

    return p0

    .line 54
    :cond_5
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->l(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p0

    return p0

    :cond_6
    if-ne v0, v6, :cond_a

    .line 55
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->h(Lcom/kwad/components/core/e/d/a$a;)I

    move-result v0

    if-ne v0, v4, :cond_7

    return v8

    :cond_7
    if-ne v0, v6, :cond_8

    return v7

    .line 56
    :cond_8
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->bg(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 57
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->k(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p0

    return p0

    .line 58
    :cond_9
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->l(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p0

    return p0

    .line 59
    :cond_a
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->h(Lcom/kwad/components/core/e/d/a$a;)I

    move-result v0

    if-ne v0, v4, :cond_b

    return v8

    :cond_b
    if-ne v0, v6, :cond_c

    return v7

    .line 60
    :cond_c
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->i(Lcom/kwad/components/core/e/d/a$a;)I

    move-result v0

    if-ne v0, v4, :cond_d

    const/16 p0, 0xc

    return p0

    :cond_d
    if-ne v0, v6, :cond_e

    const/16 p0, 0x11

    return p0

    .line 61
    :cond_e
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->om()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->aE(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-nez v0, :cond_f

    .line 62
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->n(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p0

    return p0

    .line 63
    :cond_f
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->aE(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-nez v0, :cond_12

    .line 64
    iget-boolean v0, v1, Lcom/kwad/sdk/core/response/model/AdTemplate;->isWebViewDownload:Z

    if-eqz v0, :cond_10

    .line 65
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->m(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p0

    return p0

    .line 66
    :cond_10
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->j(Lcom/kwad/components/core/e/d/a$a;)Z

    move-result v0

    if-eqz v0, :cond_11

    const/16 p0, 0xb

    return p0

    .line 67
    :cond_11
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->l(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p0

    return p0

    .line 68
    :cond_12
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->or()I

    move-result v0

    if-eq v0, v6, :cond_16

    .line 69
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->or()I

    move-result v0

    if-ne v0, v4, :cond_13

    goto :goto_2

    .line 70
    :cond_13
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->om()Z

    move-result v0

    if-eqz v0, :cond_15

    .line 71
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->CB()Z

    move-result v0

    invoke-static {v2, v0}, Lcom/kwad/sdk/core/response/b/a;->b(Lcom/kwad/sdk/core/response/model/AdInfo;Z)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 72
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->aR(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_15

    sget-boolean v0, Lcom/kwad/components/core/page/AdWebViewVideoActivityProxy;->showingAdWebViewVideoActivity:Z

    if-nez v0, :cond_15

    .line 73
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->ha()Lcom/kwad/components/core/e/d/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/components/core/e/d/c;->q(Lcom/kwad/components/core/e/d/a$a;)I

    move-result v0

    if-nez v0, :cond_14

    .line 74
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->k(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p0

    return p0

    .line 75
    :cond_14
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->e(Lcom/kwad/components/core/e/d/a$a;)V

    .line 76
    invoke-static {v1, v0}, Lcom/kwad/components/core/e/d/a;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return v0

    .line 77
    :cond_15
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->e(Lcom/kwad/components/core/e/d/a$a;)V

    .line 78
    invoke-virtual {p0, v4}, Lcom/kwad/components/core/e/d/a$a;->ar(Z)Lcom/kwad/components/core/e/d/a$a;

    .line 79
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->m(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p0

    return p0

    .line 80
    :cond_16
    :goto_2
    invoke-virtual {p0, v3}, Lcom/kwad/components/core/e/d/a$a;->ar(Z)Lcom/kwad/components/core/e/d/a$a;

    .line 81
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->e(Lcom/kwad/components/core/e/d/a$a;)V

    .line 82
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->m(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p0

    return p0
.end method

.method public static a(Lcom/kwad/components/core/webview/tachikoma/a/k$b;)V
    .locals 1

    .line 83
    sget-object v0, Lcom/kwad/components/core/e/d/a;->KR:Ljava/util/List;

    if-nez v0, :cond_0

    .line 84
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Lcom/kwad/components/core/e/d/a;->KR:Ljava/util/List;

    .line 85
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 86
    sget-object p0, Lcom/kwad/components/core/e/d/a;->KR:Ljava/util/List;

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static b(Lcom/kwad/components/core/e/d/a$a;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    .line 3
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v2

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/n/l;->dB(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 5
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->U(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 6
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->nZ()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->oe()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v0, 0x2

    .line 7
    invoke-virtual {p0, v0}, Lcom/kwad/components/core/e/d/a$a;->ak(I)V

    .line 8
    invoke-static {v3, p0}, Lcom/kwad/components/core/e/e/e;->a(Landroid/app/Activity;Lcom/kwad/components/core/e/d/a$a;)V

    const/16 p0, 0x13

    .line 9
    invoke-static {v1, p0}, Lcom/kwad/components/core/e/d/a;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return p0

    .line 10
    :cond_0
    new-instance p0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;

    invoke-direct {p0}, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;-><init>()V

    .line 11
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/b;->cD(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->au(Ljava/lang/String;)Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;

    move-result-object p0

    .line 12
    invoke-virtual {p0, v1}, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->at(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;

    move-result-object p0

    const/4 v2, 0x1

    .line 13
    invoke-virtual {p0, v2}, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->aD(Z)Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;

    move-result-object p0

    .line 14
    invoke-virtual {p0}, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->pK()Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;

    move-result-object p0

    .line 15
    invoke-static {v0, p0}, Lcom/kwad/components/core/page/AdWebViewActivityProxy;->launch(Landroid/content/Context;Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;)V

    const/16 p0, 0x14

    .line 16
    invoke-static {v1, p0}, Lcom/kwad/components/core/e/d/a;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return p0
.end method

.method public static b(Lcom/kwad/components/core/webview/tachikoma/a/k$b;)V
    .locals 4

    .line 17
    sget-object v0, Lcom/kwad/components/core/e/d/a;->KR:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    sget-object v1, Lcom/kwad/components/core/e/d/a;->KR:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, -0x1

    if-ge v0, v1, :cond_2

    .line 19
    sget-object v1, Lcom/kwad/components/core/e/d/a;->KR:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_1

    .line 20
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 21
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-ne p0, v1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, -0x1

    :goto_1
    if-eq v0, v2, :cond_3

    .line 22
    sget-object p0, Lcom/kwad/components/core/e/d/a;->KR:Ljava/util/List;

    invoke-interface {p0, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_3
    return-void
.end method

.method private static c(Lcom/kwad/components/core/e/d/a$a;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aE(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->op()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-static {p0}, Lcom/kwad/components/core/e/d/c;->A(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p0

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    return v2

    :cond_0
    return v1

    .line 4
    :cond_1
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->d(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p0

    if-ne p0, v2, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method private static d(Lcom/kwad/components/core/e/d/a$a;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 2
    iget-object v1, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->unDownloadConf:Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadConf;

    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadConf;->unDownloadRegionConf:Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadRegionConf;

    if-eqz v1, :cond_2

    .line 3
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->cV()I

    move-result p0

    const/4 v1, 0x2

    if-eq p0, v1, :cond_1

    const/4 v1, 0x3

    if-eq p0, v1, :cond_0

    .line 4
    iget-object p0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->unDownloadConf:Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadConf;

    iget-object p0, p0, Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadConf;->unDownloadRegionConf:Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadRegionConf;

    iget p0, p0, Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadRegionConf;->actionBarType:I

    return p0

    .line 5
    :cond_0
    iget-object p0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->unDownloadConf:Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadConf;

    iget-object p0, p0, Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadConf;->unDownloadRegionConf:Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadRegionConf;

    iget p0, p0, Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadRegionConf;->materialJumpType:I

    return p0

    .line 6
    :cond_1
    iget-object p0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->unDownloadConf:Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadConf;

    iget-object p0, p0, Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadConf;->unDownloadRegionConf:Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadRegionConf;

    iget p0, p0, Lcom/kwad/sdk/core/response/model/AdInfo$UnDownloadRegionConf;->describeBarType:I

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private static d(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V
    .locals 0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 7
    :pswitch_0
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->bx(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void

    .line 8
    :pswitch_1
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->bw(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void

    .line 9
    :pswitch_2
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->bu(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void

    .line 10
    :pswitch_3
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->by(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    goto :goto_0

    .line 11
    :pswitch_4
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->bv(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void

    .line 12
    :pswitch_5
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->bj(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void

    .line 13
    :pswitch_6
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->be(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void

    .line 14
    :pswitch_7
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->bf(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void

    .line 15
    :pswitch_8
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->bg(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void

    .line 16
    :pswitch_9
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->bh(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void

    .line 17
    :pswitch_a
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->bo(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void

    .line 18
    :pswitch_b
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->bp(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void

    .line 19
    :pswitch_c
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->bn(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void

    .line 20
    :pswitch_d
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->bm(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void

    .line 21
    :pswitch_e
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->bl(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void

    .line 22
    :pswitch_f
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->br(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void

    .line 23
    :pswitch_10
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->bq(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void

    .line 24
    :pswitch_11
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->bk(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void

    .line 25
    :pswitch_12
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->bs(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void

    .line 26
    :pswitch_13
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->bi(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void

    .line 27
    :pswitch_14
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->bt(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static e(Lcom/kwad/components/core/e/d/a$a;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->nZ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->g(Lcom/kwad/components/core/e/d/a$a;)V

    .line 3
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->f(Lcom/kwad/components/core/e/d/a$a;)V

    .line 4
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->ob()Lcom/kwad/components/core/e/d/a$b;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    :try_start_0
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->ob()Lcom/kwad/components/core/e/d/a$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/components/core/e/d/a$b;->onAdClicked()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 6
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    .line 7
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p0

    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/a;->bd(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method

.method private static f(Lcom/kwad/components/core/e/d/a$a;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->oj()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a$a;->p(Lcom/kwad/components/core/e/d/a$a;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->ok()Lcom/kwad/sdk/core/adlog/c/a;

    move-result-object v1

    .line 3
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->ho()Lorg/json/JSONObject;

    move-result-object p0

    .line 4
    invoke-static {v0, v1, p0}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/adlog/c/a;Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method

.method private static g(Lcom/kwad/components/core/e/d/a$a;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/kwad/components/core/e/d/a;->KR:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a$a;->p(Lcom/kwad/components/core/e/d/a$a;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    sget-object v0, Lcom/kwad/components/core/e/d/a;->KR:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/core/webview/tachikoma/a/k$b;

    if-eqz v1, :cond_1

    .line 5
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a$a;->p(Lcom/kwad/components/core/e/d/a$a;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v2

    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/e;->ec(Lcom/kwad/sdk/core/response/model/AdTemplate;)J

    move-result-wide v2

    .line 6
    invoke-interface {v1, v2, v3}, Lcom/kwad/components/core/webview/tachikoma/a/k$b;->L(J)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method private static h(Lcom/kwad/components/core/e/d/a$a;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    const/4 v2, 0x1

    .line 3
    invoke-static {p0, v2}, Lcom/kwad/components/core/e/d/d;->a(Lcom/kwad/components/core/e/d/a$a;I)I

    move-result v3

    if-ne v3, v2, :cond_2

    .line 4
    invoke-static {v2}, Lcom/kwad/components/core/e/d/d;->ax(Z)V

    .line 5
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->e(Lcom/kwad/components/core/e/d/a$a;)V

    .line 6
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->cL(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->cM(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->os()Z

    move-result v1

    if-nez v1, :cond_1

    .line 7
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    .line 8
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->oh()J

    move-result-wide v4

    long-to-float p0, v4

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr p0, v2

    float-to-double v4, p0

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int p0, v4

    .line 9
    invoke-static {v1, p0}, Lcom/kwad/sdk/core/adlog/c;->m(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    :cond_1
    const/16 p0, 0xd

    .line 10
    invoke-static {v0, p0}, Lcom/kwad/components/core/e/d/a;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    goto :goto_0

    :cond_2
    const/4 v1, 0x2

    if-ne v3, v1, :cond_3

    .line 11
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->e(Lcom/kwad/components/core/e/d/a$a;)V

    const/16 p0, 0x10

    .line 12
    invoke-static {v0, p0}, Lcom/kwad/components/core/e/d/a;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    :cond_3
    :goto_0
    return v3
.end method

.method private static i(Lcom/kwad/components/core/e/d/a$a;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    .line 3
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v2

    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v2

    .line 4
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/kwad/sdk/n/l;->dB(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    .line 5
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->T(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 6
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->nZ()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-static {v2}, Lcom/kwad/components/core/e/d/e;->E(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 7
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->oe()Z

    move-result v2

    if-nez v2, :cond_0

    .line 8
    invoke-virtual {p0, v4}, Lcom/kwad/components/core/e/d/a$a;->ak(I)V

    .line 9
    invoke-static {v3, p0}, Lcom/kwad/components/core/e/e/e;->a(Landroid/app/Activity;Lcom/kwad/components/core/e/d/a$a;)V

    .line 10
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->e(Lcom/kwad/components/core/e/d/a$a;)V

    const/16 p0, 0x11

    .line 11
    invoke-static {v1, p0}, Lcom/kwad/components/core/e/d/a;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    const/4 p0, 0x2

    return p0

    .line 12
    :cond_0
    invoke-static {v0, v1}, Lcom/kwad/components/core/e/d/e;->d(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)I

    move-result v0

    if-ne v0, v4, :cond_1

    .line 13
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->e(Lcom/kwad/components/core/e/d/a$a;)V

    const/16 p0, 0xc

    .line 14
    invoke-static {v1, p0}, Lcom/kwad/components/core/e/d/a;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    :cond_1
    return v0
.end method

.method private static j(Lcom/kwad/components/core/e/d/a$a;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 3
    invoke-static {v1, v0}, Lcom/kwad/sdk/utils/d;->h(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->e(Lcom/kwad/components/core/e/d/a$a;)V

    const/4 p0, 0x0

    .line 5
    invoke-static {v0, p0}, Lcom/kwad/sdk/core/adlog/c;->k(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    const/16 p0, 0xb

    .line 6
    invoke-static {v0, p0}, Lcom/kwad/components/core/e/d/a;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    :cond_0
    return v1
.end method

.method private static k(Lcom/kwad/components/core/e/d/a$a;)I
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->e(Lcom/kwad/components/core/e/d/a$a;)V

    .line 2
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    .line 4
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/kwad/sdk/n/l;->dB(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 5
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->U(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->nZ()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->oe()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x2

    .line 7
    invoke-virtual {p0, v1}, Lcom/kwad/components/core/e/d/a$a;->ak(I)V

    .line 8
    invoke-static {v2, p0}, Lcom/kwad/components/core/e/e/e;->a(Landroid/app/Activity;Lcom/kwad/components/core/e/d/a$a;)V

    const/16 p0, 0x13

    .line 9
    invoke-static {v0, p0}, Lcom/kwad/components/core/e/d/a;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/kwad/components/core/page/AdWebViewVideoActivityProxy;->launch(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    const/16 p0, 0xf

    .line 11
    invoke-static {v0, p0}, Lcom/kwad/components/core/e/d/a;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return p0
.end method

.method private static l(Lcom/kwad/components/core/e/d/a$a;)I
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->e(Lcom/kwad/components/core/e/d/a$a;)V

    .line 2
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    .line 4
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v2

    .line 5
    invoke-static {v0}, Lcom/kwad/sdk/n/l;->dB(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 6
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->U(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 7
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->nZ()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->oe()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v0, 0x2

    .line 8
    invoke-virtual {p0, v0}, Lcom/kwad/components/core/e/d/a$a;->ak(I)V

    .line 9
    invoke-static {v3, p0}, Lcom/kwad/components/core/e/e/e;->a(Landroid/app/Activity;Lcom/kwad/components/core/e/d/a$a;)V

    const/16 p0, 0x13

    .line 10
    invoke-static {v1, p0}, Lcom/kwad/components/core/e/d/a;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return p0

    .line 11
    :cond_0
    new-instance v2, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;

    invoke-direct {v2}, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;-><init>()V

    .line 12
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/b;->cD(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->au(Ljava/lang/String;)Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;

    move-result-object v2

    .line 13
    invoke-virtual {v2, v1}, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->at(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;

    move-result-object v2

    .line 14
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->oc()Z

    move-result p0

    invoke-virtual {v2, p0}, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->aE(Z)Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;

    move-result-object p0

    const/4 v2, 0x1

    .line 15
    invoke-virtual {p0, v2}, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->az(I)Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;

    move-result-object p0

    .line 16
    invoke-virtual {p0}, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->pK()Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;

    move-result-object p0

    .line 17
    invoke-static {v0, p0}, Lcom/kwad/components/core/page/AdWebViewActivityProxy;->launch(Landroid/content/Context;Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;)V

    const/16 p0, 0xe

    .line 18
    invoke-static {v1, p0}, Lcom/kwad/components/core/e/d/a;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return p0
.end method

.method private static m(Lcom/kwad/components/core/e/d/a$a;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->ha()Lcom/kwad/components/core/e/d/c;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/e/d/c;

    invoke-static {p0}, Lcom/kwad/components/core/e/d/a$a;->p(Lcom/kwad/components/core/e/d/a$a;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/kwad/components/core/e/d/c;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 3
    invoke-virtual {p0, v0}, Lcom/kwad/components/core/e/d/a$a;->b(Lcom/kwad/components/core/e/d/c;)Lcom/kwad/components/core/e/d/a$a;

    .line 4
    :cond_0
    invoke-virtual {v0, p0}, Lcom/kwad/components/core/e/d/c;->r(Lcom/kwad/components/core/e/d/a$a;)I

    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/kwad/components/core/e/d/a;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return v0
.end method

.method private static n(Lcom/kwad/components/core/e/d/a$a;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    .line 3
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->j(Lcom/kwad/components/core/e/d/a$a;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 p0, 0xb

    return p0

    .line 4
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->CB()Z

    move-result v2

    invoke-static {v1, v2}, Lcom/kwad/sdk/core/response/b/a;->b(Lcom/kwad/sdk/core/response/model/AdInfo;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mAdWebVideoPageShowing:Z

    if-nez v0, :cond_1

    .line 5
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->k(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p0

    return p0

    .line 6
    :cond_1
    invoke-static {p0}, Lcom/kwad/components/core/e/d/a;->l(Lcom/kwad/components/core/e/d/a$a;)I

    move-result p0

    return p0
.end method
