.class Lcom/ss/android/downloadlib/vv$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/vv;->vv(JI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/downloadlib/vv;

.field final synthetic vv:J


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/vv;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/vv$2;->m:Lcom/ss/android/downloadlib/vv;

    iput-wide p2, p0, Lcom/ss/android/downloadlib/vv$2;->vv:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/vv;->vv()Lcom/ss/android/downloadlib/vv;

    move-result-object v0

    iget-wide v1, p0, Lcom/ss/android/downloadlib/vv$2;->vv:J

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/vv;->vv(J)V

    return-void
.end method
