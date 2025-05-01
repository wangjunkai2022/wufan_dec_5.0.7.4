.class public Lcom/ss/android/downloadlib/addownload/m/m;
.super Ljava/lang/Object;


# instance fields
.field public i:Ljava/lang/String;

.field public m:J

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public final qv:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public u:Ljava/lang/String;

.field public vv:J

.field public wv:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/m/m;->qv:Ljava/util/List;

    return-void
.end method

.method public static vv(JJ)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-lez v2, :cond_0

    return-wide p0

    :cond_0
    return-wide p2
.end method


# virtual methods
.method public vv()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/m/m;->vv:J

    iget-wide v2, p0, Lcom/ss/android/downloadlib/addownload/m/m;->m:J

    invoke-static {v0, v1, v2, v3}, Lcom/ss/android/downloadlib/addownload/m/m;->vv(JJ)J

    move-result-wide v0

    return-wide v0
.end method
