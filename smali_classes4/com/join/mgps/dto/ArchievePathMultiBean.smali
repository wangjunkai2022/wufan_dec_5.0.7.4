.class public Lcom/join/mgps/dto/ArchievePathMultiBean;
.super Ljava/lang/Object;
.source "ArchievePathMultiBean.java"


# instance fields
.field private cloud_archive_path_list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathDataV2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCloud_archive_path_list()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathDataV2;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ArchievePathMultiBean;->cloud_archive_path_list:Ljava/util/List;

    return-object v0
.end method

.method public setCloud_archive_path_list(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathDataV2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ArchievePathMultiBean;->cloud_archive_path_list:Ljava/util/List;

    return-void
.end method
