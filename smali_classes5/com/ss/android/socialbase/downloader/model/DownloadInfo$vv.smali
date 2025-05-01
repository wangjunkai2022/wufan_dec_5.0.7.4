.class public Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "vv"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:[I

.field private c:Z

.field private cq:Z

.field private d:I

.field private ds:Z

.field private e:I

.field private ev:[I

.field private f:Z

.field private ff:Ljava/lang/String;

.field private fo:Ljava/lang/String;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/lang/String;

.field private j:I

.field private jb:J

.field private jh:I

.field private ju:Z

.field private k:[Ljava/lang/String;

.field private ky:Z

.field private l:Z

.field private la:Z

.field private lb:Z

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private nn:Z

.field private ns:Z

.field private o:Ljava/lang/String;

.field private ot:Z

.field private p:Ljava/lang/String;

.field private pd:J

.field private pj:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

.field private q:Z

.field private qb:J

.field private qv:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/p;",
            ">;"
        }
    .end annotation
.end field

.field private r:I

.field private s:Lorg/json/JSONObject;

.field private t:Z

.field private td:Ljava/lang/String;

.field private tf:Ljava/lang/String;

.field private to:Z

.field private u:Z

.field private v:Z

.field private vu:Z

.field private vv:Ljava/lang/String;

.field private w:Z

.field private wv:I

.field private x:Z

.field private y:Ljava/lang/String;

.field private ya:Z

.field private yj:Ljava/lang/String;

.field private zn:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->q:Z

    .line 3
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->x:Z

    .line 4
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->ns:Z

    .line 5
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/EnqueueType;->ENQUEUE_NONE:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->pj:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    .line 6
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->ds:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->q:Z

    .line 9
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->x:Z

    .line 10
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->ns:Z

    .line 11
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/EnqueueType;->ENQUEUE_NONE:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->pj:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    .line 12
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->ds:Z

    .line 13
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->p:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->td:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->wv:I

    return p0
.end method

.method static synthetic c(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->c:Z

    return p0
.end method

.method static synthetic cq(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->ky:Z

    return p0
.end method

.method static synthetic d(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->q:Z

    return p0
.end method

.method static synthetic ds(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->pd:J

    return-wide v0
.end method

.method static synthetic e(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->ds:Z

    return p0
.end method

.method static synthetic ev(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->x:Z

    return p0
.end method

.method static synthetic f(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->f:Z

    return p0
.end method

.method static synthetic ff(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->l:Z

    return p0
.end method

.method static synthetic fo(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->e:I

    return p0
.end method

.method static synthetic g(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->j:I

    return p0
.end method

.method static synthetic i(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->i:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic j(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)[I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->b:[I

    return-object p0
.end method

.method static synthetic jb(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->tf:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic jh(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->jh:I

    return p0
.end method

.method static synthetic ju(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->fo:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic k(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->qv:Ljava/util/List;

    return-object p0
.end method

.method static synthetic ky(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->lb:Z

    return p0
.end method

.method static synthetic l(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->w:Z

    return p0
.end method

.method static synthetic la(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->d:I

    return p0
.end method

.method static synthetic lb(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->jb:J

    return-wide v0
.end method

.method static synthetic m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->m:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic n(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->to:Z

    return p0
.end method

.method static synthetic nn(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)[I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->ev:[I

    return-object p0
.end method

.method static synthetic ns(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic o(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->o:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic ot(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->ot:Z

    return p0
.end method

.method static synthetic p(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->p:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic pd(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->vu:Z

    return p0
.end method

.method static synthetic pj(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Lcom/ss/android/socialbase/downloader/constants/EnqueueType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->pj:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    return-object p0
.end method

.method static synthetic q(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->k:[Ljava/lang/String;

    return-object p0
.end method

.method static synthetic qb(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->ju:Z

    return p0
.end method

.method static synthetic qv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->n:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic r(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->r:I

    return p0
.end method

.method static synthetic s(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Lorg/json/JSONObject;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->s:Lorg/json/JSONObject;

    return-object p0
.end method

.method static synthetic t(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->t:Z

    return p0
.end method

.method static synthetic td(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->ns:Z

    return p0
.end method

.method static synthetic tf(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->cq:Z

    return p0
.end method

.method static synthetic to(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->nn:Z

    return p0
.end method

.method static synthetic u(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->yj:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic v(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->y:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic vu(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->ya:Z

    return p0
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->vv:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic w(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->ff:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic wv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->u:Z

    return p0
.end method

.method static synthetic x(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->g:Ljava/util/List;

    return-object p0
.end method

.method static synthetic y(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->la:Z

    return p0
.end method

.method static synthetic ya(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->v:Z

    return p0
.end method

.method static synthetic yj(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->qb:J

    return-wide v0
.end method

.method static synthetic zn(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->zn:Z

    return p0
.end method


# virtual methods
.method public b(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->a:Ljava/lang/String;

    return-object p0
.end method

.method public b(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->c:Z

    return-object p0
.end method

.method public d(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->ds:Z

    return-object p0
.end method

.method public g(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->lb:Z

    return-object p0
.end method

.method public i(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 3
    iput p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->j:I

    return-object p0
.end method

.method public i(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->yj:Ljava/lang/String;

    return-object p0
.end method

.method public i(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->v:Z

    return-object p0
.end method

.method public j(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->ky:Z

    return-object p0
.end method

.method public jh(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->fo:Ljava/lang/String;

    return-object p0
.end method

.method public jh(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->zn:Z

    return-object p0
.end method

.method public k(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->td:Ljava/lang/String;

    return-object p0
.end method

.method public k(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->w:Z

    return-object p0
.end method

.method public la(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->ju:Z

    return-object p0
.end method

.method public m(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 3
    iput p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->jh:I

    return-object p0
.end method

.method public m(J)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 7
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->jb:J

    return-object p0
.end method

.method public m(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->m:Ljava/lang/String;

    return-object p0
.end method

.method public m(Ljava/util/List;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;"
        }
    .end annotation

    .line 5
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->g:Ljava/util/List;

    return-object p0
.end method

.method public m(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->t:Z

    return-object p0
.end method

.method public m([I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->ev:[I

    return-object p0
.end method

.method public n(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->n:Ljava/lang/String;

    return-object p0
.end method

.method public n(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->l:Z

    return-object p0
.end method

.method public o(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 3
    iput p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->d:I

    return-object p0
.end method

.method public o(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->i:Ljava/lang/String;

    return-object p0
.end method

.method public o(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->la:Z

    return-object p0
.end method

.method public p(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 3
    iput p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->r:I

    return-object p0
.end method

.method public p(J)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 5
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->qb:J

    return-object p0
.end method

.method public p(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->p:Ljava/lang/String;

    return-object p0
.end method

.method public p(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->q:Z

    return-object p0
.end method

.method public q(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->cq:Z

    return-object p0
.end method

.method public qv(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->y:Ljava/lang/String;

    return-object p0
.end method

.method public qv(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->ns:Z

    return-object p0
.end method

.method public r(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->tf:Ljava/lang/String;

    return-object p0
.end method

.method public r(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->f:Z

    return-object p0
.end method

.method public t(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->ot:Z

    return-object p0
.end method

.method public u(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 4
    iput p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->e:I

    return-object p0
.end method

.method public u(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->o:Ljava/lang/String;

    return-object p0
.end method

.method public u(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->ya:Z

    return-object p0
.end method

.method public v(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->x:Z

    return-object p0
.end method

.method public vv(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 5
    iput p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->wv:I

    return-object p0
.end method

.method public vv(J)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 8
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->pd:J

    return-object p0
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/constants/EnqueueType;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->pj:Lcom/ss/android/socialbase/downloader/constants/EnqueueType;

    return-object p0
.end method

.method public vv(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->vv:Ljava/lang/String;

    return-object p0
.end method

.method public vv(Ljava/util/List;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/p;",
            ">;)",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;"
        }
    .end annotation

    .line 4
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->qv:Ljava/util/List;

    return-object p0
.end method

.method public vv(Lorg/json/JSONObject;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 10
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->s:Lorg/json/JSONObject;

    return-object p0
.end method

.method public vv(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->u:Z

    return-object p0
.end method

.method public vv([I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 7
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->b:[I

    return-object p0
.end method

.method public vv([Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->k:[Ljava/lang/String;

    return-object p0
.end method

.method public vv()Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 2

    .line 11
    new-instance v0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;-><init>(Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;Lcom/ss/android/socialbase/downloader/model/DownloadInfo$1;)V

    return-object v0
.end method

.method public wv(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->ff:Ljava/lang/String;

    return-object p0
.end method

.method public wv(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->vu:Z

    return-object p0
.end method

.method public x(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->nn:Z

    return-object p0
.end method

.method public y(Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/model/DownloadInfo$vv;->to:Z

    return-object p0
.end method
