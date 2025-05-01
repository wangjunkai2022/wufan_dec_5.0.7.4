.class public final synthetic Lcom/join/kotlin/ui/cloudarchive/h;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lcom/join/kotlin/ui/cloudarchive/ModGameCloudViewModle;

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;Ljava/util/List;Lcom/join/kotlin/ui/cloudarchive/ModGameCloudViewModle;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/h;->b:Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;

    iput-object p2, p0, Lcom/join/kotlin/ui/cloudarchive/h;->c:Ljava/util/List;

    iput-object p3, p0, Lcom/join/kotlin/ui/cloudarchive/h;->d:Lcom/join/kotlin/ui/cloudarchive/ModGameCloudViewModle;

    iput-wide p4, p0, Lcom/join/kotlin/ui/cloudarchive/h;->e:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/h;->b:Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;

    iget-object v1, p0, Lcom/join/kotlin/ui/cloudarchive/h;->c:Ljava/util/List;

    iget-object v2, p0, Lcom/join/kotlin/ui/cloudarchive/h;->d:Lcom/join/kotlin/ui/cloudarchive/ModGameCloudViewModle;

    iget-wide v3, p0, Lcom/join/kotlin/ui/cloudarchive/h;->e:J

    invoke-static {v0, v1, v2, v3, v4}, Lcom/join/kotlin/ui/cloudarchive/ModGameCloudViewModle;->a(Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;Ljava/util/List;Lcom/join/kotlin/ui/cloudarchive/ModGameCloudViewModle;J)V

    return-void
.end method
