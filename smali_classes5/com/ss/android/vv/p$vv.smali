.class Lcom/ss/android/vv/p$vv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/vv/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "vv"
.end annotation


# instance fields
.field private i:J

.field private m:I

.field private o:Ljava/lang/String;

.field private p:I

.field private vv:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ss/android/vv/p$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/ss/android/vv/p$vv;-><init>()V

    return-void
.end method

.method static synthetic i(Lcom/ss/android/vv/p$vv;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/ss/android/vv/p$vv;->m:I

    return p0
.end method

.method static synthetic m(Lcom/ss/android/vv/p$vv;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/ss/android/vv/p$vv;->p:I

    return p0
.end method

.method static synthetic m(Lcom/ss/android/vv/p$vv;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/vv/p$vv;->m:I

    return p1
.end method

.method static synthetic o(Lcom/ss/android/vv/p$vv;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/vv/p$vv;->o:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic p(Lcom/ss/android/vv/p$vv;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/ss/android/vv/p$vv;->p:I

    return p1
.end method

.method static synthetic p(Lcom/ss/android/vv/p$vv;)J
    .locals 2

    .line 2
    iget-wide v0, p0, Lcom/ss/android/vv/p$vv;->i:J

    return-wide v0
.end method

.method static synthetic vv(Lcom/ss/android/vv/p$vv;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/ss/android/vv/p$vv;->vv:I

    return p0
.end method

.method static synthetic vv(Lcom/ss/android/vv/p$vv;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/ss/android/vv/p$vv;->vv:I

    return p1
.end method

.method static synthetic vv(Lcom/ss/android/vv/p$vv;J)J
    .locals 0

    .line 3
    iput-wide p1, p0, Lcom/ss/android/vv/p$vv;->i:J

    return-wide p1
.end method

.method static synthetic vv(Lcom/ss/android/vv/p$vv;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/ss/android/vv/p$vv;->o:Ljava/lang/String;

    return-object p1
.end method
