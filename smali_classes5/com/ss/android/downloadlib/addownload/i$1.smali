.class Lcom/ss/android/downloadlib/addownload/i$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/addownload/o$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/i;->vv(IJJLcom/ss/android/downloadlib/addownload/o$vv;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic i:J

.field final synthetic m:Ljava/lang/String;

.field final synthetic o:Lcom/ss/android/downloadlib/addownload/o$vv;

.field final synthetic p:Lcom/ss/android/downloadad/api/vv/m;

.field final synthetic u:Lcom/ss/android/downloadlib/addownload/i;

.field final synthetic vv:I


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/i;ILjava/lang/String;Lcom/ss/android/downloadad/api/vv/m;JLcom/ss/android/downloadlib/addownload/o$vv;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/i$1;->u:Lcom/ss/android/downloadlib/addownload/i;

    iput p2, p0, Lcom/ss/android/downloadlib/addownload/i$1;->vv:I

    iput-object p3, p0, Lcom/ss/android/downloadlib/addownload/i$1;->m:Ljava/lang/String;

    iput-object p4, p0, Lcom/ss/android/downloadlib/addownload/i$1;->p:Lcom/ss/android/downloadad/api/vv/m;

    iput-wide p5, p0, Lcom/ss/android/downloadlib/addownload/i$1;->i:J

    iput-object p7, p0, Lcom/ss/android/downloadlib/addownload/i$1;->o:Lcom/ss/android/downloadlib/addownload/o$vv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(J)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/i$1;->u:Lcom/ss/android/downloadlib/addownload/i;

    iget v1, p0, Lcom/ss/android/downloadlib/addownload/i$1;->vv:I

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/i$1;->m:Ljava/lang/String;

    iget-object v5, p0, Lcom/ss/android/downloadlib/addownload/i$1;->p:Lcom/ss/android/downloadad/api/vv/m;

    iget-wide v6, p0, Lcom/ss/android/downloadlib/addownload/i$1;->i:J

    iget-object v8, p0, Lcom/ss/android/downloadlib/addownload/i$1;->o:Lcom/ss/android/downloadlib/addownload/o$vv;

    move-wide v3, p1

    invoke-static/range {v0 .. v8}, Lcom/ss/android/downloadlib/addownload/i;->vv(Lcom/ss/android/downloadlib/addownload/i;ILjava/lang/String;JLcom/ss/android/downloadad/api/vv/m;JLcom/ss/android/downloadlib/addownload/o$vv;)V

    return-void
.end method
