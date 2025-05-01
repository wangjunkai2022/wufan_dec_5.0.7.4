.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->getView()Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 9

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "onViewAttachedToWindow enter "

    invoke-static {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->h(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->i(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of v2, p1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/e/m;->a(Landroid/view/View;)Landroid/app/Activity;

    move-result-object p1

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getView onViewAttachedToWindow "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    new-instance v3, Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    invoke-direct {v3, p1}, Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;-><init>(Landroid/content/Context;)V

    invoke-static {v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;)Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    new-instance v2, Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    iget-object v3, v3, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v3, v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d:Landroid/content/Context;

    invoke-direct {v2, v3}, Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;-><init>(Landroid/content/Context;)V

    invoke-static {p1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;)Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->h(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->h(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;->setUseDownloadFrame(Z)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->h(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    move-result-object p1

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a$a;

    invoke-direct {v1, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;)V

    invoke-virtual {p1, v1}, Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;->setFeedPortraitListener(Lcom/baidu/mobads/sdk/api/IFeedPortraitListener;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "portraitVideoView parent "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->h(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {p1, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x11

    iput v1, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->i(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    move-result-object v1

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->h(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->h(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->i(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;Ljava/util/List;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "render enter "

    invoke-static {p1, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-array v6, v0, [Landroid/view/View;

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->i(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    move-result-object p1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Landroid/view/View;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    iget-object v0, p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v2, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->b:Ljava/lang/Object;

    iget-object v3, p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    sget-object v4, Lcom/aggmoread/sdk/z/c/a/a/c/i;->g:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->i(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    move-result-object v5

    new-instance v7, Ljava/lang/ref/WeakReference;

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->i(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    move-result-object p1

    invoke-direct {v7, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;[Ljava/lang/Object;Lcom/aggmoread/sdk/z/c/a/a/c/i;Landroid/view/View;[Landroid/view/View;Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    iget-object v0, p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->b:Ljava/lang/Object;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->e()Z

    move-result p1

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b()Z

    move-result v1

    invoke-static {v0, p1, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->b(Ljava/lang/Object;ZZ)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->r:Lcom/aggmoread/sdk/z/c/a/a/e/b;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/e/b;->b()[B

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->b:Ljava/lang/Object;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;[B)V

    :cond_2
    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    iget-object v0, p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->h(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->h(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;->play()V

    :cond_4
    :goto_1
    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
