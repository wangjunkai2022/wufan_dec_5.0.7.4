.class final Lcom/kwad/components/ad/splashscreen/presenter/q$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/splashscreen/presenter/q$2;->onMediaPlayProgress(JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Eu:I

.field final synthetic Ev:Ljava/lang/String;

.field final synthetic Ew:Lcom/kwad/components/ad/splashscreen/presenter/q$2;

.field final synthetic rH:J


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/splashscreen/presenter/q$2;IJLjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/q$2$1;->Ew:Lcom/kwad/components/ad/splashscreen/presenter/q$2;

    iput p2, p0, Lcom/kwad/components/ad/splashscreen/presenter/q$2$1;->Eu:I

    iput-wide p3, p0, Lcom/kwad/components/ad/splashscreen/presenter/q$2$1;->rH:J

    iput-object p5, p0, Lcom/kwad/components/ad/splashscreen/presenter/q$2$1;->Ev:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/q$2$1;->Eu:I

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v0, v0

    iget-wide v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/q$2$1;->rH:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v1, v0

    if-gtz v1, :cond_0

    const/4 v1, 0x1

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/q$2$1;->Ev:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/q$2$1;->Ew:Lcom/kwad/components/ad/splashscreen/presenter/q$2;

    iget-object v1, v1, Lcom/kwad/components/ad/splashscreen/presenter/q$2;->Eq:Lcom/kwad/components/ad/splashscreen/presenter/q;

    invoke-static {v1}, Lcom/kwad/components/ad/splashscreen/presenter/q;->e(Lcom/kwad/components/ad/splashscreen/presenter/q;)Lcom/kwad/components/ad/splashscreen/widget/SkipView;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/kwad/components/ad/splashscreen/widget/SkipView;->X(Ljava/lang/String;)V

    return-void
.end method
