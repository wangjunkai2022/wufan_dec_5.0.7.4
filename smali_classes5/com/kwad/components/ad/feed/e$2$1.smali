.class final Lcom/kwad/components/ad/feed/e$2$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/feed/e$2;->onError(ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic cd:I

.field final synthetic ce:Ljava/lang/String;

.field final synthetic ep:Lcom/kwad/components/ad/feed/e$2;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/feed/e$2;ILjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/feed/e$2$1;->ep:Lcom/kwad/components/ad/feed/e$2;

    iput p2, p0, Lcom/kwad/components/ad/feed/e$2$1;->cd:I

    iput-object p3, p0, Lcom/kwad/components/ad/feed/e$2$1;->ce:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/e$2$1;->ep:Lcom/kwad/components/ad/feed/e$2;

    iget-object v0, v0, Lcom/kwad/components/ad/feed/e$2;->el:Lcom/kwad/sdk/api/KsLoadManager$FeedAdListener;

    iget v1, p0, Lcom/kwad/components/ad/feed/e$2$1;->cd:I

    iget-object v2, p0, Lcom/kwad/components/ad/feed/e$2$1;->ce:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/kwad/sdk/api/KsLoadManager$FeedAdListener;->onError(ILjava/lang/String;)V

    return-void
.end method
