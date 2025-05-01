.class public final Lcom/kwad/components/core/e/a/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/e/a/d;


# static fields
.field private static KA:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/Window;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private Kx:Lcom/kwad/components/core/e/a/g;

.field private Ky:Lcom/kwad/components/core/e/a/b;

.field private Kz:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private nZ:Landroid/view/ViewGroup;

.field private oa:Z

.field private final wU:Lcom/kwad/sdk/core/c/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kwad/sdk/core/c/c<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/components/core/e/a/h$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/e/a/h$1;-><init>(Lcom/kwad/components/core/e/a/h;)V

    iput-object v0, p0, Lcom/kwad/components/core/e/a/h;->wU:Lcom/kwad/sdk/core/c/c;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/e/a/h;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/e/a/h;->Kz:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public static a(Landroid/view/Window;)V
    .locals 1

    .line 2
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/kwad/components/core/e/a/h;->KA:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/core/e/a/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/e/a/h;->eR()V

    return-void
.end method

.method private eR()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/e/a/h;->oa:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/core/e/a/h;->oa:Z

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/e/a/h;->Ky:Lcom/kwad/components/core/e/a/b;

    invoke-interface {v0}, Lcom/kwad/components/core/e/a/b;->eQ()V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/e/a/h;->nZ:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/kwad/components/core/e/a/h;->Kx:Lcom/kwad/components/core/e/a/g;

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 6
    :cond_1
    invoke-static {}, Lcom/kwad/sdk/core/c/b;->En()Lcom/kwad/sdk/core/c/b;

    iget-object v0, p0, Lcom/kwad/components/core/e/a/h;->wU:Lcom/kwad/sdk/core/c/c;

    invoke-static {v0}, Lcom/kwad/sdk/core/c/b;->b(Lcom/kwad/sdk/core/c/c;)V

    return-void
.end method

.method public static nL()V
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/core/e/a/h;->KA:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->clear()V

    :cond_0
    const/4 v0, 0x0

    .line 3
    sput-object v0, Lcom/kwad/components/core/e/a/h;->KA:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final b(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/e/a/b;)Z
    .locals 5

    const-string v0, "InstalledActivateViewHelper"

    const/4 v1, 0x0

    .line 2
    :try_start_0
    iput-object p2, p0, Lcom/kwad/components/core/e/a/h;->Ky:Lcom/kwad/components/core/e/a/b;

    .line 3
    invoke-static {}, Lcom/kwad/sdk/core/c/b;->En()Lcom/kwad/sdk/core/c/b;

    invoke-static {}, Lcom/kwad/sdk/core/c/b;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 4
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    sget-object v3, Lcom/kwad/components/core/e/a/h;->KA:Ljava/lang/ref/WeakReference;

    if-eqz v3, :cond_1

    .line 6
    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/Window;

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    .line 8
    :goto_0
    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v3

    const v4, 0x1020002

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 9
    instance-of v4, v3, Landroid/view/ViewGroup;

    if-nez v4, :cond_2

    return v1

    .line 10
    :cond_2
    new-instance v4, Ljava/lang/ref/WeakReference;

    invoke-direct {v4, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v4, p0, Lcom/kwad/components/core/e/a/h;->Kz:Ljava/lang/ref/WeakReference;

    .line 11
    invoke-static {v2}, Lcom/kwad/sdk/n/l;->wrapContextIfNeed(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v2

    .line 12
    new-instance v4, Lcom/kwad/components/core/e/a/g;

    invoke-direct {v4, v2, p1, p0}, Lcom/kwad/components/core/e/a/g;-><init>(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/e/a/d;)V

    iput-object v4, p0, Lcom/kwad/components/core/e/a/h;->Kx:Lcom/kwad/components/core/e/a/g;

    .line 13
    invoke-static {}, Lcom/kwad/sdk/core/c/b;->En()Lcom/kwad/sdk/core/c/b;

    iget-object p1, p0, Lcom/kwad/components/core/e/a/h;->wU:Lcom/kwad/sdk/core/c/c;

    invoke-static {p1}, Lcom/kwad/sdk/core/c/b;->a(Lcom/kwad/sdk/core/c/c;)V

    .line 14
    check-cast v3, Landroid/view/ViewGroup;

    iput-object v3, p0, Lcom/kwad/components/core/e/a/h;->nZ:Landroid/view/ViewGroup;

    .line 15
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {p1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 16
    iget-object v2, p0, Lcom/kwad/components/core/e/a/h;->nZ:Landroid/view/ViewGroup;

    iget-object v3, p0, Lcom/kwad/components/core/e/a/h;->Kx:Lcom/kwad/components/core/e/a/g;

    invoke-virtual {v2, v3, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 17
    invoke-interface {p2}, Lcom/kwad/components/core/e/a/b;->nC()V

    const/4 p1, 0x1

    return p1

    .line 18
    :cond_3
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "showInWindow fail activity:"

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v1

    :catchall_0
    move-exception p1

    .line 19
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v2, "showInWindow fail error:"

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    return v1
.end method

.method public final nD()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/e/a/h;->eR()V

    return-void
.end method
