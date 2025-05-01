.class Lcom/join/mgps/fragment/DownloadCenterFragment_$o;
.super Ljava/lang/Object;
.source "DownloadCenterFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/DownloadCenterFragment_;->j0(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/List;

.field final synthetic c:Ljava/util/List;

.field final synthetic d:Ljava/util/List;

.field final synthetic e:Ljava/util/List;

.field final synthetic f:Lcom/join/mgps/fragment/DownloadCenterFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/DownloadCenterFragment_;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/DownloadCenterFragment_$o;->f:Lcom/join/mgps/fragment/DownloadCenterFragment_;

    iput-object p2, p0, Lcom/join/mgps/fragment/DownloadCenterFragment_$o;->b:Ljava/util/List;

    iput-object p3, p0, Lcom/join/mgps/fragment/DownloadCenterFragment_$o;->c:Ljava/util/List;

    iput-object p4, p0, Lcom/join/mgps/fragment/DownloadCenterFragment_$o;->d:Ljava/util/List;

    iput-object p5, p0, Lcom/join/mgps/fragment/DownloadCenterFragment_$o;->e:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DownloadCenterFragment_$o;->f:Lcom/join/mgps/fragment/DownloadCenterFragment_;

    iget-object v1, p0, Lcom/join/mgps/fragment/DownloadCenterFragment_$o;->b:Ljava/util/List;

    iget-object v2, p0, Lcom/join/mgps/fragment/DownloadCenterFragment_$o;->c:Ljava/util/List;

    iget-object v3, p0, Lcom/join/mgps/fragment/DownloadCenterFragment_$o;->d:Ljava/util/List;

    iget-object v4, p0, Lcom/join/mgps/fragment/DownloadCenterFragment_$o;->e:Ljava/util/List;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/join/mgps/fragment/DownloadCenterFragment_;->K0(Lcom/join/mgps/fragment/DownloadCenterFragment_;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method
