.class final Lcom/kwad/components/ad/splashscreen/presenter/p$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/splashscreen/presenter/p;->lx()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Ei:Lcom/kwad/components/ad/splashscreen/presenter/p;

.field final synthetic Ek:Lcom/kwad/sdk/mvp/Presenter;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/splashscreen/presenter/p;Lcom/kwad/sdk/mvp/Presenter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p$8;->Ei:Lcom/kwad/components/ad/splashscreen/presenter/p;

    iput-object p2, p0, Lcom/kwad/components/ad/splashscreen/presenter/p$8;->Ek:Lcom/kwad/sdk/mvp/Presenter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p$8;->Ei:Lcom/kwad/components/ad/splashscreen/presenter/p;

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p$8;->Ek:Lcom/kwad/sdk/mvp/Presenter;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    return-void
.end method
