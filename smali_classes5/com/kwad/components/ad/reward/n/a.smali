.class public Lcom/kwad/components/ad/reward/n/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/reward/n/b;


# instance fields
.field private mContext:Landroid/content/Context;

.field private qp:Lcom/kwad/components/ad/reward/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/kwad/components/ad/reward/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/kwad/components/ad/reward/n/a;->qp:Lcom/kwad/components/ad/reward/g;

    .line 3
    iput-object p1, p0, Lcom/kwad/components/ad/reward/n/a;->mContext:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final gK()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/a;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/a;->mContext:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1, v2, v2}, Lcom/kwad/components/ad/reward/g;->a(ILandroid/content/Context;II)V

    return-void
.end method

.method public ii()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/a;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/a;->mContext:Landroid/content/Context;

    const/4 v2, 0x1

    const/16 v3, 0xd

    const/4 v4, 0x2

    invoke-virtual {v0, v2, v1, v3, v4}, Lcom/kwad/components/ad/reward/g;->a(ILandroid/content/Context;II)V

    return-void
.end method

.method public ij()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/a;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/a;->mContext:Landroid/content/Context;

    const/4 v2, 0x1

    const/16 v3, 0x75

    const/4 v4, 0x2

    invoke-virtual {v0, v2, v1, v3, v4}, Lcom/kwad/components/ad/reward/g;->a(ILandroid/content/Context;II)V

    return-void
.end method
