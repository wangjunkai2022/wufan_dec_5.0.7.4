.class public final Lcom/kwad/components/ad/h/a/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/h/a/a/b$b;,
        Lcom/kwad/components/ad/h/a/a/b$c;,
        Lcom/kwad/components/ad/h/a/a/b$a;
    }
.end annotation


# static fields
.field public static nu:I = 0x1

.field public static nv:I = 0x2


# instance fields
.field private nA:Ljava/lang/Runnable;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private nt:Lcom/kwad/sdk/core/webview/c/c;

.field private nw:I

.field private nx:I

.field private ny:Lcom/kwad/components/ad/h/a/a/b$c;

.field private nz:Lcom/kwad/components/ad/h/a/a/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/components/ad/h/a/a/b$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/kwad/components/ad/h/a/a/b$c;-><init>(Lcom/kwad/components/ad/h/a/a/b;B)V

    iput-object v0, p0, Lcom/kwad/components/ad/h/a/a/b;->ny:Lcom/kwad/components/ad/h/a/a/b$c;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/kwad/components/ad/h/a/a/b;->nA:Ljava/lang/Runnable;

    .line 4
    iput p1, p0, Lcom/kwad/components/ad/h/a/a/b;->nw:I

    .line 5
    iput p2, p0, Lcom/kwad/components/ad/h/a/a/b;->nx:I

    return-void
.end method

.method private I(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "updateTimer: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCallBackFunction: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/kwad/components/ad/h/a/a/b;->nt:Lcom/kwad/sdk/core/webview/c/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RegisterTimer"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-gez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/h/a/a/b;->nt:Lcom/kwad/sdk/core/webview/c/c;

    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/h/a/a/b;->nz:Lcom/kwad/components/ad/h/a/a/b$b;

    if-eqz v0, :cond_2

    if-nez p1, :cond_2

    .line 4
    iget v1, p0, Lcom/kwad/components/ad/h/a/a/b;->nw:I

    invoke-interface {v0, v1}, Lcom/kwad/components/ad/h/a/a/b$b;->E(I)V

    .line 5
    :cond_2
    new-instance v0, Lcom/kwad/components/ad/h/a/a/b$a;

    invoke-direct {v0}, Lcom/kwad/components/ad/h/a/a/b$a;-><init>()V

    .line 6
    iput p1, v0, Lcom/kwad/components/ad/h/a/a/b$a;->nD:I

    .line 7
    iget p1, p0, Lcom/kwad/components/ad/h/a/a/b;->nw:I

    iput p1, v0, Lcom/kwad/components/ad/h/a/a/b$a;->nC:I

    .line 8
    iget-object p1, p0, Lcom/kwad/components/ad/h/a/a/b;->nt:Lcom/kwad/sdk/core/webview/c/c;

    if-eqz p1, :cond_3

    .line 9
    invoke-interface {p1, v0}, Lcom/kwad/sdk/core/webview/c/c;->a(Lcom/kwad/sdk/core/b;)V

    :cond_3
    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/h/a/a/b;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/h/a/a/b;->I(I)V

    return-void
.end method

.method private static f(Lcom/kwad/sdk/core/response/model/AdInfo;)I
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/kwad/components/ad/interstitial/b/b;->b(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v0

    if-gtz v0, :cond_0

    const/16 v0, 0x3c

    .line 2
    :cond_0
    iget-object p0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->adInsertScreenInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdInsertScreenInfo;

    iget p0, p0, Lcom/kwad/sdk/core/response/model/AdInfo$AdInsertScreenInfo;->autoCloseTime:I

    if-lez p0, :cond_1

    .line 3
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    move-result v0

    :cond_1
    return v0
.end method

.method public static z(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/ad/h/a/a/b;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p0

    .line 2
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/a;->bb(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/a;->bI(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    new-instance v0, Lcom/kwad/components/ad/h/a/a/b;

    sget v1, Lcom/kwad/components/ad/h/a/a/b;->nv:I

    invoke-static {p0}, Lcom/kwad/components/ad/h/a/a/b;->f(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result p0

    invoke-direct {v0, v1, p0}, Lcom/kwad/components/ad/h/a/a/b;-><init>(II)V

    return-object v0

    .line 5
    :cond_1
    iget-object p0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->adInsertScreenInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdInsertScreenInfo;

    iget p0, p0, Lcom/kwad/sdk/core/response/model/AdInfo$AdInsertScreenInfo;->autoCloseTime:I

    if-lez p0, :cond_2

    .line 6
    new-instance v0, Lcom/kwad/components/ad/h/a/a/b;

    sget v1, Lcom/kwad/components/ad/h/a/a/b;->nu:I

    invoke-direct {v0, v1, p0}, Lcom/kwad/components/ad/h/a/a/b;-><init>(II)V

    return-object v0

    :cond_2
    return-object v1
.end method


# virtual methods
.method public final a(Lcom/kwad/components/ad/h/a/a/b$b;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/h/a/a/b;->nz:Lcom/kwad/components/ad/h/a/a/b$b;

    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 0
    .param p2    # Lcom/kwad/sdk/core/webview/c/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 3
    iput-object p2, p0, Lcom/kwad/components/ad/h/a/a/b;->nt:Lcom/kwad/sdk/core/webview/c/c;

    .line 4
    iget-object p1, p0, Lcom/kwad/components/ad/h/a/a/b;->nA:Ljava/lang/Runnable;

    if-eqz p1, :cond_0

    .line 5
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lcom/kwad/components/ad/h/a/a/b;->nA:Ljava/lang/Runnable;

    :cond_0
    return-void
.end method

.method public final eG()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "startTimer: mCallBackFunction: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/components/ad/h/a/a/b;->nt:Lcom/kwad/sdk/core/webview/c/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RegisterTimer"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/h/a/a/b;->nt:Lcom/kwad/sdk/core/webview/c/c;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/kwad/components/ad/h/a/a/b$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/h/a/a/b$1;-><init>(Lcom/kwad/components/ad/h/a/a/b;)V

    iput-object v0, p0, Lcom/kwad/components/ad/h/a/a/b;->nA:Ljava/lang/Runnable;

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/h/a/a/b;->ny:Lcom/kwad/components/ad/h/a/a/b$c;

    iget v1, p0, Lcom/kwad/components/ad/h/a/a/b;->nx:I

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/h/a/a/b$c;->J(I)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/h/a/a/b;->ny:Lcom/kwad/components/ad/h/a/a/b$c;

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final eH()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/h/a/a/b;->ny:Lcom/kwad/components/ad/h/a/a/b$c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/h/a/a/b$c;->y(Z)V

    return-void
.end method

.method public final eI()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/h/a/a/b;->ny:Lcom/kwad/components/ad/h/a/a/b$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/h/a/a/b$c;->y(Z)V

    return-void
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "registerTimerListener"

    return-object v0
.end method

.method public final onDestroy()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/kwad/components/ad/h/a/a/b;->nt:Lcom/kwad/sdk/core/webview/c/c;

    return-void
.end method
