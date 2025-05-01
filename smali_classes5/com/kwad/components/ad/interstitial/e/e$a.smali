.class final Lcom/kwad/components/ad/interstitial/e/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/interstitial/e/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field private kG:I

.field private kH:Z

.field private kI:Z

.field final synthetic kJ:Lcom/kwad/components/ad/interstitial/e/e;


# direct methods
.method private constructor <init>(Lcom/kwad/components/ad/interstitial/e/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/e$a;->kJ:Lcom/kwad/components/ad/interstitial/e/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 p1, -0x80000000

    .line 2
    iput p1, p0, Lcom/kwad/components/ad/interstitial/e/e$a;->kG:I

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/kwad/components/ad/interstitial/e/e$a;->kH:Z

    .line 4
    iput-boolean p1, p0, Lcom/kwad/components/ad/interstitial/e/e$a;->kI:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/kwad/components/ad/interstitial/e/e;B)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/interstitial/e/e$a;-><init>(Lcom/kwad/components/ad/interstitial/e/e;)V

    return-void
.end method


# virtual methods
.method public final q(Z)V
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/ad/interstitial/e/e$a;->kI:Z

    return-void
.end method

.method public final r(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/ad/interstitial/e/e$a;->kH:Z

    return-void
.end method

.method public final run()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/interstitial/e/e$a;->kI:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-boolean v0, p0, Lcom/kwad/components/ad/interstitial/e/e$a;->kH:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 3
    invoke-static {}, Lcom/kwad/components/ad/interstitial/e/e;->dv()J

    move-result-wide v2

    invoke-static {p0, v1, v2, v3}, Lcom/kwad/sdk/utils/bo;->a(Ljava/lang/Runnable;Ljava/lang/Object;J)V

    return-void

    .line 4
    :cond_1
    iget v0, p0, Lcom/kwad/components/ad/interstitial/e/e$a;->kG:I

    const/high16 v2, -0x80000000

    if-ne v0, v2, :cond_2

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/e$a;->kJ:Lcom/kwad/components/ad/interstitial/e/e;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/e;->a(Lcom/kwad/components/ad/interstitial/e/e;)I

    move-result v0

    iput v0, p0, Lcom/kwad/components/ad/interstitial/e/e$a;->kG:I

    .line 6
    :cond_2
    iget v0, p0, Lcom/kwad/components/ad/interstitial/e/e$a;->kG:I

    if-gez v0, :cond_3

    return-void

    .line 7
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/e/e$a;->kJ:Lcom/kwad/components/ad/interstitial/e/e;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", this: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " PlayableTimerRunnable run : "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/kwad/components/ad/interstitial/e/e$a;->kG:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "InterstitialPlayablePresenter"

    invoke-static {v2, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/e$a;->kJ:Lcom/kwad/components/ad/interstitial/e/e;

    iget v2, p0, Lcom/kwad/components/ad/interstitial/e/e$a;->kG:I

    invoke-static {v0, v2}, Lcom/kwad/components/ad/interstitial/e/e;->a(Lcom/kwad/components/ad/interstitial/e/e;I)V

    .line 9
    iget v0, p0, Lcom/kwad/components/ad/interstitial/e/e$a;->kG:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/kwad/components/ad/interstitial/e/e$a;->kG:I

    .line 10
    invoke-static {}, Lcom/kwad/components/ad/interstitial/e/e;->dv()J

    move-result-wide v2

    invoke-static {p0, v1, v2, v3}, Lcom/kwad/sdk/utils/bo;->a(Ljava/lang/Runnable;Ljava/lang/Object;J)V

    return-void
.end method
