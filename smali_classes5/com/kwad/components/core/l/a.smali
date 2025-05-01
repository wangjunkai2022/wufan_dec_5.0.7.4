.class public Lcom/kwad/components/core/l/a;
.super Lcom/kwad/sdk/mvp/a;
.source "SourceFile"


# instance fields
.field public MU:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/core/l/a/a;",
            ">;"
        }
    .end annotation
.end field

.field private final MV:Lcom/kwad/components/core/l/b;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kwad/components/core/l/b<",
            "*>;"
        }
    .end annotation
.end field

.field public final mContext:Landroid/content/Context;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final mRootView:Landroid/view/View;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kwad/components/core/l/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kwad/components/core/l/b<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/mvp/a;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/l/a;->MU:Ljava/util/List;

    .line 3
    iput-object p1, p0, Lcom/kwad/components/core/l/a;->MV:Lcom/kwad/components/core/l/b;

    .line 4
    iget-object v0, p1, Lcom/kwad/components/core/proxy/c;->mContext:Landroid/content/Context;

    iput-object v0, p0, Lcom/kwad/components/core/l/a;->mContext:Landroid/content/Context;

    .line 5
    iget-object p1, p1, Lcom/kwad/components/core/proxy/c;->mRootView:Landroid/view/View;

    iput-object p1, p0, Lcom/kwad/components/core/l/a;->mRootView:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final getActivity()Landroid/app/Activity;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/l/a;->MV:Lcom/kwad/components/core/l/b;

    invoke-virtual {v0}, Lcom/kwad/sdk/api/proxy/IActivityProxy;->getActivity()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public final hq()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/l/a;->MV:Lcom/kwad/components/core/l/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/proxy/c;->finish()V

    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/l/a;->MU:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
