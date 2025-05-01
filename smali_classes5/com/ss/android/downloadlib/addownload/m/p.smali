.class public Lcom/ss/android/downloadlib/addownload/m/p;
.super Ljava/lang/Object;


# static fields
.field public static m:I = 0x1

.field public static p:I = 0x2

.field public static vv:I


# instance fields
.field private i:I

.field private n:I

.field private o:J

.field private qv:Ljava/lang/String;

.field private u:Lorg/json/JSONObject;

.field private wv:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Lcom/ss/android/downloadlib/addownload/m/p;->vv:I

    iput v0, p0, Lcom/ss/android/downloadlib/addownload/m/p;->i:I

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lcom/ss/android/downloadlib/addownload/m/p;->o:J

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/m/p;->u:Lorg/json/JSONObject;

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/ss/android/downloadlib/addownload/m/p;->n:I

    const-string v0, ""

    .line 6
    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/m/p;->qv:Ljava/lang/String;

    .line 7
    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/m/p;->wv:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public m()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/downloadlib/addownload/m/p;->n:I

    return v0
.end method

.method public m(I)Lcom/ss/android/downloadlib/addownload/m/p;
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/downloadlib/addownload/m/p;->n:I

    return-object p0
.end method

.method public vv(I)Lcom/ss/android/downloadlib/addownload/m/p;
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/downloadlib/addownload/m/p;->i:I

    return-object p0
.end method

.method public vv()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/ss/android/downloadlib/addownload/m/p;->i:I

    sget v1, Lcom/ss/android/downloadlib/addownload/m/p;->m:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
