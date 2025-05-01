.class final Lcom/kwad/sdk/DownloadTask$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/f/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/DownloadTask;->notifyDownloadProgress(Lcom/kwad/framework/filedownloader/a;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/kwad/sdk/f/a<",
        "Lcom/kwad/sdk/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic alq:Lcom/kwad/sdk/DownloadTask;

.field final synthetic alr:Z


# direct methods
.method constructor <init>(Lcom/kwad/sdk/DownloadTask;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/DownloadTask$4;->alq:Lcom/kwad/sdk/DownloadTask;

    iput-boolean p2, p0, Lcom/kwad/sdk/DownloadTask$4;->alr:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/kwad/sdk/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask$4;->alq:Lcom/kwad/sdk/DownloadTask;

    iget-boolean v1, p0, Lcom/kwad/sdk/DownloadTask$4;->alr:Z

    invoke-interface {p1, v0, v1}, Lcom/kwad/sdk/d;->a(Lcom/kwad/sdk/DownloadTask;Z)V

    return-void
.end method


# virtual methods
.method public final synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/kwad/sdk/d;

    invoke-direct {p0, p1}, Lcom/kwad/sdk/DownloadTask$4;->a(Lcom/kwad/sdk/d;)V

    return-void
.end method
