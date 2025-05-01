.class public Lcom/aggmoread/sdk/z/a/l/d;
.super Lcom/aggmoread/sdk/z/a/b;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/l/c;
.implements Lcom/aggmoread/sdk/z/a/l/e;
.implements Landroid/view/View$OnClickListener;
.implements Lcom/aggmoread/sdk/z/a/t/c$c;


# static fields
.field static final i:Ljava/lang/String;


# instance fields
.field private a:Lcom/aggmoread/sdk/z/a/g/b$a$a;

.field private b:Lcom/aggmoread/sdk/z/a/l/f;

.field private c:Lcom/aggmoread/sdk/z/a/g/b;

.field private d:Z

.field private volatile e:I

.field private f:Lcom/aggmoread/sdk/z/a/t/c;

.field private g:Lcom/aggmoread/sdk/z/a/s/d;

.field private volatile h:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/aggmoread/sdk/z/a/l/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/aggmoread/sdk/z/a/l/d;->i:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;)V
    .locals 2

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/b;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->d:Z

    iput v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->e:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->h:J

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/l/d;->a:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/l/d;->c:Lcom/aggmoread/sdk/z/a/g/b;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/h/c;->i()Ljava/lang/String;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    return-void
.end method

.method private a(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/View;->setFocusable(Z)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setClickable(Z)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private d()Z
    .locals 5

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->d:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->e:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/aggmoread/sdk/z/a/l/d;->h:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1388

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private f()V
    .locals 2

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->f:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->b:Lcom/aggmoread/sdk/z/a/l/f;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/l/f;->onADExposed()V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->a:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/a/g/b$a$a;->q:Ljava/util/List;

    const-string v1, "onAdExposure"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->d:Z

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->f:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/t/c;->a()V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Ljava/util/List;Lcom/aggmoread/sdk/z/a/l/f;)Landroid/view/View;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Lcom/aggmoread/sdk/z/a/l/f;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/aggmoread/sdk/z/a/l/d;->b:Lcom/aggmoread/sdk/z/a/l/f;

    if-eqz p2, :cond_1

    invoke-interface {p2, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p3

    const/4 v1, -0x1

    const-string v2, "JHAIMPTAG"

    if-ne p3, v1, :cond_0

    const-string p3, "bindView enter, add clickable view"

    invoke-static {v2, p3}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bindView enter, view = "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " , clickableViews size = "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {v2, p3}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-direct {p0, v0}, Lcom/aggmoread/sdk/z/a/l/d;->a(Ljava/util/ArrayList;)V

    instance-of p2, p1, Lcom/aggmoread/sdk/z/a/t/c;

    if-eqz p2, :cond_2

    move-object p2, p1

    check-cast p2, Lcom/aggmoread/sdk/z/a/t/c;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/l/d;->f:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-virtual {p2, p0}, Lcom/aggmoread/sdk/z/a/t/c;->a(Lcom/aggmoread/sdk/z/a/t/c$c;)V

    return-object p1

    :cond_2
    new-instance p2, Lcom/aggmoread/sdk/z/a/t/c;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3}, Lcom/aggmoread/sdk/z/a/t/c;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p3

    instance-of v0, p3, Landroid/view/ViewGroup;

    if-eqz v0, :cond_3

    check-cast p3, Landroid/view/ViewGroup;

    invoke-virtual {p3, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_3
    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/l/d;->f:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-virtual {p2, p0}, Lcom/aggmoread/sdk/z/a/t/c;->a(Lcom/aggmoread/sdk/z/a/t/c$c;)V

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/l/d;->f:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-virtual {p2, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/l/d;->f:Lcom/aggmoread/sdk/z/a/t/c;

    return-object p1
.end method

.method public a(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onWindowVisibilityChanged = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JHAIMPTAG"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->d:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/l/d;->f()V

    :cond_0
    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/t/f;Lcom/aggmoread/sdk/z/a/s/c;Lcom/aggmoread/sdk/z/a/l/e$a;)V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->f:Lcom/aggmoread/sdk/z/a/t/c;

    const-string v1, "JHAIMPTAG"

    if-nez v0, :cond_0

    const-string p1, "container shouldn\'t be null!"

    :goto_0
    invoke-static {v1, p1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    const-string p1, "media view shouldn\'t be null!"

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "media view should be visible!"

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/l/d;->isVideoAd()Z

    move-result v0

    if-nez v0, :cond_3

    const-string p1, "The native ad doesn\'t contain video!"

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->f:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/view/View;Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string p1, "The media view not in container !"

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/t/f;->b()Lcom/aggmoread/sdk/z/a/s/d;

    move-result-object v0

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/t/f;->a()Lcom/aggmoread/sdk/z/a/s/a;

    move-result-object p1

    instance-of v1, p1, Lcom/aggmoread/sdk/z/a/s/b;

    if-eqz v1, :cond_6

    if-nez p2, :cond_5

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/l/d;->c:Lcom/aggmoread/sdk/z/a/g/b;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/l/d;->c:Lcom/aggmoread/sdk/z/a/g/b;

    invoke-virtual {p2}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object p2

    invoke-virtual {p2}, Lcom/aggmoread/sdk/z/a/h/c;->l()Lcom/aggmoread/sdk/z/a/s/c;

    move-result-object p2

    :cond_5
    if-eqz p2, :cond_6

    check-cast p1, Lcom/aggmoread/sdk/z/a/s/b;

    invoke-virtual {p2}, Lcom/aggmoread/sdk/z/a/s/c;->a()Z

    move-result p2

    invoke-virtual {p1, p2}, Lcom/aggmoread/sdk/z/a/s/b;->b(Z)V

    :cond_6
    if-eqz v0, :cond_7

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->g:Lcom/aggmoread/sdk/z/a/s/d;

    new-instance p1, Lcom/aggmoread/sdk/z/a/l/d$a;

    invoke-direct {p1, p0, p3}, Lcom/aggmoread/sdk/z/a/l/d$a;-><init>(Lcom/aggmoread/sdk/z/a/l/d;Lcom/aggmoread/sdk/z/a/l/e$a;)V

    invoke-virtual {v0, p1}, Lcom/aggmoread/sdk/z/a/s/d;->a(Lcom/aggmoread/sdk/z/a/s/d$j;)V

    new-instance p1, Lcom/aggmoread/sdk/z/a/l/d$b;

    invoke-direct {p1, p0, p3}, Lcom/aggmoread/sdk/z/a/l/d$b;-><init>(Lcom/aggmoread/sdk/z/a/l/d;Lcom/aggmoread/sdk/z/a/l/e$a;)V

    invoke-virtual {v0, p1}, Lcom/aggmoread/sdk/z/a/s/d;->a(Landroid/media/MediaPlayer$OnPreparedListener;)V

    new-instance p1, Lcom/aggmoread/sdk/z/a/l/d$c;

    invoke-direct {p1, p0, p3}, Lcom/aggmoread/sdk/z/a/l/d$c;-><init>(Lcom/aggmoread/sdk/z/a/l/d;Lcom/aggmoread/sdk/z/a/l/e$a;)V

    invoke-virtual {v0, p1}, Lcom/aggmoread/sdk/z/a/s/d;->a(Landroid/media/MediaPlayer$OnCompletionListener;)V

    new-instance p1, Lcom/aggmoread/sdk/z/a/l/d$d;

    invoke-direct {p1, p0, p3}, Lcom/aggmoread/sdk/z/a/l/d$d;-><init>(Lcom/aggmoread/sdk/z/a/l/d;Lcom/aggmoread/sdk/z/a/l/e$a;)V

    invoke-virtual {v0, p1}, Lcom/aggmoread/sdk/z/a/s/d;->a(Landroid/media/MediaPlayer$OnErrorListener;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/l/d;->a:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->o()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_7

    invoke-virtual {v0, p1}, Lcom/aggmoread/sdk/z/a/s/d;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/SurfaceView;->requestFocus()Z

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/s/d;->d()V

    :cond_7
    return-void
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->a:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->l()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c()V
    .locals 3

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/l/d;->f()V

    sget-object v0, Lcom/aggmoread/sdk/z/a/l/d;->i:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dispatchDraw enter , SdkHelper.isShown(nativeAdViewExt) = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/l/d;->f:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-static {v2}, Lcom/aggmoread/sdk/z/a/m/b;->a(Landroid/view/View;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->a:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->n()I

    move-result v0

    return v0
.end method

.method public getDesc()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->a:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->g()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->a:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->k()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->a:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->l()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->a:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/a/g/b$a$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getVideoCurrentPosition()I
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->g:Lcom/aggmoread/sdk/z/a/s/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/s/d;->f()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getVideoDuration()I
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->g:Lcom/aggmoread/sdk/z/a/s/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/s/d;->e()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isAppAd()Z
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->a:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->r()Z

    move-result v0

    return v0
.end method

.method public isVideoAd()Z
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->a:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b$a$a;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/l/d;->d()Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "abort click , reason: hasExporsed = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->d:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " , isClicked = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->e:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "JHAIMPTAG"

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->h:J

    iget p1, p0, Lcom/aggmoread/sdk/z/a/l/d;->e:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/aggmoread/sdk/z/a/l/d;->e:I

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/l/d;->b:Lcom/aggmoread/sdk/z/a/l/f;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/a/l/f;->onADClicked()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/l/d;->f:Lcom/aggmoread/sdk/z/a/t/c;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/a/t/c;->c:Lcom/aggmoread/sdk/z/a/g/c;

    sget-object v0, Lcom/aggmoread/sdk/z/a/l/d;->i:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "feedsListFrameLayout2 juHeApiAdUrlDefine = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget v1, p1, Lcom/aggmoread/sdk/z/a/g/c;->a:I

    int-to-float v1, v1

    iget v2, p1, Lcom/aggmoread/sdk/z/a/g/c;->e:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    iget v2, p1, Lcom/aggmoread/sdk/z/a/g/c;->b:I

    int-to-float v2, v2

    iget v3, p1, Lcom/aggmoread/sdk/z/a/g/c;->f:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "action e x = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " ,y = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->a:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/a/g/b$a$a;->r:Ljava/util/List;

    const-string v1, "onAdClick"

    invoke-static {v1, v0, p1}, Lcom/aggmoread/sdk/z/a/q/a;->a(Ljava/lang/String;Ljava/util/List;Lcom/aggmoread/sdk/z/a/g/c;)Ljava/util/List;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->c:Lcom/aggmoread/sdk/z/a/g/b;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/l/d;->a:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/l/d;->b:Lcom/aggmoread/sdk/z/a/l/f;

    invoke-static {v0, v1, p1, v2}, Lcom/aggmoread/sdk/z/a/m/l;->a(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;Lcom/aggmoread/sdk/z/a/g/c;Lcom/aggmoread/sdk/z/a/i/b;)V

    return-void
.end method

.method public onScrollChanged()V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/l/d;->f()V

    return-void
.end method

.method public pauseVideo()V
    .locals 2

    const-string v0, "JHAIMPTAG"

    const-string v1, "pauseVideo"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->g:Lcom/aggmoread/sdk/z/a/s/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/s/d;->b()V

    :cond_0
    return-void
.end method

.method public resume()V
    .locals 2

    const-string v0, "JHAIMPTAG"

    const-string v1, "resume"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/l/d;->resumeVideo()V

    return-void
.end method

.method public resumeVideo()V
    .locals 2

    const-string v0, "JHAIMPTAG"

    const-string v1, "resumeVideo"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->g:Lcom/aggmoread/sdk/z/a/s/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/s/d;->d()V

    :cond_0
    return-void
.end method

.method public startVideo()V
    .locals 2

    const-string v0, "JHAIMPTAG"

    const-string v1, "startVideo"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->g:Lcom/aggmoread/sdk/z/a/s/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/s/d;->d()V

    :cond_0
    return-void
.end method

.method public stopVideo()V
    .locals 2

    const-string v0, "JHAIMPTAG"

    const-string v1, "stopVideo"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/l/d;->g:Lcom/aggmoread/sdk/z/a/s/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/s/d;->p()V

    :cond_0
    return-void
.end method
