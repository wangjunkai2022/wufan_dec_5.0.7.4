.class final Lcom/kwad/components/core/page/c/a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/page/c/a;->aj()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Pb:Lcom/kwad/components/core/page/recycle/e;

.field final synthetic Pc:Lcom/kwad/components/core/page/c/a;

.field final synthetic si:Lcom/kwad/sdk/core/response/model/AdInfo;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/page/c/a;Lcom/kwad/sdk/core/response/model/AdInfo;Lcom/kwad/components/core/page/recycle/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/page/c/a$1;->Pc:Lcom/kwad/components/core/page/c/a;

    iput-object p2, p0, Lcom/kwad/components/core/page/c/a$1;->si:Lcom/kwad/sdk/core/response/model/AdInfo;

    iput-object p3, p0, Lcom/kwad/components/core/page/c/a$1;->Pb:Lcom/kwad/components/core/page/recycle/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/kwad/components/core/page/c/a$1;->si:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->aE(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    const/16 v0, 0x32

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/kwad/components/core/page/c/a$1;->Pb:Lcom/kwad/components/core/page/recycle/e;

    iget-object p1, p1, Lcom/kwad/components/core/page/recycle/e;->La:Lcom/kwad/components/core/e/d/c;

    if-eqz p1, :cond_1

    .line 3
    new-instance p1, Lcom/kwad/components/core/e/d/a$a;

    iget-object v2, p0, Lcom/kwad/components/core/page/c/a$1;->Pc:Lcom/kwad/components/core/page/c/a;

    .line 4
    invoke-virtual {v2}, Lcom/kwad/sdk/mvp/Presenter;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {p1, v2}, Lcom/kwad/components/core/e/d/a$a;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    .line 5
    invoke-virtual {p1, v2}, Lcom/kwad/components/core/e/d/a$a;->ao(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 6
    invoke-virtual {p1, v2}, Lcom/kwad/components/core/e/d/a$a;->ap(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 7
    invoke-virtual {p1, v1}, Lcom/kwad/components/core/e/d/a$a;->at(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/core/page/c/a$1;->Pb:Lcom/kwad/components/core/page/recycle/e;

    iget-object v1, v1, Lcom/kwad/components/core/page/recycle/e;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 8
    invoke-virtual {p1, v1}, Lcom/kwad/components/core/e/d/a$a;->ar(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 9
    invoke-virtual {p1, v2}, Lcom/kwad/components/core/e/d/a$a;->ar(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 10
    invoke-static {p1}, Lcom/kwad/components/core/e/d/a;->a(Lcom/kwad/components/core/e/d/a$a;)I

    .line 11
    iget-object p1, p0, Lcom/kwad/components/core/page/c/a$1;->Pb:Lcom/kwad/components/core/page/recycle/e;

    iget-object p1, p1, Lcom/kwad/components/core/page/recycle/e;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, p0, Lcom/kwad/components/core/page/c/a$1;->Pc:Lcom/kwad/components/core/page/c/a;

    .line 12
    invoke-static {v1}, Lcom/kwad/components/core/page/c/a;->a(Lcom/kwad/components/core/page/c/a;)Lcom/kwad/components/core/widget/FeedVideoView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/sdk/widget/KSFrameLayout;->getTouchCoords()Lcom/kwad/sdk/utils/ac$a;

    move-result-object v1

    .line 13
    invoke-static {p1, v0, v1}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ILcom/kwad/sdk/utils/ac$a;)V

    goto :goto_0

    .line 14
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/page/c/a$1;->Pb:Lcom/kwad/components/core/page/recycle/e;

    iget-object p1, p1, Lcom/kwad/components/core/page/recycle/e;->QC:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p1, :cond_1

    .line 15
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/kwad/components/core/page/c/a$1;->Pb:Lcom/kwad/components/core/page/recycle/e;

    iget-object p1, p1, Lcom/kwad/components/core/page/recycle/e;->QC:Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    move-result p1

    if-le p1, v1, :cond_1

    .line 17
    iget-object p1, p0, Lcom/kwad/components/core/page/c/a$1;->Pb:Lcom/kwad/components/core/page/recycle/e;

    iget-object p1, p1, Lcom/kwad/components/core/page/recycle/e;->QC:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    .line 18
    iget-object p1, p0, Lcom/kwad/components/core/page/c/a$1;->Pb:Lcom/kwad/components/core/page/recycle/e;

    iget-object p1, p1, Lcom/kwad/components/core/page/recycle/e;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, p0, Lcom/kwad/components/core/page/c/a$1;->Pc:Lcom/kwad/components/core/page/c/a;

    .line 19
    invoke-static {v1}, Lcom/kwad/components/core/page/c/a;->a(Lcom/kwad/components/core/page/c/a;)Lcom/kwad/components/core/widget/FeedVideoView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/sdk/widget/KSFrameLayout;->getTouchCoords()Lcom/kwad/sdk/utils/ac$a;

    move-result-object v1

    .line 20
    invoke-static {p1, v0, v1}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ILcom/kwad/sdk/utils/ac$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 21
    invoke-static {p1}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
